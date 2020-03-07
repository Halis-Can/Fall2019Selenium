package com.automation.tests.day4;

import com.google.gson.internal.bind.util.ISO8601Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsTest {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");

        Thread.sleep(3000);

        //how to collect all links from the page?
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for(WebElement link: links){
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
            System.out.println();
        }

        for(int i=1; i < links.size(); i++){
            links.get(i).click();
//            Thread.sleep(2000);

            driver.navigate().back();
//            Thread.sleep(2000);
            //refresh list
            links = driver.findElements(By.tagName("a"));
        }

/*
interview question1: what is StaleElementReferenceException??

        //StaleElementReferenceException :it happenns
 interview question2: what happens if element wasnt found, in case of findElement??
 Answer: nothing, you will get empty list
 interview questionas3:
 how to check if element doesnt exist any more/ just doesnt exist?
 asnwr: check if collection is empty
 if( driver.findElements(By.id("name")).size()==0){
 element doesn t exist!
 */
        Thread.sleep(2000);
        driver.quit();
    }
}