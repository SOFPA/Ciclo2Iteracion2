define(['component/_uTIMasterComponent'],function(_UTIMasterComponent) {
    App.Component.UTIMasterComponent = _UTIMasterComponent.extend({
	postInit: function(){
            usuarioActual: this.getLoggedUser();
            if(usuarioActual.admin){
                
            }else{
                this.registrarUsuario();
            }
        },
        registrarUsuario: function(){
            this.toolbarComponent.hideButton('create');
            this.toolbarComponent.hideButton('save');
            this.toolbarComponent.hideButton('print');
            this.toolbarComponent.showButton('refresh');
            this.toolbarComponent.hideButton('search');
            this.toolbarComponent.hideButton('cancel');
            this.toolbarComponent.render();
            this.showDelete = false;
            this.showEdit = false;
            this.addRecordAction({
                name: 'registrarse',
                icon: '',
                displayName: 'Registrarse',
                show: true
            },
            this.edit,
            this);
        },
        getLoggedUser: function(){
            
        }
    });

    return App.Component.UTIMasterComponent;
});