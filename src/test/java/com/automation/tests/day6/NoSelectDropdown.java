package com.automation.tests.day6;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class NoSelectDropdown {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);





        BrowserUtils.wait(3);
        driver.quit();
    }
}
