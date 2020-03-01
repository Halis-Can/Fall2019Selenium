package com.automation.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws Exception {// must use with Thread.sleep
        WebDriverManager.chromedriver().setup();//==>In selenium everything starts from WebDriver interface!!
    //    ChromeDriver driver=new ChromeDriver();==> ChromeDriver extends RemoteDriver==> implement WebDriver
        WebDriver driver=new ChromeDriver();
        driver.get("https://cybertekschool.com/");// to open a website
        Thread.sleep(3000);// for demo wait 3 second!!
        String title=driver.getTitle();
        String expectedTitle="Cybertek";
        System.out.println("Title is ..." +title);//Title is ...Cybertek
        if(expectedTitle.equals(title)){
            System.out.println("TEST PASSED!");
        }else{
            System.out.println("TEST FAILED!");
        }
             driver.close();//
    }
}
