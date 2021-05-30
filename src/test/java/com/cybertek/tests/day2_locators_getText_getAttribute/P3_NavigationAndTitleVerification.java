package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        //driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("mail")).click();
        String expectedTitle = "Gmail - Email from Google";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!");
        }
        driver.navigate().back();
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();
        if (actualGoogleTitle.equals(expectedGoogleTitle)) {
            System.out.println("URL verification PASSED!");
        } else {
            System.out.println("URL verification FAILED!");

        }

    }
}

