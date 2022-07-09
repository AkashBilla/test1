package com.reports;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting {
	public static void generateJVMReport(String jsonfile) {
		
		File file = new File(System.getProperty("user.dir")+"//target");
		
		Configuration configure = new Configuration(file, "Adactin Report");
		configure.addClassifications("Browser","Chrome");
		configure.addClassifications("OS","WIN10");
		configure.addClassifications("Version","109");
		
		List<String> jsonfiles = new ArrayList<String>();
		jsonfiles.add(jsonfile);
		ReportBuilder builder = new ReportBuilder(jsonfiles, configure);
		builder.generateReports();
		
	}
	

}
