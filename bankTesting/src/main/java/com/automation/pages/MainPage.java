package com.automation.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.automation.utils.LogUtils;

import static com.automation.utils.AssertionUtils.*;
import static com.automation.utils.AssertionUtils.assertPresent;
import static com.automation.utils.CommonUtils.clickOnElement;
import static com.automation.utils.CommonUtils.sendKeysTo;
import static com.automation.utils.ConfigUtils.getPropertyByKey;
import static com.automation.utils.DriverUtils.*;
import static com.automation.utils.WebElementUtils.waitForVisible;

public class MainPage {

	public MainPage() {
		PageFactory.initElements(getDriver(), this);
	}

	public static Logger Log = LogManager.getLogger(LogUtils.class.getName());

	/// buttons - addcus, open account, cutomers ////
	@FindBy(xpath = "//button[@ng-class='btnClass1']")
	private WebElement addCustomer;
	@FindBy(xpath = "//button[@ng-class='btnClass2']")
	private WebElement openAccount;
	@FindBy(xpath = "//button[@ng-class='btnClass3']")
	private WebElement Customers;
	/// ADD CUST - FIRST/ LAST/POST/SUBMIT ////
	@FindBy(xpath = "//label[text()='First Name :']//following-sibling::input")
	private WebElement firstName;
	@FindBy(xpath = "//label[text()='Last Name :']//following-sibling::input")
	private WebElement lastName;
	@FindBy(xpath = "//label[text()='Post Code :']//following-sibling::input")
	private WebElement postCode;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement addCustSubmit;
	//// open account - select cust, currency, process
	@FindBy(xpath = "//select[@id='userSelect']")
	private WebElement userSelect;
	@FindBy(xpath = "//select[@id='currency']")
	private WebElement currency;
	@FindBy(xpath = "//button[text()='Process']")
	private WebElement Process;
	@FindBy(xpath = "//option[@value='6']")
	private WebElement cutomer6;
	@FindBy(xpath = "//option[@value='Rupee']")
	private WebElement Rupee;
	//// search ////
	@FindBy(xpath = "//div[@class='input-group-addon']//following-sibling::input")
	private WebElement search;
	@FindBy(xpath = "//td[@class='ng-binding'][1]")
	private WebElement firstNameSearch;
	@FindBy(xpath = "//td[@class='ng-binding'][2]")
	private WebElement lastNameSearch;
	@FindBy(xpath = "//td[@class='ng-binding'][3]")
	private WebElement postCodeSearch;
	@FindBy(xpath = "//td[@class='ng-binding'][3]//following-sibling::td//span")
	private WebElement accountNumberSearch;

	///////// buttons /////////////
	public void clicksOnAddCustomer() {

		clickOnElement(addCustomer);
		Log.debug("Clicks on addCustomer Button");

	}

	public void clicksOnOpenAccount() {

		clickOnElement(openAccount);
		Log.debug("Clicks on openAccount Button");

	}

	public void clicksOnCustomers() {
		clickOnElement(Customers);
		Log.debug("Clicks on Customers Button");

	}
///////// customer details /////////////

	public void customerDetails() {

		sendKeysTo(firstName, getPropertyByKey("firstName"));
		Log.debug("firstName entered");

		sendKeysTo(lastName, getPropertyByKey("lastName"));
		Log.debug("lastName entered");

		sendKeysTo(postCode, getPropertyByKey("postCode"));
		Log.debug("postCode entered");

	}

	public void clicksOnAddCustomerSubmit() {
		// TODO Auto-generated method stub
		clickOnElement(addCustSubmit);
		Log.debug("Add customer Details submitted");
		alert();

	}
///////// open account /////////////

	public void selectsCustomerCurrency() {
		// TODO Auto-generated method stub
		clickOnElement(userSelect);
		Log.debug("User Selected");
		clickOnElement(cutomer6);
		Log.debug("cutomer6 Selected");
		clickOnElement(currency);
		Log.debug("currency Selected");
		clickOnElement(Rupee);
		Log.debug("Rupee Selected");

	}

	public void clicksOnProcess() {
		// TODO Auto-generated method stub
		clickOnElement(Process);
		Log.debug("process Button Clicked");
		alert();
	}

/// search /////	
	public void search() throws InterruptedException {
		// TODO Auto-generated method stub
		sendKeysTo(search, getPropertyByKey("postCode"));
		Log.debug("Search by postCode entered");
		assertPresent(search);
//		Thread.sleep(5000);
//		assertPresent(postCodeSearch);
//		 assertEquals(postCodeSearch, postCode);
//		assertEquals(lastNameSearch, getPropertyByKey("lastName"), lastNameSearch.getText());
		// assertEquals(postCodeSearch, getPropertyByKey("postCode"));
		// assertEquals(accountNumberSearch, getPropertyByKey("accountNumber"));

	}

	public void verifyCustomerDetails() {
		// TODO Auto-generated method stub
		Log.debug("assertion on firstName");
		String firstNameActual = getPropertyByKey("firstName");
		String firstNameExpected = firstNameSearch.getText();
		assertEquals(firstNameSearch, firstNameActual, firstNameExpected);

		Log.debug("assertion on lastName");
		String lastNameActual = getPropertyByKey("lastName");
		String lastNameExpected = lastNameSearch.getText();
		assertEquals(lastNameSearch, lastNameActual, lastNameExpected);

		Log.debug("assertion on postCode");
		String postCodeActual = getPropertyByKey("postCode");
		String postCodeExpected = postCodeSearch.getText();
		assertEquals(postCodeSearch, postCodeActual, postCodeExpected);

//		Log.debug("assertion on accountNumber");
//		String postCodeActual = getPropertyByKey("postCode");
//		String postCodeExpected = postCodeSearch.getText();
//		assertEquals(postCodeSearch,postCodeActual, postCodeExpected);

	}

}
