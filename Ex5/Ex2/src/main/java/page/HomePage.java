package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By formLoginLink = By.linkText("Form Authentication");
    public HomePage(WebDriver driver){
            this.driver = driver;
}
    public LoginPage clickForm(){//tra ve 1 trang FormAuthentication
        driver.findElement(formLoginLink).click();
        return new LoginPage(driver);
        }

        }