package com.cybertek.groupStadies.Jun11_getWindowHandle;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TablePractice {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        String browser = ConfigurationReader.getProperty("browser");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/html/html_tables.asp");


         ///table[@class='wikitable sortable jquery-tablesorter']//tbody/tr
        List<WebElement> rows1 = driver.findElements(By.xpath("//table[@id='customers']//tr"));
        int countRows = 0;
        for (WebElement each : rows1){
            System.out.println("countRows = ");

        }


    }
}

















