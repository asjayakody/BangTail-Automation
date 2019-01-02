package com.bangtail.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import com.bangtail.core.PageObjectFW;

import cucumber.api.java.en.Then;

public class RegionsPage extends PageObjectFW {

	static WebElement element = null;

	public static void click_on_Regions() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='regionsSubLink-id']"));
		element.click();

	}

	public static void click_on_add_regions() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='Readd-automation-id']"));
		element.click();

	}

	public static void enter_region_code(String code) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Recode-automation-id']"));
		element.clear();
		element.sendKeys(code);

	}

	public static void enter_region_name(String name) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Rename-automation-id']"));
		element.clear();
		element.sendKeys(name);

	}

	public static void save_region() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Resave-automation-id']/span"));
		element.click();
		Thread.sleep(5000);
	}

	public static void search_for_Region(String code) throws Throwable {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='Regions-Table_filter']/label/input"));
		element.clear();
		element.sendKeys(code);

	}

	public static void verify_searched_Region_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Region001",
				driver.findElement(By.xpath("//*[@id='Regions-Table']/tbody/tr/td[1]")).getText());

		Thread.sleep(5000);

	}

	public static void verify_mandatory_field_validation_for_code() throws Throwable {

		String expectedText = "Error:  Enter Region Name.";
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-danger']"));
		String text = msg.getText();
		// System.out.println(text);
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void click_on_edit_Region() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='Reedit-automation-id']"));
		element.click();

	}

	public static void update_Region() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Resave-automation-id']/span"));
		element.click();

	}

	public static void verify_edited_Region_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("RegionEdit",
				driver.findElement(By.xpath("//*[@id='Regions-Table']/tbody/tr/td[1]")).getText());

		Thread.sleep(5000);

	}

	public static void click_on_copy_feature() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Recopy-automation-id']"));
		element.click();

	}

	public static void verify_copied_Region_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("RegionCopy",
				driver.findElement(By.xpath("//*[@id='Regions-Table']/tbody/tr/td[1]")).getText());

		Thread.sleep(5000);

	}

	public static void verify_duplicate_Region_Code_error_message() throws Throwable {

		Thread.sleep(5000);
		AssertJUnit.assertEquals("Error:  Region Code already exists. Please provide a new Region Code.",
				driver.findElement(By.xpath(".//*[@class='alert alert-danger']")).getText());

	}

	public static void click_on_delete_region() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"Redelete-automation-id\"]"));
		element.click();

	}

	public static void verify_deleted_Region_is_not_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("No matching records found",
				driver.findElement(By.xpath("//*[@id='Regions-Table']/tbody/tr/td[1]")).getText());

		Thread.sleep(5000);

	}

	public static void uncheck_active_check_box_for_create_inactive_region() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"activeChkBx\"]"));
		element.click();

	}

	public static void click_show_inactives_regions() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"checkbox1\"]"));
		element.click();

	}

	public static void verify_inactive_Region_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Region002",
				driver.findElement(By.xpath("//*[@id=\"Regions-Table\"]/tbody/tr/td[1]")).getText());

		Thread.sleep(5000);

	}

}
