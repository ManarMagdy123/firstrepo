package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilites.BrowsersActions;

public class HomePage extends BasePage{

    By searchTextBox=By.xpath("//input[@id=\"small-searchterms\"]");
    By searchButton=By.xpath("//button[@class=\"button-1 search-box-button\"]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void enterTextInSearchBox(String text){
        BrowsersActions.sendDataToElement(searchTextBox,driver,text);
    }

    public void clickOnSearchButton(){
        BrowsersActions.clickOnElement(searchButton,driver);
    }

}
