package com.interview.shoppingcart.dataproviders;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;


import org.testng.annotations.DataProvider;

import com.google.common.reflect.TypeToken;

public class UserDataProvider {
	
	@DataProvider(name="userRegistrationdata")
	public Object[][] userRegistrationData() {
		Map<String, String> userData = new HashMap<String,String>();
	    Random random = new Random();
	    String emailId = "sanjaytest" + random.nextInt(5) + "@abc.com";  	
		userData.put("email", emailId);
		userData.put("firstName", "Sanjay");
		userData.put("lastName", "Sharma");
		userData.put("password", "Welcome123");
		userData.put("fName", "Sanjay");
		userData.put("lName", "Sharma");
		userData.put("address", "Cerner,12 LakeTown,Block-B");
		userData.put("city", "Philadelphia");
		userData.put("state", "Pennslyvania");
		userData.put("pincode", "15001");
		userData.put("country", "United States");
		userData.put("mobileNo", "90515567");
		userData.put("aliasAddress", "Res");
		Object[][]testData={{userData}};
		return testData;		
		
	}
	/*
	@DataProvider
    public Object[][] userRegistrationData1() throws FileNotFoundException {
        JsonElement jsonData = new JsonParser().parse(new FileReader("src/test/resources/45146523.json"));
        JsonElement dataSet = jsonData.getAsJsonObject().get("dataSet");
        List<TestData> testData = new Gson().fromJson(dataSet, new TypeToken<List<TestData>>() {
        }.getType());
        Object[][] returnValue = new Object[testData.size()][1];
        int index = 0;
        for (Object[] each : returnValue) {
            each[0] = testData.get(index++);
        }
        return returnValue;
    }
}*/

}
