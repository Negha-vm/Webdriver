package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverify {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		String s=driver.getPageSource();
		if(s.contains("Gmail"))
		{
			  System.out.println("Text is present");
		}
		else
		{
			  System.out.println(" Text is not present");
		}
	}

}
