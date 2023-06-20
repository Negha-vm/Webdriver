package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class LoginValidation {

	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://facebook.com");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.name("email")).sendKeys("abc@email.com");
		driver.findElement(By.name("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
		String actualurl=driver.getCurrentUrl();
		String exp="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg1OTc3MzI0LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
		if(actualurl.equals(exp))
		{
			System.out.println("login success");
		}

		else
		{
			System.out.println("login fail");
		}
		
	}
}
