package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	
	//Page Locators
	
	private By emailId=By.id("username");
	private By password=By.id("password");
	private By loginButton=By.id("loginBtn");
	private By header=By.xpath("//*[@class='signup-link']");
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	

	public WebElement getEmailId() {
		return getElement(emailId);
	}

	public WebElement getPassword() {
		return getElement(password);
	}

	public WebElement getLoginButton() {
		return getElement(loginButton);
	}

	public WebElement getHeader() {
		return  getElement(header);
	}
	
	public String getLoginPageTitle() {
		return getPageTitle();
	}
	
	public String getLoginPageHeader() {
		return getPageHeader(header);
	}
	
	public HomePage doLogin(String username,String password) {
		getEmailId().sendKeys(username);
		getPassword().sendKeys(password);
		getLoginButton().click();
		return getInstance(HomePage.class);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
