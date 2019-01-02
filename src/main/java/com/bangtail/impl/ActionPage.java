package com.bangtail.impl;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;

import com.bangtail.core.PageObjectFW;

public class ActionPage extends PageObjectFW {

	static WebElement element = null;

	

	public static void click_on_add_action_button() throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='Action-List-View']/div[1]/div/button/i"));
		element.click();

	}

	public static void send_value_name(String val) {

		element = driver.findElement(By.xpath("//*[@id='home']/div[1]/div[1]/input"));
		element.clear();
		element.sendKeys(val);

	}

	public static void send_value_description(String val) {

		element = driver.findElement(By.xpath("//*[@id='home']/div[1]/div[2]/input"));
		element.clear();
		element.sendKeys(val);

	}

	public static void send_value_assigned_by(String val) {

		element = driver.findElement(By.xpath("//*[@id='home']/div[2]/div[1]/input"));
		element.clear();
		element.sendKeys(val);

	}

	public static void select_assigned_to() throws Exception {

		Thread.sleep(5000);
		//element = driver.findElement(By.xpath(".//*[@id='home']/div[2]/div[2]/span/span[1]/span/ul/li[1]"));
		//element.click();
		//Keyboard keyboard = ((HasInputDevices) driver).getKeyboard();
		//keyboard.pressKey(Keys.ENTER);
		// keyboard.pressKey(Keys.TAB);
		//keyboard.pressKey(Keys.TAB);
		

	}

	public static void select_status() {

		
		element = driver.findElement(By.xpath("//*[@id=\"home\"]/div[3]/div[1]/select"));
		element.click();
		Keyboard kb = ((HasInputDevices) driver).getKeyboard();
		kb.pressKey(Keys.ARROW_DOWN);
		kb.pressKey(Keys.ENTER);

	}

	public static void click_save_button() throws InterruptedException {

		element = driver.findElement(By.xpath(".//*[@id='Action-Detail-View']/div[3]/div[2]/label/span"));
		element.click();

	}

	public  static void click_on_cancel_button() throws InterruptedException {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='next']"));
		element.click();
	}


	public static void send_value_search_box(String val) throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='Active-Table_filter']/label/input"));
		element.clear();
		element.sendKeys(val);

	}

	public static void find_searched_item() throws InterruptedException {

		// System.out.println(driver.findElement(By.xpath("//*[@id='Active-Table']/tbody/tr[1]/td[1]")).getText());
		AssertJUnit.assertEquals("Action001",
				driver.findElement(By.xpath("//*[@id='Active-Table']/tbody/tr[1]/td[1]")).getText());
		// Thread.sleep(50000);
	}

	public static void click_edit_button() {

		element = driver.findElement(By.xpath("//*[@id='Active-Table']/tbody/tr[1]/td[8]/a[1]"));
		element.click();

	}

	public static void click_update_button() {

		element = driver.findElement(By.xpath("//*[@id='Action-Detail-View']/div[3]/div[2]/label/span"));
		element.click();

	}

	public static void verify_update_Successfull_message() {

		String expectedText = "Success!  \n" + "Record Updated Successfully";
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-success']"));
		String text = msg.getText();
		// System.out.println(text);
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void click_delete_button() {

		element = driver.findElement(By.xpath("//*[@id='Active-Table']/tbody/tr[1]/td[8]/a[3]"));
		element.click();
	}

	public static void accept_delete_alert() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

	public static void verify_deleted_item() throws InterruptedException {

		AssertJUnit.assertEquals("No matching records found",
				driver.findElement(By.xpath("//*[@id='Active-Table']/tbody/tr/td")).getText());

	}

}
