package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AlertPractice {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
    }

    @Test
    public void information_alert_test() throws InterruptedException {
        WebElement informationAlertButton = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));

        informationAlertButton.click();

        Thread.sleep(2000);

        //4. Click to OK button from the alert
        //Switching driver's focus to alert, so we can handle it
        Alert alert = driver.switchTo().alert();

        alert.accept();

        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(resultText.isDisplayed());

        String expectedText = "You successfuly clicked an alert";

        String actualText = resultText.getText();

        Assert.assertTrue(resultText.isDisplayed(), "Result text is not displayed on the page.");

        Assert.assertEquals(actualText, expectedText, "Actual text is not as expected");

    }

}
