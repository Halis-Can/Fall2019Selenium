package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxes {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/checkboxes");
        BrowserUtils.wait(2);
        //<input type="checkbox">
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));

        checkBoxes.get(0).click();//click on first checkbox
        BrowserUtils.wait(2);
 for(int i=0; i<checkBoxes.size();i++){

     //      if visible                          eligible to click  and   not clicked yet!
if (checkBoxes.get(i).isDisplayed()&&checkBoxes.get(i).isEnabled()&&(!checkBoxes.get(i).isSelected())) {
    checkBoxes.get(i).click();//click on first checkbox
    System.out.println(i+1+" cleckbox clicked");
    }
else{
    System.out.println(i+1+" cleckbox was not clicked");
       }
    }
        BrowserUtils.wait(2);
        driver.quit();
    }
}
