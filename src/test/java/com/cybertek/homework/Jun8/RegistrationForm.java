package com.cybertek.homework.Jun8;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RegistrationForm {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
       String browser = ConfigurationReader.getProperty("browser");
       String getUrl = ConfigurationReader.getProperty("dataFormUrl");
       driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get(getUrl);

    }

    @Test
    public void tc6_registration_form(){
        Faker faker = new Faker();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().name());
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(faker.name().lastName());
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(faker.name().username());
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(faker.internet().emailAddress());
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(faker.internet().password());
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(faker.phoneNumber().cellPhone());
        driver.findElement(By.xpath("//input[@value='male']")).click();
        driver.findElement(By.xpath("//input[@name='birthday']")).sendKeys("10/11/2001");

        WebElement option = driver.findElement(By.xpath("//select[@name='department']"));
        Select options = new Select(option);
        options.selectByValue("MPDC");

        WebElement jobOption = driver.findElement(By.xpath("//select[@name='job_title']"));
        Select jobOptions = new Select(jobOption);
        jobOptions.selectByVisibleText("SDET");
        driver.findElement(By.xpath("//input[@value='java']")).click();
        driver.findElement(By.xpath("//button")).click();


    }
}
