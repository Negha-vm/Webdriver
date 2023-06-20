package test;

import org.testng.annotations.Test;

import page.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass {
	

	@Test
	public void fbtest()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.createpage();
		ob.button();
	}

}
