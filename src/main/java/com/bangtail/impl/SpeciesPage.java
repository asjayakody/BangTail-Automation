package com.bangtail.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bangtail.core.PageObjectFW;

import cucumber.api.java.en.Then;



public class SpeciesPage extends PageObjectFW{
	
	static WebElement element = null;

	
	
	public static void click_on_Species() throws Throwable {
	   
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"speciesSubLink-id\"]"));
		element.click();
		
		
		
	}


	public static void click_on_Add_Species() throws Throwable {
	    
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"Spadd-automation-id\"]/i"));
		element.click();
		
		
	}
	
	
public static void enter_name(String name) throws Throwable {
	    
	element = driver.findElement(By.xpath("//*[@id=\"Spname-automation-id\"]"));
	element.clear();
	element.sendKeys(name);
		
		
	}
	


public static void click_on_active_checkbox_to_create_active_Species() throws Throwable {
    
	element = driver.findElement(By.xpath("//*[@id=\"activeChkBx\"]"));
	element.click();
	
	
}


public static void save_Species() throws Throwable {
  
	element = driver.findElement(By.xpath("//*[@id=\"Spsave-automation-id\"]/span"));
	element.click();
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
