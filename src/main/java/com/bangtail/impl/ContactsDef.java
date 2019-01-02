package com.bangtail.impl;

import cucumber.api.java.en.Then;

public class ContactsDef {

	

	@Then("^click on add contacts button$")
	public void click_on_add_contacts_button() throws Throwable {

		ContactsPage.click_on_add_contacts_button();

	}

	@Then("^enter contact code$")
	public void enter_contact_code() throws Throwable {

		ContactsPage.enter_contact_code("Con519");

	}

	@Then("^enter traading name$")
	public void enter_traading_name() throws Throwable {

		ContactsPage.enter_traading_name("Con519");

	}

	@Then("^select contact category$")
	public void select_contact_category() throws Throwable {

		ContactsPage.select_contact_category();

	}

	@Then("^enter first name$")
	public void enter_first_name() throws Throwable {

		ContactsPage.enter_first_name("Mark");
	}

	@Then("^enter email$")
	public void enter_email() throws Throwable {
		ContactsPage.enter_email("Con519@gmail.com");

	}

	@Then("^save contact$")
	public void save_contact() throws Throwable {

		ContactsPage.save_contact();

	}

	@Then("^verify Record Saved Successfull message for contact$")
	public void verify_Record_Saved_Successfull_message_for_contact() throws Throwable {

		ContactsPage.verify_Record_Saved_Successfull_message_for_contact();
	}

	@Then("^search new contact$")
	public void search_new_contact() throws Throwable {
		ContactsPage.search_new_contact("Con514");

	}

	@Then("^verify search contact is available in search results$")
	public void verify_search_contact_is_available_in_search_results() throws Throwable {

		ContactsPage.verify_search_contact_is_available_in_search_results();

	}

	@Then("^click on delete$")
	public void click_on_delete() throws Throwable {

		ContactsPage.click_on_delete();

	}

	@Then("^verify searched contact is not available in the grid$")
	public void verify_searched_contact_is_not_available_in_the_grid() throws Throwable {

		ContactsPage.verify_searched_contact_is_not_available_in_the_grid();

	}

	@Then("^click on edit$")
	public void click_on_edit() throws Throwable {

		ContactsPage.click_on_edit();

	}

	@Then("^edit trading name$")
	public void edit_trading_name() throws Throwable {

		ContactsPage.edit_trading_name("Con514_Edited");

	}

	@Then("^click on update button$")
	public void click_on_update_button() throws Throwable {

		ContactsPage.click_on_update_button();

	}

	@Then("^verify update  Successfull message for Contatcs$")
	public void verify_update_Successfull_message_for_Contatcs() throws Throwable {

		ContactsPage.verify_update_Successfull_message_for_Contatcs();
	}

	@Then("^verify Mandatory fields validations$")
	public void verify_Mandatory_fields_validations() throws Throwable {

		ContactsPage.verify_Mandatory_fields_validations();

	}

	@Then("^click on copy icon$")
	public void click_on_copy_icon() throws Throwable {

		ContactsPage.click_on_copy_icon();

	}

	@Then("^edit contact code$")
	public void edit_contact_code() throws Throwable {

		ContactsPage.edit_contact_code("Con514_cpy");

	}

	@Then("^edit email address$")
	public void edit_email_address() throws Throwable {

		ContactsPage.edit_email_address("mark14_cpy@gmail.com");

	}

	@Then("^uncheck active check box$")
	public void uncheck_active_check_box() throws Throwable {

		ContactsPage.uncheck_active_check_box();

	}

	@Then("^check show inactives$")
	public void check_show_inactives() throws Throwable {

		ContactsPage.check_show_inactives();

	}

	@Then("^enter inactive contact code$")
	public void enter_inactive_contact_code() throws Throwable {

		ContactsPage.enter_inactive_contact_code("Con01_In");
	}

	@Then("^enter email for inactive contact$")
	public void enter_email_for_inactive_contact() throws Throwable {

		ContactsPage.enter_email_for_inactive_contact("inactivecontact2@gmail.com");

	}

	@Then("^search for inactive contact$")
	public void search_for_inactive_contact() throws Throwable {

		ContactsPage.search_for_inactive_contact("Con01_In");

	}

	@Then("^verify searched contact is available in the grid$")
	public void verify_searched_contact_is_available_in_the_grid() throws Throwable {
		ContactsPage.verify_searched_contact_is_available_in_the_grid();

	}

}
