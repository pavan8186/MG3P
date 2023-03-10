package com.saucedemo.TestPack;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;
import com.saucedemo.UtilityPack.UtilityClass;

public class TC01LoginFunctionality extends TestBaseClass

{
	@Test
	
	public void loginfunctionality() throws IOException
	{
			
		System.out.println("Apply Verification");
		
		String ExpectedTitle = "Swag Labs";
		
		String ActualTitle = driver.getTitle();
		
		Assert.assertEquals(ActualTitle, ExpectedTitle);
	}
	
    @Test(priority=1,enabled=false)
	
	public void addtocartproductfunctionality()
	{
		HomePOMClass hm = new HomePOMClass(driver);
		
		hm.clickaddtocart();
		System.out.println("One product is selected");
		
		System.out.println("Apply verification");
		
		String Expectedtext = "1";
		
		String Actualtext = hm.gettext1();
		
		Assert.assertEquals(Actualtext, Expectedtext);

}
    
}
