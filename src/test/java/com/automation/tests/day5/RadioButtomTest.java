package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtomTest {
    public static void main(String[] args) {
        WebDriver driver= DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        BrowserUtils.wait(2);
        //<input type="radio" id="black" name="color">
        WebElement blackButtom=driver.findElement(By.id("black"));
        blackButtom.click();
     // IF visible and eligible to click
        if (blackButtom.isDisplayed()&&blackButtom.isEnabled()){
            System.out.println("CLICKED ON BLACK BUTTON");
        }else{
            System.out.println("FAILED TO CLICK BLACK BUTTON");
        }
        //how do we verify that buttom is selected!
        //RETURNS TRUE IF BUTTON CLECKED
        BrowserUtils.wait(2);

        if (blackButtom.isSelected()){
            System.out.println("TEST PASSED");

        }else{
            System.out.println("TEST FAILED");
        }


      driver.quit();
    }
}
