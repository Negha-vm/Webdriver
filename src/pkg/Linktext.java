package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Linktext {

	ChromeDriver driver;
	@Before
	public void setUp(){
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	public void test1()
	{
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(WebElement link:links)
		{
			System.out.println(link.getText()+"___"+link.getAttribute("href"));
		}
	}
}
