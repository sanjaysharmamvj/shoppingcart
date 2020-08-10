package com.interview.shoppingcart.tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
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
	public void beforeTest() {
		driver = BrowserFactory.createInstance("LOCAL_CHROME");
		CommonTask.launchApplication(driver, "http://automationpractice.com/index.php");

	}

	@Test(dataProvider="userRegistrationdata", dataProviderClass=UserDataProvider.class)
	public void createAccount(Map<Object, Object> map) {
		HomePage homePage = new HomePage(driver);		
		homePage.clickSignIn();
		AuthenticationPage authentication = new AuthenticationPage(driver);
		authentication.createAnAccount("sanjay122@abc.com");
		CreateAnAccountPage createAccount = new CreateAnAccountPage(driver);
		createAccount.enterPersonalInfo("sanjay@abc.com","Sanjay","Sharma","Welcome123","Sanjay",
				"Sharma","Cerner,12 LakeTown,Block-B","Philadelphia","Pennslyvania","15001","United States","90515567","Res");
		createAccount.registerAccount();
		
		System.out.println("Data from the DataProvider" +map);
	}

	@AfterTest
	public void afterTest() {
	}

}
