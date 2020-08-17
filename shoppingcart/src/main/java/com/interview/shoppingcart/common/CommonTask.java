package com.interview.shoppingcart.common;

import java.util.Random;

import org.openqa.selenium.WebDriver;

public class CommonTask {

	public static void launchApplication(WebDriver driver, String appURL) {

		driver.get(appURL);
	}

	public static String getEmailAddress(String firstName, String lastName) {
		Random r = new Random( System.currentTimeMillis() );
	    int randomNumber = ((1 + r.nextInt(2)) * 10000 + r.nextInt(10000));
		return String.format(firstName+lastName+"%s@abc.com", randomNumber);
	}

}
