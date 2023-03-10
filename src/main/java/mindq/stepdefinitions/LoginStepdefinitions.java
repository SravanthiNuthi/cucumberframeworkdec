package mindq.stepdefinitions;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobjects.LoginPage;

public class LoginStepdefinitions extends LoginPage {

	@Given("^User is in login page$")
	public void user_is_in_login_page() {
		launchApplication("Chrome");
		ExtentCucumberAdapter.addTestStepLog("launched chrome");
		
	}

	@When("^User enters emailid \"([^\"]*)\"$")
	public void user_enters_emailid(String email) {
		enterEmailId(email);
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() {
		String actualresult = captureAllProjectsText();

		String expectedResult = "All projects";

		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualresult, expectedResult, "Message is not matching");

		sa.assertAll();
	}

	@Then("^User should be not login with invalid data$")
	public void user_should_be_not_login_with_invalid_data() {
		String actualresult = captureInvalidLoginerrorMessage();

		String expectedResult = "Invalid email or password.";

		Assert.assertEquals(actualresult, expectedResult, "Error message is not validated properly");
	}

	@And("^User enters password \"([^\"]*)\"$")
	public void user_enters_password(String password) {
		enterpassword(password);
	}

	@And("^User clicks signin button$")
	public void user_clicks_signin_button() {
		clickSignInButton();
	}
}
