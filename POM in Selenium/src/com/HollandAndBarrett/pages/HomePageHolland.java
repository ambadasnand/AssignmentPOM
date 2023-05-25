package com.HollandAndBarrett.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePageHolland {
	
WebDriver driver;
	
	By clickLogin = By.xpath("//*[@id=\"data-cs-mask-account\"]/button");
	
    public HomePageHolland(WebDriver driver) {
		
		  this.driver = driver;
	}
    
    public void clickOnLogin()
	{
		driver.findElement(clickLogin).click();
	}

}


