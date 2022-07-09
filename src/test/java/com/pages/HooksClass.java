package com.pages;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.base.BaseClass;

import cucumber.api.Scenario;
import cucumber.api.java.After;
/**
 * 
 * @author Aakash
 * @Description to take screenshot after each scenario
 *
 */
public class HooksClass extends BaseClass {
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {
		getDriver(getPropertyFileValue("browser"));
		getUrl(getPropertyFileValue("url"));
	}
	@After
	public void afterScenario(Scenario scenario) {
		TakesScreenshot takesScreenshot=(TakesScreenshot)driver;
		byte[] screenshotAs = takesScreenshot.getScreenshotAs(OutputType.BYTES);
		scenario.embed(screenshotAs, "Every Scenario");
		quit();

	}
}

