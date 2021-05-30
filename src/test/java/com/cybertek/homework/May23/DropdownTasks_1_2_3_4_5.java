package com.cybertek.homework.May23;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;


import java.util.concurrent.TimeUnit;

public class DropdownTasks_1_2_3_4_5 {

    @Test(priority = 1)
    public void test1() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement simpleDropdown = driver.findElement(By.xpath("(//option[@selected='selected'])[1]"));
        simpleDropdown.click();
        System.out.println("Default values of Simple dropdown is 'Please select an option' - "
                + simpleDropdown.getText().equals("Please select an option"));

        WebElement stateSelection = driver.findElement(By.xpath("(//select[@id='state']//option)[1]"));
        System.out.println("Default values of State selection is 'Select a State' - "
                + stateSelection.getText().equals("Select a State"));
      driver.close();

    }
    @Test(priority = 2)
    public void test2() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement stateSelection1 = driver.findElement(By.xpath("(//select[@id='state']//option)[15]"));
        Thread.sleep(2000);
       stateSelection1.click();
        Select oSelect = new Select(stateSelection1);

        oSelect.selectByVisibleText("Illinois");

//        driver.get("http://practice.cybertekschool.com/dropdown");
//
//        WebElement stateSelection2 = driver.findElement(By.xpath("(//select[@id='state']//option)[48]"));
//        Thread.sleep(2000);
//       // stateSelection2.click();





//        stateSelection = driver.findElement(By.xpath("(//select[@id='state']//option)[35]"));
//        Thread.sleep(2000);
//        stateSelection.click();
//        oSelect = new Select(stateSelection);
//        oSelect.selectByVisibleText("California");


    }


    @BeforeClass
    public void setupClass(){
        System.out.println("-----> Before Class is running...");

    }
    @AfterClass
    public void teardownClass(){
        System.out.println("-----> After Class is running...");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("---> Before Method is running...");
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("---> After Method is running...");
    }

}
