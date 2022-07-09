package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SelectHotelStep {
	PageObjectManager pom = new PageObjectManager();


	@When("User should select a hotel and click continue")
	public void userShouldSelectAHotelAndClickContinue() {
		pom.getSelectHotelPage().selectHotel();
	}

	@Then("After selecting a hotel successfully User should verify {string} message")
	public void afterSelectingAHotelSuccessfullyUserShouldVerifyMessage(String string) {
		Assert.assertTrue("verify selecthotel msg", pom.getBookingHotelPage().msgBookHotel().contains(string));

	}

	@When("User should click continue without selecting a hotel")
	public void userShouldClickContinueWithoutSelectingAHotel() {
		pom.getSelectHotelPage().click();


	}

	@Then("After clicking continue User should verify error message {string}")
	public void afterClickingContinueUserShouldVerifyErrorMessage(String string) {
		Assert.assertTrue("verify select location err msg", pom.getSelectHotelPage().errRadioclickmsg().contains(string));

	}


}
