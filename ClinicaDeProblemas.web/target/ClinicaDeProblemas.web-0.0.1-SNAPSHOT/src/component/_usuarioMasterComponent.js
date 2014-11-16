define(['controller/selectionController', 'model/cacheModel', 'model/usuarioMasterModel', 'component/_CRUDComponent', 'controller/tabController', 'component/usuarioComponent',
 'component/contactoComponent', 'component/recursoComponent'],
 function(SelectionController, CacheModel, UsuarioMasterModel, CRUDComponent, TabController, UsuarioComponent,
 contactoComponent, recursoComponent) {
    App.Component._UsuarioMasterComponent = App.Component.BasicComponent.extend({
        initialize: function() {
            var self = this;
            this.configuration = App.Utils.loadComponentConfiguration('usuarioMaster');
            App.Model.UsuarioMasterModel.prototype.urlRoot = this.configuration.context;
            this.componentId = App.Utils.randomInteger();
            
            this.masterComponent = new UsuarioComponent();
            this.masterComponent.initialize();
            
            this.childComponents = [];
			
			this.initializeChildComponents();
            
            Backbone.on(this.masterComponent.componentId + '-post-usuario-create', function(params) {
                self.renderChilds(params);
            });
            Backbone.on(this.masterComponent.componentId + '-post-usuario-edit', function(params) {
                self.renderChilds(params);
            });
            Backbone.on(this.masterComponent.componentId + '-pre-usuario-list', function() {
                self.hideChilds();
            });
            Backbone.on('usuario-master-model-error', function(error) {
                Backbone.trigger(uComponent.componentId + '-' + 'error', {event: 'usuario-master-save', view: self, message: error});
            });
            Backbone.on(this.masterComponent.componentId + '-instead-usuario-save', function(params) {
                self.model.set('usuarioEntity', params.model);
                if (params.model) {
                    self.model.set('id', params.model.id);
                } else {
                    self.model.unset('id');
                }

				App.Utils.fillCacheList(
					'contacto',
					self.model,
					self.contactoComponent.getDeletedRecords(),
					self.contactoComponent.getUpdatedRecords(),
					self.contactoComponent.getCreatedRecords()
				);

				App.Utils.fillCacheList(
					'recurso',
					self.model,
					self.recursoComponent.getDeletedRecords(),
					self.recursoComponent.getUpdatedRecords(),
					self.recursoComponent.getCreatedRecords()
				);

                self.model.save({}, {
                    success: function() {
                        Backbone.trigger(self.masterComponent.componentId + '-' + 'post-usuario-save', {view: self, model : self.model});
                    },
                    error: function(error) {
                        Backbone.trigger(self.componentId + '-' + 'error', {event: 'usuario-master-save', view: self, error: error});
                    }
                });
			    if (this.postInit) {
					this.postInit();
				}
            });
        },
        render: function(domElementId){
			if (domElementId) {
				var rootElementId = $("#"+domElementId);
				this.masterElement = this.componentId + "-master";
				this.tabsElement = this.componentId + "-tabs";

				rootElementId.append("<div id='" + this.masterElement + "'></div>");
				rootElementId.append("<div id='" + this.tabsElement + "'></div>");
			}
			this.masterComponent.render(this.masterElement);
		},
		initializeChildComponents: function () {
			this.tabModel = new App.Model.TabModel({tabs: [
                {label: "Contacto", name: "contacto", enable: true},
                {label: "Recurso", name: "recurso", enable: true}
			]});
			this.tabs = new TabController({model: this.tabModel});

			this.contactoComponent = new contactoComponent();
            this.contactoComponent.initialize({cache: {data: [], mode: "memory"},pagination: false});
			this.childComponents.push(this.contactoComponent);

			this.recursoComponent = new recursoComponent();
            this.recursoComponent.initialize({cache: {data: [], mode: "memory"},pagination: false});
			this.childComponents.push(this.recursoComponent);

            var self = this;
            
            this.configToolbar(this.contactoComponent,true);
            Backbone.on(self.contactoComponent.componentId + '-post-contacto-create', function(params) {
                params.view.currentModel.setCacheList(params.view.currentList);
            });
            
            this.configToolbar(this.recursoComponent,false);
            this.recursoComponent.disableEdit();

            Backbone.on(this.recursoComponent.componentId + '-toolbar-add', function() {
                var selection = new SelectionController({"componentId":"recursoComponent"});
                App.Utils.getComponentList('recursoComponent', function(componentName, model) {
                    if (model.models.length == 0) {
                        alert('There is no Recursos to select.');
                    } else {
                        selection.showSelectionList({list: model, name: 'name', title: 'Recurso List'});
                    }
                    ;
                });
            });

            Backbone.on('recursoComponent-post-selection', function(models) {
            	self.recursoComponent.addRecords(models);
            	self.recursoComponent.render();
            });

		},
        renderChilds: function(params) {
            var self = this;
            
            var options = {
                success: function() {
                	self.tabs.render(self.tabsElement);

					self.contactoComponent.clearCache();
					self.contactoComponent.setRecords(self.model.get('listcontacto'));
					self.contactoComponent.render(self.tabs.getTabHtmlId('contacto'));

					self.recursoComponent.clearCache();
					self.recursoComponent.setRecords(self.model.get('listrecurso'));
					self.recursoComponent.render(self.tabs.getTabHtmlId('recurso'));

                    $('#'+self.tabsElement).show();
                },
                error: function() {
                    Backbone.trigger(self.componentId + '-' + 'error', {event: 'usuario-edit', view: self, id: id, data: data, error: error});
                }
            };
            if (params.id) {
                self.model = new App.Model.UsuarioMasterModel({id: params.id});
                self.model.fetch(options);
            } else {
                self.model = new App.Model.UsuarioMasterModel();
                options.success();
            }


        },
        showMaster: function (flag) {
			if (typeof (flag) === "boolean") {
				if (flag) {
					$("#"+this.masterElement).show();
				} else {
					$("#"+this.masterElement).hide();
				}
			}
		},
        hideChilds: function() {
            $("#"+this.tabsElement).hide();
        },
		configToolbar: function(component, composite) {
		    component.removeGlobalAction('refresh');
			component.removeGlobalAction('print');
			component.removeGlobalAction('search');
			if (!composite) {
				component.removeGlobalAction('create');
				component.removeGlobalAction('save');
				component.removeGlobalAction('cancel');
				component.addGlobalAction({
					name: 'add',
					icon: 'glyphicon-send',
					displayName: 'Add',
					show: true
				}, function () {
					Backbone.trigger(component.componentId + '-toolbar-add');
				});
			}
        },
        getChilds: function(name){
			for (var idx in this.childComponents) {
				if (this.childComponents[idx].name === name) {
					return this.childComponents[idx].getRecords();
				}
			}
		},
		setChilds: function(childName,childData){
			for (var idx in this.childComponents) {
				if (this.childComponents[idx].name === childName) {
					this.childComponents[idx].setRecords(childData);
				}
			}
		},
		renderMaster: function(domElementId){
			this.masterComponent.render(domElementId);
		},
		renderChild: function(childName, domElementId){
			for (var idx in this.childComponents) {
				if (this.childComponents[idx].name === childName) {
					this.childComponents[idx].render(domElementId);
				}
			}
		}
    });

    return App.Component._UsuarioMasterComponent;
});