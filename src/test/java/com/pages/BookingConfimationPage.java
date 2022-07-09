package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingConfimationPage extends BaseClass {
	public BookingConfimationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//td[text()='Booking Confirmation ']")
	public WebElement msgBookingConfirm;

	@FindBy(id="order_no")
	public WebElement attOrderId;

	public WebElement getAttOrderId() {
		return attOrderId;
	}

	public WebElement getMsgBookingConfirm() {
		return msgBookingConfirm;
	}
	public String getorderID() {
		String attributeValue = getAttributeValue(getAttOrderId());
		return attributeValue;
	}
	public String msgBookingConfirm() {
		return getTextElement(getMsgBookingConfirm());
	}
}
