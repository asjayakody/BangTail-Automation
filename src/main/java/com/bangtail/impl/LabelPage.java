package com.bangtail.impl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.AssertJUnit;
import com.bangtail.core.PageObjectFW;



public class LabelPage extends PageObjectFW {
	static WebElement element = null;

	

	public static void click_on_add_label_button() throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='Lbadd-automation-id']/i"));
		element.click();

	}

	public static void send_value_label_name(String val) {

		element = driver.findElement(By.xpath("//*[@id='Lbname-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void select_level() {

		Select level = new Select(driver.findElement(By.xpath(".//*[@id='slWrapper']/select")));
		level.selectByIndex(1);

	}

	public static void save_label() {

		element = driver.findElement(By.xpath("//*[@id='Lbsave-automation-id']/span"));
		element.click();

	}

	public static void verify_label_saved_successful() {

		WebDriverWait wait = new WebDriverWait(driver, 50);
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-success']"));
		wait.until(ExpectedConditions.visibilityOf(msg));
		String text = msg.getText();
		System.out.println(text);
		String expectedText = "Success! \n" + "Record Saved Successfully.";
		System.out.println(expectedText);
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void verify_label_validation_message_level() {

		String expectedText = "Error:  Please select Label level.";
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-danger']"));
		String text = msg.getText();
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void verify_label_validation_message_for_name() {

		String expectedText = "Error:  Please Enter Label Name.";
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-danger']"));
		String text = msg.getText();
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void send_value_search_box_label(String val) throws InterruptedException {
		Thread.sleep(5000);
		element = driver.findElement(By.xpath("//*[@id='Label-Table_filter']/label/input"));
		element.clear();
		element.sendKeys(val);

	}

	public static void click_on_edit_button() {

		element = driver.findElement(By.xpath("//*[@id='Lbedit-automation-id']"));
		element.click();

	}

	public static void edit_label_name(String val) {

		element = driver.findElement(By.xpath("//*[@id='Lbname-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

	public static void click_on_update_button() {

		element = driver.findElement(By.xpath("//*[@id='Lbsave-automation-id']/span"));
		element.click();

	}

	public static void search_for_updated_label(String val) {

		element = driver.findElement(By.xpath("//*[@id='Label-Table_filter']/label/input"));
		element.clear();
		element.sendKeys(val);

	}

	public static void verify_label_update_Successfull_message() {

		String expectedText = "Success!  \r\n" + "Record Updated Successfully.";
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-success']"));
		String text = msg.getText();
		System.out.println(expectedText);
		System.out.println(text);
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void verify_searched_label_is_appear_in_results() {

		AssertJUnit.assertEquals("Test_Labe290",
				driver.findElement(By.xpath("//*[@id='Label-Table']/tbody/tr/td[1]")).getText());

	}

	public static void click_on_delete_button() {

		element = driver.findElement(By.xpath("//*[@id='Lbdelete-automation-id']"));
		element.click();

	}

	public static void click_ok_from_confirmation_message() throws InterruptedException {

		Thread.sleep(5000);
		driver.switchTo().alert().accept();

	}

	public static void verify_deleted_item() throws InterruptedException {

		AssertJUnit.assertEquals("No matching records found",
				driver.findElement(By.xpath("//*[@id='Label-Table']/tbody/tr/td")).getText());

	}

	public static void click_on_copy_option() {

		element = driver.findElement(By.xpath("//*[@id='Lbcopy-automation-id']"));
		element.click();

	}

	public static void verify_error_message() {

		String expectedText = "Error:  Label name already exists.";
		WebElement msg = driver.findElement(By.xpath(".//*[@class='alert alert-danger']"));
		String text = msg.getText();
		AssertJUnit.assertEquals(text, expectedText);

	}

	public static void edit_label_name_as_Test_Label_copy(String val) {

		element = driver.findElement(By.xpath("//*[@id='Lbname-automation-id']"));
		element.clear();
		element.sendKeys(val);

	}

}
