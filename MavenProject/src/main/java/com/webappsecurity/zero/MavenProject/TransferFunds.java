package com.webappsecurity.zero.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TransferFunds {
	
	@FindBy(id = "tf_fromAccountId")
	private WebElement fAcc;
	
	@FindBy(id = "tf_toAccountId")
	private WebElement tAcc;
	
	@FindBy(id = "tf_amount")
	private WebElement amnt;
	
	@FindBy(id = "tf_description")
	private WebElement desc;
	
	@FindBy(id = "btn_submit")
	private WebElement btnSub;
	
	public TransferFunds(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void fundTransfer(String Amount, String Description) {
		Select fdd = new Select(fAcc);
		fdd.selectByIndex(3);
		
		Select tdd = new Select(tAcc);
		tdd.selectByIndex(4);
		
		amnt.sendKeys(Amount);
		
		desc.sendKeys(Description);
		
		btnSub.click();
	}
	
	
	
	

}
