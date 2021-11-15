package com.Bluemark.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FocalLoginTest {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","C:\\Users\\ADITYA MISHRA\\eclipse-workspace\\geckodriver-v0.29.1-win64\\geckodriver.exe");
        
		WebDriver driver = new FirefoxDriver();    
		FocalLoginTest test = new FocalLoginTest();
		
		driver.get("https://stgv2.focal.team/login");
		//test.setUserName();

	}

}
