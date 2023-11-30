package glue;

import org.openqa.selenium.WebDriver;
import pom.HomePage;
import pom.RegisterPage;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    //PAGE
    protected HomePage homePage = new HomePage(driver);
    protected RegisterPage registerPage = new RegisterPage(homePage.getDriver());
}
