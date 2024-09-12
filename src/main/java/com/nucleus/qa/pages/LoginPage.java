package com.nucleus.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nuclesu.qa.base.TestBase;

public class LoginPage extends TestBase{

	//Locaters
	
	@FindBy(xpath = "//h2[text()= 'Sign In']")
	WebElement loginText;

	@FindBy (name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy (xpath= "//button[@type='submit']")
	WebElement SignInBtn;
	
	
	
	//Initializing of the page
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String Username , String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
		SignInBtn.click();
	}
	
	
}
