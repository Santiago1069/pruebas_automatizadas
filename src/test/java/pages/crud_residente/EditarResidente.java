package pages.crud_residente;

import org.openqa.selenium.WebDriver;
import pages.ConfiguracionFunciones;

public class EditarResidente extends ConfiguracionFunciones {

    private String btn_registrar = "//*[@id=\"tabla\"]/tbody/tr[5]/td[11]/button";
    private String input_tipo_documento = "//*[@id=\"ventana_editar\"]/form/section[1]/section[1]/section[1]/input";
    private String input_nombres = "//*[@id=\"ventana_editar\"]/form/section[1]/section[1]/section[2]/input";
    private String input_celular = "//*[@id=\"ventana_editar\"]/form/section[1]/section[1]/section[3]/input";
    private String input_nro_apartamento = "//*[@id=\"ventana_editar\"]/form/section[1]/section[1]/section[4]/input";
    private String input_nro_documento = "//*[@id=\"ventana_editar\"]/form/section[1]/section[2]/section[1]/input";
    private String input_apellidos = "//*[@id=\"ventana_editar\"]/form/section[1]/section[2]/section[2]/input";
    private String input_correo = "//*[@id=\"ventana_editar\"]/form/section[1]/section[2]/section[3]/input";
    private String nro_torre = "//*[@id=\"ventana_editar\"]/form/section[1]/section[2]/section[4]/input";
    private String btn_actualizar = "//*[@id=\"ventana_editar\"]/form/section[2]/section/input";

    public EditarResidente() {
        super(driver);
    }

    //Ingresa a la aplicacion
    public void navegarAplicacion(){
        navegarPorLaAplicacion("http://localhost:4200/tabla-registrados");
    }

    //Le da click en el boton editar un residente
    public void  clickBtnEditar(){
        clickElement(btn_registrar);
    }

    //escribe en todos los inputs
    public void inputsEditar(String tipo_documento, String nombres, String celular, String nro_apartamento, String nro_documento, String apellidos, String correo, String nro_torre ){
        escribir(this.input_tipo_documento, tipo_documento);
        escribir(this.input_nombres, nombres);
        escribir(this.input_celular, celular);
        escribir(this.input_nro_apartamento, nro_apartamento);
        escribir(this.input_nro_documento, nro_documento);
        escribir(this.input_apellidos, apellidos);
        escribir(this.input_correo, correo);
        escribir(this.nro_torre, nro_torre);
    }

    //click boton actualizar
    public void clickactualizar(){
        clickElement(btn_actualizar);
    }







}
