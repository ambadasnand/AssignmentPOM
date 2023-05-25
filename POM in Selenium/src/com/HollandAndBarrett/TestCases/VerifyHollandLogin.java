package com.HollandAndBarrett.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.HollandAndBarrett.pages.HomePageHolland;
import com.HollandAndBarrett.pages.LoginPageHollandAndBarrett;

//import co.easycalculation.pages.LoginPageEasyCal;

public class VerifyHollandLogin {
	
	@Test
	public void validateLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Launch Browsers\\Chrome Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hollandandbarrett.com");
		
		LoginPageHollandAndBarrett login = new LoginPageHollandAndBarrett(driver);
		HomePageHolland home = new HomePageHolland(driver);
		Thread.sleep(3000);
		home.clickOnLogin();
		Thread.sleep(3000);
		login.typeEmail();
		login.typePassword();
		login.loginBtn();
		Thread.sleep(3000);
		//driver.quit();
	}

}
