package com.bangtail.core;

import com.relevantcodes.extentreports.ExtentReports;


public class ExtentFactory {
	
	
	public static ExtentReports getInstance() {
		
		ExtentReports extent;
//		String Path="E:\\BangtailRepo\\BangtailAutoBDDNew\\test-output\\report-demo.html";
//		extent=new ExtentReports(Path, false);
//		return extent;
//		
//		//extent.addSystemInfo(param, value)
		
		extent = new ExtentReports(System.getProperty("user.dir")+"/target/Extent.html", true);
		extent.addSystemInfo("Host Name", "Aux-038");
		extent.addSystemInfo("User Name", "Nirmala Jayasanka");
		//return extent.addSystemInfo("Environment", "QA");
		
		return extent;
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
