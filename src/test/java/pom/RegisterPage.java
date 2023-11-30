package pom;

import utils.ClaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends ClaseBase {
    //Centralizamos localizador
    By locatorTxtEmail = By.id("username");
    By locatorBtnSiguiente = By.xpath("//button[@data-testid='submit']");
    By locatorLabelErrorMailExistente = By.xpath("//span[contains(text(),'Esta dirección ya está vinculada a una cuenta')]");

    By locatorIngresoFono = By.name("inputPhoneNumber");
    By locatorLinkUsoTelefono = By.partialLinkText("Usa un n");
    By locatorMensajeSMSValido = By.xpath("//p[@data-testid='verify-phone-number']");
    By locatorBtnSiguienteFono = By.id("phonelogin-button");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    //Acciones del sitio
    public void ingresarMail(String email){
        agregarTexto(esperarPorPresenciaDeElementoWeb(locatorTxtEmail),email);
    }



    public void siguiente(){
        click(esperarPorElementoClickeable(locatorBtnSiguiente));
    }

    public String obtenerErrorMailExistente(){
        return obtenerTexto(esperarPorPresenciaDeElementoWeb(locatorLabelErrorMailExistente));
    }

    public void irARegistroPorTelefono(){
        click(esperarPorElementoClickeable(locatorLinkUsoTelefono));
    }

    public void ingresarFono(String fono){
        agregarTexto(esperarPorPresenciaDeElementoWeb(locatorIngresoFono),fono);
    }

    public String obtenerMensajeSMSValido(){
        return obtenerTexto(esperarPorPresenciaDeElementoWeb(locatorMensajeSMSValido));
    }

    public void irSiguienteFono(){
        click(esperarPorElementoClickeable(locatorBtnSiguienteFono));
    }



}
