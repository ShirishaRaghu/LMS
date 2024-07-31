package com.qa.LMS.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qa.LMS.factory.DriverFactory;
import com.qa.LMS.pages.CourseDescriptionPage;
import com.qa.LMS.pages.DashBoardPage;
import com.qa.LMS.pages.HomePage;
import com.qa.LMS.pages.LoginPage;
import com.qa.LMS.pages.WebDevelopmentPage;


public class BaseTest {
	
	WebDriver driver;
	protected Properties prop;
	DriverFactory df;
	
	protected LoginPage loginpage;
	protected HomePage homePage;
	protected WebDevelopmentPage webPage;
	protected DashBoardPage dashboardPage;
	protected CourseDescriptionPage courseDescPage;
	
	@Parameters({"browser"})
	@BeforeTest
	public void setup(String browserName) {
		df = new DriverFactory();
		prop = df.initProp();
		
		if(browserName!=null) {
			prop.setProperty("browser", browserName);//on the fly it will be updating the value
		}//setProperty will set the value
		
		driver = df.initDriver(prop);//call by refernece (prop)
		loginpage = new LoginPage(driver);
	}

	
//	@AfterTest
//	public void teardown() {
//		driver.quit();
//	}

	
	
	
	
	
	
	
	
	
}
