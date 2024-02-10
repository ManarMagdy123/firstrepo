package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import utilites.BrowsersActions;
import utilites.DriverSetUP;


public class BaseTest {
    WebDriver driver;
    SoftAssert softassert;
    HomePage homePage;
    @BeforeMethod
    public void FunctionBeforeTest(){
        driver= DriverSetUP.driverSetUp("chrome","https://demo.nopcommerce.com/");
        softassert = new SoftAssert();
        homePage = new HomePage(driver);
    }
    @AfterMethod
    public void driverclose(){
        driver.close();
    }
}
