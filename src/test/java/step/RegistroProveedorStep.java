package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.proveedor.RegistroProveedor;

public class RegistroProveedorStep {

    RegistroProveedor google = new RegistroProveedor();

    @Given("^ingreso a la aplicacion4$")
    public void navegarPorLaAplicacion (){
        google.navegarAplicacion();
    }

    @When("^registro un proveedor$")
    public void prueboLaAplicacion (){
        google.selccionarTipoDocumento("cedula_extranjera");
        google.llenarCampos("1058978457", "juan sandoval");
    }

    @And("^click en los eventos4$")
    public void clickEventos4 (){
        google.clickSiguiente();
    }

    @Then("^obtengo resultados4$")
    public void obtengoResultados4 (){

    }

}
