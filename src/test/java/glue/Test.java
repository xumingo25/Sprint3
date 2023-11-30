package glue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test {
    //atributos
    WebDriver driver;

    @Given("Estoy en la pagina de spotify")
    public void estoyEnLaPaginaDeSpotify() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("Presiono el boton registrarte en home de spotify")
    public void presionoElBotonRegistrarteEnHomeDeSpotify() {
        driver.findElement(By.xpath("//button[contains(text(),'Reg')]")).click();
    }


    @When("Ingreso en el campo direccion correo el valor {string} en formulario de registro")
    public void ingresoEnElCampoDireccionCorreoElValorEnFormularioDeRegistro(String correo) {
        driver.findElement(By.id("username")).sendKeys(correo);
    }

    @When("Presiono el boton siguiente en formulario de registro")
    public void presionoElBotonSiguienteEnFormularioDeRegistro() {
        driver.findElement(By.xpath("//button[@data-testid='submit']")).click();
    }

    @Then("Visualizo mensaje de error {string}")
    public void visualizoMensajeDeError(String resultadoEsperado) {
        String textoObtenido = driver.findElement(By.xpath("//span[contains(text(),'Esta dirección ya está vinculada a una cuenta')]")).getText();
        Assert.assertEquals(resultadoEsperado,textoObtenido);
    }

}
