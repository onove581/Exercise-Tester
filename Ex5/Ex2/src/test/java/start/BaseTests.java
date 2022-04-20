package start;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import page.HomePage;
//
//
//public class BaseTests {
//    private WebDriver driver;
//    protected HomePage homePage;
//
//    @BeforeEach
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
//        driver.manage().window() . maximize();
//        homePage = new HomePage(driver);
////        driver. manage().timeouts() .implicitlyWait(  30, TimeUnit .SECONDS);
////        driver.quit();
//    }
//    @AfterEach
//    public void tearDown(){
//        driver.quit();
//    }
////    public static void main(String[] args) {
////        BaseTests test = new BaseTests();
////        test.setUp();
////    }
//}