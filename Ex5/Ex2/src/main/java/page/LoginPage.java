package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
private WebDriver driver;

private By loginButton = By.xpath("By.xpath(\"//button[contains(text(),'Start')]\")");


public LoginPage(WebDriver driver){
        this.driver = driver;
        }
public SecureArePage clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecureArePage(driver);
        }
}
