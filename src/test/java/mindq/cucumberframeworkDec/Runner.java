package mindq.cucumberframeworkDec;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;




@CucumberOptions(features = {"Features" },
                 glue =     {"mindq.stepdefinitions"},
                // plugin = { "pretty",//"html:target/cucumber-reports/report.html"},//"json:target/cucumber-reports/Cucumber.json"},
                		 //"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/extentreport.html"},
                		plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
                 tags =     "@loginwithvaliddata",
                 monochrome = true)
public class Runner extends AbstractTestNGCucumberTests{


	

	 
}

