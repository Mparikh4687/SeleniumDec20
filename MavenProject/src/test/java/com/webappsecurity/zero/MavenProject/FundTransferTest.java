package com.webappsecurity.zero.MavenProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FundTransferTest extends Base {
	
	@Test
	
	public void transferFundsBank() throws IOException {
		LoginApplication la = new LoginApplication(driver);
		AccountSummary as = new AccountSummary(driver);
		TransferFunds tf = new TransferFunds(driver);
		TransferFundsVerify tfv = new TransferFundsVerify(driver);
		TransferFundsConfirm tfc = new TransferFundsConfirm(driver);
		
		
			
			la.Login("username", "password");
			as.clickTranFunds();
			tf.fundTransfer("400","Fund Transfer of $400");
			tfv.verifyFundTransfer();
			String actualMsg = tfc.confirmTransferFunds();
			String expectedMsg = "You successfully submitted your transaction.";
			Assert.assertEquals(actualMsg, expectedMsg);
			tfc.logout();
			driver.navigate().to("http://zero.webappsecurity.com/login.html");
		}
}
		
	



