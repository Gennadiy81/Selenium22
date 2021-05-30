package com.cybertek.groupStadies.May24;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DefinesElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.target.com/");
        ArrayList<String> arrayList = new ArrayList<>();
        List<WebElement> a  = driver.findElements(By.xpath("(//div[@class='ItemTitle-yw3r8r-0 fqaeHF'])"));
        for (int i = 7; i < a.size(); i++) {
            arrayList.add(a.get(i).getText());

        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}


