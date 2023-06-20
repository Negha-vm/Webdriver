package pkg;

import org.openqa.selenium.chrome.ChromeDriver;


public class Firstscript {

	public static void main(String[] args) {
	
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.get("https://www.youtube.com/");

        
       
      driver.quit();
	}

}
