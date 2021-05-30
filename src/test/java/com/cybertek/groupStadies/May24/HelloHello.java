package com.cybertek.groupStadies.May24;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static org.testng.AssertJUnit.assertEquals;

public class HelloHello {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://business.twitter.com/start-advertising");
        assertStartAdvertising();

        // considering that there is only one tab opened in that point.
        String oldTab = driver.getWindowHandle();
        driver.findElement(By.linkText("Twitter Advertising Blog")).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        newTab.remove(oldTab);
        // change focus to new tab
        driver.switchTo().window(newTab.get(0));
        assertAdvertisingBlog();

        // Do what you want here, you are in the new tab

        driver.close();
        // change focus back to old tab
        driver.switchTo().window(oldTab);
        assertStartAdvertising();

        // Do what you want here, you are in the old tab
    }

    private static void assertStartAdvertising() {
       WebDriver driver = new ChromeDriver();
        assertEquals("Start Advertising | Twitter for Business", driver.getTitle());
    }

    private static void assertAdvertisingBlog() {
        WebDriver driver = new ChromeDriver();
        assertEquals("Twitter Advertising", driver.getTitle());
    }
    }

