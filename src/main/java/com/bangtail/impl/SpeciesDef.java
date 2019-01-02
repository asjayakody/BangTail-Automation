package com.bangtail.impl;

import cucumber.api.java.en.Then;

public class SpeciesDef {
	
	
	@Then("^click on Species$")
	public void click_on_Species() throws Throwable {
	   
		SpeciesPage.click_on_Species();
		
	}

	@Then("^click on Add Species$")
	public void click_on_Add_Species() throws Throwable {
	    
		SpeciesPage.click_on_Add_Species();
		
	}
	
	
	@Then("^enter name \"([^\"]*)\"$")
	public void enter_name(String name) throws Throwable {
	    
		SpeciesPage.enter_name(name);
		
		
	}

	@Then("^click on active checkbox to create active Species$")
	public void click_on_active_checkbox_to_create_active_Species() throws Throwable {
	    
		SpeciesPage.click_on_active_checkbox_to_create_active_Species();
		
		
	}

	@Then("^save Species$")
	public void save_Species() throws Throwable {
	  
		
		SpeciesPage.save_Species();
		
		
		
	}
	
	
	
	
	
	
	
	

}
