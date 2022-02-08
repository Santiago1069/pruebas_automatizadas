package pages.proveedor;

import org.openqa.selenium.WebDriver;
import pages.ConfiguracionFunciones;

public class BuscarResidente extends ConfiguracionFunciones {

    private String tipo_documento = "//*[@id=\"buscar_tipo_documento\"]";
    private String nro_documento = "//*[@id=\"buscar_numero_documento\"]";
    private String primer_apellido = "//*[@id=\"buscar_apellidos\"]";
    private String btn_buscar = "/html/body/app-root/main/app-informacion-residente/section[2]/section[3]/form/section[4]/input";

    public BuscarResidente() {
        super(driver);
    }

    //Ingresa a la aplicacion
    public void navegarAplicacion(){
        navegarPorLaAplicacion("http://localhost:4200/informacion-residente");
    }

    //Selecciona del select el tipo de documento
    public void selccionarTipoDocumento(String categoria){
        selectOption(tipo_documento, categoria);
    }

    //Escribimos en los inputs
    public void llenarInput(String numero_documento, String apellido ){
        escribir(this.nro_documento, numero_documento);
        escribir(this.primer_apellido, apellido);
    }

    //click en el boton buscar
    public void clickBuscar(){
        clickElement(btn_buscar);
    }


}
