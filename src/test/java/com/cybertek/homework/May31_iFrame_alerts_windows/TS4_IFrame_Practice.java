package com.cybertek.homework.May31_iFrame_alerts_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TS4_IFrame_Practice {
    WebDriver driver;

    @BeforeMethod
    public void TS4_IFrame_Practice(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void ts4(){
        driver.switchTo().frame("//body[@id='tinymce']");
       WebElement ifFrameText = driver.findElement(By.xpath("//body[@id='tinymce']/p"));
       //String ifFrameText.getText();

    }
}
