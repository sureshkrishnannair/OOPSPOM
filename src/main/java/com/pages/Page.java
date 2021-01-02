package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class Page {
	
	
	WebDriver driver;
	WebDriverWait wait;
	
//Constructor
	public Page(WebDriver driver) {
		
		this.driver=driver;
		this.wait=new WebDriverWait(this.driver,15);
		
	}
	
//Abstrct methods
	
	/*To get the current Page Title*/
	public abstract String getPageTitle();
	
	/*To get the current Page Header*/
	public abstract String getPageHeader(By locator);
	
	/*To get element by passing its locator*/
	public abstract WebElement getElement(By locator);
	
	public abstract void waitForElementPresent(By locator);
	
	public abstract void waitForPageTitlePresent(String title);
	
	
	/*To create runtime Page Object*/
	public <T extends BasePage>T getInstance(Class<T> pageClass){
		
		try {
			return pageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
		
		
	}
	

}
