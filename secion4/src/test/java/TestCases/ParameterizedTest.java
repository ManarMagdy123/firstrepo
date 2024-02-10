package TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;
public class ParameterizedTest extends BaseTest {
    @Parameters({"email","password"})
    @Test
    public void loginTest(String email,String password){
        homePage.clickOnLoginButton();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.sendEmail(email);
        loginpage.sendPassword(password);
        loginpage.clickOnLogInButtonInLoginPage();
        softassert.assertEquals(loginpage.getValidLoginMessage(), "Welcome to our store");
        softassert.assertAll();
    }
}
