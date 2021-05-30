package com.cybertek.homework.May12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankLinkTextVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        String expectedText = "Zero Bank";
        WebElement actualText = driver.findElement(By.className("brand"));
        String actualLinkText = actualText.getText();
        if (actualLinkText.contains(expectedText)) {
            System.out.println("Text verification PASSED!");
        } else {
            System.out.println("Text verification FAILED!");

        }

        String expectedInHrefValue = "index.html";
        String actualHref = actualText.getAttribute("href");
        if (actualHref.contains(expectedInHrefValue)) {
            System.out.println("HREF verification PASSED!");
        } else {
            System.out.println("HREF verification FAILED!");

        }
    }
}
