package com.Test_NG;

import org.testng.annotations.Test;

public class Expected_Exception {

	@Test(expectedExceptions = ArithmeticException.class) //nullpointer
	private void demo() {
		int a = 10;
		System.out.println(a/0);
	}
	
	
	
	
	
	
	
	
	
	
}
