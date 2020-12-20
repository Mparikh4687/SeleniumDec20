package com.webappsecurity.zero.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirm {
	
	@FindBy(css = ".alert")
	private WebElement confText;
	
	@FindBy(css = "li.dropdown:nth-child(3) > a:nth-child(1)")
	private WebElement usName;
	
	@FindBy(id = "logout_link")
	private WebElement logout;
	
	public TransferFundsConfirm(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String confirmTransferFunds() {
		String getErrorText = confText.getText();
		return getErrorText;
	}
	
	public void logout() {
		usName.click();
		logout.click();
	}

}
