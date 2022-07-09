package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHotelPage extends BaseClass{
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="location")
	public WebElement ddnLocation;

	@FindBy(id="hotels")
	public WebElement ddnHotels;

	@FindBy(id="room_type")
	public WebElement ddnRoom_type;

	@FindBy(id="room_nos")
	public WebElement ddnRoom_nos;

	@FindBy(id="datepick_in")
	public WebElement txtDatepick_in;

	@FindBy(id="datepick_out")
	public WebElement txtDatepick_out;

	@FindBy(id="adult_room")
	public WebElement ddnadult_room;

	@FindBy(id="child_room")
	public WebElement ddnchild_room;

	@FindBy(xpath="//td[text()='Search Hotel ']")
	public WebElement msgSearchHotel;

	@FindBy(id="Submit")
	public WebElement btnsubmit;

	@FindBy(id="location_span")
	public WebElement errLocationMsg;

	@FindBy(name="username_show")
	public WebElement msgHellovickie;

	@FindBy(id="checkout_span")
	public WebElement errDatepickoutMsg;

	@FindBy(id="checkin_span")
	public WebElement errDatepickinMsg;

	public WebElement getMsgHellovickie() {
		return msgHellovickie;
	}
	public WebElement getErrLocationMsg() {
		return errLocationMsg;
	}
	public WebElement getErrDatepickinMsg() {
		return errDatepickinMsg;
	}
	public WebElement getErrDatepickoutMsg() {
		return errDatepickoutMsg;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}
	public WebElement getMsgSearchHotel() {
		return msgSearchHotel;
	}
	public WebElement getDdnLocation() {
		return ddnLocation;
	}
	public WebElement getDdnHotels() {
		return ddnHotels;
	}
	public WebElement getDdnRoom_type() {
		return ddnRoom_type;
	}
	public WebElement getDdnRoom_nos() {
		return ddnRoom_nos;
	}
	public WebElement getTxtDatepick_in() {
		return txtDatepick_in;
	}
	public WebElement getTxtDatepick_out() {
		return txtDatepick_out;
	}
	public WebElement getDdnadult_room() {
		return ddnadult_room;
	}
	public WebElement getDdnchild_room() {
		return ddnchild_room;
	}

	public void searchHotel(String location, String hotels, String room_type,String room_nos,
			String datepick_in, String datepick_out, String adult_room, String child_room) {
		selectByVisibleTextId(getDdnLocation(), location);
		selectByVisibleTextId(getDdnHotels(), hotels);
		selectByVisibleTextId(getDdnRoom_type(), room_type);
		selectByVisibleTextId(getDdnRoom_nos(), room_nos);
		clear(getTxtDatepick_in());
		sendkeys(getTxtDatepick_in(), datepick_in);
		clear(getTxtDatepick_out());
		sendkeys(getTxtDatepick_out(), datepick_out);
		selectByVisibleTextId(getDdnadult_room(), adult_room);
		selectByVisibleTextId(getDdnadult_room(), child_room);
		click(getBtnsubmit());

	}
	public void searchHotel(String location,String datepick_in, String datepick_out) {
		selectByVisibleTextId(getDdnLocation(), location);
		clear(getTxtDatepick_in());
		sendkeys(getTxtDatepick_in(), datepick_in);
		clear(getTxtDatepick_in());
		sendkeys(getTxtDatepick_out(), datepick_out);
		click(getBtnsubmit());

	}
	public void click() {
		click(getBtnsubmit());
	}
	public String hellovickie() {
		return getAttributeValue(getMsgHellovickie());
	}
	public String errSearchHotel() {
		return getTextElement(getErrLocationMsg());
	}
	public String errDatepickin() {
		return getTextElement(getErrDatepickinMsg());
	}
	public String errDatepickout() {
		return getTextElement(getErrDatepickoutMsg());
	}
}
