package step;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pages.pruebaautomatizacionPage;


import static org.junit.Assert.assertTrue;

public class pruebaautomatizacionStep {

    pruebaautomatizacionPage pruebaautomatizacion = new pruebaautomatizacionPage();

    @Given("^ingreso al formulario$")
    public void navegarALaAplicacion () throws InterruptedException {
        pruebaautomatizacion.ingresarformulario();
        pruebaautomatizacion.llenarinputinicio("*Aqui va el correo electronico");
        pruebaautomatizacion.clicsiguiente();
        Thread.sleep(5000);
        pruebaautomatizacion.llenarinputcontrasena("*Aqui va la contraseña*");
        pruebaautomatizacion.cliciniciarsesion();

    }


    @When("^ingreso los campos$")
    public void ingresoDatos() throws InterruptedException {
        Thread.sleep(8000);
        pruebaautomatizacion.llenarInputspreguntas("Santiago Sandoval Arboleda", "Medellin, Antioquia", "Quiero tener mi propia empresa, ser alguien que le aporte al mundo cosas buenas", "Si claro, mi objetivo es llegar a la ingeneria");
    }

    @And("^envio el formulario$")
    public void clickEventos(){
      pruebaautomatizacion.clickEnviar();
    }

}
