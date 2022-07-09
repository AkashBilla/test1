package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.reports.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(tags= {" @CancelBookingPage"},                                                                                   // or @SearchPage or @SelectPage or @BookingPage or @CancelBookingPage or @LoginPage or "},
		snippets=SnippetType.CAMELCASE ,monochrome=true ,
plugin= {"pretty","json:target//jsonfile.json"},
features="src/test/resources",glue="com.stepdefinition", strict=false, dryRun=false)
public class TestRunnerClass {
	
	
	@AfterClass
	public static void report() {

		Reporting.generateJVMReport(System.getProperty("user.dir")+"\\target\\jsonfile.json");

	}
}
