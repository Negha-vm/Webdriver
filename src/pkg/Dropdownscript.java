package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownscript {
	ChromeDriver driver;
	@Before
	public void setUp(){
		driver =new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test1()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select days=new Select(day);
		days.selectByValue("24");
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select months=new Select(month);
		months.selectByValue("09");
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select years=new Select(year);
		years.selectByValue("1997");
		
		List<WebElement> d=days.getOptions();
		System.out.println("count of days:"+d.size());
		
		List<WebElement> m=months.getOptions();
		System.out.println("count of months:"+m.size());
		
		List<WebElement> y=years.getOptions();
		System.out.println("count of years:"+y.size());
		
	}
}
