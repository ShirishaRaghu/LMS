package com.qa.LMS.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.LMS.base.BaseTest;

public class WebDevelopmentPageTest extends BaseTest {

	@BeforeClass
	public void webPageSetup() {
		dashboardPage = loginpage.doLogin();
		webPage = dashboardPage.navigateToWebDevPage();
	}

	@Test
	public void doHeaderTest() {

		Assert.assertEquals(webPage.getHeaderTest(), "Web Development");
	}

	@DataProvider
	public Object[][] searchCourses() {
		return new Object[][] { { "python", "Learn Python Programming" },
				{ "angular", "Learn and Understand AngularJS" }, { "linux", "Learn Linux in 5 Days" } };
	}

	@Test(dataProvider = "searchCourses")
	public void doSearchTest(String searchCourse, String courseName) {

		webPage.doSearchCourse(searchCourse);
		Assert.assertEquals(webPage.getCourseName(courseName), courseName);

	}
	
	@Test
	public void goToCourseDesPage() {
		webPage.navigateToCoursePage("python", "Learn Python Programming");
	}
	
}
