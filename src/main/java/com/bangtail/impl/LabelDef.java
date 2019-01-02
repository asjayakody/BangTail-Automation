package com.bangtail.impl;

import cucumber.api.java.en.Then;

public class LabelDef {



	@Then("^click on add label button$")
	public void click_on_add_label_button() throws Throwable {

		LabelPage.click_on_add_label_button();

	}

	@Then("^enter label name$")
	public void enter_label_name() throws Throwable {

		LabelPage.send_value_label_name("Test_Labe310");

	}

	@Then("^select level$")
	public void select_level() throws Throwable {

		LabelPage.select_level();

	}

	@Then("^save label$")
	public void save_label() throws Throwable {

		LabelPage.save_label();

	}

	@Then("^verify label saved sucessful message$")
	public void verify_label_saved_successful_message() throws Throwable {
		LabelPage.verify_label_saved_successful();

	}

	@Then("^verify label validation message for level$")
	public void verify_label_validation_messages() throws Throwable {

		LabelPage.verify_label_validation_message_level();

	}

	@Then("^verify label validation message for name$")
	public void verify_label_validation_message_for_name() throws Throwable {

		LabelPage.verify_label_validation_message_for_name();

	}

	@Then("^search for label$")
	public void search_for_label() throws Throwable {

		LabelPage.send_value_search_box_label("Test_Labe18");

	}

	@Then("^click on edit button$")
	public void click_on_edit_button() throws Throwable {

		LabelPage.click_on_edit_button();

	}

	@Then("^edit label name$")
	public void edit_label_name() throws Throwable {

		LabelPage.edit_label_name("Test_Label_Updated");

	}

	@Then("^update label$")
	public void update_label() throws Throwable {

		LabelPage.click_on_update_button();

	}

	@Then("^search for updated label$")
	public void search_for_updated_label() throws Throwable {

		LabelPage.search_for_updated_label("Test_Label_Updated");

	}

	@Then("^verify label update  Successfull message$")
	public void verify_label_update_Successfull_message() throws Throwable {

		LabelPage.verify_label_update_Successfull_message();

	}

	@Then("^verify searched label is appear in results$")
	public void verify_searched_label_is_appear_in_results() throws Throwable {

		LabelPage.verify_searched_label_is_appear_in_results();

	}

	@Then("^click on delete button$")
	public void click_on_delete_button() throws Throwable {

		LabelPage.click_on_delete_button();

	}

	@Then("^click ok from confirmation message$")
	public void click_ok_from_confirmation_message() throws Throwable {

		LabelPage.click_ok_from_confirmation_message();

	}

	@Then("^verify searched label is not available in the grid$")
	public void verify_searched_label_is_not_available_in_the_grid() throws Throwable {

		LabelPage.verify_deleted_item();

	}

	@Then("^click on copy option$")
	public void click_on_copy_option() throws Throwable {

		LabelPage.click_on_copy_option();
	}

	@Then("^verify error message$")
	public void verify_error_message() throws Throwable {

		LabelPage.verify_error_message();

	}

	@Then("^edit label name as Test_Label_copy$")
	public void edit_label_name_as_Test_Label_copy() throws Throwable {
		LabelPage.edit_label_name_as_Test_Label_copy("Test_Label_copy");
	}

}
