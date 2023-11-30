package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ClaseBase;

public class RegisterPage extends ClaseBase {
    //Centralizamos localizador
    //By locatorTxtEmail = By.id("username");
    @FindBy(id = "username")
    WebElement txtEmail;

    //By locatorBtnSiguiente = By.xpath("//button[@data-testid='submit']");
    @FindBy(xpath = "//button[@data-testid='submit']")
    WebElement btnSiguiente;

    //By locatorLabelErrorMailExistente = By.xpath("//span[contains(text(),'Esta dirección ya está vinculada a una cuenta')]");
    @FindBy(xpath = "//span[contains(text(),'Esta dirección ya está vinculada a una cuenta')]")
    WebElement labelErrorMailExistente;

    //By locatorIngresoFono = By.name("inputPhoneNumber");
    @FindBy(name = "inputPhoneNumber")
    WebElement txtFono;

    //By locatorLinkUsoTelefono = By.partialLinkText("Usa un n");
    @FindBy(partialLinkText = "Usa un n")
    WebElement linkUsoTelefono;


    //By locatorMensajeSMSValido = By.xpath("//p[@data-testid='verify-phone-number']");
    @FindBy(xpath = "//p[@data-testid='verify-phone-number']")
    WebElement mensajeSMSValido;

    //By locatorBtnSiguienteFono = By.id("phonelogin-button");
    @FindBy(id = "phonelogin-button")
    WebElement btnSiguienteFono;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //Acciones del sitio
    public void ingresarMail(String email){
        agregarTexto(esperarPorElementoClickeable(txtEmail),email);
    }



    public void siguiente(){
        click(esperarPorElementoClickeable(btnSiguiente));
    }

    public String obtenerErrorMailExistente(){
        return obtenerTexto(esperarPorElementoClickeable(labelErrorMailExistente));
    }

    public void irARegistroPorTelefono(){
        click(esperarPorElementoClickeable(linkUsoTelefono));
    }

    public void ingresarFono(String fono){
        agregarTexto(esperarPorElementoClickeable(txtFono),fono);
    }

    public String obtenerMensajeSMSValido(){
        return obtenerTexto(esperarPorElementoClickeable(mensajeSMSValido));
    }

    public void irSiguienteFono(){
        click(esperarPorElementoClickeable(btnSiguienteFono));
    }



}
