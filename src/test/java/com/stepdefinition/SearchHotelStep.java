package com.stepdefinition;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchHotelStep {
	PageObjectManager pom = new PageObjectManager();

	@When("User should search hotel using {string} , {string} , {string} , {string} , {string} , {string} , {string} and {string}")
	public void userShouldSearchHotelUsingAnd(String location, String hotels, String room_type, String room_nos, String datepick_in, String datepick_out, String adult_room, String child_room) {
		pom.getSearchHotelPage().searchHotel(location, hotels, room_type, room_nos, datepick_in, datepick_out, adult_room, child_room);
	}

	@Then("After searching hotel User should verify {string} message")
	public void afterSearchingHotelUserShouldVerifyMessage(String string) {
		Assert.assertTrue(pom.getSelectHotelPage().msgSelectHotel().contains(string));
	}

	@When("User should search hotel using mandatory fields {string} , {string} and {string}")
	public void userShouldSearchHotelUsingMandatoryFieldsAnd(String location, String datepick_in, String datepick_out) {
		pom.getSearchHotelPage().searchHotel(location, datepick_in, datepick_out);

	}

	@Then("After searching hotel User should verify Date out-of-range error message {string} and {string}")
	public void afterSearchingHotelUserShouldVerifyDateOutOfRangeErrorMessageAnd(String string, String string2) {
		Assert.assertTrue("verify datein err msg", pom.getSearchHotelPage().errDatepickin().contains(string));
		Assert.assertTrue("verify dateout err msg", pom.getSearchHotelPage().errDatepickout().contains(string2));
	}

	@When("User should search hotel without entering any fields")
	public void userShouldSearchHotelWithoutEnteringAnyFields() {
		pom.getSearchHotelPage().click();
	}

	@Then("After searching hotel User should verify not selecting location error message {string}")
	public void afterSearchingHotelUserShouldVerifyNotSelectingLocationErrorMessage(String string) {
		Assert.assertTrue("verify searchhotel err msg", pom.getSearchHotelPage().errSearchHotel().contains(string));

	}


}
