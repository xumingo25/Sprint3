package pom;

import utils.ClaseBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends ClaseBase {

    //Centralizar los localizador
    By locatorBtnRegistrarte = By.xpath("//button[contains(text(),'Reg')]");

    //Constructor
    public HomePage(WebDriver driver) {
        super(driver);
    }

    //Crear las funciones de la página
    public void irARegistrarse(){
        click(esperarPorElementoClickeable(locatorBtnRegistrarte));
    }
}
