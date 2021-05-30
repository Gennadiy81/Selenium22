package com.cybertek.groupStadies.May16;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_Find24WebElements {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver():
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.homedepot.com");
        Thread.sleep(1000);
//        WebElement idSearchBox = driver.findElement(By.id("headerSearch"));
//        idSearchBox.sendKeys("garden hose" + Keys.ENTER);
//
//        WebElement classNameInStockBox = driver.findElement(By.className("checkbox-btn__label"));
//        classNameInStockBox.click();
//
//        WebElement linkTextTruckTulRental = driver.findElement(By.linkText("Truck & Tool Rental"));
//        linkTextTruckTulRental.click();
//
//        WebElement linkTextAerators = driver.findElement(By.linkText("Aerators"));
//        linkTextAerators.click();
//
//        Thread.sleep(1000);
//        WebElement cssSelectorMyAccount = driver.findElement(By.cssSelector("div[class='MyAccount__label SimpleFlyout__link--bold']"));
//        cssSelectorMyAccount.click();
//
//        Thread.sleep(1000);
//        WebElement classNamePathSingIn = driver.findElement(By.className("MyAccount__auth"));
//        classNamePathSingIn.click();
//
//        Thread.sleep(1000);
//        WebElement idEmailInput = driver.findElement(By.id("email"));
//        idEmailInput.sendKeys("cybertec@gmail.com");
//
//        WebElement cssSelectorPasswordInput = driver.findElement(By.cssSelector("input[type='password']"));
//        cssSelectorPasswordInput.sendKeys("1234qwer" + Keys.ENTER);
//
//        WebElement cssSelectorHomeDepotLogo = driver.findElement(By.cssSelector("img[alt='thd-logo']"));
//        cssSelectorHomeDepotLogo.click();
//
//        WebElement tagNameFreeDelivery = driver.findElement(By.tagName("span"));
//        System.out.println(tagNameFreeDelivery.getText());
//        System.out.println(driver.findElement(By.tagName("a")).getAttribute("href"));
//
//        WebElement idForThePro = driver.findElement(By.linkText("For the Pro"));
//        System.out.println(idForThePro.getAttribute("id"));
//        idForThePro.click();
//
//        WebElement xPathHome = driver.findElement(By.xpath("//a[@href='/']"));
//        System.out.println(xPathHome.getText());
//        System.out.println(xPathHome.getAttribute("class"));
//        xPathHome.click();
//
//        WebElement cssSelectorFurniture = driver.findElement(By.cssSelector("a[data-id='homeDecorFurniture']"));
//        System.out.println(cssSelectorFurniture.getAttribute("class"));
//        System.out.println(cssSelectorFurniture.getAttribute("href"));

        WebElement xPathClosed = driver.findElement(By.xpath("//div[@class='col__12-12 my-store-widget__store--closed']"));
        System.out.println(xPathClosed.getText());

        WebElement cssSelectorTelephone = driver.findElement(By.cssSelector("a[href='tel:(312)850-4836']"));
        System.out.println(cssSelectorTelephone.getText());
        System.out.println(cssSelectorTelephone.getAttribute("href"));












            // Thread.sleep(10000);
            //driver.close();


        }
    }

