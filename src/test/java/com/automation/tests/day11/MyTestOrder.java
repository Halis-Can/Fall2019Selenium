package com.automation.tests.day11;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class MyTestOrder {
/**
 * Go to http://practice.cybertekschool.com/tables
 * Click on "Last name" column name
 * Verify that table is sorted by last name in alphabetic order.
 */
WebDriver driver;


@BeforeMethod
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.get("http://practice.cybertekschool.com/tables");
}

@AfterMethod
    public  void  teardown() throws Exception {
    Thread.sleep(2000);
    driver.quit();
}
    @Test
    public void sort(){
driver.findElement(By.xpath("//table[1]//*[text()='Last Name']")).click();
        BrowserUtils.wait(2);
        List<WebElement> columns=driver.findElements(By.xpath("//table[1]//tbody//td[1]"));
        for (int i=0;i<columns.size()-1;i++ ) {
      String value=columns.get(i).getText();
      String nextValue=columns.get(i+1).getText();
            Assert.assertTrue(value.compareTo(nextValue)<0);
            System.out.println(value.compareTo(nextValue));

        }
    }

}