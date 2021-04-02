package com.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.utils.LogUtils;
import static com.automation.utils.AssertionUtils.*;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.CommonUtils.sendKeysTo;
import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.getDriver;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public static Logger Log = LogManager.getLogger(LogUtils.class.getName());

	@FindBy(xpath = "//button[text()='Bank Manager Login']")
	private WebElement BankManagerLogin;

	public void verifyUserOnLoginpage() {

		assertPageTitle(getPropertyByKey("LoginPage.title"));
		Log.info("Login Page Title found");
	}

	public void login() {
		
		clickOnElement(BankManagerLogin);
		Log.debug("User clicks Bank Manager Login");
		
		
	}

}
