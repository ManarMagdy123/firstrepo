package utilites;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public  class BrowsersActions {
    static WebDriverWait wait ;

    public BrowsersActions() {}
    public static void waitFunction(By webElement,WebDriver driver){
        wait =new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(webElement));
    }

     public static void clickOnElement(By webElement, WebDriver driver){
         waitFunction(webElement,driver);
         wait.until(ExpectedConditions.elementToBeClickable(webElement));
         driver.findElement(webElement).click();
     }

    public static void sendDataToElement(By webElement, WebDriver driver ,String text){
        waitFunction(webElement,driver);
        driver.findElement(webElement).sendKeys(text);
    }

    public static String getDataFromElement(By webElement, WebDriver driver){
        waitFunction(webElement,driver);
        return driver.findElement(webElement).getText();
    }
    public static void selectDataFromCheckBox(By webElement,WebDriver driver,String text){
        waitFunction(webElement,driver);
        Select selection=new Select(driver.findElement(webElement));
        selection.selectByVisibleText(text);
    }
}
