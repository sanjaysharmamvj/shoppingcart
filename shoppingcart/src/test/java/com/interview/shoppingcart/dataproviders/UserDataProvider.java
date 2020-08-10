package com.interview.shoppingcart.dataproviders;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Random;

import org.testng.annotations.DataProvider;

import com.fasterxml.jackson.databind.ObjectMapper;

public class UserDataProvider {

	@DataProvider(name = "userRegistrationdata")
	public Object[][] getRegistrationData() throws FileNotFoundException {
		ObjectMapper objectMapper = new ObjectMapper();
		Map<String, String> jsonData = new HashMap<String, String>();
		try {
			FileInputStream fileInput = new FileInputStream("C://Users/ss041118/git/ShoppingCart/shoppingcart/src/test/resources/testdata/user_data.json");
			jsonData = objectMapper.readValue(fileInput, Map.class);
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} 
		return new Object[][] { { jsonData } };

	}

}
