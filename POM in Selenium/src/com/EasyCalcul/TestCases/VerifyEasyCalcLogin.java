package com.EasyCalcul.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import co.easycalculation.pages.LoginPageEasyCal;

public class VerifyEasyCalcLogin {
	
	@Test
	public void validateLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Launch Browsers\\Chrome Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		
		LoginPageEasyCal login = new LoginPageEasyCal(driver);
		login.typeEmail();
		login.typePassword();
		login.loginBtn();
		Thread.sleep(3000);
		//driver.quit();
	}

}
