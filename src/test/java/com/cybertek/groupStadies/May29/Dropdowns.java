package com.cybertek.groupStadies.May29;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://bch.cbd.int/database/organisms/");
        List<WebElement> register = new ArrayList<>();
         register = driver.findElements(By.xpath("//select[contains(@id,'E3')]"));


        for (int i = 0; i < register.size(); i++){
            System.out.println(register.get(i).getText());
           // if (register.get(i).getText().contains("Gene Registry")){

           // }

        }
        WebElement dropDowns = driver.findElement(By.xpath("//select[contains(@id,'E3')]"));
        Select options1 = new Select(dropDowns);
        options1.selectByVisibleText("Gene Registry");

        System.out.println("Hello hello");
       WebElement dropDowns2 = driver.findElement(By.xpath("//select[contains(@id,'E3')]"));

     Select options2 = new Select(dropDowns2);
     options1.selectByVisibleText("Filter by technique used");
//
//       WebElement dropDowns2 = driver.findElement(By.xpath("//select[contains(@id,'E2')]"));
//
//       Select options2 = new Select(dropDowns2);
//       options2.selectByVisibleText("Filter by technique used");
//
//        System.out.println();
//
//
//        driver.close();

    }
}
