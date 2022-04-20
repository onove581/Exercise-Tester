import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WebForm extends PageObject {

    private final String u_name = "standard_user";
    private final String password = "secret_sauce";
    private final String us1="";
    private final String ps1="";
    private final String us2="tomsmith";
    private final String ps2="SuperSecretPassword!";
    @FindBy(linkText = "Form Authentication")
    private WebElement s;
    @FindBy(id = "username")
    private WebElement first_name;

    @FindBy(id = "password")
    private WebElement last_name;

    @FindBy(css = "#login button")
    private WebElement submit_button;


    public WebForm(WebDriver driver) {
        super(driver);
    }
    public void clicks(){
        this.s.click();
    }


    public void us1(){
        this.first_name.sendKeys(us1);
    }
    public void pas1(){
        this.last_name.sendKeys(ps1);
    }

    public void us2(){
        this.first_name.sendKeys(us2);
    }
    public void pas2(){
        this.last_name.sendKeys(ps2);
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

