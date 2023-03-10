package com.saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

public class TC04Logoutfunctionality extends TestBaseClass

{
	@Test
	
	public void logoutfunctionality()
	{
		HomePOMClass hm = new HomePOMClass(driver);
		
		hm.clickmenu();
		System.out.println("Click on menu button");
		
		
		hm.clicklogout();
		System.out.println("Click on logout button");
		
		String ExpectedURL = "https://www.saucedemo.com/";
		
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(ExpectedURL, ActualURL);
	}

}
