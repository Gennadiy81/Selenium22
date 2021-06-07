package com.cybertek.groupStadies.May29;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Group5Assignment {
    WebDriver driver;
    @BeforeMethod
    public void Group(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");
    }
    @Test
    public void group_task() throws InterruptedException {
        WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        userName.sendKeys("user15");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123" + Keys.ENTER);

        //Thread.sleep(2000);
        //WebElement closeButton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
        //closeButton.click();

        WebElement fleet = driver.findElement(By.xpath("(//span[@class='title title-level-1'])[1]"));
        fleet.click();
        WebElement options = driver.findElement(By.xpath("(//span[@class='title title-level-2'])[1]"));

        options.click();





    }
}
