package com.flexonJuly2019.FirstMavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	/*
	 * assertions are used to perform validation for ur test cases and output test cases pass or fail
	 * allows reading data from data source if needed ---- @DataProvider
	 * TestNG.XML  ---- configure groups(group the test cases), Disable and enable test cases
	 * 
	 * 
	 * 
	 */
	
	
	@Test(enabled = false)
	public void test1() 
	{
		Assert.assertTrue(true);
	}
	
	@Test(priority = 2)
	public void test2() 
	{
		Assert.assertTrue(false,"not matching the expected condition");
	}
	
	@Test(priority = 3)
	public void test3() 
	{
		Assert.assertEquals("Flexon","Flexon");
	
}
	
	
	@Test(priority = 1)
	public void test4() 
	{
		Assert.assertTrue(false);
	}
	
}