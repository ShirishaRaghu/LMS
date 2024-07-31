package com.qa.LMS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.LMS.utils.ElementUtil;

public class WebDevelopmentPage {

	private WebDriver driver;
	private ElementUtil eleUtil;

	// private loctors
	private By courseHeader = By.linkText("h3");
	private By search = By.xpath("//input[contains(@placeholder,'organizations...')]");
	private By searchBtn = By.xpath("//button[text()='Search']");
	private By header = By.xpath("//h1[text()='Web Development']");

	// constr....
	public WebDevelopmentPage(WebDriver driver) {
		this.driver = driver;
		eleUtil = new ElementUtil(driver);
	}

	// methods

	public String getHeaderTest() {
		String headerText = eleUtil.doGetElementText(header);
		System.out.println("Header test :"+headerText);
		return headerText;
	}

	public void doSearchCourse(String searchCourse) {
		System.out.println("searching for " + searchCourse);
		eleUtil.doSendkeys(search, searchCourse);
		eleUtil.doClick(searchBtn);

	}

	public String getCourseName(String courseName) {
		String courseHeader = eleUtil.waitForElementVisible(By.linkText(courseName), 5).getText();
		System.out.println("Course Name "+courseHeader);
		return courseHeader;

	}
	
	public CourseDescriptionPage navigateToCoursePage(String searchCourse, String courseName) {
		doSearchCourse(searchCourse);
		eleUtil.waitForElementVisible(By.linkText(courseName), 5).click();
		return new CourseDescriptionPage(driver);
		
	}

}
