package pages.crud_residente;

import org.openqa.selenium.WebDriver;
import pages.ConfiguracionFunciones;

public class EliminarResidente extends ConfiguracionFunciones {

    //Cada vez que ejecutemos la prueba pegamos en esta varia el Xpath del nuevo boton
    private String btn_eliminar = "//*[@id=\"tabla\"]/tbody/tr[5]/td[10]/button";

    public EliminarResidente() {
        super(driver);
    }

    public void navegarAplicacion(){
        navegarPorLaAplicacion("http://localhost:4200/tabla-registrados");
    }

    public void clickBtnElimiar(){
        clickElement(btn_eliminar);
    }


}
