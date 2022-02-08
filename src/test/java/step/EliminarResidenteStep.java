package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.crud_residente.EliminarResidente;

public class EliminarResidenteStep {

    EliminarResidente google = new EliminarResidente();

    @Given("^ingreso a la aplicacion2$")
    public void navegarPorLaAplicacion (){
        google.navegarAplicacion();
    }

    @And("^elimino un residente$")
    public void clickEventos3 (){
        google.clickBtnElimiar();
    }


}
