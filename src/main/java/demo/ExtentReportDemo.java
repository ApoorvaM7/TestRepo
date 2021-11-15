package demo;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportDemo {

	public static void main(String[] args) {


		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
		
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		
		ExtentTest test = extent.createTest("My first Test","Sample Description");
		
		test.log(Status.INFO, "starting test case");
        
		System.out.println("hello extent report");
		
		test.pass("printed the message");
		
		extent.flush();
	}

}
