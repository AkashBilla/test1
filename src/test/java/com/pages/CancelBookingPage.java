package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class CancelBookingPage extends BaseClass {
	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="order_id_text")
	public WebElement txtOrderId;

	@FindBy(xpath="//a[text()='Booked Itinerary']")
	public WebElement btnItierary;

	@FindBy(id="search_hotel_id")
	public WebElement btnSearchOrderId;

	@FindBy(xpath="//input[contains(@value,'Cancel')]")
	public WebElement btnCancelOrderid;

	public WebElement getTxtOrderId() {
		return txtOrderId;
	}
	public WebElement getBtnItierary() {
		return btnItierary;
	}
	public WebElement getBtnSearchOrderId() {
		return btnSearchOrderId;
	}
	public WebElement getBtnCancelOrderid() {
		return btnCancelOrderid;
	}
	@FindBy(xpath="//label[contains(text(),'The booking has been cancelled.')]")
	public WebElement msgBookinCancel;
	public WebElement getMsgBookinCancel() {
		return msgBookinCancel;
	}
	public void cancelBooking(String order_id) {
		click(getBtnItierary());
		sendkeys(getTxtOrderId(),order_id );
		click(getBtnSearchOrderId());
		click(getBtnCancelOrderid());
		acceptPopUp();
	}
	public void cancelExistingOrder(String order_id) {
		click(getBtnItierary());
		click(getBtnCancelOrderid());
		acceptPopUp();

	}
	public String msgCancelBooking() {
		return getTextElement(getMsgBookinCancel());
	}


}
