
package pagelayer;

import org.openqa.selenium.By;

import baselayer.BaseClass;

public class LoginPage extends BaseClass{

	By LoginButton = By.xpath("//a[@id='login2']");
	By UserName = By.xpath("//input[@id='loginusername']");
	By Password = By.xpath("//input[@id='loginpassword']");
	By LoginButton2 = By.xpath("//button[text()='Log in']");
	
	public void gotoLoginPage() {
		driver.findElement(LoginButton).click();
	}
	
	public void setUserName(String username) {	
		driver.findElement(UserName).sendKeys(username);
		
	}
	public void setPassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}
	public void clickOnLoginButton() {
		driver.findElement(LoginButton2).click();
	}
	
	
	public void userLogin(String username, String password) {
	
		this.gotoLoginPage();
		this.setUserName(username);
		this.setPassword(password);
		this.clickOnLoginButton();
		
	}
	
}

