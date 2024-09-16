package com.nucleus.qa.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nuclesu.qa.base.TestBase;
import com.nucleus.qa.pages.HomePage;
import com.nucleus.qa.pages.LoginPage;
import com.nucleus.qa.pages.NewProposalPage;

public class NewProposalTestCase extends TestBase {

	LoginPage loginPage;
	HomePage homePage;
	NewProposalPage newProposalPage;
	
	public NewProposalTestCase() {
		super();
	}
	
	@BeforeMethod
	public void SetUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = new HomePage();
		newProposalPage = new NewProposalPage();
		
	}
	@Test (priority = 0)
	public void CreateNewProposal() {
		String Username = "raja.singareddy@nucleus-cf.co.uk";
		String Password = "qatest@123";
		Url();
		loginPage.Login(Username, Password);
		homePage.ClickOnNewProposal();
	}
	 
}
