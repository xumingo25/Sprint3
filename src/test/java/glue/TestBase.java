package glue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pom.HomePage;
import pom.RegisterPage;

public class TestBase {
    protected WebDriver driver = Hooks.getDriver();
    //PAGE OBJECT
    //protected HomePage homePage = new HomePage(driver);
    //protected RegisterPage registerPage = new RegisterPage(homePage.getDriver());

    //PAGE FACTORY
    protected HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    protected RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
}
