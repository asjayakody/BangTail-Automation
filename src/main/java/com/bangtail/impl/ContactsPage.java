package com.bangtail.impl;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import com.bangtail.core.PageObjectFW;



public class ContactsPage extends PageObjectFW {

	static WebElement element = null;

	

	public static void click_on_add_contacts_button() throws InterruptedException {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='cadd-automation-id']/i"));
		element.click();

	}

	public static void enter_contact_code(String val) {

		element = driver.findElement(By.xpath("//*[@id='ccode-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void enter_traading_name(String val) {

		element = driver.findElement(By.xpath("//*[@id='tname-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void select_contact_category() {

		element = driver.findElement(By.xpath(".//*[@id='home']/div/div[1]/div[1]/div[4]/select"));
		element.click();
		Keyboard kb = ((HasInputDevices) driver).getKeyboard();
		kb.pressKey(Keys.ARROW_DOWN);
		kb.pressKey(Keys.ENTER);

	}

	public static void enter_first_name(String val) {

		element = driver.findElement(By.xpath("//*[@id='fname-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void enter_email(String val) {

		element = driver.findElement(By.xpath("//*[@id='cemail-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void save_contact() {

		element = driver.findElement(By.xpath("//*[@id='csave-automation-id']/span"));
		element.click();

	}

	public static void verify_Record_Saved_Successfull_message_for_contact() throws Throwable {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-success']"));
		wait.until(ExpectedConditions.visibilityOf(msg));
		String text = msg.getText();
		System.out.println(text);
		String expectedText = "Success! \n" + "Record Saved Successfully.";
		System.out.println(expectedText);
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void search_new_contact(String val) throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='contactListTable_filter']/label/input"));
		element.clear();
		element.sendKeys(val);

	}

	public static void verify_search_contact_is_available_in_search_results() throws InterruptedException {
		Thread.sleep(5000);
		AssertJUnit.assertEquals("Con519",
				driver.findElement(By.xpath("//*[@id='contactListTable']/tbody/tr/td[2]")).getText());

	}

	public static void click_on_delete() throws InterruptedException {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='codelete-automation-id']"));
		element.click();

	}

	public static void verify_searched_contact_is_not_available_in_the_grid() {

		AssertJUnit.assertEquals("No matching records found",
				driver.findElement(By.xpath("//*[@id='contactListTable']/tbody/tr/td")).getText());

	}

	public static void click_on_edit() throws InterruptedException {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='coedit-automation-id']"));
		element.click();

	}

	public static void edit_trading_name(String val) {

		element = driver.findElement(By.xpath("//*[@id='tname-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void click_on_update_button() {

		element = driver.findElement(By.xpath("//*[@id='csave-automation-id']/span"));
		element.click();

	}

	public static void verify_update_Successfull_message_for_Contatcs() {

		String expectedText = "Success!  \r\n" + "Record Updated Successfully.";
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-success']"));
		String text = msg.getText();
		System.out.println(expectedText);
		System.out.println(text);
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void verify_Mandatory_fields_validations() {

		String expectedText = "Error:  Please enter a code.\r\n" + "Error:  Please enter a trading name.\r\n"
				+ "Error:  Please enter a first name.\r\n" + "Error:  Please enter an email.\r\n"
				+ "Error:  Please select contact category.";
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-danger']"));
		String text = msg.getText();
		// System.out.println(text);
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void click_on_copy_icon() throws InterruptedException {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='cocopy-automation-id']"));
		element.click();

	}

	public static void edit_contact_code(String val) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='ccode-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void edit_email_address(String val) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='cemail-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void uncheck_active_check_box() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='chkActive']"));
		element.click();

	}

	public static void check_show_inactives() throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='checkboxShowInactive']"));
		element.click();

	}

	public static void enter_inactive_contact_code(String val) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='ccode-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void enter_email_for_inactive_contact(String val) throws Throwable {

		element = driver.findElement(By.xpath("//*[@id='cemail-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void search_for_inactive_contact(String val) throws Throwable {

		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='contactListTable_filter']/label/input"));
		element.clear();
		element.sendKeys(val);
		Thread.sleep(3000);
	}

	public static void verify_searched_contact_is_available_in_the_grid() throws Throwable {
		Thread.sleep(3000);
		AssertJUnit.assertEquals("Con01_In",
				driver.findElement(By.xpath("//*[@id='contactListTable']/tbody/tr/td[2]")).getText());

	}

}
