package com.bangtail.core;
import com.bangtail.core.*;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Locale;

//import static com.auxenta.purelight.utiliy.SetConfigData.OSType.Windows;

public class SetConfigData {


    public static String ChoromeDriver = "exe/windows/chromedriver.exe";
    public static String FirefoxDriver = "exe/windows/geckodriver.exe";
    public static String IeDriver = "exe/windows/IEDriverServer.exe";
    public static String ChromeDriverMac = "exe/mac/chromedriver";
    public static String FireFoxDriverMac = "exe/mac/geckodriver";
    public static String ChromeDriverLinux = "exe/linux/chromedriver";
    public static String FireFoxDriverLinux = "exe/geckodriver";
    public static String Reportdir = "Purelight_Test_Report";
    public static String Logpath = "//logs.txt";


    public static String Errorlogpath;
    public static String ChromeDriverPath;
    public static String FirefoxDriverPath;
    public static String IEDriverPath;





    static String detectedOS;

    public void SetOS() throws IOException {

        if (detectedOS == null) {
            String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);

            if ((OS.contains("win"))) {
                detectedOS = "Windows";
            } else if ((OS.contains("mac"))) {
                detectedOS = "MacOS";
            } else if ((OS.contains("lin"))) {
                detectedOS = "Linux";
            } else if ((OS.contains("other"))) {
                detectedOS = "Other";
            }
        }
    }


    public void createFolder() {


        String username = System.getProperty("user.name");

        switch (detectedOS) {
            case "Windows":
                DirectoryCreator.createDirectory("C://"+Reportdir+"_"+ DateTimeCreator.getDate()+"");
                this.Errorlogpath   = DirectoryCreator.TestReportPath + Logpath;
                this.ChromeDriverPath = ChoromeDriver;
                this.FirefoxDriverPath = FirefoxDriver;
                this.IEDriverPath = IeDriver;
                break;
            case "MacOS":
                DirectoryCreator.createDirectory("/Users/"+username+""+Reportdir+"_"+DateTimeCreator.getDate()+"");
                this.Errorlogpath   = DirectoryCreator.TestReportPath + Logpath;
                this.ChromeDriverPath = ChromeDriverMac;
                this.FirefoxDriverPath = FireFoxDriverMac;
                this.IEDriverPath = IeDriver;
            case "Linux":

                DirectoryCreator.createDirectory("/home/"+username+"/"+Reportdir+"_"+DateTimeCreator.getDate()+"");
                this.Errorlogpath   = DirectoryCreator.TestReportPath + Logpath;
                this.ChromeDriverPath = ChromeDriverLinux;
                this.FirefoxDriverPath = FireFoxDriverLinux;
                this.IEDriverPath = IeDriver;
                break;
        }


    }

}








