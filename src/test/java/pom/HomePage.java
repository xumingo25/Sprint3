package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.ClaseBase;

public class HomePage extends ClaseBase {

    //Centralizar los localizador
    //By locatorBtnRegistrarte = By.xpath("//button[contains(text(),'Reg')]");
    @FindBy(xpath = "//button[contains(text(),'Reg')]")
    WebElement btnRegistrate;

    //Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Crear las funciones de la página
    public void irARegistrarse(){
        click(esperarPorElementoClickeable(btnRegistrate));
    }
}
