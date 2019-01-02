package com.bangtail.impl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import com.bangtail.core.PageObjectFW;



public class BreedPage extends PageObjectFW {

	static WebElement element = null;

	public static void click_on_add_breed() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='breedadd-automation-id']/i"));
		element.click();

	}

	public static void enter_breed_code_as(String code) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='breedcode-automation-id']"));
		element.clear();
		element.sendKeys(code);

	}

	public static void enter_breed_name_as(String name) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='breedname-automation-id']"));
		element.clear();
		element.sendKeys(name);

	}

	public static void enter_breed_description_as(String description) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='breeddes-automation-id']"));
		element.clear();
		element.sendKeys(description);

	}

	public static void save_breed() throws Throwable {

		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id='breedsave-automation-id']/span"));
		element.click();

	}

	public static void search_breed(String code) throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='datatable1_filter']/label/input"));
		element.clear();
		element.sendKeys(code);

	}

	public static void verify_searched_breed_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Breed001",
				driver.findElement(By.xpath("//*[@id='datatable1']/tbody/tr[1]/td[1]")).getText());

	}

	public static void delete_breed() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='breeddelet-automation-id']"));
		element.click();

	}

	public static void verify_searched_breed_is_not_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("No matching records found",
				driver.findElement(By.xpath("//*[@id='datatable1']/tbody/tr/td")).getText());

	}

	public static void uncheck_is_active() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='home']/div[4]/div[2]/label/input"));
		element.click();

	}

	public static void click_copy_breed() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='breedcopy-automation-id']"));
		element.click();

	}

	public static void click_on_edit_breed() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='breededit-automation-id']"));
		element.click();

	}

	public static void update_breed() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='breedsave-automation-id']/span"));
		element.click();

	}

	public static void verify_searched_breed_is_not_available() throws Throwable {

		AssertJUnit.assertEquals("No matching records found",
				driver.findElement(By.xpath("//*[@id='datatable1']/tbody/tr/td")).getText());

	}

	public static void check_show_inactives_to_show_inactive_breeds() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='checkbox1']"));
		element.click();

	}

	public static void verify_searched_inactive_breed_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Breed002",
				driver.findElement(By.xpath("//*[@id='datatable1']/tbody/tr[1]/td[1]")).getText());

	}

}
