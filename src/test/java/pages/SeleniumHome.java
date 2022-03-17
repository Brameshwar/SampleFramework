package pages;

import core.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Sync;

public class SeleniumHome extends BaseTest {

    Sync sync = new Sync();;
    WebDriver driver;
    public SeleniumHome(){
        this.driver = BaseTest.driver;
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "selenium_logo")
    WebElement companyLogo;

    @FindBy(xpath = "xxxxxxx")
    WebElement xxxxxxxxx;

    public boolean validateSeleniumLogo() {
        sync.waitForElementToBeVisible(companyLogo);
        return companyLogo.isDisplayed();
    }


}
