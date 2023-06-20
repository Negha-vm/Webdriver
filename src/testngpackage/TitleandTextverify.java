package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TitleandTextverify {

	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.google.com/");
	}
	@Test
	public void test1()
	{
		String actualtitle=driver.getTitle();
	    System.out.println("actualtitle="+actualtitle);
	}
	@Test
	public void test2()
	{
	String s=driver.getPageSource();
	if(s.contains("Gmail"))
	{
		  System.out.println("Text is present");
	}
	else
	{
		  System.out.println(" Text is not present");
	}
	}

	@Test
	public void test3()
	{
		System.out.println("Test3");
	}
	@AfterMethod

	public void aftermethod()
	{
		System.out.println("aftermethod");
	}
	@AfterTest
	public void Teardown()
	{
		System.out.println("Teardown");
	}
}
