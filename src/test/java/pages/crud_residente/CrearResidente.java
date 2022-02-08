package pages.crud_residente;

import pages.ConfiguracionFunciones;

public class CrearResidente extends ConfiguracionFunciones {

    private String btn_registrar_residente = "//*[@id=\"btn_registrar\"]";
    private String tipo_documento = "/html/body/app-root/main/app-registrar-residente/section[4]/form/section[1]/section[1]/select";
    private String input_nombres  = "//*[@id=\"nombres\"]";
    private String input_celular  = "//*[@id=\"celular\"]";
    private String input_nro_apart  = "//*[@id=\"numero_apartamento\"]";
    private String input_nro_documento  = "//*[@id=\"numero_documento\"]";
    private String input_apellidos  = "//*[@id=\"apellidos\"]";
    private String input_correo  = "//*[@id=\"email\"]";
    private String input_nro_torre  = "//*[@id=\"numero_torre\"]";
    private String btn_registrar  = "/html/body/app-root/main/app-registrar-residente/section[4]/form/section[3]/section[1]/input";

    public CrearResidente() {
        super(driver);
    }

    //Ingresa a la aplicacion
    public void navegarAplicacion(){
        navegarPorLaAplicacion("http://localhost:4200/tabla-registrados");
    }

    //Le da click en el boton Registrar un residente
    public void  ingresarRegistrarResidente(){
        clickElement(btn_registrar_residente);
    }

    //Selecciona del select el tipo de documento
    public void selccionarTipoDocumento(String categoria){
        selectOption(tipo_documento, categoria);
    }

    //escribe en todos los inputs
    public void llenarInputs(String nombres, String celular, String apartamento, String numero_documento, String apellidos, String correo, String torre ){
        escribir(this.input_nombres, nombres);
        escribir(this.input_celular, celular);
        escribir(this.input_nro_apart, apartamento);
        escribir(this.input_nro_documento, numero_documento);
        escribir(this.input_apellidos, apellidos);
        escribir(this.input_correo, correo);
        escribir(this.input_nro_torre, torre);

    }

    //click en el boton registrar
    public void clickRegistar(){
        clickElement(btn_registrar);
    }


}
