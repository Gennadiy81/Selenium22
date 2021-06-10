package com.cybertek.homework.Jun8;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestSmartBearUtils {
    WebDriver driver;

    @Test
    public void test1(){
        SmartBearUtils.verifyOrder("Gennadiy");
    }
}
