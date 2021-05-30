package com.cybertek.groupStadies.May20_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TwentyElements {
    public static void main(String[] args) throws InterruptedException {
        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://chrome.google.com/webstore/category/extensions?hl=en");
//        List<WebElement> classEl = driver.findElements(By.xpath("//div[@class='a-P-d-w']"));
//        for (WebElement each : classEl) {
//            System.out.println(each.getText());
//        }
//        driver.findElement(By.xpath("//div[@title='Custom Cursor for Chrome™']")).click();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.navigate().to("https://chrome.google.com/webstore/category/extensions?hl=en");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//div[@title='Dark Mode']")).click();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.navigate().to("https://chrome.google.com/webstore/category/extensions?hl=en");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//div[@title='MetaMask']")).click();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        driver.navigate().to("https://www.cars.com/");
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//        driver.findElement(By.xpath("//div[@class='_3WR-2 _35UQG']/span")).click();
//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.navigate().to("https://www.cargurus.com");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//li[@class='links']/a[@href='/Cars/forsale']")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@href='/Cars/cl-Certified-Toyota-m7']")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//img[@alt='2017 Prius Three Touring FWD']")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//button[@data-cg-ft='listing-navigation-all-results']")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//a[@href='/Cars/new/']")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//div[@class='embedResponsive16by9 embedResponsive']/img")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("a[href='#listing=283920514']>div>div>div>picture>img[alt='2020 Nissan Frontier SV King Cab RWD']")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("div[class='_26WJC1 _2TkLbq']>img[alt='Vehicle Full Photo']")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("div[class='YS81m6 _5q34pN']")).click();
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/div[6]/div/div/div[1]/div[1]/div[2]/div/div/svg[1]/path")).click();










    }
}

