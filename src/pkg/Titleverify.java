package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverify {

	public static void main(String[] args) {
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		String actualtitle=driver.getTitle();
	    System.out.println("actualtitle="+actualtitle);
	    String expected="Google1";
	    if(actualtitle.equalsIgnoreCase(expected))
	    {
	    	 System.out.println("same string");
	    }
	    else
	    {
	    	System.out.println("Different string");
	    }

	}

}
