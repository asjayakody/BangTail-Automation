package com.bangtail.impl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.bangtail.core.PageObjectFW;



public class MainMenuPage extends PageObjectFW {

	static WebElement element = null;

	public static void click_expand_icon_to_expand_main_menu() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='btnLeftMenu']/i"));
		element.click();
		driver.manage().window().maximize();
	}

	public static void click_on_data_managment_menu() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='dataManagementMenuItem-id']/span"));
		element.click();

	}

	public static void click_on_action_menu() throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='actionSubLink-id']"));
		element.click();

	}

	public static void click_on_Brands() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='brandSubLink-id']"));
		element.click();

	}

	public static void click_on_Breed() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='breedSubLink-id']"));
		element.click();
		Thread.sleep(5000);

	}

	public static void click_on_Contacts() throws InterruptedException {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='contactsSubLink-id']"));
		element.click();

	}

	public static void click_on_Label_menu() throws InterruptedException {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='labelSubLink-id']"));
		element.click();

	}
	
	
	public static void click_on_Alerts() throws Throwable {

		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id='alertsSubLink-id']"));
		element.click();
		Thread.sleep(3000);
	}

}
