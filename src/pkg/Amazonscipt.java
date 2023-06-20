package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonscipt {

	ChromeDriver driver;
	@Before
	public void setUp(){
		driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	@Test
	public void test1()
	{
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[4]")).click();
		driver.findElement(By.xpath("//div[@id='nav-tools']/a[2]")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a[8]")).click();
		driver.findElement(By.id("nav-hamburger-menu")).click();	
	}
	
}
