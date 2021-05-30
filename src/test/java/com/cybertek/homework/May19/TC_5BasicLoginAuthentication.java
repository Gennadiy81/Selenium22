package com.cybertek.homework.May19;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_5BasicLoginAuthentication {
    public static void main(String[] args) {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        System.out.println(driver.getTitle().equals("Web Orders Login"));
        driver.findElement(By.xpath("//div[@class='login']/input")).sendKeys("Tester");
        driver.findElement(By.xpath("//div[@class='login']//input[2]")).sendKeys("test");
        driver.findElement(By.xpath("//div[@class='login']//input[3]")).click();
        System.out.println(driver.getTitle().equals("Web Orders"));

    }
}
