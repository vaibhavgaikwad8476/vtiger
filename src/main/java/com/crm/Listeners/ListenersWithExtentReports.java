package com.crm.Listeners;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.crm.BaseClass.DwsBaseClass;

public class ListenersWithExtentReports extends DwsBaseClass implements ITestListener {
	public static ExtentSparkReporter spark;
	public static ExtentReports report;
	public static ExtentTest test;
	@Override
	public void onTestStart(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test=report.createTest(name);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, "onTestSuccess");
		test.log(Status.PASS, name+" is Success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, "onTestFailure");
		test.log(Status.FAIL, name+" is Failled");
		TakesScreenshot ts=(TakesScreenshot) driver;
		String from = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(from);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String name=result.getMethod().getMethodName();
		test.log(Status.INFO, "onTestSkipped");
		test.log(Status.SKIP, name+"is Skipped");
	}

	@Override
	public void onStart(ITestContext context) {
		spark=new ExtentSparkReporter(".\\src\\main\\resources\\TestCase.html");
		spark.config().setDocumentTitle("honda kawasaki Royal Enfield");
		spark.config().setReportName("Manikandan");
		spark.config().setTheme(Theme.DARK);
		
		//Create Extent Report
		report=new ExtentReports();
		report.setSystemInfo("OS", "Linux");
		report.setSystemInfo("Browser", "Chrome");
		
		//Attach Report to spark
		report.attachReporter(spark);
		
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
}
