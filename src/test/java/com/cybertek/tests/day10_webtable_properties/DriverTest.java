package com.cybertek.tests.day10_webtable_properties;

import com.cybertek.utilities.Driver;
import org.testng.annotations.Test;

public class DriverTest {
    @Test
            public void how_to_use_driver(){
        Driver.getDriver().get("http://library2.cybertekschool.com/login.html");
    }

}
