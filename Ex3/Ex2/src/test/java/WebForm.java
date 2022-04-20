import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject {

    private final String un = "First Name";
    private final String passw= "kdfmdfmjas";
    private final String comments="High School";
    private final String finames="D:\\Project\\Exercise Tester\\Ex1\\Ex2\\text.jpg";
    private final String mu="Selection Item 1";
    private final String drop="Drop Down Item 2";
    private final String r="radio 1";
    @FindBy(name = "username")
    private WebElement usname;
    @FindBy(name = "password")
    private WebElement pass;
    @FindBy(name = "comments")
    private WebElement comment;
    @FindBy(css = "filename")
    private  WebElement file;
    @FindBy(name="checkboxes[]")
    private WebElement checkbox;
    @FindBy(name="radioval")
    private WebElement radio;
    @FindBy(name="multipleselect[]")
    private WebElement multipleselect;
    @FindBy(name="dropdown")
    private WebElement dropdown;
    @FindBy(name="submitbutton")
    private WebElement submitbutton;
    @FindBy(xpath = "//div[contains(text(),'The form was successfully submitted!')]")
    private WebElement alertSuccess;

//    @FindBy(xpath = "//div[contains(text(),'Processed Form Details')]")
//    private WebElement alertSuccess;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){
        this.usname.sendKeys(un);
    }

    public void enterpassword(){ this.pass.sendKeys(passw); }
    public void entercomment(){ this.comment.sendKeys(comments); }
    public void uploadfolder(){ this.file.sendKeys(finames); }
    public void check(){this.checkbox.click();}
    public void ra(){this.radio.click();}
    public void multi(){this.multipleselect.sendKeys(mu);}
    public void dropdo(){this.dropdown.sendKeys(drop);}
    public void submit(){this.submitbutton.click();}
    public void verifyAlertSuccess(){
        this.alertSuccess.isDisplayed();
    }

//
//    public void pressSubmitButton(){
//        this.submit_button.click();
//    }
//    public void checkradio(){this.radio_button.click();}
//    public void checkbox(){this.checkbox1.click();}
//    public void optioncheck(){this.option1.sendKeys(option2);}
//    public void date(){this.datetime.sendKeys(date_too);}
//    public void verifyAlertSuccess(){
//        this.alertSuccess.isDisplayed();
//    }
}
