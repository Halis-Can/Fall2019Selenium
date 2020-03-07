package com.automation.tests.day5;

import com.automation.utilities.BrowserUtilys;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        driver.manage().window().maximize();

        BrowserUtilys.wait(2);
        List<WebElement> radioButtons = driver.findElements(By.tagName("input"));

        for (WebElement radioButton : radioButtons) {
            //to check if button can be clicked
            String id = radioButton.getAttribute("id");
            if (radioButton.isEnabled()) {
                //<input type="radio" id="red" name="color">
                radioButton.click();
                System.out.println("Clicked on : " + id);
                BrowserUtilys.wait(1);
            } else {
                //<input type="radio" id="green" name="color" disabled="">
                System.out.println("Button is disabled, not clicked : :"+id);
            }



        }driver.quit();
    }
}
