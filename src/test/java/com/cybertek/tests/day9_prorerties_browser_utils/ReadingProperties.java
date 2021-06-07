package com.cybertek.tests.day9_prorerties_browser_utils;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {
        Properties properties = new Properties();

        FileInputStream file = new FileInputStream("configuration.properties");

        properties.load(file);

        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));

        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));


    }
    @Test
    public void using_properties_method(){

        System.out.println("ConfigurationReader.getProperty(\"browser\") = " + ConfigurationReader.getProperty("browser"));
        System.out.println("ConfigurationReader.getProperty(\"ene\") = " + ConfigurationReader.getProperty("ene"));
    }

}
