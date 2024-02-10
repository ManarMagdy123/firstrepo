package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilites.BrowsersActions;

public class RegisterationPage extends BasePage{
    By femaleButton= By.xpath("//input[@id=\"gender-female\"]");
    By maleButton=By.xpath("//input[@id=\"gender-male\"]");
    By firstName=By.xpath("//input[@id=\"FirstName\"]");
    By lastName=By.xpath("//input[@id=\"LastName\"]");
    By dayOfBirth =By.xpath("//select[@name=\"DateOfBirthDay\"]");
    By monthOfBirth=By.xpath("//select[@name=\"DateOfBirthMonth\"]");
    By yearOfBirth=By.xpath("//select[@name=\"DateOfBirthYear\"]");
    By emailBox=By.xpath("//input[@name=\"Email\"]");
    By companyBox=By.xpath("//input[@name=\"Company\"]");
    By newsLetter=By.xpath("//input[@name=\"Newsletter\"]");
    By passwordBox=By.xpath("//input[@name=\"Password\"]");
    By confirmPasswordBox=By.xpath("//input[@name=\"ConfirmPassword\"]");
    By registerButtonSubmit =By.xpath("//button[@id=\"register-button\"]");
    By welcomeMessage=By.xpath("//div[@class=\"result\"]");
    By invalidRegisterMessage=By.xpath("//div[@class=\"message-error validation-summary-errors\"]//ul//li[text()=\"The specified email already exists\"]");
    public RegisterationPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnFemaleButton(){
        BrowsersActions.clickOnElement(femaleButton,driver);
    }

    public void clickOnMaleButton(){
        BrowsersActions.clickOnElement(maleButton,driver);
    }

    public void sendFirstName(String text){
        BrowsersActions.sendDataToElement(firstName,driver,text);
    }


    public void sendLastName(String text){
        BrowsersActions.sendDataToElement(lastName,driver,text);
    }


    public void sendEmail(String text){
        BrowsersActions.sendDataToElement(emailBox,driver,text);
    }

    public void sendDayOfBirth(String text){
        BrowsersActions.selectDataFromCheckBox(dayOfBirth,driver,text);
    }

    public void sendMonthOfBirth(String text){
        BrowsersActions.selectDataFromCheckBox(monthOfBirth,driver,text);
    }

    public void sendYearOfBirth(String text){
        BrowsersActions.selectDataFromCheckBox(yearOfBirth,driver,text);
    }

    public void sendCompany(String text){
        BrowsersActions.sendDataToElement(companyBox,driver,text);
    }

    public void clickOnNewSLetter(){
        BrowsersActions.clickOnElement(newsLetter,driver);
    }

    public void sendPasswordInRegisterPage(String text){
        BrowsersActions.sendDataToElement(passwordBox,driver,text);
    }

    public void sendConfirmPassword(String text){
        BrowsersActions.sendDataToElement(confirmPasswordBox,driver,text);
    }

    public void clickOnRegisterButtonInRegisterPage(){
        BrowsersActions.clickOnElement(registerButtonSubmit,driver);
    }
    public String getWelcomeMessage(){
        return BrowsersActions.getDataFromElement(welcomeMessage,driver);
    }
    public String getInvalidRegisterMessage(){
        return BrowsersActions.getDataFromElement(invalidRegisterMessage,driver);
    }
}
