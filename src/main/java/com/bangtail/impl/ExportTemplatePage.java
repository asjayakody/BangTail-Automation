package com.bangtail.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;

import com.bangtail.core.PageObjectFW;





public class ExportTemplatePage extends PageObjectFW {
	
	static WebElement element = null;
	
	
	public static void click_on_Export_Templates_menu_item() throws Throwable {
		
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"exportTemplatesSubLink-id\"]"));
		element.click();
	    
	}

	
	public static void click_on_Export_Templates_Add_button() throws Throwable {
		
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"Export-Templates-List\"]/div[1]/div/button/i"));
		element.click();
	    
	}

	
	public static void enter_Export_Templates_Name_as(String name) throws Throwable {
		   
		element = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/div[1]/input"));
		element.clear();
		element.sendKeys(name);
	}

	
	public static void select_Entity_Type() throws Throwable {
		
		element = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/div[2]/select"));
		element.click();
		Keyboard kb = ((HasInputDevices) driver).getKeyboard();
		kb.pressKey(Keys.ARROW_DOWN);
		kb.pressKey(Keys.ENTER);
	    
	}

	
    public static void enter_Export_Templates_Description_as(String Description) throws Throwable {
    	
    	element = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/div[3]/input"));
		element.clear();
		element.sendKeys(Description);
	    
	}

	
	public static void select_File_Format() throws Throwable {
		
		element = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/div[6]/div[1]/select"));
		element.click();
		Keyboard kb = ((HasInputDevices) driver).getKeyboard();
		kb.pressKey(Keys.ARROW_DOWN);
		kb.pressKey(Keys.ENTER);
	    
	    
	}

	
    public static void select_File_Name_as(String Filename) throws Throwable {
	    
    	element = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[1]/div[6]/div[2]/input"));
		element.clear();
		element.sendKeys(Filename);
		
	}

	
	public static void click_on_Add_Fields_Button() throws Throwable {
		
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/div[2]/div[1]/div[1]/button"));
		element.click();
	    
	    
	}

	
	public static void select_Source_Data() throws Throwable {
		
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"tableDetails\"]/div[1]/select"));
		element.click();
		Keyboard kb = ((HasInputDevices) driver).getKeyboard();
		kb.pressKey(Keys.ARROW_DOWN);
		kb.pressKey(Keys.ENTER);
	    
	    
	}

	
	public static void select_Source_Field() throws Throwable {
		
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"tableDetails\"]/div[2]/select"));
		element.click();
		Keyboard kb = ((HasInputDevices) driver).getKeyboard();
		kb.pressKey(Keys.ARROW_DOWN);
		kb.pressKey(Keys.ENTER);
	    
	    
	}

	
    public static void enter_Destination_Field_as(String DestinationField) throws Throwable {
    	
    	Thread.sleep(1000);
    	element = driver.findElement(By.xpath("//*[@id=\"DestinationField\"]"));
		element.clear();
		element.sendKeys(DestinationField);
	    
		
	}

	
    
	public static void click_on_AFADD_Button() throws Throwable {
	    
		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//*[@id=\"tableDetails\"]/div[8]/div[2]/label/span"));
		element.click();
		
	}

	
	public static void save_Export_Templates() throws Throwable {
		
		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//*[@id=\"Export-Templates-Detail\"]/div[3]/div[2]/label"));
		element.click();
	    
	    
	}

	
    public static void verify_Template_Successfully_added() throws Throwable {
	    
    	WebDriverWait wait = new WebDriverWait(driver, 50);
    	WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-success']"));
    	wait.until(ExpectedConditions.visibilityOf(msg));
    	String text = msg.getText();
    	System.out.println(text);
    	String expectedText = "Success!  Template Successfully added.";
    	System.out.println(expectedText);
    	AssertJUnit.assertEquals(text, expectedText);
	}

	
	public static void click_on_Export_Templates_cancel_button() throws Throwable {
		
		Thread.sleep(2000);
		element = driver.findElement(By.xpath("	//*[@id=\"next\"]/span"));
		element.click();
		
		//*[@id="next"]//*[@id="next"]
		//*[@id="next"]/span
		//*[@id="next"]/span
	}

	
	public static void click_Leave_page_from_confirmation_message() throws Throwable {
	    
	}

	
	public static void enter_Export_Templates_name_in_search_box() throws Throwable {
	    
	}

	
	public static void verify_searched_Export_Template_is_available_in_the_grid() throws Throwable {
	    
	}

}
