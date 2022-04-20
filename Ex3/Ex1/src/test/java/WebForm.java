import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WebForm extends PageObject {

    private final String fname = "First Name";
    private final String lname= "kdfmdfmjas";
    private final String mmail="dfgkgmg@gmail.com";
    private final String gen="Male";
    private final String finames="D:\\Project\\Exercise Tester\\Ex1\\Ex1\\text.jpg";
    private final String phone="0395185901";
    private final String day="16/02/2022";
    private final String add="sdfkksdf  sdfsdf";
    private final String drop="Drop Down Item 2";
    private final String fci="NCR";
    private final String fci2="Delhi";
    private final String sub="Delhdi";
    @FindBy(xpath = "//*[@id=\"firstName\"]")
    private WebElement firstname;
    @FindBy(xpath = "//*[@id=\"lastName\"]")
    private WebElement lastname;
    @FindBy(xpath = "//*[@id=\"userEmail\"]")
    private WebElement mail;
    @FindBy(id = "gender-radio-1")
    private WebElement gender;
    @FindBy(xpath= "//*[@id=\"userNumber\"]")
    private  WebElement mobile;
    @FindBy(xpath="//*[@id=\"dateOfBirthInput\"]")
    private WebElement date;
    @FindBy(id="subjectsContainer")
    private WebElement subject;
    @FindBy(id="hobbies-checkbox-2")
    private WebElement hobby;
    @FindBy(css="input.form-control-file")
    private WebElement file;
    @FindBy(xpath="//*[@id='currentAddress']")
    private WebElement address;
    @FindBy(xpath="//*[@id=\"state\"]")
    private WebElement state;
    @FindBy(xpath = "//*[@id=\"city\"]")
    private WebElement city;
    @FindBy(xpath="//*[@id=\"submit\"]")
    private WebElement submit;

//    @FindBy(xpath = "//div[contains(text(),'Processed Form Details')]")
//    private WebElement alertSuccess;

    public WebForm(WebDriver driver) {
        super(driver);
    }

    public void enterFirstName(){ this.firstname.sendKeys(fname); }

    public void enterlastname(){ this.lastname.sendKeys(lname); }
    public void entermail(){ this.mail.sendKeys(mmail); }
    public void entergender(){ this.gender.sendKeys("Male"); }
    public void enterphone(){this.mobile.sendKeys(phone);}
    public void enterdate(){this.date.sendKeys(day);}
    public void entersub(){this.subject.sendKeys(sub);}
    public void enterhobbi(){this.hobby.sendKeys("Reading");}
    public void uploadfile(){this.file.sendKeys(finames);}
    public void enteraddres(){this.address.sendKeys(add);}
    public void enterstate(){this.state.sendKeys(fci);}
    public void entercity(){this.state.sendKeys(fci);}
    public void submit(){this.submit.click();}

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
