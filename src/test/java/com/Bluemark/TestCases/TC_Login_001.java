package com.Bluemark.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Bluemark.pageObjects.LoginPage;

public class TC_Login_001 extends BaseClass


{
    @Test
	public void loginTest()
	{
		driver.get(baseUrl);
		
		//logger.info("url opened");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userName);
		lp.setPwd(password);
		lp.clickSubmit(baseUrl);
		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true); //testNG feature
		}
		else
		{
			Assert.assertTrue(false);
		}
			
	}
	
	
	
}
