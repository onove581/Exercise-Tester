package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By buttonJSalert=By.xpath("/html/body/div[2]/div/div/ul/li[1]/button");
private By buttonJSconfirm=By.xpath("/html/body/div[2]/div/div/ul/li[2]/button");
    public AlertPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickButtonJSAlert(){
        driver.findElement(buttonJSalert).click();
    }
    public void acceptJSAlert(){
        driver.switchTo().alert().accept();
    }
    public void clickButtonJSConfirm(){
    driver.findElement(buttonJSconfirm).click();

    }
    public void clickToCancel(){
    driver.switchTo().alert().dismiss();

    }
    public String getAlertText(){
    return driver.switchTo().alert().getText();
    }
}
