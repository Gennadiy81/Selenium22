package com.cybertek.homework.May12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBankLinkTextVerificationTwo {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        String expectedHrefValue = "index.html";
        WebElement actualHref = driver.findElement(By.className("brand"));
        String actualHrefValue = actualHref.getAttribute("href");
        if (actualHrefValue.contains(expectedHrefValue)) {
            System.out.println("HREF verification PASSED!");
        } else {
            System.out.println("HREF verification FAILED!");
        }
    }
}
