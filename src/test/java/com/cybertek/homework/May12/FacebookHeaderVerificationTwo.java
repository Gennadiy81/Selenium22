package com.cybertek.homework.May12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerificationTwo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(" https://www.facebook.com");
        String expectedLinkText = "registration_form";
        WebElement actualLink = driver.findElement(By.className("_8esh"));
        String actualLinkText = actualLink.getAttribute("href");

        if (actualLinkText.contains(expectedLinkText)){
            System.out.println("HREF text verification PASSED!");
        }else {
            System.out.println("HREF text verification FAILED!");
        }

    }
}
