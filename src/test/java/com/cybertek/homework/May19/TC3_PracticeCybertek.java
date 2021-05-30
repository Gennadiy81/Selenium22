package com.cybertek.homework.May19;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC3_PracticeCybertek {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/input"))
                .sendKeys("euginik@gmail.com");
        driver.findElement(By.cssSelector("button[id='form_submit']")).click();
        System.out.println(driver.getCurrentUrl().contains("forgot_password"));
        Thread.sleep(10000);
        //driver.close();

    }
}
