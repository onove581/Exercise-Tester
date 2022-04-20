import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject {

    private final String FIRST_NAME = "First Name";
    private final String LAST_NAME = "Last Name";
    private final String Radio="High School";
    private final String checkbox="Male";
    private final String option2="0-1";
    private final String date_too="04/05/2022";
    @FindBy(id = "first-name")
    private WebElement first_name;

    @FindBy(id = "last-name")
    private WebElement last_name;

    @FindBy(xpath = "//a[contains(text(),'Submit')]")
    private WebElement submit_button;
    @FindBy(xpath = "//*[@id='radio-button-1']")
    private  WebElement radio_button;
    @FindBy(xpath="//*[@id=\'checkbox-1\']")
    private WebElement checkbox1;
    @FindBy(xpath="//*[@id=\'select-menu\']")
    private WebElement option1;
    @FindBy(xpath="//*[@id=\'datepicker\']")
    private WebElement datetime;

    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.first_name.sendKeys(FIRST_NAME);
    }

    public void enterLastName(){
        this.last_name.sendKeys(LAST_NAME);
    }

    public void pressSubmitButton(){
        this.submit_button.click();
    }
    public void checkradio(){this.radio_button.click();}
    public void checkbox(){this.checkbox1.click();}
    public void optioncheck(){this.option1.sendKeys(option2);}
    public void date(){this.datetime.sendKeys(date_too);}
    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }
}
