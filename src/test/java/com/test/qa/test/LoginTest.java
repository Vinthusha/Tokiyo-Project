package com.test.qa.test;

import com.test.qa.testdata.LoginData;
import com.test.qa.tokyo.LoginPage;
import com.test.qa.utils.TestBase;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest  extends TestBase {

    @Test(priority=1, dataProviderClass = LoginData.class, dataProvider = "OrangeHRMLogin")
    public void LoginTest(String username,String password )  {
        softAssert = new SoftAssert();
        softAssert.assertTrue(LoginPage.isLoginPageDisplay(),"LoginPage Displayed");
        LoginPage.implicitWait(30000);
        LoginPage.setUserName(username);
        LoginPage.setPassword(password);
        LoginPage.clickLogin();
        LoginPage.implicitWait(5000);
        softAssert.assertTrue(LoginPage.isDashboardPageDisplayed(), "Dashboard Page Not Display");
        softAssert.assertAll();

    }
}
