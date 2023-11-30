package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pom.RegisterPage;


public class Test extends TestBase{


    @Given("Estoy en la pagina de spotify")
    public void estoyEnLaPaginaDeSpotify() {
        Assert.assertEquals("Reproductor web de Spotify: música para todo el mundo",
                homePage.obtenerTituloSitio());
    }

    @Given("Presiono el boton registrarte en home de spotify")
    public void presionoElBotonRegistrarteEnHomeDeSpotify() {
        homePage.irARegistrarse();
    }


    @When("Ingreso en el campo direccion correo el valor {string} en formulario de registro")
    public void ingresoEnElCampoDireccionCorreoElValorEnFormularioDeRegistro(String correo) {
        registerPage.ingresarMail(correo);
    }

    @When("Presiono el boton siguiente en formulario de registro")
    public void presionoElBotonSiguienteEnFormularioDeRegistro() {
        registerPage.siguiente();
    }

    @Then("Visualizo mensaje de error {string}")
    public void visualizoMensajeDeError(String resultadoEsperado) {
        Assert.assertEquals(resultadoEsperado,registerPage.obtenerErrorMailExistente());
    }

}
