package com.cybertek.groupStadies.May12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_VerifyURL {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.aol.com");
        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "aol";
        if (currentUrl.contains(expectedUrl)) {
            System.out.println("URL verification PASSED");
        } else {
            System.out.println("URL verification FAILED");
        }
    }
}
