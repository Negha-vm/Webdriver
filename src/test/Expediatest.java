package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Expediapage;

public class Expediatest {
	WebDriver driver;
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.expedia.com");
	}

	@Test
	public void fbtest()
	{
		Expediapage ob=new Expediapage(driver);
		ob.setvalues();
		ob.click();
	}
}
