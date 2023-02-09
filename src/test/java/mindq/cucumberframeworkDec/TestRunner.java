package mindq.cucumberframeworkDec;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"Features"},
                 glue = {"mindq.stepdefinitions"},
                plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                tags =     "@loginwithvaliddata",
                monochrome = true)
public class TestRunner extends AbstractTestNGCucumberTests{

}
