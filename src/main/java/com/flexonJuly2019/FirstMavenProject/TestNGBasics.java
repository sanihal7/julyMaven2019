package com.flexonJuly2019.FirstMavenProject;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {



/*
 * maven is used for dependency management ---- jar files like selenium, testNG, reporting jar
 * 
 *  we created maven project ---- manage dependencies and it is a build tool
 *  Maven created a project structure for us - ex package structure
 *  we imported TESTING dependency
 *  TESTING is a testing library
 *  a bunch of assertion and annotation
 */


	@BeforeTest
	public void beforeTest()
	{
			System.out.println("i am in Beforetest method ");
	}
	
	@BeforeClass
	
	public void beforeClass()

	{
		System.out.println("i am in BeforeClass method ");
	}
	
		
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("i am in Beforetest method");
	}
	
	
	
	
	
	
@Test
public void test1()
{
	
	System.out.println("test 1 method");
}

@Test
public void test2()
{
	System.out.println("test 2 method");
}

@Test
public void test3()
{
	System.out.println("test 3 method");
}

@AfterMethod
public void afterMethod()
{
	System.out.println("i am in aftertest method");
}

@AfterClass
public void afterClass()
{
	System.out.println("i am in afterclass method");
}

@AfterTest
public void afterTest()
{
	System.out.println("i am in after test method");
}
}