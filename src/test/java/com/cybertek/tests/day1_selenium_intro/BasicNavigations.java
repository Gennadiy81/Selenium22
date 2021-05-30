package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {
        // 1 - setup the browser driver
        WebDriverManager.chromedriver().setup();
        //2 - create instance of selenium web driver
        WebDriver driver = new ChromeDriver();

        // this line will maximize the web page
        driver.manage().window().maximize();
        //3 - get the page for Tesla.com
        driver.get("https://tesla.com");

        System.out.println("Current title - " +  driver.getTitle());

        String currentUrl = driver.getCurrentUrl();
        System.out.println("current = " + currentUrl);
        // putting 3 seconds wait/ stop the code for sec
        Thread.sleep(3000);
        // going back using navigation

        driver.navigate().back();
        // putting 3 seconds wait/ stop the code for sec
        Thread.sleep(3000);
        // going forward using navigation
        driver.navigate().forward();

        // putting 3 seconds wait/ stop the code for sec
        Thread.sleep(3000);

        //refreshing the page using navigation
        driver.navigate().refresh();


        //going to another url using .to
        driver.get("https://google.com");
        currentUrl = driver.getCurrentUrl();

        System.out.println("Current title - " +  driver.getTitle());

        System.out.println("currentUrl = " + currentUrl);




        //this method will close current page
        driver.close();

        // will close all of the opened browser or tabs within the same session
        // it will only close 1 browser or 1 tab
        driver.close();




    }
}
