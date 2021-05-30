package com.cybertek.groupStadies.May12;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T7_GoTo {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        WebElement userNameInput = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        userNameInput.sendKeys("Tester");
        WebElement passwordInput = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        passwordInput.sendKeys("test");
        WebElement loginEnter = driver.findElement(By.xpath("//input[@type='submit']"));

        loginEnter.click();
        String expectedTitle = "Web Orders";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED");
        }

        System.out.println(driver.getCurrentUrl());

    }
}
