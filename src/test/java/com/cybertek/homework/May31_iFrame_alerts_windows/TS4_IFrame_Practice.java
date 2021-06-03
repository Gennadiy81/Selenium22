package com.cybertek.homework.May31_iFrame_alerts_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
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
    public void ts4(){ WebElement iFrame = driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
        driver.switchTo().frame(iFrame);
        WebElement actualText = driver.findElement(By.tagName("p"));
        Assert.assertEquals(actualText.getText(), "Your content goes here.", "Test don't work");
        driver.switchTo().parentFrame();

        WebElement parentIframe = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(parentIframe.isDisplayed(), "An iFrame containing the TinyMCE WYSIWYG Editor");

        System.out.println(parentIframe.getText());



    }
}
