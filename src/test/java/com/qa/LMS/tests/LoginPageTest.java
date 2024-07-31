package com.qa.LMS.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.LMS.base.BaseTest;

public class LoginPageTest extends BaseTest {

	@Test
	public void loginPageTitleTest() {

		String actTitle = loginpage.getPageTitle();
		Assert.assertEquals(actTitle, "Login | Rocket LMS");

	}

	@Test
	public void loginPageURLTest() {

		String actURL = loginpage.getPageURL();
		Assert.assertTrue(actURL.contains("org/login"));

	}
	
	
	
	@Test
	public void loginTest() {
		//loginpage.doLogin(prop.getProperty("username"), prop.getProperty("passowrd"));
		loginpage.doLogin();
	}

}
