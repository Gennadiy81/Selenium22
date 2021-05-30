package com.cybertek.homework.May12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BackAndForthNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://google.com");

        driver.findElement(By.partialLinkText("mail")).click();
        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains("Gmail")){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

        driver.navigate().back();
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google verification title PASSED");
        }else {
            System.out.println("Google verification title FAILED");
        }




    }
}
