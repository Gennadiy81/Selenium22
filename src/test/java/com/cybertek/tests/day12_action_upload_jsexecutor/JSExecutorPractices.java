package com.cybertek.tests.day12_action_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsexecutor_tes1(){
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        BrowserUtils.sleep(2);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

       for (int i= 0; i < 5 ; i ++){
          BrowserUtils.sleep(1);
           js.executeScript("window.scrollBy(0, 750)");
       }
    }

    @Test
    public void scroll_using_jsexecutor_tes2(){
        Driver.getDriver().get("http://practice.cybertekschool.com/large");
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        WebElement cybertekSchoolLink = Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink = Driver.getDriver().findElement(By.linkText("Home"));
        BrowserUtils.sleep(1);
        //use js.executor with different scrolling JavaScript function
        js.executeScript("arguments[0].scrollIntoView(true)", cybertekSchoolLink);
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)", homeLink);

    }
}
