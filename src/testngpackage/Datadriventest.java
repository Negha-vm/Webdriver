package testngpackage;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {


	ChromeDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.facebook.com");
	}
	@Test
	public void test() throws Exception
	{
		FileInputStream f=new FileInputStream("C:\\Users\\Negha\\Desktop\\LuminarJava\\Book2.xlsx");
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet sh=wb.getSheet("Sheet1"); //sheet details
	    int row=sh.getLastRowNum();  //row details
	    for(int i=1;i<=row;i++)
	    {
	    	 String username= sh.getRow(i).getCell(0).getStringCellValue();
	    	 //String password= sh.getRow(i).getCell(1).getStringCellValue();
	    	 int pwd=(int)sh.getRow(i).getCell(1).getNumericCellValue();
	    	 String password=String.valueOf(pwd);

            System.out.println("username="+username+"\n"+"password="+password);
            driver.findElement(By.name("email")).clear();
            driver.findElement(By.name("email")).sendKeys(username);
            driver.findElement(By.name("pass")).clear();
     		driver.findElement(By.name("pass")).sendKeys(password);
     		driver.findElement(By.name("login")).click();

	    }
	
	}


}
