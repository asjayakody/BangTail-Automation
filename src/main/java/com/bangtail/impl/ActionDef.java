package com.bangtail.impl;

import static org.testng.AssertJUnit.assertEquals;

import com.bangtail.impl.ActionPage;

import cucumber.api.java.en.Then;

public class ActionDef  {

	

	@Then("^click on add Action button$")
	public void click_on_add_Action_button() throws Throwable {

		ActionPage.click_on_add_action_button();

	}

	@Then("^enter Name$")
	public void enter_Name() throws Throwable {

		ActionPage.send_value_name("Action001");

	}

	@Then("^enter Description$")
	public void enter_Description() throws Throwable {

		ActionPage.send_value_description("this is to check brand");

	}

	@Then("^enter Assigned by$")
	public void enter_Assigned_by() throws Throwable {

		ActionPage.send_value_assigned_by("Administrator");

	}

	@Then("^select Assigned to$")
	public void select_Assigned_to() throws Throwable {

		ActionPage.select_assigned_to();

	}

	@Then("^select status as Complete$")
	public void select_status_as_Complete() throws Throwable {

		ActionPage.select_status();

	}

	@Then("^save action$")
	public void save_action() throws Throwable {

		ActionPage.click_save_button();

	}

	@Then("^verify Record Saved Successfull message$")
	public void verify_Record_Saved_Successfull_message() throws Throwable {

		assertEquals("Success! Record Saved Successfully.", "Success! Record Saved Successfully.");

	}

	@Then("^click on cancel button$")
	public void click_on_cancel_button() throws Throwable {

		ActionPage.click_on_cancel_button();

	}


	@Then("^enter action name in search box$")
	public void enter_action_name_in_search_box() throws Throwable {

		ActionPage.send_value_search_box("Action001");

	}

	@Then("^verify searched action is available in the grid$")
	public void verify_searched_action_is_available_in_the_grid() throws Throwable {

		ActionPage.find_searched_item();

	}

	@Then("^click edit button$")
	public void click_edit_button() throws Throwable {

		ActionPage.click_edit_button();

	}

	@Then("^edit name$")
	public void edit_name() throws Throwable {

		ActionPage.send_value_name("Action001_Edited");

	}

	@Then("^edit description$")
	public void edit_description() throws Throwable {
		ActionPage.send_value_description("this is edited");

	}

	@Then("^click on Update button$")
	public void click_on_Update_button() throws Throwable {

		ActionPage.click_update_button();

	}

	@Then("^verify update  Successfull message$")
	public void verify_update_Successfull_message() throws Throwable {

		ActionPage.verify_update_Successfull_message();

	}

	@Then("^click delete button$")
	public void click_delete_button() throws Throwable {

		ActionPage.click_delete_button();

	}

	@Then("^click on ok from confirmation message box$")
	public void click_on_ok_from_confirmation_message_box() throws Throwable {

		ActionPage.accept_delete_alert();

	}

	@Then("^verify searched action is not available in the grid$")
	public void verify_searched_action_is_not_available_in_the_grid() throws Throwable {

		ActionPage.verify_deleted_item();

	}

}
