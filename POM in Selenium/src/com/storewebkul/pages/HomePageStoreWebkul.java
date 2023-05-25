package com.storewebkul.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageStoreWebkul {
	
WebDriver driver;
	
	By clickLoginLink = By.linkText("Login");
	
    public HomePageStoreWebkul(WebDriver driver) {
		
		  this.driver = driver;
	}
    
    public void clickOnLogin()
	{
		driver.findElement(clickLoginLink).click();
	}

}
