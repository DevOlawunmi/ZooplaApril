package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverLib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver){
        DriverLib.driver =driver;
        PageFactory.initElements(driver, this);
    }
}
