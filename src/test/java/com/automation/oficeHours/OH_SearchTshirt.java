package com.automation.oficeHours;

import com.automation.utilities.BrowserUtils;
import com.automation.utilities.Driver;
import com.automation.utilities.WebDriverFactory;
import com.automation.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OH_SearchTshirt {
   private WebDriver driver;


    @BeforeMethod
    public void setup() {
        driver = WebDriverFactory.getDriver("chrome");
     driver.get("http://automationpractice.com/index.php");

    }

    @Test
    public void seachTshirtTest1(){
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("tshirt");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//button[@name='submit_search']")).submit();
        BrowserUtils.wait(2);
        String expected= "No results were found for your search \"tshirt\"";
        String actual=driver.findElement(By.xpath("//p[@class='alert alert-warning']")).getText();
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void searcTshirtTest2(){
        driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("t-shirt");
        BrowserUtils.wait(2);
        driver.findElement(By.xpath("//button[@name='submit_search']")).submit();
        BrowserUtils.wait(2);
        String expected= "1 result has been found.";
        String actual=driver.findElement(By.xpath("//span[@class='heading-counter']")).getText();
        Assert.assertEquals(actual,expected);
    }


    @AfterMethod
    public void teardown(){
        driver.quit();
    }
}
