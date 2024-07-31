package com.qa.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.LMS.utils.ElementUtil;

public class HomePage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	//private locators
	private By storeLink = By.xpath("//a[@href='/products']");
	
	
	
	
	
	//constr....
		public HomePage(WebDriver driver) {
			this.driver=driver;
			eleUtil = new ElementUtil(driver);
		}
	
		//methods
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
}
