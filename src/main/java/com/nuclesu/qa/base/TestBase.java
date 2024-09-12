package com.nuclesu.qa.base;

import java.time.Duration;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestBase {

	public static WebDriver driver;
	
	public static void initialization() {
		driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}
	public static void Url() {
		driver.navigate().to("https://myfunding.ncf-sandbox.com/login/mynucleus");
	}
}
