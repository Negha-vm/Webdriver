package testngpackage;

import org.testng.annotations.Test;

public class TestngGrouping {

	@Test(groups= {"smoke","sanity"})
	public void test1()
	{
		System.out.println("Test1");
	}
	@Test(groups= {"smoke"})
	public void test2()
	{
		System.out.println("Test2");
	}
	@Test(groups= {"sanity"})
	public void test3()
	{
		System.out.println("Test3");
	}
	@Test(groups= {"smoke"})
	public void test4()
	{
		System.out.println("Test4");
	}
	@Test(groups= {"sanity"})
	public void test5()
	{
		System.out.println("Test5");
	}


}
