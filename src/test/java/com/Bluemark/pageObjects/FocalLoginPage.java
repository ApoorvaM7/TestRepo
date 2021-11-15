package com.Bluemark.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FocalLoginPage {
	
	WebDriver driver;
	
	By username = By.xpath("/html/body/main/div/div/div/div[2]/form/div[1]/div/input");
	By pwd = By.xpath("/html/body/main/div/div/div/div[2]/form/div[2]/div/input");
	By loginBtn = By.xpath("/html/body/main/div/div/div/div[2]/form/div[4]/button/span[1]");
	
	FocalLoginPage(WebDriver d)
	{
		driver = d;
	}
	
	public void setUserName()
	{
		driver.findElement(username).sendKeys();
	}
	
	public void setPwd()
	{
		driver.findElement(pwd).sendKeys();
	}
	
	public void clickLoginBtn()
	{
		driver.findElement(loginBtn).click();
	}

}
