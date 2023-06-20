package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Expediapage {
	WebDriver driver;
	By flight=By.xpath("//*[@id='wizardMainRegionV2']/div/div/div/div/ul/li[2]/a/span");
	By leaving=By.xpath("//div[@class='uitk-layout-grid-item uitk-layout-grid-item-has-column-start uitk-layout-grid-item-has-column-start-by-medium']/div/div[1]/div/div/button");
	By fromdate=By.xpath("//div[@class='uitk-layout-flex-item uitk-layout-flex-item-max-width-half_width uitk-layout-flex-item-flex-basis-zero uitk-layout-flex-item-flex-grow-1 uitk-date-field-wrapper']/div/label");
	By date1=By.xpath("//div[@class='uitk-date-picker-month']/table/tbody/tr[5]/td[2]/button");
	By traveller=By.xpath("//div[@class='uitk-menu uitk-menu-mounted']/button");
	By adult=By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-item uitk-step-input-controls']/button[2]/span");
	By child=By.xpath("//div[@class='uitk-layout-flex uitk-layout-flex-align-items-center uitk-layout-flex-justify-content-space-between uitk-step-input childStepInput uitk-step-input-mounted']/div/button[2]/span");
	By select=By.xpath("//div[@class='uitk-layout-grid uitk-layout-grid-has-auto-columns uitk-layout-grid-has-columns uitk-layout-grid-has-space uitk-layout-grid-display-grid uitk-spacing uitk-spacing-padding-blockstart-one uitk-spacing-padding-blockend-three']/div/select");
	By age=By.xpath("//div[@class='uitk-layout-grid uitk-layout-grid-has-auto-columns uitk-layout-grid-has-columns uitk-layout-grid-has-space uitk-layout-grid-display-grid uitk-spacing uitk-spacing-padding-blockstart-one uitk-spacing-padding-blockend-three']/div/select/option[3]");
	By economy=By.xpath("//*[@id='preferred-class-input-trigger']");
	By first=By.xpath("//*[@id=\'preferred-class-input\']/div/div/a[4]/span");
	By search=By.xpath("//*[@id=\"search_button\"]");
	public Expediapage(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void setvalues()
	{
		driver.findElement(leaving).sendKeys("Ahmedabad",Keys.ENTER);
		driver.findElement(adult).sendKeys("Bangalore",Keys.ENTER);
		driver.findElement(date1).sendKeys("16-06-2023",Keys.ENTER);

	}
	public void click()
	{
		driver.findElement(flight).click();
		driver.findElement(leaving).click();
		driver.findElement(fromdate).click();
		driver.findElement(date1).click();
		driver.findElement(traveller).click();
        driver.findElement(adult).click();
        driver.findElement(child).click();
        driver.findElement(select).click();
        driver.findElement(age).click();
		driver.findElement(economy).click();
		driver.findElement(first).click();
		driver.findElement(search).click();

		
	}
	


}
