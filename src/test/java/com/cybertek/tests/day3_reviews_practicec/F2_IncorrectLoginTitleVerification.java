package com.cybertek.tests.day3_reviews_practicec;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        WebElement inputUsername =  driver.findElement(By.id("email"));
        inputUsername.sendKeys("Ivanka");


        WebElement inputPassword = driver.findElement(By.id("pass"));
        inputPassword.sendKeys("qwer1234" + Keys.ENTER);
        Thread.sleep(5000);

        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title verification PASSED");
        } else {
            System.out.println("Title verification FAILED");
        }
    }
}
