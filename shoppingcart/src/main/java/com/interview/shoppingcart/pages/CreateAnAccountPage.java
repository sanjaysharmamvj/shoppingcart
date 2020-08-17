package com.interview.shoppingcart.pages;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAnAccountPage extends BasePage {
	protected Logger logger=LogManager.getLogger(getClass());
	public CreateAnAccountPage(WebDriver driver) {
		super(driver);	
		
	}

	public void enterPersonalInfo(Map <String, String > userData) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Your personal information']")));
		WebElement custFName = driver.findElement(By.id("customer_firstname"));
		custFName.sendKeys(userData.get("firstName"));
		WebElement custLName = driver.findElement(By.id("customer_lastname"));
		custLName.sendKeys(userData.get("lastName"));
		WebElement passWrd = driver.findElement(By.id("passwd"));
		passWrd.sendKeys(userData.get("password"));
		WebElement custFirstname = driver.findElement(By.id("firstname"));
		custFirstname.sendKeys(userData.get("fName"));
		WebElement custLastName = driver.findElement(By.id("lastname"));
		custLastName.sendKeys(userData.get("lName"));
		WebElement custaddress = driver.findElement(By.id("address1"));
		custaddress.sendKeys(userData.get("address"));
		WebElement custCity = driver.findElement(By.id("city"));
		custCity.sendKeys(userData.get("city"));
		WebElement custState = driver.findElement(By.id("id_state"));
		custState.sendKeys(userData.get("state"));
		WebElement custPinCode = driver.findElement(By.id("postcode"));
		custPinCode.sendKeys(userData.get("zipcode"));
		WebElement custCountry = driver.findElement(By.id("id_country"));
		custCountry.sendKeys(userData.get("country"));
		WebElement custMobileNo = driver.findElement(By.id("phone_mobile"));
		custMobileNo.sendKeys(userData.get("mobileNo"));
		WebElement custAddressAlias = driver.findElement(By.id("alias"));
		custAddressAlias.sendKeys(userData.get("aliasAddress"));
	}

	public void registerAccount() {
		WebElement submitBttn = driver.findElement(By.id("submitAccount"));
		submitBttn.click();
		logger.info("Register button clicked");
	}
}