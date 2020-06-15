package com.test.qa.tokyo;

import utils.PageBase;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.util.logging.Logger;

public class LoginPage extends PageBase {
    public SoftAssert softAssert;

    private static final Logger LOGGER = (Logger) Logger.getLogger(String.valueOf(LoginPage.class));

    private static By DashBoard = By.xpath("//div[@class=\"logo\"]");
    private static By hdrLogin = By.xpath("//h3");
    private static By txtUserName = By.id("usernameOrEmail");
    private static By txtPassword = By.id("password");
    private static By btnLogin = By.xpath("//button");
    private static By alert = By.id("spanMessage");

    public static boolean isLoginPageDisplay() {

        return getDriver().findElement(hdrLogin).isDisplayed();
    }

    public static void setUserName(String userName) {

        getDriver().findElement(txtUserName).sendKeys(userName);
    }

    public static void setPassword(String password) {
        getDriver().findElement(txtPassword).sendKeys(password);
    }

    public static void clickLogin() {
        getDriver().findElement(btnLogin).click();
    }

    public static boolean isDashboardPageDisplayed() {
        return getDriver().findElement(DashBoard).isDisplayed();

    }
}
