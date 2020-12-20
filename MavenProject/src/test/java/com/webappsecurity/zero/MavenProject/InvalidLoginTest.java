package com.webappsecurity.zero.MavenProject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends Base {
	
	@Test
	 public void verifyInvalidLogin() {
		LoginApplication la = new LoginApplication(driver);
		
		la.Login("username","password1");
		String actualText = la.getErrorMsg();
		String expectedText = "Login and/or password are wrong.";
		Assert.assertEquals(actualText, expectedText);
	}

}
