package com.bangtail.impl;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;

public class AlertsDef {

	@Then("^clikc on add alert$")
	public void clikc_on_add_alert() throws Throwable {

		AlertsPage.clikc_on_add_alert();
		

	}

	@Then("^enter alert name as \"([^\"]*)\"$")
	public void enter_alert_name_as(String name) throws Throwable {

		AlertsPage.enter_alert_name_as(name);
		

	}

	@Then("^enter description as \"([^\"]*)\"$")
	public void enter_description_as(String description) throws Throwable {

		AlertsPage.enter_description_as(description);
		

	}

	@Then("^save alert$")
	public void save_alert() throws Throwable {

		AlertsPage.save_alert();
		

	}

	@Then("^search for alert \"([^\"]*)\"$")
	public void search_for_alert(String name) throws Throwable {

		AlertsPage.search_for_alert(name);
		

	}

	@Then("^verify searched alert is available in the grid$")
	public void verify_searched_alert_is_available_in_the_grid() throws Throwable {

		AlertsPage.verify_searched_alert_is_available_in_the_grid();
		

	}

	@Then("^verify mandatory fields validation$")
	public void verify_mandatory_fields_validation() throws Throwable {

		AlertsPage.verify_mandatory_fields_validation();
		

	}

	@Then("^click on edit alert$")
	public void click_on_edit_alert() throws Throwable {

		AlertsPage.click_on_edit_alert();
		

	}

	@Then("^update alert$")
	public void update_alert() throws Throwable {

		AlertsPage.update_alert();
		

	}

	@Then("^verify edited alert is available in the grid$")
	public void verify_edited_alert_is_available_in_the_grid() throws Throwable {

		AlertsPage.verify_edited_alert_is_available_in_the_grid();
		

	}

	@Then("^click on delete alert$")
	public void click_on_delete_alert() throws Throwable {

		AlertsPage.click_on_delete_alert();
		

	}

	@Then("^verify deleted alert is not available in the grid$")
	public void verify_deleted_alert_is_not_available_in_the_grid() throws Throwable {

		AlertsPage.verify_deleted_alert_is_not_available_in_the_grid();
		

	}

	@Then("^click on copy alert$")
	public void click_on_copy_alert() throws Throwable {

		AlertsPage.click_on_copy_alert();
		

	}

	@Then("^verify copied alert is available in the grid$")
	public void verify_copied_alert_is_available_in_the_grid() throws Throwable {

		AlertsPage.verify_copied_alert_is_available_in_the_grid();
		

	}

}
