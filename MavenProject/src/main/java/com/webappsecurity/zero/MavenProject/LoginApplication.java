package com.webappsecurity.zero.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginApplication {
	
	@FindBy(id = "user_login")
	private WebElement uName;
	
	@FindBy(id = "user_password")
	private WebElement pass;
	
	@FindBy(id = "user_remember_me")
	private WebElement checkBox;
	
	@FindBy(name = "submit")
	private WebElement subBtn;
	
	@FindBy(css = ".alert")
	private WebElement errorMsg;
	
	public LoginApplication(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String UserName, String Password) {
		
		uName.sendKeys(UserName);
		pass.sendKeys(Password);
		checkBox.click();
		subBtn.click();
	}
	
	public String getErrorMsg() {
		String getText = errorMsg.getText();
		return getText;
	}

}
