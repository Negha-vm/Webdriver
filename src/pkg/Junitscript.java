package pkg;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitscript {

	ChromeDriver driver;
	@Before
	public void setUp(){
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void test1()
	{
		
		String actualtitle=driver.getTitle();
        System.out.println("actualtitle="+actualtitle);
	}
	@After
	public void testdown()
	{
		driver.quit();
	}
}

