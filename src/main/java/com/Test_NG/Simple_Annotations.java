package com.Test_NG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Simple_Annotations {

	
	
	@BeforeSuite
	private void setProperty() {
		System.out.println("set Property");

	}
	
	
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");

	}
	
	
	@BeforeClass
	private void url() {
		System.out.println("url");

	}
	
	
	@BeforeMethod
	private void login() {
		System.out.println("login");

	}
	
	
	@Test
	private void laptop() {
		System.out.println("laptop search");

	}
	
	
	@Test
	private void mobile() {
		System.out.println("mobile search");

	}
	
	@Test
	private void earphones() {
		System.out.println("earphones search");

	}
	
	@AfterMethod
	private void logout() {
		System.out.println("log out");

	}
	
	@AfterClass
	private void verifyHomePage() {
		System.out.println("Home Page");

	}
	
	@AfterTest
	private void close() {
		System.out.println("close");

	}
	
	@AfterSuite
	private void deleteAllCookies() {
		System.out.println("delete all cookies");

	}
	
	
	
	
	
}
