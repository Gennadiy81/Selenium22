package com.cybertek.groupStadies.May12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_LoginJoinVerifyTitle {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.aol.com");
        WebElement claasName = driver.findElement(By.className("navicon"));
        claasName.click();

        String expectedTitle = "AOL";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("First title verification PASSED");
        } else {
            System.out.println("First title verification FAILED");
        }


        driver.navigate().back();
        String expectedTitleTwo = "AOL - News, Politics, Sports & Latest Headlines - AOL.com";
        String actualTitleTwo = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Second title verification PASSED");
        }else {
            System.out.println("Second title verification FAILED");
        }


        Thread.sleep(5000);

        driver.findElement(By.tagName("input")).sendKeys("java" + Keys.ENTER);
        String expectedTitleThree = "java – AOL Search Result";
        String actualTitleTwoThree = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Third title verification PASSED");
        }else {
            System.out.println("Third title verification FAILED");
        }


        driver.findElement(By.id("logo")).click();
        String expectedTitleFourth = "AOL - News, Politics, Sports & Latest Headlines - AOL.com";
        String actualTitleFourth = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Fourth title verification PASSED");
        }else {
            System.out.println("Fourth title verification FAILED");
        }

    }
}
