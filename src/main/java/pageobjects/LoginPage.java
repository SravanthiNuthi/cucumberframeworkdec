package pageobjects;

import org.openqa.selenium.By;

import mindq.cucumberframeworkDec.ReusableMethods;


public class LoginPage extends ReusableMethods {

	public static By emailinputBox = By.id("user_email");
	public static By passwordInputBox = By.name("user[password]");
	public static By signInButton = By.name("commit");

	public static By termsOfServiceLink = By.linkText("Terms Of Service");

	public static By allProjectsText = By.id("ember62");

	public static By errorMessageText = By.xpath("//p[text()='Invalid email or password.']");

	public static void enterEmailId(String email) {

		driver.findElement(emailinputBox).clear();
		driver.findElement(emailinputBox).sendKeys(email);
	}

	public static void enterpassword(String password) {

		driver.findElement(passwordInputBox).clear();
		driver.findElement(passwordInputBox).sendKeys(password);
	}

	public static void clickSignInButton() {

		driver.findElement(signInButton).click();
	}

	public static String captureAllProjectsText() {

		String text = driver.findElement(allProjectsText).getText();

		return text;
	}

	public static String captureInvalidLoginerrorMessage() {

		String text = driver.findElement(errorMessageText).getText();

		return text;
	}
}
