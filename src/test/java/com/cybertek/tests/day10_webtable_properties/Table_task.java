package com.cybertek.tests.day10_webtable_properties;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TableUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_task {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        String browser = ConfigurationReader.getProperty("browser");
        String url = ConfigurationReader.getProperty("dataTablesUrl");
        driver = WebDriverFactory.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }
    @Test
    public void task3_return_tims_due_amount(){
        // //table[@id='table1']//td[.='Tim']/../td[4]
        WebElement timsDueAmount = driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/following-sibling::td[2]"));
        String actualTimResult = timsDueAmount.getText();
        String expectedTimResult = "$50.00";
        Assert.assertEquals(actualTimResult, expectedTimResult, "Test Failing");

    }
    @Test
    public void task4_verify_order_method(){
        TableUtils.verifyOrder(driver, "Frank");
    }
}
