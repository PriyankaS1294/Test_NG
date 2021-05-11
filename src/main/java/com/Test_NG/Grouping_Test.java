package com.Test_NG;

import org.testng.annotations.Test;

public class Grouping_Test {

	
	@Test(groups="Electronics")
	private void laptop() {
		System.out.println("laptop search");

	}
	
	
	@Test(groups="Electronics")
	private void mobile() {
		System.out.println("mobile search");

	}
	
	@Test(groups="Electronics")
	private void earphones() {
		System.out.println("earphones search");

	}
	
	@Test(groups="Education")
	private void books() {
		System.out.println("books");
	}
	
	@Test(groups="Social Media")
	private void whatsapp() {
		System.out.println("whatsapp");
		
	}
	
	@Test(groups="Social Media")
	private void facebook() {
		System.out.println("facebook");
		
	}
	
	
	
	
	
	
	
	
	
}
