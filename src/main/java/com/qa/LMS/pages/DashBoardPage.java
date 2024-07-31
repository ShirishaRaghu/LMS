package com.qa.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.LMS.utils.ElementUtil;

public class DashBoardPage {

	
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	
	private By categery = By.xpath("//div[@class='menu-category']");
	private By parentMenu = By.xpath("//img[@alt='Development icon']");
	private By subMenuu = By.xpath("//img[@alt='Web Development icon']");
	
	
	
	//constr....
		public DashBoardPage(WebDriver driver) {
			this.driver=driver;
			eleUtil = new ElementUtil(driver);
		}
	
		
		//methods
		public String getDashboardTitle() {
			String title = eleUtil.waitForTitleIs("Dashboard | Rocket LMS", 5);
			System.out.println("Dashboard page title : "+title);
			return title;
		}
		
		public String getDashboardURL() {
			String url = eleUtil.waitForURLContains("org/panel", 5);
			System.out.println("Dashboard page url : "+url);
			return url;
		}
	
	
		public WebDevelopmentPage  navigateToWebDevPage()  {
			eleUtil.doClick(categery);
			eleUtil.handleMenuSubMenu2(parentMenu, subMenuu);
			return new WebDevelopmentPage(driver);
			
		}
	
	
	
}
