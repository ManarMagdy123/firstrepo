package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.LoginPage;

public class DataProviderTest extends BaseTest{
    @DataProvider(name="LoginData")
    public Object[][]provideLoginData(){
        return new Object[][]{
                {"mahmed.mrmr15352255555@gmail.com","mahmd123456789"},//valid
                {"mahmed.mrmr15352255555@gmail.com","mahmd123456789"},//incorrect password
        };
    }
    @Test(dataProvider="LoginData")
    public void LoginTest(String email,String password){
        homePage.clickOnLoginButton();
        LoginPage loginpage = new LoginPage(driver);
        loginpage.sendEmail(email);
        loginpage.sendPassword(password);
        loginpage.clickOnLogInButtonInLoginPage();
        softassert.assertEquals(loginpage.getValidLoginMessage(), "Welcome to our store");
        softassert.assertAll();
    }
}
