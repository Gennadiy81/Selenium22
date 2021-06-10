package com.cybertek.utilities;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TableUtils {
    //WebDriver driver;
    public static void verifyOrder(WebDriver driver, String name){
        List<WebElement> allNames  = driver.findElements(By.xpath("//table[@id='table1']//tr//td[2]"));

         for (WebElement each : allNames){
             if(each.getText().equals(name)){
                 Assert.assertTrue(each.getText().equals(name));
                 return;
             }

         }
         Assert.fail("The expected name is not on the table");
    }
    public static void printNamesAndEmails(WebDriver driver){
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='table1']//tbody//td[2]"));
        List<WebElement> allEmails = driver.findElements(By.xpath("//table[@id='table1']//tbody//td[3]"));
        int count =0;
        for(int i = 0; i < allNames.size(); i++){
            count += 1;
            System.out.println("Name" + count + ": " + allNames.get(i).getText() + ", " + "Email" + count + ": " + allEmails.get(i).getText());
            ////table[@id='table1']//td[.='Tim']//following-sibling::td[.='$50.00']
        }

    }
}
