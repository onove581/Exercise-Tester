package start;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WebForm extends PageObject {


    @FindBy(xpath = "/html/body/div[2]/div/div/div[1]/button")
    private WebElement submit_button;


    public WebForm(WebDriver driver) {
        super(driver);
    }
    public void pressSubmitButton(){
        this.submit_button.click();
    }

}

