import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    private WebDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
    }

    public static void main(String[] args) {
        BaseTests test = new BaseTests();
        test.setUp();

    }

    // Bài 3
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //driver .manageO .windowO .maximize();
        driver.manage().window().setSize(new Dimension(375, 812));
        driver.findElement(By.xpath("//button[contains(text(),'Start')]")) .click();
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




}
