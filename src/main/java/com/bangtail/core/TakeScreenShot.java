package com.bangtail.core;

import java.io.File;
import org.apache.commons.io.FileUtils;
//import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenShot {
	
	 public static String captureScreenshot(String screenshotName, String timeTaken) {
	        String screenShotPath = "";
	        try {
	            TakesScreenshot ts = (TakesScreenshot) Driver.driver;
	           File source = ts.getScreenshotAs(OutputType.FILE);
	          //  File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	            screenShotPath = DirectoryCreator.screenshotDir + "/" + screenshotName + "_" + timeTaken + ".png";
	            //FileUtils.copyFile(source, new File(screenShotPath));
	            FileUtils.copyFile(source, new File(screenShotPath));
	            
	            
	             

	        } catch (Exception e) {

	            e.printStackTrace();
	        }
	        return screenShotPath;
	    }

	
	
		
	

}
