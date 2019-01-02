package com.bangtail.impl;

import cucumber.api.java.en.Then;

public class MainMenuDef {

	@Then("^click expand icon to expand main menu$")
	public void click_expand_icon_to_expand_main_menu() throws Throwable {

		MainMenuPage.click_expand_icon_to_expand_main_menu();

	}

	@Then("^click on data managment menu$")
	public void click_on_data_managment_menu() throws Throwable {

		MainMenuPage.click_on_data_managment_menu();

	}

	@Then("^click on Action menu item$")
	public void click_on_Action_menu_item() throws Throwable {

		MainMenuPage.click_on_action_menu();

	}

	@Then("^click on Brands$")
	public void click_on_Brands() throws Throwable {

		MainMenuPage.click_on_Brands();

	}

	@Then("^click on Breed$")
	public void click_on_Breed() throws Throwable {

		MainMenuPage.click_on_Breed();

	}

	@Then("^click on Contacts$")
	public void click_on_Contacts() throws Throwable {

		MainMenuPage.click_on_Contacts();
	}

	@Then("^click on Label menu$")
	public void click_on_Label_menu() throws Throwable {

		MainMenuPage.click_on_Label_menu();

	}
	
	
	@Then("^click on Alerts$")
	public void click_on_Alerts() throws Throwable {

		MainMenuPage.click_on_Alerts();

	}
	
	

}
