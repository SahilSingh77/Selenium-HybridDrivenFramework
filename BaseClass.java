package com.FrameWork.Page;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.Utility.BrowserFactory;
import com.Utility.ConfigDataProvider;
import com.Utility.ExcelDataProvider;
import com.Utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public com.Utility.ExcelDataProvider excel;
	public ConfigDataProvider config;
	
	@BeforeSuite
	public void Setup() {
		excel = new ExcelDataProvider();
		config = new ConfigDataProvider();
	}
	
	@BeforeClass
	public void BrowserTest() {
		driver = BrowserFactory.BrowserOptions(driver, config.getBrowser(), config.getAppURL());
		
	}
	@AfterClass
	public void TearDown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	@AfterMethod
	public void tearDownMethod(ITestResult result) {
		if(result.getStatus() == ITestResult.FAILURE) {
			Helper.capturedScreenShot(driver);
			
		}
	}

}
