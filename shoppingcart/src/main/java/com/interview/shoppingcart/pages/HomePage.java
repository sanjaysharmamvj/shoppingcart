package com.interview.shoppingcart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	private WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickSignIn() {
		WebElement signInBttn = driver.findElement(By.className("login"));
		signInBttn.click();

	}

}
