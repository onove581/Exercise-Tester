package start;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestPlan {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Ultil.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Waiting for loading ")
    public static void submitForm(){
        driver.get(Ultil.BASE_URL);
        WebForm web=new WebForm(driver);
        web.pressSubmitButton();
        WebDriverWait s=new WebDriverWait(driver,30);
        WebDriverWait wait=new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
        System.out.println(driver.findElement(By.id("finish")).getText());
        driver.manage() .timeouts() .implicitlyWait( 30, TimeUnit.SECONDS);
        FluentWait waits = new FluentWait(driver) .withTimeout(10, TimeUnit.SECONDS)
                .pollingEvery(  2, TimeUnit .SECONDS).ignoring(NoSuchElementException.class);
        waits.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));
        System.out.println(driver.findElement(By.id("finish")).getText());
        driver.quit();
    }
//
//    @AfterSuite
//    public static void cleanUp(){
//        driver.manage().deleteAllCookies();
//        driver.close();
//    }
}
