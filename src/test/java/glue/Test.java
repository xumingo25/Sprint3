package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Test extends TestBase{


    @Given("Estoy en la pagina de spotify")
    public void estoy_en_la_pagina_de_spotify() {
        Assert.assertEquals("Reproductor web de Spotify: música para todo el mundo",
                homePage.obtenerTituloSitio());
    }

    @Given("Presiono el boton registrarte en home de spotify")
    public void presiono_el_boton_registrarte_en_home_de_spotify() {
        homePage.irARegistrarse();
    }


    @When("Ingreso en el campo direccion correo el valor {string} en formulario de registro")
    public void ingreso_en_el_campo_direccion_correo_el_valor_en_formulario_de_registro(String correo) {
        registerPage.ingresarMail(correo);
    }

    @When("Presiono el boton siguiente en formulario de registro")
    public void presiono_el_boton_siguiente_en_formulario_de_registro() {
        registerPage.siguiente();
    }

    @Then("Visualizo mensaje de error {string}")
    public void visualizo_mensaje_de_error(String resultadoEsperado) {
        Assert.assertEquals(resultadoEsperado,registerPage.obtenerErrorMailExistente());
    }

}
