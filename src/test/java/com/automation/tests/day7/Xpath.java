package com.automation.tests.day7;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Xpath {
    public static String userNameLocator = "//label[text()='Username']/following-sibling::input";//==> right click also you can use//*[@id="login"]/div[1]/div/input
    public static String passwordLocator = "//label[text()='Password']/following-sibling::input";//==>//*[@id="login"]/div[2]/div/input
    public static String loginBtnLocator = "//button[contains(text(), 'Login')]";//==>//*[@id="wooden_spoon"]

    public static void main(String[] args) {

        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        BrowserUtils.wait(3);
        driver.findElement(By.xpath(userNameLocator)).sendKeys("tomsmith");
        driver.findElement(By.xpath(passwordLocator)).sendKeys("SuperSecretPassword");
        driver.findElement(By.xpath(loginBtnLocator)).click();

        BrowserUtils.wait(3);
        driver.quit();
    }
}