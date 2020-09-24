package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class GoogleAramaStepDefinitions {

    GooglePage googlePage= new GooglePage();

    @Given("kullanici google sayfasina gider")
    public void kullanici_google_sayfasina_gider() {

        Driver.getDriver().get(ConfigurationReader.getProperty("google_link"));

    }



    @Given("techproeducation aramasi yapar")
    public void techproeducation_aramasi_yapar() {

        googlePage.searchBox.sendKeys(ConfigurationReader.getProperty("google_kelime")+ Keys.ENTER);

    }
    @Then("sayfa basligini control eder")
    public void sayfa_basligini_control_eder() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains(ConfigurationReader.getProperty("google_kelime")));




    }

}
