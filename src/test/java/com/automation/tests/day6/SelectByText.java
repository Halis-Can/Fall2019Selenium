package com.automation.tests.day6;
import com.automation.utilities.BrowserUtils;
import com.automation.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectByText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        BrowserUtils.wait(3);
        //create a webelement object for drop-down first
        WebElement simpleDropdown = driver.findElement(By.id("dropdown"));
        //provide weblement object into constructor
        Select selectSimpleDropdown = new Select(simpleDropdown);
        //select by visible text
        selectSimpleDropdown.selectByVisibleText("Option 1");
        BrowserUtils.wait(3);
        selectSimpleDropdown.selectByVisibleText("Option 2");
//
        Select selectYear= new Select(driver.findElement(By.id("year")));
        Select selectMonth= new Select(driver.findElement(By.id("month")));
        Select selectDay= new Select(driver.findElement(By.id("day")));

        selectDay.selectByVisibleText("1");
        selectMonth.selectByVisibleText("February");
        selectYear.selectByVisibleText("2003");
// select all months one by one!!
        List<WebElement> months = selectMonth.getOptions();
        for (WebElement eachmonth : months){
            String monthName=eachmonth.getText();
            selectMonth.selectByVisibleText(monthName);
            BrowserUtils.wait(1);
        }

        Select stateSelect= new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("District Of Columbia");
// option tht is currently selected
// getfirstSelectedOption()==> retuns a webelement, thats why
        String selected=stateSelect.getFirstSelectedOption().getText();

        if (selected.equals("District Of Columbia")){
            System.out.println("TEST PASSED");
        }else
            System.out.println("TEST FAILED");
            List<WebElement> states = stateSelect.getOptions();
        for (WebElement stateOption: states){
            System.out.println(stateOption.getText());
        }

        BrowserUtils.wait(3);
        driver.quit();
    }
}