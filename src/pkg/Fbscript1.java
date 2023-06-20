package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbscript1 {

	ChromeDriver driver;
	@Before
	public void setUp(){
	    driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("abc@email.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("abc");
		driver.findElement(By.xpath("//button[@name='login']")).click();

	}
}
	
