package AlertTests;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import page.HomePage;

public class AlertTests extends BaseTests {
//    @Test
//    public void test(){
//        var alerPage= homePage.clickJavaScriptAlerts();
//   alerPage.clickButtonJSAlert();
//   alerPage.acceptJSAlert();
//        String text=alerPage.getAlertText();
//        Assertions.assertEquals(text,"You successfully clicked an alert","Result alert is incorrect!");
//
//    }
    @Test
    public void alerttextconfirm(){
                var alerPage= homePage.clickJavaScriptAlerts();
   alerPage.clickButtonJSConfirm();
   String text=alerPage.getAlertText();
   alerPage.clickToCancel();
        Assertions.assertEquals(text,"I am a JS Confirm","Alert text is incorrect");


    }
}
