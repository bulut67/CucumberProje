package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.EbayPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class EbayStepDefinitions {
    EbayPage ebayPage=new EbayPage();
    @Given("kullanici ebay sayfasina gider")
    public void kullanici_ebay_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("ebay_link"));
    }


    @Given("kullanici {string} aramasi yap")
    public void kullanici_aramasi_yap(String string) {
        ebayPage.searchBox.sendKeys(string+ Keys.ENTER);


    }



    @Then("cikan sonucu control ed")
    public void cikan_sonucu_control_ed() {
        System.out.println(ebayPage.ebayresult.getText());
    }

}
