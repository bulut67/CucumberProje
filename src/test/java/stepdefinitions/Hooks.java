package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    /*
    TestNG'de ki gibi @BeforeMethod gibi calisir
    Her senaryodan once calisir

     */
    @Before
    public void setUp(){

        System.out.println("setUp calisti");
    }
    /*
     TestNG'de ki gibi @AfterMethod gibi calisir
    Her senaryodan sonra calisir

     */
    @After
    public void tearDown(Scenario scenario){
        System.out.println("tearDown calisti");
        /*
        Ekran goruntusu almak icin bu sabit kodu kullanabiliriz
         */
        final  byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

        /*
        eger senaryonun sonucu FAILED ise ekran goruntusu rapora
        ekleyebilirim
         */
        if (scenario.isFailed()){
            scenario.embed(screenshot,"image/png");

        }

    }
}
