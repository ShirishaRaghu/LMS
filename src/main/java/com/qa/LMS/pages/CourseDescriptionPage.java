package com.qa.LMS.pages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.LMS.utils.ElementUtil;

public class CourseDescriptionPage {

	
	
	private WebDriver driver;
	private ElementUtil eleUtil;
	
	private Map<String, String> courseMap = new HashMap<String, String>();
	
	private By courseTitle = By.cssSelector("h1.course-title");
	private By courseMetaKeyValues = By.xpath("//div[@class='mt-30']//div[@class='d-flex align-items-center']");
	private By courseMetavalues = By.xpath("//div[@class='mt-30']//span[@class='font-14']");
	
	// constr....
		public CourseDescriptionPage(WebDriver driver) {
			this.driver = driver;
			eleUtil = new ElementUtil(driver);
		}
	
	
	public String getCourseTitle() {
		String title = eleUtil.waitForElementVisible(courseTitle, 5).getText();
		System.out.println("Corse title is "+title);
		return title;
	}
	
	
	public void getCourseSpecifications() {
		List<WebElement> metaKeyValues = eleUtil.getElements(courseMetaKeyValues);
		for(WebElement e : metaKeyValues) {
			String metaKey = e.getText();
		}
		
	}
	
	
	
	
}
