package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass{
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="radiobutton_0")
	public WebElement radbtn;
	@FindBy(id="continue")
	public WebElement btncontinue;
	@FindBy(xpath="//td[text()='Select Hotel ']")
	public WebElement msgselectHotel;
	@FindBy(id="radiobutton_span")
	public WebElement errRadiobutton;
	
	public WebElement getErrRadiobutton() {
		return errRadiobutton;
	}
	public WebElement getMsgselectHotel() {
		return msgselectHotel;
	}
	public WebElement getRadbtn() {
		return radbtn;
	}
	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public void selectHotel() {
		click(getRadbtn());
		click(getBtncontinue());

	}
	public void click() {
		click(getBtncontinue());
	}
	public String msgSelectHotel() {
		return getTextElement(getMsgselectHotel());
	}
	public String errRadioclickmsg() {
		return getTextElement(getErrRadiobutton());
	}


}
