package com.bangtail.impl;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.bangtail.core.PageObjectFW;

public class LoginPage extends PageObjectFW {
	static WebElement element = null;

	public static void setdriver() {
		PageObjectFW pageObjectFW = new PageObjectFW();
		pageObjectFW.getname("CHROME");
		driver.get("http://192.168.2.158:8081/Login/Index");
		//driver.manage().window().maximize();

	}

	public static String sendvalue_username(String val) {

		element = driver.findElement(By.xpath(".//*[@id='Iumentis-Login-Page']/div/div[3]/input"));
		element.clear();
		element.sendKeys(val);
		return val;

	}

	public static void sendvalue_password(String val) {

		element = driver.findElement(By.xpath(".//*[@id='Iumentis-Login-Page']/div/div[4]/input"));
		element.clear();
		element.sendKeys(val);

	}

	public static void enter_login_button() throws InterruptedException {

		// Thread.sleep(5000);
		element = driver.findElement(By.xpath(".//*[@id='Iumentis-Login-Page']/div/button"));
		element.click();

	}

	public static void click_on_Administrator_icon() throws InterruptedException {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("/html/body/div[3]/div[2]/nav/div/a/img"));
		element.click();
		// driver, Time.setSeconds(10)).Until(ExpectedConditions.elementIfVisible("your
		// selector");

		// new WebDriverWait(driver,
		// 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[2]/nav/div/a/img")));
		Thread.sleep(5000);

	}

	public static void click_on_sign_out() throws InterruptedException {

		element = driver.findElement(By.xpath("//a[@id='Login_LogOut']"));
		element.click();
		Thread.sleep(5000);

//		Thread.sleep(5000);
//		Keyboard kb = ((HasInputDevices) driver).getKeyboard();
//		kb.pressKey(Keys.TAB);
//		kb.pressKey(Keys.TAB);
//		kb.pressKey(Keys.TAB);
//		element.click();

		// img[@class='wd-25 rounded-circle']
//		element = driver.findElement(By.xpath("//a[@id='Login_LogOut']"));
//		element.click();
//		Thread.sleep(2000);
//		element.sendKeys(Keys.ENTER);

//		Boolean staleElement = true;
//		while (staleElement) {
//			try {
//				element = driver.findElement(By.xpath("//*[@id='Login_LogOut']"));
//				element.click();
//				staleElement = false;
//
//			} catch (StaleElementReferenceException e) {
//				staleElement = true;
//			}
//		}
//
	}

	public static void close_browser() {

		// driver.quit();

		if (driver == null) {
			return;
		}
		
		driver.close();
		driver = null;

	}

}
