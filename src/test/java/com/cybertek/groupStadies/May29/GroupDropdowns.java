package com.cybertek.groupStadies.May29;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GroupDropdowns {
    WebDriver driver;

    @BeforeMethod
    public void GroupDropdowns(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.aa.com/booking/find-flights?redirectSearchToLegacyAACom=false");

    }
    @Test
    public void test01_address(){
        WebElement oneWay = driver.findElement(By.xpath("//span[.='One way']"));
        oneWay.click();

        WebElement toGo = driver.findElement(By.xpath("//input[@id='segments0.destination']"));
        toGo.sendKeys("chicago");

        WebElement timeOfDay = driver.findElement(By.xpath("//select[@id='segments0.travelTime']"));
        Select timeOfDaySelect = new Select(timeOfDay);

        timeOfDaySelect.selectByVisibleText("Evening");

        WebElement passengerCount = driver.findElement(By.xpath("//select[@id='passengerCount']"));
        Select passengerCountSelect = new Select(passengerCount);
        passengerCountSelect.selectByValue("2");

        WebElement passengerAge = driver.findElement(By.xpath("//select[@id='passengers0.passengerType']"));
        Select passengerAgeSelect = new Select(passengerAge);
        passengerAgeSelect.selectByIndex(3);

        WebElement depart = driver.findElement(By.xpath("//input[@id='segments0.travelDate']"));

        WebElement passenger2 = driver.findElement(By.xpath("//select[@id='passengers1.passengerType']"));

        Select selectPassenger2 = new Select(passenger2);
        selectPassenger2.selectByValue("SENIOR");

        WebElement searchBy = driver.findElement(By.xpath("//select[@id='revenueSearchOption']"));
        Select selectSearch = new Select(searchBy);

        selectSearch.selectByIndex(1);

        WebElement classMy = driver.findElement(By.xpath("//select[@name='revenueCabin']"));
        Select selClass = new Select(classMy);
        selClass.selectByVisibleText("Business / First");



    }

}
