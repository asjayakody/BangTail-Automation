package com.bangtail.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import com.bangtail.core.PageObjectFW;



public class TreatmentsSessionsPage extends PageObjectFW {

	static WebElement element = null;

	public static void click_on_Treatments() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"treatmentsSubLink-id\"]"));
		element.click();

	}

	public static void add_new_Processing_Session() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"createProcessingSession\"]/i"));
		element.click();

	}

	public static void enter_Processing_Session_name(String name) throws Throwable {

		Thread.sleep(2000);

		element = driver.findElement(By.xpath("//*[@id=\"ProcessingSessionName\"]"));
		element.clear();
		element.sendKeys(name);

	}

	public static void click_on_Add() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"CreateProcessingSessionDB\"]"));
		element.click();

	}

	public static void select_newly_added_Processing_Session() throws Throwable {

		Thread.sleep(5000);
		Select Processing_Session = new Select(driver.findElement(By.xpath("//*[@id=\"TPSelect\"]")));
		Processing_Session.selectByIndex(1);

	}

	public static void click_on_Go_to_Treatments() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"gotoTreatment\"]"));
		element.click();

	}

	public static void select_Practitioner() throws Throwable {

		Thread.sleep(5000);
		Select Practitioner = new Select(
				driver.findElement(By.xpath("//*[@id=\"TreatementManager\"]/div[2]/div[1]/div/div[1]/select")));
		Practitioner.selectByIndex(1);

	}

	public static void select_Add_from_product() throws Throwable {

		Thread.sleep(3000);
		Select product = new Select(
				driver.findElement(By.xpath("//*[@id=\"TreatementManager\"]/div[2]/div[1]/div/div[4]/select")));
		product.selectByIndex(1);

	}

	public static void click_Add_Products() throws Throwable {

		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"TreatementManager\"]/div[2]/div[1]/div/div[6]/button"));
		element.click();

	}

	public static void click_on_Select_Batch() throws Throwable {

		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"datatable3\"]/tbody/tr/td[9]/span"));
		element.click();

	}

	public static void select_valid_bacth() throws Throwable {

		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"Product-Batch-Table\"]/tbody/tr/td[1]/input"));
		element.click();

	}

	public static void save_product() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"TreatementManager\"]/div[2]/div[3]/div[1]/input[2]"));
		element.click();

	}

	public static void click_on_save_close() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"TreatementManager\"]/div[3]/button"));
		element.click();

	}

	public static void verify_added_product_is_displayed_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Singvac 1yr",
				driver.findElement(By.xpath("//*[@id=\"datatable3\"]/tbody/tr/td[2]")).getText());

		Thread.sleep(5000);

	}

	public static void select_value_from_Add_from_a_Protocol() throws Throwable {

		Thread.sleep(3000);
		Select Protocol = new Select(
				driver.findElement(By.xpath("//*[@id=\"TreatementManager\"]/div[2]/div[1]/div/div[3]/select")));
		Protocol.selectByIndex(1);

	}

	public static void verify_added_product_from_protocol_is_displayed_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("BRU-Ultravac 5 in 1",
				driver.findElement(By.xpath("//*[@id=\"datatable3\"]/tbody/tr/td[2]")).getText());

		Thread.sleep(5000);

	}

	public static void search_animal_by_using_Visual_EID(String eid) throws Throwable {

		Thread.sleep(2000);

		element = driver.findElement(By.xpath("//*[@id=\"txtSearchById\"]"));
		element.clear();
		element.sendKeys(eid);

	}

	public static void select_animal_from_the_grid() throws Throwable {

		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//*[@id=\"animalGrid\"]/div[6]/div/div/div[1]/input"));
		element.click();

	}

	public static void click_on_Add_Animals_to_Treatment() throws Throwable {

		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//*[@id=\"add_ps\"]"));
		element.click();

	}

	public static void click_on_Show_Animals_in_Session() throws Throwable {

		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//*[@id=\"ShowTreatmentAnimal\"]"));
		element.click();

	}

	public static void verify_moved_animal_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("SDF-97-23862",
				driver.findElement(By.xpath("//*[@id=\"animalGrid\"]/div[6]/div/div/div[2]/a/span/u")).getText());

		Thread.sleep(5000);

	}

	public static void click_on_Animal_Managment() throws Throwable {

		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"animalManagementMenuItem-id\"]/span"));
		element.click();

	}

	public static void click_on_Manage_Animals() throws Throwable {

		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"manageAnimalsSubLink-id\"]"));
		element.click();

	}

	public static void click_on_Visual_EID() throws Throwable {

		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"animalGrid\"]/div[6]/div/div/div[2]/a/span/u"));
		element.click();

	}

	public static void select_Treatments_tab() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"Animal-Detail-View\"]/div[1]/div[2]/ul/li[8]/a"));
		element.click();

	}

	public static void verify_product_field() throws Throwable {

		AssertJUnit.assertEquals("BRU-Ultravac 5 in 1",
				driver.findElement(By.xpath("//*[@id=\"datatable1\"]/tbody/tr/td[2]")).getText());

		Thread.sleep(5000);

	}

	public static void verify_Batch_NO() throws Throwable {

		AssertJUnit.assertEquals("1000",
				driver.findElement(By.xpath("//*[@id=\"datatable1\"]/tbody/tr/td[3]")).getText());

		Thread.sleep(5000);

	}
	
	
public static void select_an_already_created_processing_session(String name) throws Throwable {
	   
	Thread.sleep(3000);
	element = driver.findElement(By.xpath(""));
	Select session = new Select(
			driver.findElement(By.xpath("")));
	session.selectByValue(name);

			
	}
	
	
	
	
	
	
	

}
