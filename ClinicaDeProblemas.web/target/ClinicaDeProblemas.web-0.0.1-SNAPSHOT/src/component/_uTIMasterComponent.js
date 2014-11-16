define(['controller/selectionController', 'model/cacheModel', 'model/uTIMasterModel', 'component/_CRUDComponent', 'controller/tabController', 'component/uTIComponent',
 'component/opinionComponent', 'component/usuarioComponent'],
 function(SelectionController, CacheModel, UTIMasterModel, CRUDComponent, TabController, UTIComponent,
 opinionComponent, usuarioComponent) {
    App.Component._UTIMasterComponent = App.Component.BasicComponent.extend({
        initialize: function() {
            var self = this;
            this.configuration = App.Utils.loadComponentConfiguration('uTIMaster');
            App.Model.UTIMasterModel.prototype.urlRoot = this.configuration.context;
            this.componentId = App.Utils.randomInteger();
            
            this.masterComponent = new UTIComponent();
            this.masterComponent.initialize();
            
            this.childComponents = [];
			
			this.initializeChildComponents();
            
            Backbone.on(this.masterComponent.componentId + '-post-uTI-create', function(params) {
                self.renderChilds(params);
            });
            Backbone.on(this.masterComponent.componentId + '-post-uTI-edit', function(params) {
                self.renderChilds(params);
            });
            Backbone.on(this.masterComponent.componentId + '-pre-uTI-list', function() {
                self.hideChilds();
            });
            Backbone.on('uTI-master-model-error', function(error) {
                Backbone.trigger(uComponent.componentId + '-' + 'error', {event: 'uTI-master-save', view: self, message: error});
            });
            Backbone.on(this.masterComponent.componentId + '-instead-uTI-save', function(params) {
                self.model.set('uTIEntity', params.model);
                if (params.model) {
                    self.model.set('id', params.model.id);
                } else {
                    self.model.unset('id');
                }

				App.Utils.fillCacheList(
					'opinion',
					self.model,
					self.opinionComponent.getDeletedRecords(),
					self.opinionComponent.getUpdatedRecords(),
					self.opinionComponent.getCreatedRecords()
				);

				App.Utils.fillCacheList(
					'usuario',
					self.model,
					self.usuarioComponent.getDeletedRecords(),
					self.usuarioComponent.getUpdatedRecords(),
					self.usuarioComponent.getCreatedRecords()
				);

                self.model.save({}, {
                    success: function() {
                        Backbone.trigger(self.masterComponent.componentId + '-' + 'post-uTI-save', {view: self, model : self.model});
                    },
                    error: function(error) {
                        Backbone.trigger(self.componentId + '-' + 'error', {event: 'uTI-master-save', view: self, error: error});
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
                {label: "Opinion", name: "opinion", enable: true},
                {label: "Usuario", name: "usuario", enable: true}
			]});
			this.tabs = new TabController({model: this.tabModel});

			this.opinionComponent = new opinionComponent();
            this.opinionComponent.initialize({cache: {data: [], mode: "memory"},pagination: false});
			this.childComponents.push(this.opinionComponent);

			this.usuarioComponent = new usuarioComponent();
            this.usuarioComponent.initialize({cache: {data: [], mode: "memory"},pagination: false});
			this.childComponents.push(this.usuarioComponent);

            var self = this;
            
            this.configToolbar(this.opinionComponent,true);
            Backbone.on(self.opinionComponent.componentId + '-post-opinion-create', function(params) {
                params.view.currentModel.setCacheList(params.view.currentList);
            });
            
            this.configToolbar(this.usuarioComponent,false);
            this.usuarioComponent.disableEdit();

            Backbone.on(this.usuarioComponent.componentId + '-toolbar-add', function() {
                var selection = new SelectionController({"componentId":"usuarioComponent"});
                App.Utils.getComponentList('usuarioComponent', function(componentName, model) {
                    if (model.models.length == 0) {
                        alert('There is no Usuarios to select.');
                    } else {
                        selection.showSelectionList({list: model, name: 'name', title: 'Usuario List'});
                    }
                    ;
                });
            });

            Backbone.on('usuarioComponent-post-selection', function(models) {
            	self.usuarioComponent.addRecords(models);
            	self.usuarioComponent.render();
            });

		},
        renderChilds: function(params) {
            var self = this;
            
            var options = {
                success: function() {
                	self.tabs.render(self.tabsElement);

					self.opinionComponent.clearCache();
					self.opinionComponent.setRecords(self.model.get('listopinion'));
					self.opinionComponent.render(self.tabs.getTabHtmlId('opinion'));

					self.usuarioComponent.clearCache();
					self.usuarioComponent.setRecords(self.model.get('listusuario'));
					self.usuarioComponent.render(self.tabs.getTabHtmlId('usuario'));

                    $('#'+self.tabsElement).show();
                },
                error: function() {
                    Backbone.trigger(self.componentId + '-' + 'error', {event: 'uTI-edit', view: self, id: id, data: data, error: error});
                }
            };
            if (params.id) {
                self.model = new App.Model.UTIMasterModel({id: params.id});
                self.model.fetch(options);
            } else {
                self.model = new App.Model.UTIMasterModel();
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

    return App.Component._UTIMasterComponent;
});