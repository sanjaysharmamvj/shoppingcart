package com.interview.shoppingcart.pages;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage {
	static final Logger logger=LogManager.getLogger(AuthenticationPage.class);
	private WebDriver driver;
	private WebDriverWait wait;

	public AuthenticationPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver,30);
	}
	
	public void createAnAccount(String emailId) {
		By by = By.id("email_create");
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
		WebElement emailAddress = driver.findElement(by);
		emailAddress.sendKeys(emailId);
		logger.info("Email Id entered successfully");
		WebElement createAnAccountBttn = driver.findElement(By.name("SubmitCreate"));
		createAnAccountBttn.click();
		logger.info("Create an Account button clicked");
	}

}
