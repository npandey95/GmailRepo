package com.gmailweb.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
		features="classpath:FeatureFiles/HomePage.feature",
		glue="stepDefinitions",
		plugin="html:target/html-report.html"
		)

@RunWith(Cucumber.class)
public class TestRunner {

}

