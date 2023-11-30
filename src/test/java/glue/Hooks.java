package glue;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private static WebDriver driver;
    public static int numeroEscenario= 0;

    @Before
    public void setUp(){
        numeroEscenario++;
        System.out.println("Se esta ejecutando el escenario "+numeroEscenario);
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.spotify.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
