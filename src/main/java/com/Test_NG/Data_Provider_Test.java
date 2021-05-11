package com.Test_NG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Data_Provider_Test {
	
	@Test(dataProvider = "test_Data")

	private void credentials(String username, int password) {
		
		System.out.println("Username : "+username);
		System.out.println("Password : "+password);
		
		
	}
	
	//object [] []
	@DataProvider
	private Object[][] test_Data() {
		
		return new Object[] [] {
			{"Smith", 123},
			{"Starc", 234},
			{"Watson", 345}
		};
	}
	
	
}
