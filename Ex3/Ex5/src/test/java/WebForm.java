import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WebForm extends PageObject {

    private final String u_name = "standard_user";
    private final String password = "secret_sauce";

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    private WebElement first_name;

    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement last_name;

    @FindBy(xpath = "//*[@id=\"login-button\"]")
    private WebElement submit_button;


    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(u_name);
    }

    public void enterLastName(){
        this.last_name.sendKeys(password);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }

}

