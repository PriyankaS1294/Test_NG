package com.Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Concept {

	
	
	@Test
	private void demo() {
		String db_Username = "Smith"; // null;- pass
		
		String actual_Username= "Starc";
		
		System.out.println("Welcome to signin page");
		
	//	Assert.assertEquals(actual_Username, db_Username);
		//Assert.assertNotEquals(actual_Username, db_Username);
		
		Assert.assertNull(db_Username);
		
		System.out.println("welcome to home page");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
