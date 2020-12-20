package com.webappsecurity.zero.MavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTest extends Base {
	
    @Test
	
	public void verifyValidLogin() {
		
		LoginApplication la = new LoginApplication(driver);
		AccountSummary as = new AccountSummary(driver);
		
		la.Login("username", "password");
		boolean isElementVisible = as.verifyText();
		Assert.assertTrue(isElementVisible);
		
	}

}
