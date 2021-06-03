package com.cybertek.groupStadies.May29;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class VleriasTask {
            public static void main(String[] args) {
                WebDriver driver = WebDriverFactory.getDriver("chrome");
                driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                driver.get("https://www.aa.com/booking/find-flights?redirectSearchToLegacyAACom=false");

                WebElement oneWay = driver.findElement(By.xpath("//span[.='One way']"));
                oneWay.click();

                WebElement toGo = driver.findElement(By.xpath("//input[@id='segments0.destination']"));
                toGo.sendKeys("chicago");

//        driver.findElement(By.xpath("//input[@id='segments0.travelDate']")).click();

                WebElement timeOfDay = driver.findElement(By.xpath("//select[@id='segments0.travelTime']"));
                Select timeOfDaySelect = new Select(timeOfDay);

                timeOfDaySelect.selectByVisibleText("Evening");

                WebElement passengers = driver.findElement(By.xpath("//select[@id='passengerCount']"));
                Select select2 = new Select(passengers);
                select2.selectByVisibleText("9");

                List<WebElement> passengerList = driver.findElements(By.xpath("//select[contains(@id,'passengerType')]"));
                List<Select> list = new ArrayList<>();
                for (int i = 0; i < passengerList.size(); i++) {
                    list.add(new Select(passengerList.get(i)));
                    list.get(i).selectByIndex(3);
                }

//        WebElement pass1 = driver.findElement(By.xpath("//select[@id='passengers0.passengerType']"));
//        Select select3 = new Select(pass1);
//        select3.selectByVisibleText("Senior (65+)");
//
//        WebElement pass2 = driver.findElement(By.xpath("//select[@id='passengers1.passengerType']"));
//        Select select4 = new Select(pass2);
//        select4.selectByIndex(2);
//
//        WebElement pass3 = driver.findElement(By.xpath("//select[@id='passengers2.passengerType']"));
//        Select select5 = new Select(pass3);
//        select5.selectByIndex(3);
//
//        WebElement option1 = driver.findElement(By.xpath("//select[@id='revenueSearchOption']"));
//        Select rate = new Select(option1);
//        rate.selectByVisibleText("Flexible fare");
//
//        WebElement option2 = driver.findElement(By.xpath("//select[@id='revenueCabin']"));
//        Select classFlight = new Select(option2);
//        classFlight.selectByValue("BUSINESS_FIRST");
//
//        WebElement option3 = driver.findElement(By.xpath("//select[@id='airline']"));
//        Select airlines = new Select(option3);
//        airlines.selectByValue("AA");



            }
        }


