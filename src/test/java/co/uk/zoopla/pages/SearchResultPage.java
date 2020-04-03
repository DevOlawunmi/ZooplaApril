package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage {
    public SearchResultPage (WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
