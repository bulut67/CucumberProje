package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.WalmartPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class WalmartStepDefinitions {
    WalmartPage walmartPage=new WalmartPage();
    @Given("kullanici walmart sayfasina gider")
    public void kullanici_walmart_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("walmart_link"));
    }



    @Given("kullanici {string} aramasi yapariz")
    public void kullanici_aramasi_yapariz(String string) {
        walmartPage.SearchBox.sendKeys(string+ Keys.ENTER);


    }
    @Then("cikan sonucu control ederiz")
    public void cikan_sonucu_control_ederiz() {
        System.out.println(walmartPage.result.getText());
    }

}
