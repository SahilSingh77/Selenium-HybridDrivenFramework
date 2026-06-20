package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	
	public static WebDriver BrowserOptions(WebDriver driver, String browserName, String Appurl) {
		if(browserName.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else {
			System.out.println("Browser Does Not Support...");
		}
		
		driver.manage().window().maximize();
		driver.get(Appurl);
		return driver;
	}
	public static void quitBrowser(WebDriver driver) {
		driver.quit();
	}
}