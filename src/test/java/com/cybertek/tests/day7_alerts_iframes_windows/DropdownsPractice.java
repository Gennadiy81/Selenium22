package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownsPractice {
    WebDriver driver;

    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown");
    }
    @Test
    public void tc1_simple_dropdowns_test(){

        Select simpleDropdown = new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));


        WebElement currentlySelectedOption = simpleDropdown.getFirstSelectedOption();

        String actualTextOfCurrentOption = currentlySelectedOption.getText();
        String expectedText = "Please select an option";
        Assert.assertEquals(actualTextOfCurrentOption, expectedText);

        //Doing everything in one line: get currently selected option, get the text and compare against expected
        //Assert.assertEquals(simpleDropdown.getFirstSelectedOption().getText(), "Please select an option");
        //4. Verify “State selection” default selected value is correct
        //Expected: “Select a State”

        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        String actualStateDropdownText = stateDropdown.getFirstSelectedOption().getText();
        String expectedStateDropDown = "Select a State";
        Assert.assertEquals(actualStateDropdownText, expectedStateDropDown);

    }

    @Test
    public void tc2_simple_dropdowns_test(){
        Select stateDropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        stateDropdown.selectByVisibleText("Illinois");

        stateDropdown.selectByValue("VA");

        stateDropdown.selectByIndex(5);

        String expectedOptionText = "California";

        String actualOptionText =  stateDropdown.getFirstSelectedOption().getText();
        Assert.assertEquals(actualOptionText, expectedOptionText, "This message will print out if my test is Failing");




    }

    @AfterClass

    public void teardownClass() throws InterruptedException {
        Thread.sleep(5000);
        //driver.close();
    }
}
