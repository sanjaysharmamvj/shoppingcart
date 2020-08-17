package com.interview.shoppingcart.test.listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {

	WebDriver driver = null;
	String filePath = "C:\\Screenshots";

	public void onFinish(ITestContext result) {

	}

	public void onStart(ITestContext result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	// When Test case get failed, this method is called.
	public void onTestFailure(ITestResult result) {
		System.out.println("***** Error " + result.getName() + " test has failed *****");
		String methodName = result.getName().toString().trim();
		ITestContext context = result.getTestContext();
		WebDriver driver = (WebDriver) context.getAttribute("driver");
		takeScreenShot(methodName, driver);
	}

	public void takeScreenShot(String methodName, WebDriver driver) {
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// The below method will save the screen shot in d drive with test method name
		try {
			FileUtils.copyFile(scrFile, new File(filePath + methodName + ".png"));
			System.out.println("***Placed screen shot in " + filePath + " ***");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// When Test case get Skipped, this method is called.
	public void onTestSkipped(ITestResult result) {
		System.out.println("The name of the testcase Skipped is :" + result.getName());
	}

	// When Test case get Started, this method is called.
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + " test case started");
	}

	// When Test case get passed, this method is called.
	public void onTestSuccess(ITestResult result) {
		System.out.println("The name of the testcase passed is :" + result.getName());
	}
}
