package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilites.BrowsersActions;


public class BasePage  {
    WebDriver driver;
    WebDriverWait wait ;

    By registerButton=By.xpath("//a[@class=\"ico-register\"]");
    By loginButton=By.xpath("//a[@class=\"ico-login\"]");

    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait =new WebDriverWait(driver,20);
    }

    public void clickOnLoginButton(){
        BrowsersActions.clickOnElement(loginButton,driver);
    }
    public void clickOnRegisterButton(){
        BrowsersActions.clickOnElement(registerButton,driver);
    }
}
