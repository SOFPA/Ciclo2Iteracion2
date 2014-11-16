define(['component/_uTIMasterComponent'],function(_UTIMasterComponent) {
    App.Component.UTIMasterComponent = _UTIMasterComponent.extend({
		postInit: function(){
			//Escribir en este servicio las instrucciones que desea ejecutar al inicializar el componente
		}
    });

    return App.Component.UTIMasterComponent;
});