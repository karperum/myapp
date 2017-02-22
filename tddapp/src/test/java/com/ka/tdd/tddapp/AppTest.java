package com.ka.tdd.tddapp;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest

{
	
	App app;
	
	@Before
	public void setUp(){
		app = new App();
	}

	@Test
	public void testApp() {
		final String name ="Karthik";
		Assert.assertNotNull(app.callMe(name));
	}
}
