package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends Page {

	public BasePage(WebDriver driver) {
		super(driver);
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageHeader(By locator) {
		return getElment(locator).getText();
	}

	@Override
	public WebElement getElment(By locator) {
		WebElement element = null;
		try {
			element = driver.findElement(locator);
			return element;

		} catch (Exception e) {
			System.out.println("element is not created" + locator.toString());
			e.printStackTrace();
		}
		return element;
	}

	@Override
	public void waitForElementPresent(By locator) {
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		} catch (Exception e) {
			System.out.println("Error occured while waiting for the Element" + locator.toString());
		}

	}

	@Override
	public void waitForPageTitlePresent(String title) {

		try {
			wait.until(ExpectedConditions.titleContains(title));
		} catch (Exception e) {
			System.out.println("Error occured while waiting for the Title" + title);
		}

	}

}
