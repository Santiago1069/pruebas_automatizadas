package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.crud_residente.CrearResidente;

public class CrearResidenteStep {

    CrearResidente google = new CrearResidente();

    @Given("^ingreso a la aplicacion1$")
    public void navegarPorLaAplicacion (){
        google.navegarAplicacion();
    }


    @When("^registro un residente$")
    public void prueboLaAplicacion (){
        google.ingresarRegistrarResidente();
    }


    @And("^click en los eventos2$")
    public void clickEventos2 (){
        google.selccionarTipoDocumento("1");
        google.llenarInputs("Paula", "3123345578", "2003", "16989784", "Rojas", "Paula@gmail.com", "2");
        google.clickRegistar();
    }


    @Then("^obtengo resultados2$")
    public void obtengoResultados2 (){
    }


}
