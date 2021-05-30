package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/iframe");
    }

    @Test
    public void iframe_test(){
        // 1st way by index
        // driver.switchTo().frame(0);

       // 2nd way Locate as web element
        //driver.switchTo().frame("//iframe[@class='tox-edit-area__iframe']")

        //3rd way
        driver.switchTo().frame("mce_0_ifr");
        WebElement yourContentGoesHerText = driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHerText.isDisplayed());

        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

    }


}
