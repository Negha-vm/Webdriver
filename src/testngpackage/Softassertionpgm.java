package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Softassertionpgm {
	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test()
	{
	String actualtitle=driver.getTitle();
	String exp="Facebook";

	if(exp.equals(actualtitle))
	{
	System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	System.out.println("comparison");
	}
			
}
