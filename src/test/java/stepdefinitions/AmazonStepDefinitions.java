package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.AmazonPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage=new AmazonPage();
    @Given("kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigurationReader.getProperty("amazon_link"));

    }


    @Given("headphones aramasi yapar")
    public void headphones_aramasi_yapar() {
        amazonPage.searchBox.sendKeys("headphones"+ Keys.ENTER);


    }
    @Then("cikan sonucu control eder")
    public void cikan_sonucu_control_eder() {

        System.out.println(amazonPage.result.getText());
    }

    @Given("aramakutusuna camera aramasi yapar")
    public void aramakutusuna_camera_aramasi_yapar() {
       amazonPage.searchBox.sendKeys("camera"+Keys.ENTER);
    }
    @Given("kullanici {string} aramasi yapar")
    public void kullanici_aramasi_yapar(String string) {
        amazonPage.searchBox.sendKeys(string+Keys.ENTER);

    }
    @Given("kullanici dropdownda {string} secer")
    public void kullanici_dropdownda_secer(String string) {
        Select select=new Select(amazonPage.dropDown);
        select.selectByVisibleText(string);

    }


}
