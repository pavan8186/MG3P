package com.saucedemo.TestPack;


import org.testng.annotations.Test;

import com.saucedemo.POMPack.HomePOMClass;

public class TC05DropDownfunctionality extends TestBaseClass

{
	
	@Test
	
	public void dropdownselect()
	{
		HomePOMClass hm = new HomePOMClass(driver);
		
		hm.clickdropdown();
		System.out.println("Select the option");
		
	}

}
