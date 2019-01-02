package com.bangtail.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import com.bangtail.core.PageObjectFW;

import cucumber.api.java.en.Then;

public class TraitsPage extends PageObjectFW {

	static WebElement element = null;

	public static void click_on_Traits() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='traitsSubLink-id']"));
		element.click();

	}

	public static void click_on_add_Traits() throws Throwable {

		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//*[@id='Tradd-automation-id']/i"));
		element.click();

	}

	public static void enter_Trailt_code(String code) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Trcode-automation-id']"));
		element.clear();
		element.sendKeys(code);

	}

	public static void enter_Trailt_name(String name) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Trname-automation-id']"));
		element.clear();
		element.sendKeys(name);

	}

	public static void select_display_order() throws Throwable {

		Select order = new Select(driver.findElement(By.xpath("//*[@id='Trdisplay-automation-id']")));
		Thread.sleep(5000);
		order.selectByIndex(1);

	}

	public static void enter_min(String min) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Min']"));
		element.clear();
		element.sendKeys(min);

	}

	public static void enter_max(String max) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Max']"));
		element.clear();
		element.sendKeys(max);

	}

	public static void enter_cull(String cull) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Cull']"));
		element.clear();
		element.sendKeys(cull);

	}

	public static void save_Trait() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Trsave-automation-id']/span"));
		element.click();

	}

	public static void search_for_Trait(String name) throws Throwable {

		
		element = driver.findElement(By.xpath("//*[@id='traitList_filter']/label/input"));
		element.clear();
		element.sendKeys(name);
		Thread.sleep(5000);

	}

	public static void verify_searched_trait_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Trait001",
				driver.findElement(By.xpath("//*[@id='traitList']/tbody/tr[1]/td[1]")).getText());

		Thread.sleep(5000);

	}

	public static void click_on_edit_trait() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Tredit-automation-id']"));
		element.click();

	}

	public static void update_trait() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='Trsave-automation-id']/span"));
		element.click();

	}

	public static void verify_edited_trait_is_available_in_the_grid() throws Throwable {

		AssertJUnit.assertEquals("Traitedit",
				driver.findElement(By.xpath("//*[@id='traitList']/tbody/tr[1]/td[1]")).getText());

		Thread.sleep(5000);

	}

}
