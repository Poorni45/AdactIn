package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.stepdefinition.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src\\test\\resources\\Features" }, glue = { "org.stepdefinition" },dryRun=false,
plugin = {"json:src\\test\\resources\\Reports\\Json\\Adactin.json"})
public class TestRunner {

	@AfterClass
	public static void jvmReportGeneration() {
	JvmReport.generateJvmReport(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\Json\\Adactin.json");

	}
	

}