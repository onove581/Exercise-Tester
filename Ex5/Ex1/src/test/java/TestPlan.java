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

    @Test(priority = 1)
    public static void submitForm1(){
        driver.get(Ultil.BASE_URL);
        WebForm web=new WebForm(driver);
        web.clicks();
        web.enterFirstName();
        web.enterLastName();
        web.pressSubmitButton();


        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test(priority = 2)
    public static void submitForm2(){
        driver.get(Ultil.BASE_URL);
        WebForm web=new WebForm(driver);
        web.clicks();
        web.us1();
        web.enterLastName();
        web.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test(priority = 3)
    public static void submitForm3(){
        driver.get(Ultil.BASE_URL);
        WebForm web=new WebForm(driver);
        web.clicks();
        web.us2();
        web.enterLastName();
        web.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test(priority = 4)
    public static void submitForm4(){
        driver.get(Ultil.BASE_URL);
        WebForm web=new WebForm(driver);
        web.clicks();
        web.us1();
        web.pas1();
        web.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test(priority = 5)
    public static void submitForm5(){
        driver.get(Ultil.BASE_URL);
        WebForm web=new WebForm(driver);
        web.clicks();
        web.us2();
        web.pas2();
        web.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test(priority = 6)
    public static void submitForm6(){
        driver.get(Ultil.BASE_URL);
        WebForm web=new WebForm(driver);
        web.clicks();
        web.us1();
        web.pas2();
        web.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    @Test(priority = 7)
    public static void submitForm7(){
        driver.get(Ultil.BASE_URL);
        WebForm web=new WebForm(driver);
        web.clicks();
        web.us2();
        web.pas1();
        web.pressSubmitButton();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }

    @AfterSuite
    public static void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
