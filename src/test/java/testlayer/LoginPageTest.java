package testlayer;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

import pagelayer.LoginPage;

public class LoginPageTest extends LoginPage{
	
	@Test
	public void loginTest() {
		
		userLogin("Milind19","Milind@123");
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.demoblaze.com/","Not on Login page");
		Assert.assertEquals(driver.getTitle(),"STORE","Not on Login page");
						
	}

}
