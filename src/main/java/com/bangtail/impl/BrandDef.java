package com.bangtail.impl;
import cucumber.api.java.en.Then;

public class BrandDef {

	

	@Then("^click on Add Brand$")
	public void click_on_Add_Brand() throws Throwable {

		BrandPage.click_on_Add_Brand();

	}

	@Then("^eneter brand name as \"([^\"]*)\"$")
	public void eneter_brand_name(String brandname) throws Throwable {

		BrandPage.eneter_brand_name(brandname);

	}

	@Then("^enter descripton as \"([^\"]*)\"$")
	public void enter_descripton(String description) throws Throwable {

		BrandPage.enter_descripton(description);

	}

	@Then("^choose brand logo$")
	public void choose_brand_logo() throws Throwable {

		BrandPage.choose_brand_logo();

	}

	@Then("^save brand$")
	public void save_brand() throws Throwable {

		BrandPage.save_brand();

	}

	@Then("^click on cancel$")
	public void click_on_cancel() throws Throwable {

		BrandPage.click_on_cancel();

	}

	@Then("^verify searched brand is available in the grid$")
	public void verify_searched_brand_is_available_in_the_grid() throws Throwable {

		BrandPage.verify_searched_brand_is_available_in_the_grid();

	}

	@Then("^verify mandatory filed validation message$")
	public void verify_mandatory_filed_validation_message() throws Throwable {

		BrandPage.verify_mandatory_filed_validation_message();

	}

	@Then("^search for \"([^\"]*)\"$")
	public void search_for(String brandname) throws Throwable {

		BrandPage.search_for(brandname);

	}

	@Then("^click on delete button to delete brand$")
	public void click_on_delete_button_to_delete_brand() throws Throwable {

		BrandPage.click_on_delete_button_to_delete_brand();

	}

	@Then("^verify searched brand is not available in the grid$")
	public void verify_searched_brand_is_not_available_in_the_grid() throws Throwable {

		BrandPage.verify_searched_brand_is_not_available_in_the_grid();

	}

	@Then("^click on edit brand$")
	public void click_on_edit_brand() throws Throwable {

		BrandPage.click_on_edit_brand();

	}

	@Then("^click update$")
	public void click_update() throws Throwable {

		BrandPage.click_update();
	}

}
