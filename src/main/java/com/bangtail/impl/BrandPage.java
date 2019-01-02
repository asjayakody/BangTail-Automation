package com.bangtail.impl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.AssertJUnit;
import com.bangtail.core.PageObjectFW;



public class BrandPage extends PageObjectFW {

	static WebElement element = null;

	

	public static void click_on_Add_Brand() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='Beadd-automation-id']/i"));
		element.click();

	}

	public static void eneter_brand_name(String brandname) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='name-automation-id']"));
		element.clear();
		element.sendKeys(brandname);

	}

	public static void enter_descripton(String description) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Description-automation-id']"));
		element.clear();
		element.sendKeys(description);

	}

	public static void choose_brand_logo() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='choose-automation-id']"));
		element.sendKeys("E:\\BangtailRepo\\BangtailAutoBDDNew\\src\\test\\TestData\\BrandLogos\\Brand_logo.png");

	}

	public static void save_brand() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Besave-automation-id']/span"));
		element.click();

	}

	public static void click_on_cancel() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='next']/span"));
		element.click();

	}

	public static void verify_searched_brand_is_available_in_the_grid() throws Throwable {

		Thread.sleep(3000);
		AssertJUnit.assertEquals("Brand001",
				driver.findElement(By.xpath("//*[@id='brandList']/tbody/tr/td[1]")).getText());

	}

	public static void verify_mandatory_filed_validation_message() throws Throwable {

		String expectedText = "Error:  Please enter a name.\r\n" + "Error:  Please enter a description.\r\n"
				+ "Error:  Please upload an image.";
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-danger']"));
		String text = msg.getText();
		System.out.println(text);
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void search_for(String brandname) throws Throwable {

		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id='brandList_filter']/label/input"));
		element.clear();
		element.sendKeys(brandname);

	}

	public static void click_on_delete_button_to_delete_brand() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Bdelete-automation-id']"));
		element.click();

	}

	public static void verify_searched_brand_is_not_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("No matching records found",
				driver.findElement(By.xpath("//*[@id='brandList']/tbody/tr/td")).getText());

	}

	public static void click_on_edit_brand() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Bedit-automation-id']"));
		element.click();

	}

	public static void click_update() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Besave-automation-id']/span"));
		element.click();

	}

}
