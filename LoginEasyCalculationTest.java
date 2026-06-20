package com.FrameWork.TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.FrameWork.Page.BaseClass;
import com.FrameWork.Page.LoginPage;
import com.Utility.ExcelDataProvider;

public class LoginEasyCalculationTest extends BaseClass {
	@Test
	
	public void loginApp() throws Exception {
		
		ExcelDataProvider excel = new ExcelDataProvider();
		excel.getStringData("LoginHRM", 0, 0);
		
		LoginPage loginHRM = PageFactory.initElements(driver, LoginPage.class);
		loginHRM.login_EasyCal(excel.getStringData("LoginHRM", 0, 0), excel.getStringData("LoginHRM", 0, 0));
		Thread.sleep(10000);
	}

}
