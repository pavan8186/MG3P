package com.saucedemo.POMPack;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePOMClass 

{
	
    WebDriver driver;
    Select s;
	
	@FindBy(xpath="//button[@id='react-burger-menu-btn']")WebElement menubutton;
	@FindBy(xpath="//a[@id='logout_sidebar_link']")WebElement logoutbutton;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")WebElement oneproductaddtocartbut;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")WebElement bagprodtaddtocart ;
	@FindBy(xpath="//button[text()='Add to cart']")List<WebElement> multiproduct ;
	@FindBy(xpath="//span[@class='shopping_cart_badge']")WebElement allprodtaddtocart ;
	@FindBy(xpath="//select[@class='product_sort_container']")WebElement dropdown;
	
	
	public void clickmenu()
	{
		menubutton.click();
	}
	
	public void clicklogout()
	{
		logoutbutton.click();
	}
	
	public void clickaddtocart()
	{
		oneproductaddtocartbut.click();
	}
	
	public void clickalladdtocartbutton()
	{
		for(WebElement i: multiproduct)
			i.click();
		
	}
	
	public String  gettext1()
	{
		String actualproductseleceted = bagprodtaddtocart.getText();
		return actualproductseleceted;
	}
	
	public String  gettext()
	{
		String actualproductseleceted = allprodtaddtocart.getText();
		return actualproductseleceted;
	}
	
	public void clickdropdown()
	{
		dropdown.click();
		s.selectByValue("za");
	}

	
	public HomePOMClass(WebDriver driver)
	{
		
		this.driver = driver ;
		PageFactory.initElements(driver, this);
		s = new Select(dropdown);
	}
	
}
