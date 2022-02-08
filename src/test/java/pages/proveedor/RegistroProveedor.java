package pages.proveedor;

import org.openqa.selenium.WebDriver;
import pages.ConfiguracionFunciones;

public class RegistroProveedor extends ConfiguracionFunciones {

    private String btn_rol_proveedor = "/html/body/app-root/main/app-inicio/section[2]/section[1]";
    private String tipo_documento = "//*[@id=\"tipo_documento\"]";
    private String nro_documento = "//*[@id=\"numero_documento\"]";
    private String nombre = "//*[@id=\"nombre_completo\"]";
    private String btn_siguiente = "/html/body/app-root/main/app-informacion-proveedor/section[3]/section[3]/form/section[5]/input[1]";

    public RegistroProveedor() {
        super(driver);
    }

    //Ingresa a la aplicacion
    public void navegarAplicacion(){
        navegarPorLaAplicacion("http://localhost:4200");
        clickElement(btn_rol_proveedor);
    }

    //Selecciona del select el tipo de documento
    public void selccionarTipoDocumento(String categoria){
        selectOption(tipo_documento, categoria);
    }

    public void llenarCampos(String numero_documento, String nombres ){
        escribir(this.nro_documento, numero_documento);
        escribir(this.nombre, nombres);
    }

    //click en el boton siguiente
    public void clickSiguiente(){
        clickElement(btn_siguiente);
    }


}
