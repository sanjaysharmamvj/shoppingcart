package com.interview.shoppingcart.tests;

import java.util.Map;

import org.apache.logging.log4j.core.tools.picocli.CommandLine.Option;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.interview.shoppingcart.common.BrowserFactory;
import com.interview.shoppingcart.common.CommonTask;
import com.interview.shoppingcart.dataproviders.UserDataProvider;
import com.interview.shoppingcart.pages.AuthenticationPage;
import com.interview.shoppingcart.pages.CreateAnAccountPage;
import com.interview.shoppingcart.pages.HomePage;

public class CreateAccountTest {

	private WebDriver driver;

	@BeforeTest
	@Parameters({"browser", "gridHubURL"})
	public void beforeTest(String browser, String gridHubURL) {
		driver = BrowserFactory.createInstance(browser, gridHubURL);
		CommonTask.launchApplication(driver, "http://automationpractice.com/index.php");

	}

	@Test(dataProvider = "userRegistrationdata", dataProviderClass = UserDataProvider.class)
	public void createAccount(Map<String, String> userData) {
		HomePage homePage = new HomePage(driver);
		homePage.clickSignIn();
		AuthenticationPage authentication = new AuthenticationPage(driver);
		String emailId = CommonTask.getEmailAddress(userData.get("firstName"), userData.get("lastName"));
		System.out.println(emailId);
		authentication.createAnAccount(emailId);
		CreateAnAccountPage createAccount = new CreateAnAccountPage(driver);
		createAccount.enterPersonalInfo(userData);
		createAccount.registerAccount();
	}

	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
