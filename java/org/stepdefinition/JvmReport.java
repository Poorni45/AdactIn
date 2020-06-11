package org.stepdefinition;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String json) {
		File f= new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Jvm");
		
		Configuration c = new Configuration(f, "AdactIn");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("AdactIn", "Hotel Booking");
		
		List<String> jsonFiles = new ArrayList<String>();
		jsonFiles.add(json);
		
		ReportBuilder r = new ReportBuilder(jsonFiles, c);
		r.generateReports();
		

	}

}
