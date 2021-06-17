package com.cybertek.groupStadies.Jun11_getWindowHandle;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WindowHandle {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        String browser = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");

    }

    @Test
    public void tc1() throws InterruptedException {
        String parentWindowHandle = driver.getWindowHandle();

        driver.findElement(By.id("newTabsBtn")).click();
        //driver.switchTo().window(parentWindowHandle);
        Set<String> handles = driver.getWindowHandles();

        for (String each : handles) {
            driver.switchTo().window(each);
            if (driver.getTitle().contains("AlertsDemo")){
                driver.switchTo().window(each);
                break;
            }
        }

        driver.findElement(By.id("promptBox")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Gennadiy");
        alert.accept();

    }
}





