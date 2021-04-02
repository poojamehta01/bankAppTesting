package com.automation.steps;

import org.testng.annotations.Test;

import com.automation.pages.MainPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainPageSteps {
	MainPage mainpage = new MainPage();
///////////  add customer ///////////
	@When("^User clicks on Add Customer button on Main page$")
	public void user_clicks_on_Add_Customer_button_on_Main_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mainpage.clicksOnAddCustomer();
	}

	@When("^User enters first Name, last Name, post Code$")
	public void user_enters_first_Name_last_Name_post_Code() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    mainpage.customerDetails();
	}

	@When("^User clicks on Add Customer Submit button on Main page$")
	public void user_clicks_on_Add_Customer_Submit_button_on_Main_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    mainpage.clicksOnAddCustomerSubmit();
	}
///////////  open account ///////////
	@When("^User clicks on Open Account button on Main page$")
	public void user_clicks_on_Open_Account_button_on_Main_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mainpage.clicksOnOpenAccount();
	}
	@When("^User Selects customer and curreny from dropDown on Main page$")
	public void user_Selects_customer_and_curreny_from_dropDown_on_Main_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		mainpage.selectsCustomerCurrency();
	}

	@When("^User clicks on Process button on Main page$")
	public void user_clicks_on_Process_button_on_Main_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		mainpage.clicksOnProcess();
	}
/////////// customers ///////////
	@When("^User clicks on Customers button on Main page$")
	public void user_clicks_on_Customers_button_on_Main_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    mainpage.clicksOnCustomers();
	}
	
	@When("^USer searchs the account Details on Main page$")
	public void user_searchs_the_account_Details_on_Main_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   mainpage.search();
	}


}
