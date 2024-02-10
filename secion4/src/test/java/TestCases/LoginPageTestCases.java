package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;

public class LoginPageTestCases extends BaseTest {

    @Test(priority =0)
    public void verifyValidLogInWithValidEmailAndValidPassword() {
        homePage.clickOnLoginButton();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.sendEmail("mahmed.mrmr15352255555@gmail.com");
        loginpage.sendPassword("mahmd123456789");
        loginpage.clickOnLogInButtonInLoginPage();
        softassert.assertEquals(loginpage.getValidLoginMessage(), "Welcome to our store");
        softassert.assertAll();
    }

    @Test(priority = 1)
    public void verifyInValidLogInWithValidEmailAndInvalidPassword() {
        homePage.clickOnLoginButton();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.sendEmail("mahmed.mrmr15352255555@gmail.com");
        loginpage.sendPassword("mahmd23456789");
        loginpage.clickOnLogInButtonInLoginPage();
        System.out.println(loginpage.getInvalidLoginMessage());
        softassert.assertEquals(loginpage.getInvalidLoginMessage(),
                "Login was unsuccessful. Please correct the errors and try again.\n" +
                "The credentials provided are incorrect");
        softassert.assertAll();
    }
}
