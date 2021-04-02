package com.automation.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import static com.automation.utils.DriverUtils.*;
import static com.automation.utils.WebElementUtils.waitForVisible;

public class CommonUtils extends LogUtils  {
	public void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,250)");
	}

	public static void clickOnElement(WebElement element) {
		waitForVisible(element);
		element.click();
		Log.debug("Performing click");
	}
	public static void selectfromDropdown(WebElement element) {
		
	}

	public static void sendKeysTo(WebElement element, String text) {
		waitForVisible(element);
		element.clear();
		element.sendKeys(text);
		Log.debug("Entering value");
	}

	public static void upload(WebElement element, String text) {

		element.sendKeys(text);
		Log.debug("Uploading Attachment");
	}
	public static void alert() {

		Alert alert=driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
		Log.debug("User clicks ok");
	}
	
}
