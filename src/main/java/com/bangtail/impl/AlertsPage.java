package com.bangtail.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import com.bangtail.core.PageObjectFW;


public class AlertsPage extends PageObjectFW {

	static WebElement element = null;

	public static void clikc_on_add_alert() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Alert-List-View-Id']/div[1]/div/button/i"));
		element.click();
		
		
	}

	public static void enter_alert_name_as(String name) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='home']/div[1]/div[1]/div/div[1]/input"));
		element.clear();
		element.sendKeys(name);

	}

	public static void enter_description_as(String description) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='home']/div[1]/div[2]/textarea"));
		element.clear();
		element.sendKeys(description);

	}

	public static void save_alert() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Alert-Detail-View-Id']/div[3]/div[2]/label/span"));
		element.click();
		Thread.sleep(6000);

	}

	public static void search_for_alert(String name) throws Throwable {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='Alert-Table-Id_filter']/label/input"));
		element.clear();
		element.sendKeys(name);

	}

	public static void verify_searched_alert_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Alert001",
				driver.findElement(By.xpath("//*[@id='Alert-Table-Id']/tbody/tr[1]/td[1]")).getText());

		Thread.sleep(5000);
	}

	public static void verify_mandatory_fields_validation() throws Throwable {

		Thread.sleep(5000);
		AssertJUnit.assertEquals("Error:  Please Enter Description.",
				driver.findElement(By.xpath("//*[@id='home']/div[4]/div/div[2]/div/div/div/span")).getText());

	}

	public static void click_on_edit_alert() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Alert-Table-Id']/tbody/tr[1]/td[5]/a[1]"));
		element.click();

	}

	public static void update_alert() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Alert-Detail-View-Id']/div[3]/div[2]/label/span"));
		element.click();

	}

	public static void verify_edited_alert_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Alert_Edited",
				driver.findElement(By.xpath("//*[@id='Alert-Table-Id']/tbody/tr[1]/td[1]")).getText());

		Thread.sleep(5000);

	}

	public static void click_on_delete_alert() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Alert-Table-Id']/tbody/tr[1]/td[5]/a[3]"));
		element.click();

	}

	public static void verify_deleted_alert_is_not_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("No matching records found",
				driver.findElement(By.xpath("//*[@id='Alert-Table-Id']/tbody/tr/td")).getText());

		Thread.sleep(5000);

	}

	public static void click_on_copy_alert() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Alert-Table-Id']/tbody/tr[1]/td[5]/a[2]"));
		element.click();

	}

	public static void verify_copied_alert_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Alert_Copy",
				driver.findElement(By.xpath("//*[@id='Alert-Table-Id']/tbody/tr[1]/td[1]")).getText());

		Thread.sleep(5000);

	}

}
