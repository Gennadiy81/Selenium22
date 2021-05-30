package com.cybertek.groupStadies.May12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_VerifyTitleExpected {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
       //driver.manage().window().maximize();
        driver.get("https://www.aol.com");
        String expectedTitle = "AOL - News, Politics, Sports & Latest Headlines - AOL.com";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }

    }
}
