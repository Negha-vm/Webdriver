package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
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

@Test(priority=2,invocationCount=2)
public void test1()
{
	System.out.println("Test1");
}
@Test(priority=3)
public void test2()
{
	System.out.println("Test2");
}
@Test(priority=1,enabled=false)
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
