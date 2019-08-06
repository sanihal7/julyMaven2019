package com.flexonJuly2019.FirstMavenProject;

import org.testng.annotations.Test;

public class TestNGPractiseRegression {

	@Test( groups = {"Regression"})
	public void Test1()
	{
		
		System.out.println("sanity test 1 method");
	}

	@Test( groups = {"Regression"})
	public void test2()
	{
		System.out.println("sanity test 2 method");
	}

}
