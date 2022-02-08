package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.proveedor.BuscarResidente;

public class BuscarResidenteStep {

    BuscarResidente google = new BuscarResidente();

    @Given("^ingreso a la aplicacion5$")
    public void navegarPorLaAplicacion (){
        google.navegarAplicacion();
    }

    @When("^ingreso de los datos del residente$")
    public void tipoDocumento (){
        google.selccionarTipoDocumento("cedula");
    }

    @And("^click en los eventos5$")
    public void llenamosInputs (){
        google.llenarInput("1066231858", "SANDOVAL");
        google.clickBuscar();
    }

    @Then("^obtengo resultados5$")
    public void obtengoResultados2 (){
    }

}
