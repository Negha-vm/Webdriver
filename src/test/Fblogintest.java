package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;
import utilities.Excelutils;

public class Fblogintest extends Baseclass {
//	WebDriver driver;
//	@BeforeTest
//	public void setup()
//	{
//		driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//	}

	@Test
	public void fbtest()
	{
		Fbloginpage ob=new Fbloginpage(driver);
		ob.setvalues("abc@gmail.com", "abc");
		ob.login();
	}
//	@Test
//	public void fbtest1()
//	{
//		Fbloginpage p1=new Fbloginpage(driver);
//		String x1="E:\\TestData\\Book1.xlsx";
//		String sheet="Sheet1";
//		int rowCount=Excelutils.getRowcount(x1, sheet);
//		for(int i=1;i<=rowCount;i++)
//		{
//			String username=Excelutils.getCellvalue(x1, sheet, i, 0);
//			System.out.println("username"+username);
//			String pwd=Excelutils.getCellvalue(x1, sheet, i, 1);
//			System.out.println("password"+pwd);
//			p1.setvalues(username, pwd);
//			p1.login();
//			String expectedurl="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNjg2NTYyMjk2LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D";
//			String actualurl=driver.getCurrentUrl();
//			if(actualurl.equals(expectedurl))
//			{
//				System.out.println("pass");
//			}
//			else
//			{
//				System.out.println("fail");
//
//			}
//					
//		}
	//}
}
