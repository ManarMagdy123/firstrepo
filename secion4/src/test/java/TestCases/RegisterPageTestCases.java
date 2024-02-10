package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.RegisterationPage;

import java.util.concurrent.TimeUnit;

public class RegisterPageTestCases extends BaseTest{

    @Test(priority = 0)
    public void verifyValidRegisterWithUnUsedEmail() {
        homePage.clickOnRegisterButton();
        RegisterationPage registerationPage= new RegisterationPage(driver);
        registerationPage.clickOnFemaleButton();
        registerationPage.sendFirstName("manar");
        registerationPage.sendLastName("mohamed");
        registerationPage.sendEmail("mahmed.mrmr15352255555@gmail.com");
        registerationPage.sendDayOfBirth("9");
        registerationPage.sendMonthOfBirth("October");
        registerationPage.sendYearOfBirth("2001");
        registerationPage.sendCompany("amazon");
        registerationPage.clickOnNewSLetter();
        registerationPage.sendPasswordInRegisterPage("mahmd123456789");
        registerationPage.sendConfirmPassword("mahmd123456789");
        registerationPage.clickOnRegisterButtonInRegisterPage();
        softassert.assertEquals(registerationPage.getWelcomeMessage(), "Your registration completed");
        softassert.assertAll();
    }

    @Test(priority = 1)
    public void verifyValidRegisterWithUsedEmail() {
        homePage.clickOnRegisterButton();
        RegisterationPage registerationPage= new RegisterationPage(driver);
        registerationPage.clickOnFemaleButton();
        registerationPage.sendFirstName("manar");
        registerationPage.sendLastName("mohamed");
        registerationPage.sendEmail("mahmed.mrmr15352255555@gmail.com");
        registerationPage.sendDayOfBirth("9");
        registerationPage.sendMonthOfBirth("October");
        registerationPage.sendYearOfBirth("2001");
        registerationPage.sendCompany("amazon");
        registerationPage.clickOnNewSLetter();
        registerationPage.sendPasswordInRegisterPage("mahmd123456789");
        registerationPage.sendConfirmPassword("mahmd123456789");
        registerationPage.clickOnRegisterButtonInRegisterPage();
        softassert.assertEquals(registerationPage.getInvalidRegisterMessage() , "The specified email already exists");
        softassert.assertAll();
    }
}
