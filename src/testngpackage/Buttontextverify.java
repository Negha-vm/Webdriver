package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Buttontextverify {

	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1()
	{
		WebElement text=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));
		if(text.getAttribute("value").matches("Check availability"))
		{
        	 System.out.println("Text is same");
        }
        else
        {
        	System.out.println("Text is Different");
        }   
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
