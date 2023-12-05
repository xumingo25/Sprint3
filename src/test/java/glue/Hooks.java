package glue;

import com.aventstack.extentreports.model.Report;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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
    public void tearDown(Scenario scenario){
        byte[] screenShot;
        if(scenario.isFailed()){
            screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());
            scenario.log("Fallo el step del scenario");
        }else{
            screenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot,"image/png",scenario.getName());
            scenario.log("Escenario OK");
        }
        driver.quit();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
