package testngpackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Hardassertionpgm {

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
		Assert.assertEquals(exp,actualtitle);
		System.out.println("comparison");

		
		
	}
	
}
