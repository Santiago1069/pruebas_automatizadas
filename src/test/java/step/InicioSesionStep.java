package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.inicio_sesion.InicioSesion;

public class InicioSesionStep {

    InicioSesion google = new InicioSesion();

    @Given("^navego por la aplicacion$")
    public void navegarPorLaAplicacion (){
        google.navegarAplicacion();
    }


    @When("^Pruebo la aplicacion$")
    public void prueboLaAplicacion (){
        google.ingresarAdministrador();
    }


    @And("^click en los eventos1$")
    public void clickEventos1 (){
        google.escribircorreocontrasena("Sandoval@gmail.com", "1069926239");
        google.clickiniciarsesion();
    }


    @Then("^obtengo resultados1$")
    public void obtengoResultados1 (){


    }






}
