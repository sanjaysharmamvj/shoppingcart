package com.interview.shoppingcart.common;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserFactory {
	
	public static WebDriver createInstance(String browserName, String gridHubURL) {
		BrowserType browserType = BrowserType.valueOf(browserName);
		WebDriver driver = null;
		switch(browserType) {
		case LOCAL_CHROME :
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case LOCAL_FIREFOX :
			System.setProperty("webdriver.gecko.driver", "src/main/resources/drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case GRID_CHROME :
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			try {
				driver = new RemoteWebDriver(new URL(gridHubURL), chromeOptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case GRID_FIREFOX :
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			try {
				driver = new RemoteWebDriver(new URL(gridHubURL), firefoxOptions);
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		default:
			System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
			break;
			
		}
	driver.manage().window().maximize();
	return driver;
		
	}

}
