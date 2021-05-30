package com.cybertek.homework.May12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookHeaderVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" https://www.facebook.com");
        String expectedHeaderText = "Connect with friends and the world around you on Facebook.";
        WebElement actualHeader = driver.findElement(By.tagName("h2"));
        String actualHeaderText = actualHeader.getText();
        if (actualHeaderText.equals(expectedHeaderText)) {
            System.out.println("Header verification PASSED!");
        } else {
            System.out.println("Header verification FAILED!");

        }
    }
}
