define([], function() {
    App.Delegate.LoginDelegate = {
        //Función que obtiene el "user Stack" del servicio rest.
        getLoggedUserStack: function(sdata, callback, callbackError) {
            $.ajax({
                url: '/carrito.web/webresources/auth/session/userstack',
                method: 'GET',
                dataType: "html",
                contentType: "application/json"
            }).done(function(data) {
                callback(data);
            }).fail(function(error) {
                callbackError(error);
            });
        }
 
    };
 
});