package com.cybertek.tests.day5_findElements_checkboxex;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PO_FindElements_Practice {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/forgot_password");

        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        for (WebElement each : listOfLinks) {
            System.out.println(each.getText());
            System.out.println(each.getAttribute("href"));
        }
        int numberOfLinks = listOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);
        Thread.sleep(10000);
        driver.close();

    }
}
