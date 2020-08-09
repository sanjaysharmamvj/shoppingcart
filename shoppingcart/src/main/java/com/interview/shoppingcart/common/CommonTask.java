package com.interview.shoppingcart.common;

import org.openqa.selenium.WebDriver;

public class CommonTask {

	public static void launchApplication(WebDriver driver, String appURL) {

		driver.get(appURL);
	}

}
