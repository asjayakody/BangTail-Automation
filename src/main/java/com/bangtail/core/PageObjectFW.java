package com.bangtail.core;


import org.openqa.selenium.WebDriver;


public class PageObjectFW extends Driver {
   // private static String currentScenario = CucumberHook.currentRunningScenario;
    public void getname(String path) {
        Driver driver_d = new Driver();
        String driverpath = driver_d.getDriverpath(path);
       WebDriver driver = driver_d.getChoromeDriver(driverpath);
       // WebDriver driver =driver_d.getFireFoxDriver(driverpath);
       //WebDriver driver =driver_d.getIEDriver(driverpath);
        //driver.get("https://www.google.com/");


    }

 }


