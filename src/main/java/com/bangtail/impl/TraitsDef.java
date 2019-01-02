package com.bangtail.impl;

import cucumber.api.java.en.Then;

public class TraitsDef {

	@Then("^click on Traits$")
	public void click_on_Traits() throws Throwable {

		TraitsPage.click_on_Traits();

	}

	@Then("^click on add Traits$")
	public void click_on_add_Traits() throws Throwable {

		TraitsPage.click_on_add_Traits();

	}

	@Then("^enter Trailt code \"([^\"]*)\"$")
	public void enter_Trailt_code(String code) throws Throwable {

		TraitsPage.enter_Trailt_code(code);

	}

	@Then("^enter Trailt name \"([^\"]*)\"$")
	public void enter_Trailt_name(String name) throws Throwable {

		TraitsPage.enter_Trailt_name(name);

	}

	@Then("^select display order$")
	public void select_display_order() throws Throwable {

		TraitsPage.select_display_order();

	}

	@Then("^enter min \"([^\"]*)\"$")
	public void enter_min(String min) throws Throwable {

		TraitsPage.enter_min(min);

	}

	@Then("^enter max \"([^\"]*)\"$")
	public void enter_max(String max) throws Throwable {

		TraitsPage.enter_max(max);

	}

	@Then("^enter cull \"([^\"]*)\"$")
	public void enter_cull(String cull) throws Throwable {

		TraitsPage.enter_cull(cull);

	}

	@Then("^save Trait$")
	public void save_Trait() throws Throwable {

		TraitsPage.save_Trait();

	}

	@Then("^search for Trait \"([^\"]*)\"$")
	public void search_for_Trait(String name) throws Throwable {

		TraitsPage.search_for_Trait(name);

	}

	@Then("^verify searched trait is available in the grid$")
	public void verify_searched_trait_is_available_in_the_grid() throws Throwable {

		TraitsPage.verify_searched_trait_is_available_in_the_grid();

	}

	@Then("^click on edit trait$")
	public void click_on_edit_trait() throws Throwable {

		TraitsPage.click_on_edit_trait();

	}

	@Then("^update trait$")
	public void update_trait() throws Throwable {

		TraitsPage.update_trait();

	}

	@Then("^verify edited trait is available in the grid$")
	public void verify_edited_trait_is_available_in_the_grid() throws Throwable {

		TraitsPage.verify_edited_trait_is_available_in_the_grid();

	}

}
