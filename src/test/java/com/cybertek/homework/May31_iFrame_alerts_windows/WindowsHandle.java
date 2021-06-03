package com.cybertek.homework.May31_iFrame_alerts_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowsHandle {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/windows");
    }

    @Test
    public void windowHandle(){
        Assert.assertEquals(driver.getTitle(), "Practice", "Test is failing");
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
        
        for (String eachWindow : driver.getWindowHandles()){
            driver.switchTo().window(eachWindow);
            System.out.println("Current title while switching: " + driver.getTitle());
        }
        String actualTitleAfterClick = driver.getTitle();

        System.out.println("actualTitleAfterClick = " + actualTitleAfterClick);




    }
}
