define([], function() {
    App.Model._UTIMasterModel = Backbone.Model.extend({
     	initialize: function() {
            this.on('invalid', function(model,error) {
                Backbone.trigger('uTI-master-model-error', error);
            });
        },
        validate: function(attrs, options){
        	var modelMaster = new App.Model.UTIModel();
        	if(modelMaster.validate){
            	return modelMaster.validate(attrs.uTIEntity,options);
            }
        }
    });

    App.Model._UTIMasterList = Backbone.Collection.extend({
        model: App.Model._UTIMasterModel,
        initialize: function() {
        }

    });
    return App.Model._UTIMasterModel;
    
});