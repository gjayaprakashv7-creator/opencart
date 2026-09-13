package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{

	
	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		logger.info("***** Starting TC002_LoginTest *****");
		
		try {
			
		HomePage hp=new HomePage(driver);//home page
		hp.clickMyaccount();
		hp.clickLogin();
		
		LoginPage lp=new LoginPage(driver);//Login page
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		MyAccountPage macc=new MyAccountPage(driver);//MyAccount page
		boolean targetPage= macc.isMyAccountPageExists();
		Assert.assertEquals(targetPage, true, "Login failed");
		
		}
		
		catch(Exception e) {
			logger.error("Test failed", e);
		    Assert.fail("Exception occurred: " + e.getMessage());
		}
		
		logger.info("***** Finished TC002_LoginTest *****");
	}
}
