package com.bangtail.impl;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginDef {

	private LoginPage loginuser;

	@Given("^browser is open and logged in as admin user$")
	public void browser_is_open_and_logged_in_as_admin_user() throws Throwable {

		loginuser.setdriver();
		loginuser.sendvalue_username("admin");
		loginuser.sendvalue_password("123");
		loginuser.enter_login_button();

	}

	@Then("^click on Administrator icon$")
	public void click_on_Administrator_icon() throws Throwable {

		LoginPage.click_on_Administrator_icon();

	}

	@Then("^click on Sign Out$")
	public void click_on_Sign_Out() throws Throwable {

		LoginPage.click_on_sign_out();

	}

	@Then("^Close Browser$")
	public void close_Browser() throws Throwable {

		LoginPage.close_browser();

	}

}
