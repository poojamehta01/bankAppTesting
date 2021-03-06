package com.automation.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import static com.automation.utils.DriverUtils.getDriver;
import static com.automation.utils.DriverUtils.tearDown;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Hooks {

	@Before
	public void setUp() {
		getDriver();
	}

	@After
	public void teardown() {
		tearDown();
	}
}
