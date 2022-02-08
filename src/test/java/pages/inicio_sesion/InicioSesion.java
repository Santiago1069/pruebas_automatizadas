package pages.inicio_sesion;


import pages.ConfiguracionFunciones;

public class InicioSesion extends ConfiguracionFunciones {

    private String clickadministrador = "//*[@id=\"imagen_administrador\"]";
    private String correo = "//*[@id=\"correo_electronico\"]";
    private String contrasena = "//*[@id=\"contrasena\"]";
    private String btn_iniciar_sesion = "/html/body/app-root/main/app-login-administrador/section[2]/section/form/section[4]/input";

    public InicioSesion() {
        super(driver);
    }

    //Ingresa a la aplicacion
    public void navegarAplicacion(){
        navegarPorLaAplicacion("http://localhost:4200");
    }

    //Le da click en el boton administrador
    public void  ingresarAdministrador(){
        clickElement(clickadministrador);
    }

    //escribe en los dos inputs de correo y contrasena
    public void escribircorreocontrasena(String correo, String contrasena){
        escribir(this.correo, correo);
        escribir(this.contrasena, contrasena);

    }

    //click en el boton iniciar sesion
    public void clickiniciarsesion(){
        clickElement(btn_iniciar_sesion);
    }





}
