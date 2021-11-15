package com.Bluemark.TestCases;

//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.Bluemark.utilities.*;

public class BaseClass {
	
	ReadConfig read = new ReadConfig();
	
	public String baseUrl = read.getApplicationUrl();
	public String userName = read.getUserName();
	public String password = read.getPassword();
	
	public static WebDriver driver;
	
	
	//public static Logger logger;
	
	@Parameters("browsers")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("firefox"))
		{
		System.setProperty("webdriver.gecko.driver",read.getFireFoxPath());
		driver = new FirefoxDriver();
		
		}
		else if(br.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new FirefoxDriver();
			
		}
		 //logger=logger.getLogger("Apoorva_Mv1");
		//PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AfterClass
	public void End()
	{
		driver.quit();
	}

}
