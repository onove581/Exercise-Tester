package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class baseTest {
    private WebDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.quit();
    }

    public static void main(String[] args) {
        baseTest test = new baseTest();
        test.setup();

    }
}

