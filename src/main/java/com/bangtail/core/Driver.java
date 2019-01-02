package com.bangtail.core;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;




public class Driver {

	

    public static WebDriver driver = null;

    public WebDriver getIEDriver(String path) {

        if (driver == null) {
            
            System.setProperty("webdriver.ie.driver", path);
         
        }
        return driver;
    }



    public String getDriverpath(String driver) {

        String driver_path;

        switch (driver.toUpperCase()) {

            case "CHROME":
                driver_path = "exe/windows/chromedriver.exe";
                break;
            case "FIREFOX":
                driver_path = "exe/windows/geckodriver.exe";
                break;
            case "IE":
                driver_path = "exe/windows/IEDriverServer.exe";
                break;
            default:
                driver_path = "exe/windows/chromedriver.exe";
                break;
        }

        return driver_path;
    }

    public String readPropertyFile(String KEY) {
        String key = KEY;
        Properties prop = new Properties();
        InputStream input = null;
        try {
            input = new FileInputStream("config.properties");
            prop.load(input);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return prop.getProperty(key);

    }

    public WebDriver getChoromeDriver(String path) {

        if (driver == null) {


            System.setProperty("webdriver.chrome.driver", path);
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--disable-infobars");
            driver = new ChromeDriver(chromeOptions);

        }
        return driver;
    }



    public void close() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }



	
	
	
	
}
