package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.crud_residente.EditarResidente;

public class EditarResidenteStep {

    EditarResidente google = new EditarResidente();

    @Given("^ingreso a la aplicacion3$")
    public void navegarPorLaAplicacion (){
        google.navegarAplicacion();
    }

    @When("^edito un residente$")
    public void prueboLaAplicacion (){
        google.clickBtnEditar();
        google.inputsEditar("CEDULAEXTRANJERIA", "Martha", "3103214568", "1003", "012354789", "Arboleda", "Martha@gmail.com", "3");
    }

    @And("^click en los eventos3$")
    public void clickEventos3 (){
        google.clickactualizar();
    }


    @Then("^obtengo resultados3$")
    public void obtengoResultados3 (){

    }

}