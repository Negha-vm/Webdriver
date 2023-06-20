package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffradioscript {
	ChromeDriver driver;
	@Before
	public void setUp(){
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1()
	{
		
		boolean Selected=driver.findElement(By.xpath("//form/div/table[2]/tbody/tr[24]/td[3]/input[@value='m']")).isSelected();
		if(Selected)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
	}
}
