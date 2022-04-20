import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Testform {
    private static final WebDriver driver = new ChromeDriver();

    @BeforeSuite
    public static void main(String[] args) {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);
    }

    @Test(testName = "Submit a automation-practice-form")
    public static void submitForm(){
        driver.get(Utils.BASE_URL);
        WebForm webForm = new WebForm(driver);
        webForm.enterFirstName();
        webForm.enterlastname();
        webForm.entermail();
        webForm.entergender();
        webForm.enterphone();
        webForm.enterdate();
        webForm.enterhobbi();
        webForm.enteraddres();




        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//        webForm.verifyAlertSuccess();
    }

//    @AfterSuite
//    public static void cleanUp(){
//        driver.manage().deleteAllCookies();
//        driver.close();
//    }
}