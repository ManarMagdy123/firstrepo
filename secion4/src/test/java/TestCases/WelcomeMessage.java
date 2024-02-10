package TestCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

public class WelcomeMessage extends BaseTest {
    @Test
    public void sampleTest1()

    {
        homePage.clickOnLoginButton();
        LoginPage loginpage=new LoginPage(driver);
        softassert.assertEquals(loginpage.getWelcomeMessageText(),"Welcome, Please Sign In!");
        softassert.assertAll();
    }
}
