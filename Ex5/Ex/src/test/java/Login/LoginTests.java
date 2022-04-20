package Login;

import base.BaseTests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import page.LoginPage;
import page.SecureArePage;

public class LoginTests extends BaseTests {
    @Test()
    @DisplayName("TC01-Login successfully")
    public void testLoginSuccessful() {
        LoginPage loginPage = homePage.clickForm();
        loginPage.setUserName("tomsmith");
        loginPage.setPassword("SuperSecretPassword!");
        SecureArePage secureAreaPage = loginPage.clickLoginButton();
        String alertText = secureAreaPage.getAlertText();
        Assertions.assertTrue(alertText.contains("You logged into a secure area"), "Alert text is incorrect");
    }

}
