package com.automation.tests.day3;

import com.automation.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class FindElementPractice {
    public static void main(String[] args)throws Exception  {
      //  WebDriverManager.chromedriver().setup();
       // WebDriver driver=new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullName =driver.findElement(By.name("full_name"));
        fullName.sendKeys("Mister Twister");
        Thread.sleep(2000);
        WebElement email =driver.findElement(By.name("email"));
        email.sendKeys("sdet@cybertek.com");
        Thread.sleep(2000);
        WebElement signUp =driver.findElement(By.name("wooden_spoon"));
       // signUp.click();
        //when you see type="submit", you can use submit() instead of click()!
        //it make sense to use when click() method doesn't work!
         signUp.submit();
         Thread.sleep(2000);

   String expected ="Thank you for signing up. Click the button below to return to the home page.";

        WebElement message =driver.findElement(By.className("subheader"));
        String  actual =message.getText();

        if (expected.equalsIgnoreCase((actual))){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }




        driver.quit();//to close everthing
    }
}
