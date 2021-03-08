package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\Features\\OrderMobile.feature"} ,

glue = {"com.stepsdefinition"},

plugin= {"html:src\\test\\resources\\Features\\FinalReports\\cucumbe","rerun:src\\test\\resources\\failure.txt"})

		

public class TestRunner {

	
}
