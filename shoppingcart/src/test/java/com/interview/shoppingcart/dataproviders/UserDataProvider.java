package com.interview.shoppingcart.dataproviders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.interview.shoppingcart.pages.AuthenticationPage;

public class UserDataProvider {
	static final Logger logger=LogManager.getLogger(UserDataProvider.class);
	@DataProvider(name = "userRegistrationdata")
	public Object[][] getRegistrationData() throws FileNotFoundException {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> jsonData = new HashMap<String, String>();
		try {
			FileInputStream fileInput = new FileInputStream("src/test/resources/testdata/user_data.json");
			jsonData = objectMapper.readValue(fileInput, Map.class);
		} catch (FileNotFoundException fnfe) {
			
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} 
		return new Object[][] { { jsonData } };

	}

}
