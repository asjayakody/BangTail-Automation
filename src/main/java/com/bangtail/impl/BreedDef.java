package com.bangtail.impl;
import cucumber.api.java.en.Then;

public class BreedDef {

	@Then("^click on add breed$")
	public void click_on_add_breed() throws Throwable {

		BreedPage.click_on_add_breed();

	}

	@Then("^enter breed code as \"([^\"]*)\"$")
	public void enter_breed_code_as(String code) throws Throwable {

		BreedPage.enter_breed_code_as(code);

	}

	@Then("^enter breed name as \"([^\"]*)\"$")
	public void enter_breed_name_as(String name) throws Throwable {

		BreedPage.enter_breed_name_as(name);

	}

	@Then("^enter breed description as\"([^\"]*)\"$")
	public void enter_breed_description_as(String description) throws Throwable {

		BreedPage.enter_breed_description_as(description);

	}

	@Then("^save breed$")
	public void save_breed() throws Throwable {

		BreedPage.save_breed();

	}

	@Then("^search breed \"([^\"]*)\"$")
	public void search_breed(String code) throws Throwable {

		BreedPage.search_breed(code);

	}

	@Then("^verify searched breed is available in the grid$")
	public void verify_searched_breed_is_available_in_the_grid() throws Throwable {

		BreedPage.verify_searched_breed_is_available_in_the_grid();

	}

	@Then("^delete breed$")
	public void delete_breed() throws Throwable {

		BreedPage.delete_breed();

	}

	@Then("^verify searched breed is not available in the grid$")
	public void verify_searched_breed_is_not_available_in_the_grid() throws Throwable {

		BreedPage.verify_searched_breed_is_not_available_in_the_grid();

	}

	@Then("^uncheck is active$")
	public void uncheck_is_active() throws Throwable {

		BreedPage.uncheck_is_active();

	}

	@Then("^click copy breed$")
	public void click_copy_breed() throws Throwable {

		BreedPage.click_copy_breed();

	}

	@Then("^click on edit breed$")
	public void click_on_edit_breed() throws Throwable {

		BreedPage.click_on_edit_breed();

	}

	@Then("^update breed$")
	public void update_breed() throws Throwable {

		BreedPage.update_breed();

	}

	@Then("^verify searched breed is not available$")
	public void verify_searched_breed_is_not_available() throws Throwable {

		BreedPage.verify_searched_breed_is_not_available();

	}

	@Then("^check show inactives to show inactive breeds$")
	public void check_show_inactives_to_show_inactive_breeds() throws Throwable {

		BreedPage.check_show_inactives_to_show_inactive_breeds();

	}

	@Then("^verify searched inactive breed is available in the grid$")
	public void verify_searched_inactive_breed_is_available_in_the_grid() throws Throwable {

		BreedPage.verify_searched_inactive_breed_is_available_in_the_grid();

	}

}
