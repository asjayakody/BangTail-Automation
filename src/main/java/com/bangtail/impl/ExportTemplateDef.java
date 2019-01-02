package com.bangtail.impl;

import static org.testng.AssertJUnit.assertEquals;

import cucumber.api.java.en.Then;

public class ExportTemplateDef {
	
	@Then("^click on Export Templates menu item$")
	public void click_on_Export_Templates_menu_item() throws Throwable {
		
		ExportTemplatePage.click_on_Export_Templates_menu_item();
	    
	}

	@Then("^click on Export Templates Add button$")
	public void click_on_Export_Templates_Add_button() throws Throwable {
		
		ExportTemplatePage.click_on_Export_Templates_Add_button();
	    
	}

	@Then("^enter Export Templates Name as \"([^\"]*)\"$")
	public void enter_Export_Templates_Name_as(String name) throws Throwable {
	   
		ExportTemplatePage.enter_Export_Templates_Name_as(name);
	}


	@Then("^select Entity Type$")
	public void select_Entity_Type() throws Throwable {
		
		ExportTemplatePage.select_Entity_Type();
	    
	}

	@Then("^enter Export Templates Description as \"([^\"]*)\"$")
	public void enter_Export_Templates_Description_as(String Description) throws Throwable {
		
		ExportTemplatePage.enter_Export_Templates_Description_as(Description);
	    
	}

	@Then("^select File Format$")
	public void select_File_Format() throws Throwable {
		
		ExportTemplatePage.select_File_Format();
	    
	}

	@Then("^select File Name as \"([^\"]*)\"$")
	public void select_File_Name_as(String Filename) throws Throwable {
	    
		ExportTemplatePage.select_File_Name_as(Filename);
	}
	

	@Then("^click on Add Fields Button$")
	public void click_on_Add_Fields_Button() throws Throwable {
		
		ExportTemplatePage.click_on_Add_Fields_Button();
	    
	}

	@Then("^select Source Data$")
	public void select_Source_Data() throws Throwable {
		
		ExportTemplatePage.select_Source_Data();
	    
	}

	@Then("^select Source Field$")
	public void select_Source_Field() throws Throwable {
	    
		ExportTemplatePage.select_Source_Field();
	}

	@Then("^enter Destination Field as \"([^\"]*)\"$")
	public void enter_Destination_Field_as(String DestinationField) throws Throwable {
		
		ExportTemplatePage.enter_Destination_Field_as(DestinationField);
	   
	}

	@Then("^click on AFADD Button$")
	public void click_on_AFADD_Button() throws Throwable {
		
		ExportTemplatePage.click_on_AFADD_Button();
	    
		
	}

	@Then("^save Export Templates$")
	public void save_Export_Templates() throws Throwable {
	    
		ExportTemplatePage.save_Export_Templates();
	}

	@Then("^verify Template Successfully added$")
	public void verify_Template_Successfully_added() throws Throwable {
		
		ExportTemplatePage.verify_Template_Successfully_added();
	    
		
	}


	@Then("^click on Export Templates cancel button$")
	public void click_on_Export_Templates_cancel_button() throws Throwable {
		
		ExportTemplatePage.click_on_Export_Templates_cancel_button();
	    
	}

	@Then("^click Leave page from confirmation message$")
	public void click_Leave_page_from_confirmation_message() throws Throwable {
	    
	}

	@Then("^enter Export Templates name in search box$")
	public void enter_Export_Templates_name_in_search_box() throws Throwable {
	    
	}

	@Then("^verify searched Export Template is available in the grid$")
	public void verify_searched_Export_Template_is_available_in_the_grid() throws Throwable {
	    
	}


}
