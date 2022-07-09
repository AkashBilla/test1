package com.pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class LoginPage  extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	public WebElement txtusername;

	@FindBy(id="password")
	public WebElement txtpassword;

	@FindBy(id="login")
	public WebElement btnlogin;
	@FindBy(xpath="//b[contains(text(),'Invalid Login details or Your Password might have expired. ')]")
	public WebElement errUsername;

	public WebElement getErrUsername() {
		return errUsername;
	}
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void login(String username,String password) {
		sendKeys(getTxtusername(), username);
		sendKeys(getTxtpassword(), password);
		click(getBtnlogin());

	}

	public void loginWithEnter(String username,String password) throws AWTException {
		sendKeys(getTxtusername(), username);
		sendKeys(getTxtpassword(), password);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}
	public void login() {
		click(btnlogin);
	}
	public String errUsernamemsg() {
		return getTextElement(getErrUsername());
	}
}
