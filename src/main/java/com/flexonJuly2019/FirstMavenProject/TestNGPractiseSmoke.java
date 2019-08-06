package com.flexonJuly2019.FirstMavenProject;

import org.testng.annotations.Test;

public class TestNGPractiseSmoke {
	
	
	@Test( groups = {"smoke"})
	public void Test1()
	{
		
		System.out.println("sanity test 1 method");
	}

	@Test( groups = {"smoke"})
	public void test2()
	{
		System.out.println("sanity test 2 method");
	}


}
