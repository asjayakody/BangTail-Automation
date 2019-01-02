package com.bangtail.core;

//import com.auxenta.purelight.support.DateTimeCreator;
import com.bangtail.*;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;


public class ExtentReport {


    private static ExtentReports extent;
    private static ExtentTest logger;


    public static void startReport() {
        extent = new ExtentReports(DirectoryCreator.testOutput + "/" + "PureLightExtentReport.html", false);
         extent.loadConfig(new File("extent-config.xml"));
    }


    public static void startTest(String testName) {
        logger = extent.startTest(testName);
    }


    private static void testStep(String screenShotPath, String stepDetails, LogStatus logStatus) {
        logger.log(logStatus, stepDetails);
        logger.log(LogStatus.INFO, "Screencast below: " + logger.addScreenCapture(screenShotPath));
        extent.endTest(logger);
        extent.flush();
    }

    public static void endReport() {
        extent.close();
    }

    public static void logInfo(String info) {
        logger.log(LogStatus.INFO, info);
        extent.endTest(logger);
        extent.flush();
    }

    public static void logScrennShotInfo(String screenName,String info){
        String timeTaken = DateTimeCreator.getTime();
        String screenShotPath = TakeScreenShot.captureScreenshot(screenName, timeTaken);
        logger.log(LogStatus.INFO, info);
        logger.log(LogStatus.INFO, "Screencast below: " + logger.addScreenCapture(screenShotPath));
        extent.endTest(logger);
        extent.flush();
    }

    public static void addLogsToReport(String screenName, String stepDefinition, boolean actualResult) {
        String timeTaken = DateTimeCreator.getTime();
        String screenShotPath = TakeScreenShot.captureScreenshot(screenName, timeTaken);
        if (actualResult) {
            ExtentReport.testStep(screenShotPath, stepDefinition, LogStatus.PASS);
        } else {
            ExtentReport.testStep(screenShotPath, stepDefinition, LogStatus.FAIL);
        }
    }


}

