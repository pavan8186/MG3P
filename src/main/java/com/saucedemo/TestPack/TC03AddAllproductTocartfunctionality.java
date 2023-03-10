package com.saucedemo.TestPack;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;
public class TC03AddAllproductTocartfunctionality extends TestBaseClass

{
	@Test 
	
	public void allproductaddtocart()
	{
		HomePOMClass hm = new HomePOMClass(driver);
		
		hm.clickalladdtocartbutton();
		System.out.println("All product is selected");
		
		System.out.println("Apply verification");
		
		String Expectedresult = "6";
		
		String Actualresult = hm.gettext();
		
		Assert.assertEquals(Actualresult, Expectedresult);
		
	}
	

}
