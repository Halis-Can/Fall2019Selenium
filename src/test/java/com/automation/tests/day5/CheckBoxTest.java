package com.automation.tests.day5;

import com.automation.utilities.BrowserUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
////sift twice  short cut!!!!!1
import java.util.List;

public class CheckBoxTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().version("79").setup();
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/checkboxes");
        //Task1: lets verify 1 st checkbox is not selected and 2nd is selected
        List<WebElement> checkBoxes = driver.findElements(By.tagName("input"));
  if (!checkBoxes.get(0).isSelected()&&checkBoxes.get(1).isSelected()){
      System.out.println("TEST PASSED");
  }else{
      System.out.println("TEST FAILED");
  }
      //task 2:lets click on the first checkbox and verify its clicked
     //   checkBoxes.get(0).click();==>same think to bottom one
        WebElement checkbox1=checkBoxes.get(0);
        checkbox1.click();

        BrowserUtils.wait(2);
 if (checkbox1.isSelected()){
     System.out.println("TEST PASSED");
     System.out.println("Checkbox 1 is selected");
 }else{
     System.out.println("TEST FAILED");
     System.out.println("Checkbox 2 is selected ");
 }

        driver.quit();
      }
}
