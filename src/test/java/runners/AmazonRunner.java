package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"html:target/default-cucumber-reports",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"}, //rapor olusturmak icin
        features = "src/test/resources/features", //features klasorunun adresini
        glue = "stepdefinitions", //testlerinin icersinde oldugu pakets ismi
        tags = "@amazon", // seçtiğiniz tag'a ait testler çalıştırılır.
        dryRun = false //Senaryo'da olusturdugumuz anca henuz test methodu
        // yazilmamis olan adimlarin steps methods consol'da gormek icin true seklinde kullaniriz
)


public class AmazonRunner {
}
