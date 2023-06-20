package pkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertscript {
	ChromeDriver driver;
	@Before
	public void setUp(){
		driver =new ChromeDriver();
		driver.get("C:/Users/Negha/Desktop/Html/Alert.html");
	}
	@Test
	public void test1()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String text=a.getText();
		if(text.equals("Hello...Iam an alert box!!"))
		{
		System.out.println("Same");
		}
        else 
        {
        	System.out.println("Different");
		}
		a.accept();
		
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("negha");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("michael");
		driver.findElement(By.xpath("/html/body/input[4]")).click();
	}
}
	
		


