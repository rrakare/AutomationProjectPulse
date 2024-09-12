package com.nucleus.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.nuclesu.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy (xpath ="//a[contains(text(),'DASHBOARD')]")
	WebElement Dashboard;
	
	@FindBy (xpath ="//a[contains(text(),'NEW PROPOSAL')]")
	WebElement NewProposal;
	@FindBy (xpath ="//a[contains(text(),'OPEN BANKING STATUS')]")
	WebElement BankingStatus;
	@FindBy (xpath ="//a[contains(text(),'OPEN ACCOUNTING STATUS')]")
	WebElement AccountingStatus;
	@FindBy (xpath ="//a[contains(text(),'PRODUCT SUPPORT')]")
	WebElement ProductSupport;
	@FindBy (xpath ="//a[contains(text(),'QUERIES')]")
	WebElement Queries;
	
	@FindBy (xpath ="//a[contains(text(),'SIC Codes')]")
	WebElement SicCodes;
	@FindBy (xpath ="//a[contains(text(),'LOGOUT')]")
	WebElement Logout;
	@FindBy (xpath ="//a[contains(text(),'Log a Query')]")
	WebElement LogAQuery;
	@FindBy (name="search_name")
	WebElement SearchName;
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnNewProposal() {
		NewProposal.click();
	}
	
}
