package com.stepdefinition;

import java.awt.AWTException;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.base.BaseClass;
import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();
	@Given("User is on the adactin login page")
	public void userIsOnTheAdactinLoginPage() {
		getDriver("chrome");
		getUrl("https://adactinhotelapp.com/");
		setImplicitWait(9);
		
	}

	@When("User should login using {string} and {string}")
	public void userShouldLoginUsingAnd(String username, String password) throws FileNotFoundException, IOException {
		pom.getLoginPage().login(username,password);

	}


	@When("User should login using {string} and {string} with the help of Enter key")
	public void userShouldLoginUsingAndWithTheHelpOfEnterKey(String username, String password) throws FileNotFoundException, AWTException, IOException {
		pom.getLoginPage().loginWithEnter(username,password);

	}

	@Then("After login User should verify  login error message contains {string}")
	public void afterLoginUserShouldVerifyLoginErrorMessageContains(String string) {
		Assert.assertTrue("verify login error", pom.getLoginPage().errUsernamemsg().contains(string));
	}

}
