package com.storewebkul.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageStoreWebkul {
	
	WebDriver driver;
	
     By email = By.id("wk-login-email");
     By password = By.id("wk-login-pass");
     By login = By.xpath("//*[@id=\"send2\"]/span/span");
	
    public LoginPageStoreWebkul(WebDriver driver) {
		
		  this.driver = driver;
	}
    
    public void typeEmail()
	{
		driver.findElement(email).sendKeys("9740673180");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("raghubn@123");
	}
	
	public void loginBtn()
	{
		driver.findElement(login).click();
	}

}
