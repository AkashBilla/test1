package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingHotelStep {
	PageObjectManager pom = new PageObjectManager();
	static String orderID;

	@When("User should book the hotel with all mandatory fields like {string},{string},{string} and save the order id")
	public void userShouldBookTheHotelWithAllMandatoryFieldsLikeAndSaveTheOrderId(String first_name, String last_name, String address, io.cucumber.datatable.DataTable dataTable) {
		List<Map<String,String>> asMaps = dataTable.asMaps();
		String cc_type = asMaps.get(2).get("CreditCardType");
		String cc_num = asMaps.get(2).get("CreditCardNo");
		String cc_exp_month = asMaps.get(2).get("ExpMonth");
		String cc_exp_year = asMaps.get(2).get("ExpYear");
		String cc_cvv = asMaps.get(2).get("CVV");

		pom.getBookingHotelPage().bookHotel(first_name, last_name, address, cc_num, cc_type, cc_exp_month, cc_exp_year, cc_cvv);
		orderID = pom.getBookingConfimationPage().getorderID();
	}

	@Then("After booking hotel successfully User should verify {string} message")
	public void afterBookingHotelSuccessfullyUserShouldVerifyMessage(String string) {
		Assert.assertTrue("verify bookhotel msg", pom.getBookingConfimationPage().msgBookingConfirm().contains(string));

	}

	@When("User should book the hotel without entering any fields")
	public void userShouldBookTheHotelWithoutEnteringAnyFields() {
		pom.getBookingHotelPage().click();
	}

	@Then("After booking hotel User should verify error messages {string},{string},{string},{string},{string},{string} and {string}")
	public void afterBookingHotelUserShouldVerifyErrorMessagesAnd(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
		Assert.assertTrue("verify firstname error msg", pom.getBookingHotelPage().errFirstname().contains(string));
		Assert.assertTrue("verify lastname error  msg", pom.getBookingHotelPage().errLastname().contains(string2));
		Assert.assertTrue("verify address error  msg", pom.getBookingHotelPage().errAddressmsg().contains(string3));
		Assert.assertTrue("verify cc-num error  msg", pom.getBookingHotelPage().errCCnummsg().contains(string4));
		Assert.assertTrue("verify cc-type error  msg", pom.getBookingHotelPage().errCCtypemsg().contains(string5));
		Assert.assertTrue("verify expirydate error  msg", pom.getBookingHotelPage().errExpiryMsg().contains(string6));
		Assert.assertTrue("verify cccvv error  msg", pom.getBookingHotelPage().errCCCVVmsg().contains(string7));

	}



}
