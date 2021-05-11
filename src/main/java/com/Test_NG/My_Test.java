package com.Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class My_Test {

	@Test(retryAnalyzer = Retry_Class.class)
     private void credentials() {
	String db_Username = "Smith"; 
	
	String actual_Username= "Starc";
	
	Assert.assertEquals(actual_Username, db_Username);
	
     }
	
	
	@Test(retryAnalyzer = Retry_Class.class)
     private void credentials1() {
    		String db_Password = "Smith@123"; 
    		
    		String actual_Password= "Starc@123";
    		
    		Assert.assertEquals(actual_Password, db_Password);
    		
    	     }
	
	
	
	
	
	
}
