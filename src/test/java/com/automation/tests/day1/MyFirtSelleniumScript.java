package com.automation.tests.day1;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;

public class MyFirtSelleniumScript {
    public static void main(String[] args) {
        //setup chromedriver
        WebDriverManager.chromedriver().setup();
        //create chromedriver object
        ChromeDriver driver=new ChromeDriver();
        //open some website
        driver.get("https://www.google.com/");
        //change name
    }
}
