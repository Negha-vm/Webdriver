package testngpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragandDrop {

	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://demoqa.com/droppable/");
	}
	
	@Test
	public void test1()
	{
		WebElement src=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dest);
		act.perform();
		String expected="Dropped!";
		String actualtext=dest.getText();
		if(actualtext.equals(expected))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");

		}
		
	}
	
}
