package com.saucedemo.POMPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 

{
	
	WebDriver driver ;
	Actions act;
	
	@FindBy(xpath="//input[@id='user-name']")WebElement username ;
	@FindBy(xpath="(//input[@class='input_error form_input'])[2]")WebElement password ;
	@FindBy(xpath="//input[@class='submit-button btn_action']")WebElement clickloginbutton ;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
//	public void clickloginbutton()
//	{
//		clickloginbutton.click();;
//	}
	
	public void mouseaction() 
	{
		act.click(clickloginbutton).perform();
	}
	
	
	public LoginPOMClass(WebDriver driver)
	{
		act = new Actions(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	

}
