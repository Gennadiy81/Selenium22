package com.cybertek.tests.day3_reviews_practicec;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F4_AttributeValueVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // driver.manage().window().maximize();
        driver.get("https://www.facebook.com");

        WebElement attrib = driver.findElement(By.linkText("Create a Page"));
        String expectedHref = "registration_form";
        String actualHrefValue = attrib.getAttribute("href");
        if (actualHrefValue.contains(expectedHref)) {
            System.out.println("HREF text verification PASSED!");
        } else {
            System.out.println("HREF text verification FAILED!");


        }
    }
}
