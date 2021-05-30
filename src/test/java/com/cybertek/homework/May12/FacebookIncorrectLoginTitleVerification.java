package com.cybertek.homework.May12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIncorrectLoginTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.findElement(By.id("email")).sendKeys("Maksim"+ Keys.ENTER);
        driver.findElement(By.id("pass")).sendKeys("qwer1234" + Keys.ENTER);

        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }
    }
}
