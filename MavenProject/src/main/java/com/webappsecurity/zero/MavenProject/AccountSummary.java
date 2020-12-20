package com.webappsecurity.zero.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummary {
	
	@FindBy(linkText = "Transfer Funds")
	private WebElement tFund;
	
	public AccountSummary(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickTranFunds() {
		tFund.click();
	}
	
	public boolean verifyText() {
		boolean isTransFundsVisible = tFund.isDisplayed();
		return isTransFundsVisible;
	}

}
