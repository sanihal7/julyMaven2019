package com.flexonJuly2019.FirstMavenProject;

import org.testng.annotations.Test;

public class TestNGPractiseSanity {

	@Test( groups = {"sanity"})
	public void Test2()
	{
		
		System.out.println("sanity test 1 method");
	}

	@Test( groups = {"sanity"})
	public void test2()
	{
		System.out.println("sanity test 2 method");
	}

}
