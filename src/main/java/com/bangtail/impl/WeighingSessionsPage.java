package com.bangtail.impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.AssertJUnit;

import com.bangtail.core.PageObjectFW;

import cucumber.api.java.en.Then;

public class WeighingSessionsPage extends PageObjectFW {

	static WebElement element = null;

	public static void click_on_Sessions() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"sessionsMenuItem-id\"]/span"));
		element.click();

	}

	public static void click_on_Weighing() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"weighingSubLink-id\"]"));
		element.click();

	}

	public static void check_create_session_checkbox() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"createSessionCheck\"]"));
		element.click();

	}

	public static void enter_session_name(String name) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"createSessions\"]/input"));
		element.clear();
		element.sendKeys(name);

	}

	public static void select_weighing_category() throws Throwable {

		Select category = new Select(driver.findElement(By.xpath("//*[@id=\"weighingCategoryList\"]")));
		category.selectByIndex(1);

	}

	public static void click_on_save_next() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"Induction-Default-View\"]/div[2]/button[1]"));
		element.click();
		Thread.sleep(5000);

	}

	public static void click_on_EID() throws Throwable {

		Thread.sleep(3000);
		element = driver
				.findElement(By.xpath("//*[@id=\"Weighing-Detail-View\"]/div[1]/div/div/div/div[4]/div/button[2]"));
		element.click();

	}

	public static void enter_EID(String eid) throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"Weighing-Detail-View\"]/div[1]/div/div/div/div[4]/input"));
		element.sendKeys(eid);

	}

	public static void select_ok_to_create_new_animal() throws Throwable {

		Thread.sleep(3000);
		driver.switchTo().alert().accept();

	}

	public static void click_ok() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"Weighing-Detail-View\"]/div[1]/div/div/div/div[4]/button[1]"));
		element.click();

	}

	public static void enter_new_EID(String eid) throws Throwable {

		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/input"));
		element.sendKeys(eid);

	}

	public static void select_sex() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"home\"]/div[4]/div/button[1]"));
		element.click();

	}

	public static void enter_weight(String weight) throws Throwable {

		Thread.sleep(2000);
		element = driver.findElement(By.xpath("//*[@id=\"tab1\"]/div/div[2]/div/div[1]/div[2]/div/input"));
		element.equals(driver.switchTo().activeElement());
		element.sendKeys(weight);

	}

	public static void click_save_new() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"Weighing-Detail-View\"]/div[2]/div/div[4]/button[2]"));
		element.click();
		Thread.sleep(3000);

	}

	public static void click_on_cancel_to_exit() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id=\"Weighing-Detail-View\"]/div[2]/div/div[4]/button[1]"));
		element.click();

	}

	public static void click_on_cancel_to_exit_from_session_page() throws Throwable {
		Thread.sleep(3000);
		element = driver.findElement(By.xpath("//*[@id=\"Induction-Default-View\"]/div[2]/button[2]"));
		element.click();

	}

	public static void go_to_Weights_tab() throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id=\"Animal-Detail-View\"]/div[1]/div[2]/ul/li[2]/a"));
		element.click();

	}

	public static void verify_Live_WT() throws Throwable {

		AssertJUnit.assertEquals("600",
				driver.findElement(By.xpath("//*[@id=\"AnimalWeight-Table\"]/tbody/tr/td[2]")).getText());

		Thread.sleep(5000);

	}

}
