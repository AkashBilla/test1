package com.stepdefinition;

import com.pagemanager.PageObjectManager;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CancelBookingStep {
	PageObjectManager pom = new PageObjectManager();


	@When("User should cancel the generated order id")
	public void userShouldCancelTheGeneratedOrderId() {
		pom.getCancelBookingPage().cancelBooking(BookingHotelStep.orderID);

	}

	@Then("After cancelling the order id User should verify cancellation msg {string}")
	public void afterCancellingTheOrderIdUserShouldVerifyCancellationMsg(String string) {

	}

	@When("User should cancel the existing order id {string}")
	public void userShouldCancelTheExistingOrderId(String string) {
		pom.getCancelBookingPage().cancelBooking(BookingHotelStep.orderID);
	}

}
