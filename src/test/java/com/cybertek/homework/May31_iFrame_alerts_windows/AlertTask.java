package com.cybertek.homework.May31_iFrame_alerts_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertTask {
    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void tc1_information_alert(){
        WebElement jsAlertElem = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        jsAlertElem.click();
        Alert jsAlert = driver.switchTo().alert();
        jsAlert.accept();
        Assert.assertEquals(driver.findElement(By.cssSelector("p[id='result']")).getText(),
                "You successfuly clicked an alert", "Test if failing");
    }
    @Test
    public void tc2_conformation_alert(){
        WebElement jcConfirm = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        jcConfirm.click();
        Alert jcConfirmAlert = driver.switchTo().alert();
        jcConfirmAlert.accept();
        Assert.assertTrue(driver.findElement(By.cssSelector("p[id='result']")).isDisplayed(), "You clicked: Ok");
    }
    @Test
    public void tc3_information_alert(){
        WebElement jsPrompt = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        jsPrompt.click();
        Alert jsPromptAlert = driver.switchTo().alert();
        jsPromptAlert.sendKeys("hello");
        jsPromptAlert.accept();
        Assert.assertEquals(driver.findElement(By.cssSelector("p[id='result']")).getText(),
                "You entered: hello", "Test is failing");
    }

}
