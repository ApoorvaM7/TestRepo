package com.Bluemark.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	
	@FindBy(name="uid")
	WebElement txt;
	
	@FindBy(name="password")
	WebElement pwd;
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	
	public void setUserName(String uname)
	{
		txt.sendKeys(uname);
	}
	
	public void setPwd(String paswd)
	{
		pwd.sendKeys(paswd);
	}
	
	public void clickSubmit(String sub)
	{
		btnLogin.click();
	}
	

}
