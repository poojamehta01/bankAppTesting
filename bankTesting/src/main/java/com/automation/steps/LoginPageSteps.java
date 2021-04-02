package com.automation.steps;

import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	LoginPage loginpage = new LoginPage();

	@Given("^User is on Login Page of the application$")
	
	public void user_is_on_Login_Page_of_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		loginpage.verifyUserOnLoginpage();
	}

	@When("^User logs in as Bank Manager$")
	public void user_logs_in_as_Bank_Manager() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    loginpage.login();
	}

}
