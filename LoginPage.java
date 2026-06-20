package com.FrameWork.Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
    //Create Constructor
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		
	}
	@FindBy(id= "log_email")
	WebElement email;
	
	@FindBy(name = "log_password")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[1]/div/div[2]/form/div[4]/input[1]")
	WebElement login_btn;
	
	//Create Method
	public void login_EasyCal(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		login_btn.click();
	}

}
