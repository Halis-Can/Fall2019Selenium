package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.awt.font.FontRenderContext;
import java.util.List;

public class SelectByTextMultipleOptions {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        Select languagesSelect=new Select(driver.findElement(By.name("Languages")));

        boolean isMultible=languagesSelect.isMultiple();
        System.out.println(isMultible);//true!!
languagesSelect.selectByVisibleText("Java");
        languagesSelect.selectByVisibleText("Python");
        languagesSelect.selectByVisibleText("C#");
        // lets get all selected options
        List<WebElement> selectedLanguages=languagesSelect.getAllSelectedOptions();
        for (WebElement eachLanguage: selectedLanguages){
            System.out.println(eachLanguage.getText());
        } BrowserUtils.wait(3);
 languagesSelect.deselectByVisibleText("Java");//to unselect somethink
        //BrowserUtils.wait(3);
       // languagesSelect.deselectAll();

        BrowserUtils.wait(3);
        driver.quit();
    }
}
