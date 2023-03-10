package com.saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

public class TC02AddtoCartproductfunctionality extends TestBaseClass

{
	
	@Test
	
	public void addtocartproductfunctionality()
	{
		HomePOMClass hm = new HomePOMClass(driver);
		
		hm.clickdropdown();
		System.out.println("New dropdown option selected");
		
		hm.clickaddtocart();
		System.out.println("One product is selected");
		
		System.out.println("Apply verification");
		
		String Expectedtext = "1";
		
		String Actualtext = hm.gettext1();
		
		Assert.assertEquals(Actualtext, Expectedtext);
		
		
	}

}
