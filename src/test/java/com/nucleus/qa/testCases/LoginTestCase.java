package com.nucleus.qa.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nuclesu.qa.base.TestBase;
import com.nucleus.qa.pages.HomePage;
import com.nucleus.qa.pages.LoginPage;
import com.nucleus.qa.pages.NewProposalPage;

public class LoginTestCase extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	NewProposalPage newProposalPage;
	
	
	public LoginTestCase () {
		super();
	}
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		newProposalPage = new NewProposalPage();
		
	}
	@Test
	public void NCFPortalLoginTC() {
		String Username = "raja.singareddy@nucleus-cf.co.uk";
		String Password = "qatest@123";
		Url();
		loginPage.Login(Username, Password);
		driver.close();
	}
}
