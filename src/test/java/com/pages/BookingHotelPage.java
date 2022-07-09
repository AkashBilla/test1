package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookingHotelPage extends BaseClass {
	public BookingHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="first_name")
	public WebElement txtFirstName;

	@FindBy(id="last_name")
	public WebElement txtLastName;

	@FindBy(id="address")
	public WebElement txtAddress;

	@FindBy(id="cc_num")
	public WebElement txtCreditCardNum;

	@FindBy(id="cc_type")
	public WebElement ddnCreditCardType;

	@FindBy(id="cc_exp_month")
	public WebElement ddnExpMonth;

	@FindBy(id="cc_exp_year")
	public WebElement ddnExpYear;

	@FindBy(id="cc_cvv")
	public WebElement txtCreditCardCVV;

	@FindBy(id="book_now")
	public WebElement btnBookNow;

	@FindBy(xpath="//td[text()='Book A Hotel ']")
	public WebElement msgbookHotel;


	public WebElement getMsgbookHotel() {
		return msgbookHotel;
	}
	public  WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtAddress() {
		return txtAddress;
	}

	public WebElement getTxtCreditCardNum() {
		return txtCreditCardNum;
	}

	public WebElement getDdnCreditCardType() {
		return ddnCreditCardType;
	}

	public WebElement getBtnBookNow() {
		return btnBookNow;
	}

	public WebElement getDdnExpMonth() {
		return ddnExpMonth;
	}

	public WebElement getDdnExpYear() {
		return ddnExpYear;
	}

	public WebElement getTxtCreditCardCVV() {
		return txtCreditCardCVV;
	}
	@FindBy(id="first_name_span")
	public WebElement errfirstNamemsg;
	@FindBy(id="last_name_span")
	public WebElement errlastNamemsg;
	@FindBy(id="address_span")
	public WebElement erraddressmsg;
	@FindBy(id="cc_num_span")
	public WebElement errccNumber;
	@FindBy(id="cc_type_span")
	public WebElement errccType;
	@FindBy(id="cc_expiry_span")
	public WebElement errexpirymsg;
	@FindBy(id="cc_cvv_span")
	public WebElement errccCVVmsg;

	public WebElement getErrfirstNamemsg() {
		return errfirstNamemsg;
	}
	public WebElement getErrlastNamemsg() {
		return errlastNamemsg;
	}
	public WebElement getErraddressmsg() {
		return erraddressmsg;
	}
	public WebElement getErrccNumber() {
		return errccNumber;
	}
	public WebElement getErrccType() {
		return errccType;
	}
	public WebElement getErrexpirymsg() {
		return errexpirymsg;
	}
	public WebElement getErrccCVVmsg() {
		return errccCVVmsg;
	}
	public void bookHotel(String first_name, String last_name, String address, String cc_num,
			String cc_type, String cc_exp_month, String cc_exp_year, String cc_cvv) {
		sendkeys(getTxtFirstName(), first_name);
		sendkeys(getTxtLastName(), last_name);
		sendkeys(getTxtAddress(), address);
		sendkeys(getTxtCreditCardNum(), cc_num);
		selectByVisibleTextId(getDdnCreditCardType(), cc_type);
		selectByVisibleTextId(getDdnExpMonth(), cc_exp_month);
		selectByVisibleTextId(getDdnExpYear(), cc_exp_year);
		sendkeys(getTxtCreditCardCVV(), cc_cvv);
		click(getBtnBookNow());
	}
	public void click() {
		click(getBtnBookNow());
	}
	public String msgBookHotel() {
		return getTextElement(getMsgbookHotel());
	}
	public String errFirstname() {
		return getTextElement(getErrfirstNamemsg());
	}
	public String errLastname() {
		return getTextElement(getErrlastNamemsg());
	}
	public String errAddressmsg() {
		return getTextElement(getErraddressmsg());
	}
	public String errCCnummsg() {
		return getTextElement(getErrccNumber());
	}
	public String errCCtypemsg() {
		return getTextElement(getErrccType());
	}
	public String errExpiryMsg() {
		return getTextElement(getErrexpirymsg());
	}
	public String errCCCVVmsg() {
		return getTextElement(getErrccCVVmsg());
	}

}
