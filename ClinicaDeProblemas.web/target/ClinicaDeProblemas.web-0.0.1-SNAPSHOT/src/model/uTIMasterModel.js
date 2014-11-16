define(['model/_uTIMasterModel'], function() { 
    App.Model.UTIMasterModel = App.Model._UTIMasterModel.extend({

    });

    App.Model.UTIMasterList = App.Model._UTIMasterList.extend({
        model: App.Model.UTIMasterModel
    });

    return  App.Model.UTIMasterModel;

});