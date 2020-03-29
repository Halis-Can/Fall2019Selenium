package com.automation.tests.vytrack.fleet;

import com.automation.pages.LoginPage;
import com.automation.pages.fleet.VehiclesPage;
import com.automation.tests.vytrack.AbstractTestBase;
import com.automation.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewVehiclesPageTests extends AbstractTestBase {
    @Test
    public void verifyTitle(){
        LoginPage loginPage = new LoginPage();
        VehiclesPage vehiclesPage = new VehiclesPage();
        loginPage.login();
        vehiclesPage.navigateTo("Fleet", "Vehicles");
        String expectedTitle = "Dashboard";//All - Car - Entities - System - Car - daha sonra sildim bunu
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }
}



