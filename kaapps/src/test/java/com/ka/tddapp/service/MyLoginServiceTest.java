package com.ka.tddapp.service;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyLoginServiceTest {

	private MyLoginService myLoginService;

	@BeforeMethod
	public void setUp() {
		myLoginService = new MyLoginService();
	}

	
	public  int callme(String a){
		int i =0;
		if(a.equalsIgnoreCase("ka")){
			 i= 1;
		}else{
			i=2;
		}
		return i;
		
	}
	@Test(dataProvider = "mtData")
	public void test(String data,int actual) {

		System.out.println("supplied Data: " + data);
		int re = callme(data);
		Assert.assertEquals(re, actual);
	}

	@DataProvider(name = "mtData")
	public Object getDat() {
		return new Object[][] { { "ka" ,1}, { "keyan" ,2} };
	}
}
