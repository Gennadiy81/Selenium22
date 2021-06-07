package com.cybertek.tests.day9_prorerties_browser_utils;

import org.testng.annotations.Test;

public class LearningProperties {


    @Test
    public void java_properties_reading_test(){
        System.out.println("System.getProperty(\"os.name\") - " + System.getProperty("os.name"));
        System.out.println("System.clearProperty(\"user.name\") - " + System.clearProperty("user.name"));

    }
}
