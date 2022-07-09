package com.stepdefinition;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;

public class CommonSteps {
	PageObjectManager pom = new PageObjectManager();

	@Then("After login User should verify successful login message {string}")
	public void afterLoginUserShouldVerifySuccessfulLoginMessage(String string) {


	}

}
