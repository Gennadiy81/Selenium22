package com.cybertek.homework.Jun19_Upload_Actions;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest_TC14 {
    @Test
    public void uploadPractice(){
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");
        WebElement chooseFile = Driver.getDriver().findElement(By.id("file-upload"));
        String path = "C:\\Users\\ghena\\Pictures\\Saved Pictures\\20210224_193421.jpg";
        chooseFile.sendKeys(path);
        WebElement fileSubmit = Driver.getDriver().findElement(By.id("file-submit"));
        fileSubmit.click();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h3")).isDisplayed(), "Not Displayed");

    }
}
