package com.bangtail.impl;

import cucumber.api.java.en.Then;

public class RegionsDef {

	@Then("^click on Regions$")
	public void click_on_Regions() throws Throwable {

		RegionsPage.click_on_Regions();

	}

	@Then("^click on add regions$")
	public void click_on_add_regions() throws Throwable {

		RegionsPage.click_on_add_regions();

	}

	@Then("^enter region code \"([^\"]*)\"$")
	public void enter_region_code(String code) throws Throwable {

		RegionsPage.enter_region_code(code);

	}

	@Then("^enter region name \"([^\"]*)\"$")
	public void enter_region_name(String name) throws Throwable {

		RegionsPage.enter_region_name(name);

	}

	@Then("^save region$")
	public void save_region() throws Throwable {

		RegionsPage.save_region();

	}

	@Then("^search for Region \"([^\"]*)\"$")
	public void search_for_Region(String code) throws Throwable {

		RegionsPage.search_for_Region(code);

	}

	@Then("^verify searched Region is available in the grid$")
	public void verify_searched_Region_is_available_in_the_grid() throws Throwable {

		RegionsPage.verify_searched_Region_is_available_in_the_grid();

	}

	@Then("^verify mandatory field validation for code$")
	public void verify_mandatory_field_validation_for_code() throws Throwable {

		RegionsPage.verify_mandatory_field_validation_for_code();

	}

	@Then("^click on edit Region$")
	public void click_on_edit_Region() throws Throwable {

		RegionsPage.click_on_edit_Region();

	}

	@Then("^update Region$")
	public void update_Region() throws Throwable {

		RegionsPage.update_Region();

	}

	@Then("^verify edited Region is available in the grid$")
	public void verify_edited_Region_is_available_in_the_grid() throws Throwable {

		RegionsPage.verify_edited_Region_is_available_in_the_grid();

	}

	@Then("^click on copy feature$")
	public void click_on_copy_feature() throws Throwable {

		RegionsPage.click_on_copy_feature();

	}

	@Then("^verify copied Region is available in the grid$")
	public void verify_copied_Region_is_available_in_the_grid() throws Throwable {

		RegionsPage.verify_copied_Region_is_available_in_the_grid();

	}

	@Then("^verify duplicate Region Code error message$")
	public void verify_duplicate_Region_Code_error_message() throws Throwable {

		RegionsPage.verify_duplicate_Region_Code_error_message();

	}

	@Then("^click on delete region$")
	public void click_on_delete_region() throws Throwable {

		RegionsPage.click_on_delete_region();

	}

	@Then("^verify deleted Region is not available in the grid$")
	public void verify_deleted_Region_is_not_available_in_the_grid() throws Throwable {

		RegionsPage.verify_deleted_Region_is_not_available_in_the_grid();

	}

	@Then("^uncheck active check box for create inactive region$")
	public void uncheck_active_check_box_for_create_inactive_region() throws Throwable {

		RegionsPage.uncheck_active_check_box_for_create_inactive_region();

	}

	@Then("^click show inactives regions$")
	public void click_show_inactives_regions() throws Throwable {

		RegionsPage.click_show_inactives_regions();

	}

	@Then("^verify inactive Region is available in the grid$")
	public void verify_inactive_Region_is_available_in_the_grid() throws Throwable {

		RegionsPage.verify_inactive_Region_is_available_in_the_grid();

	}

}
