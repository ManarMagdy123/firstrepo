package pages;
import utilites.BrowsersActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    By emailBox=By.xpath("//input[@class=\"email\"]");
    By passwordBox=By.xpath("//input[@id=\"Password\"]");
    By forgetPasswordButton=By.xpath("//a[text()=\"Forgot password?\"]");
    By RememberMeButton=By.xpath("//input[@id=\"RememberMe\"]");
    By logInButtonSubmit =By.xpath("//button[@class=\"button-1 login-button\"]");
    By registerButtonLoginPage =By.xpath("//button[@class=\"button-1 register-button\"]");
    By welcomeMessage=By.xpath("//div[@class=\"page-title\"]");
    By invalidLoginMessage=By.xpath("//div[@class=\"message-error validation-summary-errors\"]");
    By validLoginMessage=By.xpath("//div//h2[text()=\"Welcome to our store\"]");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void sendEmail(String text){
        BrowsersActions.sendDataToElement(emailBox,driver,text);
    }


    public void sendPassword(String password){
        BrowsersActions.sendDataToElement(passwordBox,driver,password);
    }


    public void clickOnLogInButtonInLoginPage(){
        BrowsersActions.clickOnElement(logInButtonSubmit,driver);
    }

    public void clickOnRememberMeButton(){
        BrowsersActions.clickOnElement(RememberMeButton,driver);
    }

    public void clickOnForgetPasswordButton(){
        BrowsersActions.clickOnElement(forgetPasswordButton,driver);
    }

    public void clickOnRegisterButtonInLoginPage(){
        BrowsersActions.clickOnElement(registerButtonLoginPage,driver);
    }

    public String getWelcomeMessageText(){
       return BrowsersActions.getDataFromElement(welcomeMessage,driver);
    }

    public String getInvalidLoginMessage(){
       return BrowsersActions.getDataFromElement(invalidLoginMessage,driver);
    }

    public String getValidLoginMessage(){
       return BrowsersActions.getDataFromElement(validLoginMessage,driver);
    }
}
