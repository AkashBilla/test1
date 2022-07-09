package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
/**
 * 
 * @author Aakash
 * @Description To maintain reusable method
 * @CreationDate 24-06-2022
 *
 */
public class BaseClass {

	public static WebDriver driver;
/**
 * @Description To setup chromedriver
 * @CreatinDate 26-06-2022
 */
	public static void getChromeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	public static void getDriver(String driverType) {
		switch (driverType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}
	public static void getUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public void setImplicitWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}
	public void maximize() {
		driver.manage().window().maximize();
	}
	public void sendKeys(WebElement element,String data) {
		element.sendKeys(data);

	}
	public  void quit() {
		driver.quit();
	}
	//subclass
	/**
	 * @Desciption to send data with element
	 * @param xpath
	 * @param data
	 */
	public void sendKeys(String xpath,String data) {
		driver.findElement(By.xpath(xpath)).sendKeys(data);

	}
	public void sendKeysId(String txtusername,String data) {
		driver.findElement(By.id(txtusername)).sendKeys(data);

	}
	public void sendKeysName(String name,String data) {
		driver.findElement(By.name(name)).sendKeys(data);

	}
	public void sendKeysClass(String classname,String data) {
		driver.findElement(By.className(classname)).sendKeys(data);

	}//subclass over
	//element+clear
	public void clear(WebElement element) {
		element.clear();
	}
	public void clearId(String id) {
		driver.findElement(By.id(id)).clear();
	}
	public void clearName(String name) {
		driver.findElement(By.name(name)).clear();
	}
	public void clearClass( String classname) {
		driver.findElement(By.className(classname)).clear();
	}
	//end of clear
	//new method--sendkeys + enter
	public void sendKeysEnter(String xpath, String data) {
		driver.findElement(By.xpath(xpath)).sendKeys(data,Keys.ENTER);

	}
	public void sendKeysEnterId(String xpath, String data) {
		driver.findElement(By.id(xpath)).sendKeys(data,Keys.ENTER);

	}
	public void sendKeysEnterName(String name, String data) {
		driver.findElement(By.name(name)).sendKeys(data,Keys.ENTER);

	}
	public void sendKeysEnterClass(String classname, String data) {
		driver.findElement(By.className(classname)).sendKeys(data,Keys.ENTER);

	}//end of sendkeys+enter
	//element+click
	public void click(WebElement element) {
		element.click();
	}
	//subclass of element click
	public void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	public void clickId(String id) {
		driver.findElement(By.id(id)).click();
	}
	public void clickName(String name) {
		driver.findElement(By.name(name)).click();
	}
	public void clickClassName(String classname) {
		driver.findElement(By.className(classname)).click();
	}//end of subclass click=====16

	public String getTitle() {
		String title = driver.getTitle();
		return title; 
	}
	//getattribute 

