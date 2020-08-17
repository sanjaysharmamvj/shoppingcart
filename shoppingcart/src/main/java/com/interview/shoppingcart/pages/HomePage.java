package com.interview.shoppingcart.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	protected Logger logger=LogManager.getLogger(getClass());
	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSignIn() {
		WebElement signInBttn = driver.findElement(By.className("login"));
		signInBttn.click();
		logger.info("Clicked on Sigin button");
	}

}
