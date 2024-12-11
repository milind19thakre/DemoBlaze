package testlayer;

import org.testng.annotations.Test;

import pagelayer.LoginPage;

public class LoginPageTest extends LoginPage{
	
	@Test
	public void loginTest() {
		userLogin("Milind19","Milind@123");
		
	}

}
