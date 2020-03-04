package com.automation.tests.day3;

import com.automation.utilities.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindElementById {
    public static void main(String[] args)throws Exception {
        WebDriver driver = DriverFactory.createDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");

        WebElement userName = driver.findElement(By.name("username"));
        userName.sendKeys("tomsmith");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");
        Thread.sleep(2000);

        WebElement signUp= driver.findElement(By.id("wooden_spoon"));
          signUp.submit();
        Thread.sleep(2000);

        String expected ="Welcome to the Secure Area. When you are done click logout below.";

        WebElement message =driver.findElement(By.tagName("h4"));
        //WebElement message =driver.findElement(By.className("subheader"));==>it is work also!
        String  actual =message.getText();
        Thread.sleep(2000);

        if (expected.equalsIgnoreCase((actual))){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
         WebElement logout=driver.findElement(By.partialLinkText("Logout"));
        String href=logout.getAttribute("href");
        String className=logout.getAttribute("class");
        System.out.println(href);
        System.out.println(className);
        logout.click();
        Thread.sleep(2000);

     //let's enter invalid credentials
        WebElement userName2 = driver.findElement(By.name("username"));
        userName2.sendKeys("tom");
        Thread.sleep(2000);

        WebElement password2 = driver.findElement(By.name("password"));
        password2.sendKeys("Super");
        Thread.sleep(2000);

        WebElement signUp2= driver.findElement(By.id("wooden_spoon"));
        signUp2.submit();
        Thread.sleep(2000);
        WebElement errorMessage = driver.findElement(By.id("flash-messages"));
        System.out.println(errorMessage.getText());
        Thread.sleep(2000);
        driver.quit();//to close everthing
        /*
===============2.WAY===============
black color text,
purple tag
brown atribute

public class FindElementById {

    public static void main(String[] args) throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword");

        Thread.sleep(2000);

        driver.findElement(By.id("wooden_spoon")).click();


        Thread.sleep(2000);

        String expected = "Welcome to the Secure Area. When you are done click logout below.";
        String actual = driver.findElement(By.tagName("h4")).getText();

        if (expected.equals(actual)){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //let's click on Logout button. It looks like a button, but it's actually a link
        //every element with <a> tag is a link
        //if you have couple spaces in the text, just use partialLinkText instead of linkText
        //linkText - equals()
        //partialLinkText - contains() - complete match doesn't required
        //don't put space
        WebElement logout = driver.findElement(By.partialLinkText("Logout"));

        String href = logout.getAttribute("href");
        String className = logout.getAttribute("class");

        System.out.println(href);
        System.out.println(className);

        logout.click();
        Thread.sleep(2000);

        //let's enter invalid credentials

        driver.findElement(By.name("username")).sendKeys("wrong");
        driver.findElement(By.name("password")).sendKeys("wrong");
        driver.findElement(By.id("wooden_spoon")).click();



        Thread.sleep(2000);

        WebElement errorMessage = driver.findElement(By.id("flash-messages"));

        System.out.println(errorMessage.getText());

        Thread.sleep(2000);

        driver.quit();
    }
}



         */
    }
}
