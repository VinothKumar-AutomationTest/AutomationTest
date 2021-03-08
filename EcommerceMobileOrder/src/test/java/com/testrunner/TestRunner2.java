package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(features= { "@src\\test\\resources\\failure.txt"} ,

glue = {"com.stepsdefinition"})
public class TestRunner2 {

}