	public String getAttributeValue(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public String getAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public String getAttributeValueId(String id) {
		WebElement element = driver.findElement(By.id(id));
		String attribute = element.getAttribute("value");
		return attribute;
	}
	//sendkeys + id
	public void sendkeysByXpath(String xpath,String data) {
		driver.findElement(By.xpath(xpath)).sendKeys(data);

	}
	public void sendkeysById(String id,String data) {
		driver.findElement(By.id(id)).sendKeys(data);

	}
	public void sendkeys(WebElement element,String data) {
		element.sendKeys(data);
	}
	public void sendkeysByValue(String name,String data) {
		driver.findElement(By.name(name)).sendKeys(data);

	}
	public void sendkeysByClassName(String className,String data) {
		driver.findElement(By.className(className)).sendKeys(data);

	}
	//Webelement
	public WebElement findElementsByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;

	}
	public WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;

	}
	public WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;

	}
	public WebElement findElementByClassName(String classname) {
		WebElement element = driver.findElement(By.className(classname));
		return element;
		//29
	}//end of element
	//start of element + getText()
	public String getTextElement(WebElement element) {
		String text = element.getText();
		return text;
	}
	public void getText(String xpath) {
		driver.findElement(By.xpath(xpath)).getText();
	}
	public void getTextId(String id) {
		driver.findElement(By.id(id)).getText();
	}
	public void getTextClassName(String className) {
		driver.findElement(By.className(className)).getText();
	}
	public void getTextName(String name) {
		driver.findElement(By.name(name)).getText();
	}
	//end of getText
	//select class   //34
	public void selectByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void deselectByIndex(WebElement element,int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	public void selectByValueElement(WebElement element,String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void deselectByValueElement(WebElement element,String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	public void selectByVisibleTextElement(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void deselectByVisibleTextElement(WebElement element,String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	public List<WebElement> selectGetOptionsElement(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public void selectDeselectAllElement(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}


	public void selectByIndex(String xpath,int index) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void deselectByIndex(String xpath,int index) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	public void selectByValue(String xpath,String value) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void deselectByValue(String xpath,String value) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public void selectByVisibleText(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectByVisibleText(String xpath,String text) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void deselectByVisibleText(String xpath,String text) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	public List<WebElement> selectGetOptions(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public void selectDeselectAll(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		Select select = new Select(element);
		select.deselectAll();
	}

	//51
	public void selectByIndexId(String id,int index) {
		WebElement element = driver.findElement(By.id(id));
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void deselectByIndexId(String id,int index) {
		WebElement element = driver.findElement(By.id(id));
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	public void selectByValueId(String id,String value) {
		WebElement element = driver.findElement(By.id(id));
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void deselectByValueId(String id,String value) {
		WebElement element = driver.findElement(By.id(id));
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public void selectByVisibleTextId(WebElement element,String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void selectByVisibleTextId(String id,String text) {
		WebElement element = driver.findElement(By.id(id));
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void deselectByVisibleTextId(String id,String text) {
		WebElement element = driver.findElement(By.id(id));
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	public List<WebElement> selectGetOptionsId(String id) {
		WebElement element = driver.findElement(By.id(id));
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public void selectDeselectAllId(String id) {
		WebElement element = driver.findElement(By.id(id));
		Select select = new Select(element);
		select.deselectAll();
	}
	//name//59
	public void selectByIndexName(String name,int index) {
		WebElement element = driver.findElement(By.name(name));
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void deselectByIndexName(String name,int index) {
		WebElement element = driver.findElement(By.name(name));
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	public void selectByValueName(String name,String value) {
		WebElement element = driver.findElement(By.name(name));
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void deselectByValueName(String name,String value) {
		WebElement element = driver.findElement(By.name(name));
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public void selectByVisibleTextName(String name,String text) {
		WebElement element = driver.findElement(By.name(name));
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void deselectByVisibleTextName(String name,String text) {
		WebElement element = driver.findElement(By.name(name));
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	public List<WebElement> selectGetOptionsName(String name) {
		WebElement element = driver.findElement(By.name(name));
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public void selectDeselectAllName(String name) {
		WebElement element = driver.findElement(By.name(name));
		Select select = new Select(element);
		select.deselectAll();
	}//className//67
	public void selectByIndexclassname(String classname,int index) {
		WebElement element = driver.findElement(By.className(classname));
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	public void deselectByIndexclassname(String classname,int index) {
		WebElement element = driver.findElement(By.className(classname));
		Select select = new Select(element);
		select.deselectByIndex(index);
	}
	public void selectByValueclassname(String classname,String value) {
		WebElement element = driver.findElement(By.className(classname));
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public void deselectByValueclassname(String classname,String value) {
		WebElement element = driver.findElement(By.className(classname));
		Select select = new Select(element);
		select.deselectByValue(value);
	}
	public void selectByVisibleTextclassname(String classname,String text) {
		WebElement element = driver.findElement(By.className(classname));
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	public void deselectByVisibleTextclassname(String classname,String text) {
		WebElement element = driver.findElement(By.className(classname));
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}
	public List<WebElement> selectGetOptionsclassname(String classname) {
		WebElement element = driver.findElement(By.className(classname));
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}
	public void selectDeselectAllclassname(String classname) {
		WebElement element = driver.findElement(By.className(classname));
		Select select = new Select(element);
		select.deselectAll();
	}
	public String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties property = new Properties();
		property.load(new FileInputStream("C:\\Users\\Aakash\\eclipse-workspace\\AdactinOMRBranchAutomation2\\config.properties"));
		Object objName = property.get(key);
		String string = (String)objName;//type casting
		return string;
	}
	public void acceptPopUp() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

}
