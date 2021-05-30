package com.cybertek.utilities;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static void main(String[] args) {

        getDriver("chrome");

    }
    public static WebDriver getDriver(String browserType){

         if (browserType.equalsIgnoreCase("chrome")){
             WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
         }else if(browserType.equalsIgnoreCase("firefox")) {
             WebDriverManager.firefoxdriver().setup();
             return new FirefoxDriver();
         }else{
             System.out.println("Given browser type does not exist. Driver = null");
         }
         return null;
    }

}