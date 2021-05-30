package com.cybertek.tests.day6_testing_intro_dropdown;


import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @Test(priority = 1)
    public void test1() {
        System.out.println("Running test 1...");
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("Running test 2...");
        String actual = "apple";
        String expected = "apple";
        Assert.assertTrue(actual.equals(expected));
        //Assert.assertFalse(actual.equals(expected));
    }

    @BeforeClass
    public void setupClass(){
        System.out.println("----> Before CLASS is running...");
    }
    @AfterClass
    public void teardownClass() {
        System.out.println("----> After CLASS is running...");
    }

    @BeforeMethod
    public void setMethod(){
        System.out.println("---> Before method is running...");

    }
    @AfterMethod
    public void teardownMethod(){
        System.out.println("---> After method is running...");
    }


}
