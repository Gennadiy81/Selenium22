package com.cybertek.tests.day9_prorerties_browser_utils;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.LibraryUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P1_Library_utils {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver(ConfigurationReader.getProperty("browser"));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("http://library2.cybertekschool.com/login.html");
    }
    @Test
            public void login_link_count_test(){
        LibraryUtils.loginToLibrary(driver);
        BrowserUtils.sleep(2);

        List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));

        System.out.println("allLinks.size() = " + allLinks.size());

        for (WebElement each : allLinks) {
            System.out.println(each.getText());
        }
        }
    }
