package com.HollandAndBarrett.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageHollandAndBarrett {
	
WebDriver driver;
	
	By email = By.name("username");
	By password = By.name("password");
	By login = By.xpath("//button[contains(text(),'Sign In')]");
	
	
	
	public LoginPageHollandAndBarrett(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void typeEmail()
	{
		driver.findElement(email).sendKeys("raghu.astepahead@gmail.com");
	}
	
	public void typePassword()
	{
		driver.findElement(password).sendKeys("raghuBN@123");
	}
	
	public void loginBtn()
	{
		driver.findElement(login).click();
	}

}
