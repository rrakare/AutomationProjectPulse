package com.nucleus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nuclesu.qa.base.TestBase;

public class NewProposalPage extends TestBase{

	@FindBy (xpath ="//div[contains(text(),'Limited Company')]")
	WebElement CompanyType;
	@FindBy (name="comp_name")
	WebElement SearchCompanyName;
	@FindBy (xpath ="//h3[contains(text(),'JEWEL MANAGEMENT LIMITED')]")
	WebElement CompanyName;
	@FindBy (xpath ="//div[@class='list-result'][1]")
	WebElement PrimaryDirector;
	@FindBy (xpath ="//input[@id='email']")
	WebElement EnterEmail;
	@FindBy (xpath ="//input[@id='phone']")
	WebElement EnterPhone;
	@FindBy (xpath ="//input[@id='mobile']")
	WebElement EnterMobile;
	@FindBy (xpath ="//input[@id='birth_day']")
	WebElement EnterBirthDay;
	@FindBy (xpath ="//input[@id='birth_month']")
	WebElement EnterBirthMonth;
	@FindBy (xpath ="//input[@id='birth_year']")
	WebElement EnterBirthYear;
	@FindBy (xpath ="//input[@id='residential_address']")
	WebElement EnterPostalCode;
	@FindBy (xpath ="//button[contains(text(),'Find Address')][1]")
	WebElement ClickOnFindAddress;
	@FindBy (xpath ="//ul[@id='residential']//li[1]")
	WebElement SelectFirstAddress;
	
	//Enter Manually Address if not search in the postal code box
	@FindBy (xpath ="//span[contains(text(),'Enter address manually')][1]")
	WebElement EnterManuallyAddress;
	@FindBy (xpath ="//input[@id='residential_building_number']")
	WebElement EnterHouseNumber;
	@FindBy (xpath ="//input[@id='residential_building_name']")
	WebElement EnterHouseName;
	@FindBy (xpath ="//input[@id='residential_street']")
	WebElement EnterStreet;
	@FindBy (xpath ="//input[@id='residential_city']")
	WebElement EnterCity;
	@FindBy (xpath ="//input[@id='residential_country']")
	WebElement EnterCountry;
	@FindBy (xpath ="//input[@id='residential_zip']")
	WebElement EnterPostCode;
	
	//Select Property Address 
	@FindBy (xpath ="//label[@id='property-hide']")
	WebElement SelectResidentialPropertyYes;
	@FindBy (xpath ="//label[@id='property-show']")
	WebElement SelectResidentialPropertyNo;
	@FindBy (xpath ="//input[@name='propertyowner']//parent::label//div[contains(text(),'Yes')]")
	WebElement SelectResidentialPropertyUKYes;
	@FindBy (xpath ="//input[@name='propertyowner']//parent::label//div[contains(text(),'No')]")
	WebElement SelectResidentialPropertyUKNo;
	
	//Property Address 
	@FindBy (xpath ="(//button[contains(text(),'Find Address')])[2]")
	WebElement ClickonPropertyFindAddress;
	@FindBy (xpath ="(//span[contains(text(),'Enter address manually')])[2]")
	WebElement EnterPropetyAddressManually;
	
	//Trading Address 
	@FindBy (xpath ="//input[@name='trading_business_same']//parent::label//div[contains(text(),'Yes')]")
	WebElement SelectTradingAddressYes;
	@FindBy (xpath ="//input[@name='trading_business_same']//parent::label//div[contains(text(),'No')]")
	WebElement SelectTradingAddressNo;
	@FindBy (xpath ="//input[@id='trading_address']")
	WebElement EnterPostCodeTrading;
	@FindBy (xpath ="(//button[contains(text(),'Find Address')])[4]")
	WebElement ClickOnTradingFindAddress;
	
	//Enter Manually Trading Address if not search in the postal code box
	@FindBy (xpath ="(//span[contains(text(),'Enter address manually')])[4]")
	WebElement EnterTradingAddressManually;
	@FindBy (xpath ="//input[@id='trading_street']")
	WebElement EnterTradingStreet;
	@FindBy (xpath ="//input[@id='trading_city']")
	WebElement EnterTradingCity;
	@FindBy (xpath ="//input[@id='trading_country']")
	WebElement EnterTradingCountry;
	@FindBy (xpath ="//input[@id='trading_zip']")
	WebElement EnterTradingZip;
	
	@FindBy (xpath ="//button[@id='steponebutton']")
	WebElement NextStepBtn;
	
	
	
	public NewProposalPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void LimitedCompanyClick() {
		CompanyType.click();
	}
	public void SearchCompanyName(String Name) {
		SearchCompanyName.sendKeys(Name);
	}
	public void SelectCompanyName() {
		CompanyName.click();
	}
	public void PrimaryDirector() {
		PrimaryDirector.click();
	}
	public void Email(String Email) {
		EnterEmail.sendKeys(Email);
	}
	public void Phone(String Phone) {
		EnterPhone.sendKeys(Phone);
	}
	public void Mobile(String Mobile) {
		EnterMobile.sendKeys(Mobile);
	}
	public void BirthDay(String BirthDay) {
		EnterBirthDay.sendKeys(BirthDay);
	}
	public void BirthMonth(String BirthMonth) {
		EnterBirthMonth.sendKeys(BirthMonth);
	}
	public void BirthYear(String BirthYear) {
		EnterBirthYear.sendKeys(BirthYear);
	}
	public void PostCode(String PostCode) {
		EnterPostalCode.sendKeys(PostCode);
	}
	public void FindAddressClick() {
		ClickOnFindAddress.click();
	}
	public void SelectAddress() {
		SelectFirstAddress.click();
	}
	public void SelectResidentialPropertyYes() {
		SelectResidentialPropertyYes.click();
	}
	public void SelectResidentialPropertyNo() {
		SelectResidentialPropertyNo.click();
	}
	public void SelectTradingAddress() {
		SelectTradingAddressYes.click();
	}
	public void NextButton() {
		NextStepBtn.click();
	}
}
