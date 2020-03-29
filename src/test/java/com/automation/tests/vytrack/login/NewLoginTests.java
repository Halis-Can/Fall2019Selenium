package com.automation.tests.vytrack.login;

import com.automation.pages.LoginPage;
import com.automation.tests.vytrack.AbstractTestBase;
import com.automation.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewLoginTests extends AbstractTestBase {
    /**
     * Login and verify that page title is a "Dashboard"
     * 5 minutes
     */
    @Test
    public void verifyPageTitle() {
        LoginPage loginPage = new LoginPage();
       loginPage.login();
       Assert.assertEquals(Driver.getDriver().getTitle(),"Dashboard");

    }

    @Test
    public void verifyWarningMessage(){
        LoginPage loginPage = new LoginPage();
        loginPage.login("wrong", "wrong");
        Assert.assertEquals(loginPage.getWarningMessageText(), "Invalid user name or password.");
    }

}