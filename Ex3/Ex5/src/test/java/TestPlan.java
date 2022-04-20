import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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

    @Test(testName = "Submit a saucedemo")
    public static void submitForm(){
        driver.get(Ultil.BASE_URL);
        WebForm web=new WebForm(driver);
        web.enterFirstName();
        web.enterLastName();
        web.pressSubmitButton();


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
