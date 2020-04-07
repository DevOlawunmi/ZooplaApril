package co.uk.zoopla.pages;

import co.uk.zoopla.commons.DriverLib;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SearchResultPage extends BasePage {
    public SearchResultPage (WebDriver driver){
        DriverLib.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy (tagName = "h1")
    private WebElement pageTitle;
    @FindBy (css = ".listing-results-price.text-price")
    private List<WebElement> resultList;

    public void isSearchResultPageDisplayed(){
        Assert.assertTrue(pageTitle.isDisplayed());
    }
    public void isCorrectURLDisplayed(String location){
        driver.getCurrentUrl().contains(location.toLowerCase());
    }
    public void isPropertyDisplayed(String property){
        Assert.assertTrue(pageTitle.getText().contains(property));
    }
    public ProductDetailsPage clickOnARandomResult(){
        Random random = new Random();
       int randomNumber = random.nextInt(resultList.size()-1);
       resultList.get(randomNumber).click();
       return new ProductDetailsPage(driver);
            }
}
