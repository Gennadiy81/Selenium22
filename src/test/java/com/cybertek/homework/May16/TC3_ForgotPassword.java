package com.cybertek.homework.May16;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TC3_ForgotPassword {
    public static void main(String[] args) {
       // WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver();
        WebDriver driver =  WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");
        WebElement searchBar = driver.findElement(By.xpath("input[@type='text']"));
        searchBar.sendKeys("qwert@gmail.com");
    }
}
