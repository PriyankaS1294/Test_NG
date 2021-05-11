package com.Test_NG;

import org.testng.annotations.Test;

public class TimeOut_Test {

	@Test(timeOut = 3000)
	private void demo() throws Throwable {
		
		System.out.println("Browser");
		
		Thread.sleep(2000);
		
		System.out.println("login");
		
		Thread.sleep(2000);
		System.out.println("navigate");

	}
	
	
	
	
	
}
