package com.cybertek.homework.Jun5;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Task1_2 {
    WebDriver driver;

    @BeforeClass
    public void setupClass(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
        password.sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();

    }

    @Test
    public void tc_1(){
        int linksCount = 0;
        List<WebElement> listLinks = driver.findElements(By.xpath("//ul[@id='ctl00_menu']//a"));
        for (int i = 0; i < listLinks.size(); i++){
            linksCount += 1;
            System.out.println(listLinks.get(i).getText());
        }
        System.out.println("Count of all the links on landing page = " + linksCount);
    }

    @Test
    public void tc_2() throws InterruptedException {
        driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();
        WebElement options = driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']"));
        Select familyAlbum = new Select(options);
        familyAlbum.selectByVisibleText("FamilyAlbum");

        WebElement quantity = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtQuantity']"));
        quantity.sendKeys(Keys.CONTROL + "a");
        quantity.sendKeys("2");

        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Faker faker = new Faker();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName")).sendKeys(faker.name().fullName());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox2")).sendKeys(faker.address().streetAddress());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox3")).sendKeys(faker.address().city());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox4")).sendKeys(faker.address().state());
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox5")).sendKeys(faker.number().digits(5));

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys(faker.number().digits(18));
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys(faker.number().numberBetween(10, 12) + "/" + faker.number().numberBetween(10, 22));
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
        WebElement order = driver.findElement(By.xpath("//input[@onclick='UpdateFields()']/..//strong"));
        Assert.assertEquals(order.getText(), "New order has been successfully added.");




    }


}
