package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Titlescript {
	
	public static void main(String[] args) {

	ChromeDriver driver =new ChromeDriver();
	driver.get("https://www.google.com/");
	String actualtitle=driver.getTitle();
    System.out.println("actualtitle="+actualtitle);

	}

}

	 