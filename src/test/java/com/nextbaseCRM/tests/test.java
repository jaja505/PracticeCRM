package com.nextbaseCRM.tests;


import com.nextbaseCRM.utilities.ConfigurationReader;
import com.nextbaseCRM.utilities.Driver;

public class test {
    public static void main(String[] args) {

       Driver.getDriver().get(ConfigurationReader.getProperty("url"));

        System.out.println(ConfigurationReader.getProperty("url"));


    }
}
