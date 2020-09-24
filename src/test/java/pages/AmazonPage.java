package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {

    public AmazonPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchBox;
    @FindBy(xpath = "//span[@dir='auto']")
    public WebElement result;
    @FindBy(id = "searchDropdownBox")
    public WebElement dropDown;
}
