package com.interview.shoppingcart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CreateAnAccountPage extends BasePage {
	
	public CreateAnAccountPage(WebDriver driver) {
		super(driver);	
		
	}

	public void enterPersonalInfo(String emailID, String fName, String lName, String password, String firstName,
			String lastName, String address, String city, String state, String pinCode, String country, String mobNo,
			String addressAlias) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Your personal information']")));
		WebElement custFName = driver.findElement(By.id("customer_firstname"));
		custFName.sendKeys(fName);
		WebElement custLName = driver.findElement(By.id("customer_lastname"));
		custLName.sendKeys(lName);
		WebElement passWrd = driver.findElement(By.id("passwd"));
		passWrd.sendKeys(password);
		WebElement custFirstname = driver.findElement(By.id("firstname"));
		custFirstname.sendKeys(firstName);
		WebElement custLastName = driver.findElement(By.id("lastname"));
		custLastName.sendKeys(lastName);
		WebElement custaddress = driver.findElement(By.id("address1"));
		custaddress.sendKeys(address);
		WebElement custCity = driver.findElement(By.id("city"));
		custCity.sendKeys(city);
		WebElement custState = driver.findElement(By.id("id_state"));
		custState.sendKeys(state);
		WebElement custPinCode = driver.findElement(By.id("postcode"));
		custPinCode.sendKeys(pinCode);
		WebElement custCountry = driver.findElement(By.id("id_country"));
		custCountry.sendKeys(country);
		WebElement custMobileNo = driver.findElement(By.id("phone_mobile"));
		custMobileNo.sendKeys(mobNo);
		WebElement custAddressAlias = driver.findElement(By.id("alias"));
		custAddressAlias.sendKeys(addressAlias);
		registerAccount();

	}

	public void registerAccount() {
		WebElement submitBttn = driver.findElement(By.id("submitAccount"));
		submitBttn.click();
	}
}