package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fbscript {
	ChromeDriver driver;
	@Before
	public void setUp(){
	    driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{
		driver.findElement(By.id("email")).sendKeys("abc@email.com");
		driver.findElement(By.name("pass")).sendKeys("abc");
		driver.findElement(By.name("login")).click();
		
		String actualtitle=driver.getTitle();
        System.out.println(actualtitle);
	}
}

