package com.storewebkul.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.storewebkul.pages.HomePageStoreWebkul;
import com.storewebkul.pages.LoginPageStoreWebkul;

import co.easycalculation.pages.LoginPageEasyCal;

public class VerifyStoreWebkulLogin {
	
	@Test
	public void validateLogin() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Launch Browsers\\Chrome Browser Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://store.webkul.com");
		
		LoginPageStoreWebkul login = new LoginPageStoreWebkul(driver);
		HomePageStoreWebkul home = new HomePageStoreWebkul(driver);
		Thread.sleep(2000);
		home.clickOnLogin();
		Thread.sleep(2000);
		login.typeEmail();
		login.typePassword();
		login.loginBtn();
		Thread.sleep(3000);
		//driver.quit();
	}

}
