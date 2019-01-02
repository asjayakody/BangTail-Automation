package com.bangtail.impl;

import cucumber.api.java.en.Then;

public class WeighingSessionsDef {

	@Then("^click on Sessions$")
	public void click_on_Sessions() throws Throwable {

		WeighingSessionsPage.click_on_Sessions();

	}

	@Then("^click on Weighing$")
	public void click_on_Weighing() throws Throwable {

		WeighingSessionsPage.click_on_Weighing();

	}

	@Then("^check create session checkbox$")
	public void check_create_session_checkbox() throws Throwable {

		WeighingSessionsPage.check_create_session_checkbox();

	}

	@Then("^enter session name \"([^\"]*)\"$")
	public void enter_session_name(String name) throws Throwable {

		WeighingSessionsPage.enter_session_name(name);

	}

	@Then("^select weighing category$")
	public void select_weighing_category() throws Throwable {

		WeighingSessionsPage.select_weighing_category();

	}

	@Then("^click on save & next$")
	public void click_on_save_next() throws Throwable {

		WeighingSessionsPage.click_on_save_next();

	}

	@Then("^click on EID$")
	public void click_on_EID() throws Throwable {

		WeighingSessionsPage.click_on_EID();

	}

	@Then("^enter EID \"([^\"]*)\"$")
	public void enter_EID(String eid) throws Throwable {

		WeighingSessionsPage.enter_EID(eid);

	}

	@Then("^select ok to create new animal$")
	public void select_ok_to_create_new_animal() throws Throwable {

		WeighingSessionsPage.select_ok_to_create_new_animal();

	}

	@Then("^click ok$")
	public void click_ok() throws Throwable {
		WeighingSessionsPage.click_ok();

	}

	@Then("^enter new EID \"([^\"]*)\"$")
	public void enter_new_EID(String eid) throws Throwable {

		WeighingSessionsPage.enter_new_EID(eid);

	}

	@Then("^select sex$")
	public void select_sex() throws Throwable {

		WeighingSessionsPage.select_sex();

	}

	@Then("^enter weight \"([^\"]*)\"$")
	public void enter_weight(String weight) throws Throwable {

		WeighingSessionsPage.enter_weight(weight);

	}

	@Then("^click save&new$")
	public void click_save_new() throws Throwable {

		WeighingSessionsPage.click_save_new();

	}

	@Then("^click on cancel to exit$")
	public void click_on_cancel_to_exit() throws Throwable {

		WeighingSessionsPage.click_on_cancel_to_exit();

	}

	@Then("^click on cancel to exit from session page$")
	public void click_on_cancel_to_exit_from_session_page() throws Throwable {

		WeighingSessionsPage.click_on_cancel_to_exit_from_session_page();

	}

	@Then("^go to Weights tab$")
	public void go_to_Weights_tab() throws Throwable {

		WeighingSessionsPage.go_to_Weights_tab();

	}

	@Then("^verify Live WT$")
	public void verify_Live_WT() throws Throwable {

		WeighingSessionsPage.verify_Live_WT();

	}

}
