package com.automation.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.automation.pages.LoginPage;
import com.automation.utils.LogUtils;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	LoginPage loginpage = new LoginPage();
	public static Logger Log = LogManager.getLogger(LogUtils.class.getName());
	@Given("^User is on Login Page of the application$")
	
	public void user_is_on_Login_Page_of_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Log.info("Verifying that user is on login Page");
		loginpage.verifyUserOnLoginpage();
		
	}

	@When("^User logs in as Bank Manager$")
	public void user_logs_in_as_Bank_Manager() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Log.info("Performing login");
	    loginpage.login();
	}

}
