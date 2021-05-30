package com.cybertek.homework.May16;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class May17 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

                driver.get("https://www.bing.com");
        String expectedTitle = "Bing";
        String actualTitle = driver.getTitle();
        System.out.println(expectedTitle.equals(actualTitle));
        driver.findElement(By.id("id_s")).click();
        driver.navigate().back();
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='sb_form_q']"));
        Thread.sleep(1000);
        searchBox.sendKeys("java" + Keys.ENTER);


    }
}
