package com.qa.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.LMS.utils.ElementUtil;

public class LoginPage {

	private WebDriver driver;
	private ElementUtil eleUtil;
	
	//private locators
	
	private By emailLocator = By.id("email");
	private By passwordlocator = By.id("password");
	private By student = By.xpath("//button[text()='Student']");
	private By login = By.xpath("//button[text()='Login']");
	
	//const
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		eleUtil = new ElementUtil(driver);
	}
	
	
	
	
	//page methods
	
	
	public String getPageTitle() {
		String title = eleUtil.waitForTitleIs("Login | Rocket LMS", 5);
		System.out.println(title);
		return title;
		
	}
	
	public String getPageURL() {
		String url = eleUtil.waitForURLContains("org/login", 5);
		System.out.println(url);
		return url;
	}
	
	
	
	
	
	public DashBoardPage doLogin() {
//		eleUtil.doSendkeys(emailLocator, email,5);
//		eleUtil.doSendkeys(passwordlocator, password,5);
		eleUtil.doClick(student);
		eleUtil.doClick(login);

		return new DashBoardPage(driver);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
