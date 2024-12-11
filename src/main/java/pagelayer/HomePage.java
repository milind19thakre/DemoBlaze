
package pagelayer;

import org.openqa.selenium.By;

import baselayer.BaseClass;

public class HomePage extends BaseClass {
	
	By homebutton = By.xpath("//a[@class='nav-link']/parent::li[@class='nav-item active']");
	By Contact = By.xpath("//a[text()='Contact']");
	By Aboutus = By.xpath("//a[text()='About us']");
	By Cart = By.xpath("//a[@id='cartur']");
	By Logout = By.xpath("//a[@id='logout2']");
	By Nameofuser = By.xpath("//a[@id='nameofuser']");
	By Forward =  By.xpath("//span[@class='carousel-control-next-icon']");
	By Backword = By.xpath("//span[@class='carousel-control-prev-icon']");
	By Phones = By.xpath("//a[text()='Phones']");
	By Laptops  = By.xpath("/a[text()='Laptops']");
	By Monitors = By.xpath("/a[text()='Monitors']");
	By previous = By.xpath("//button[@id='prev2']");
	By next = By.xpath("//button[@id='next2']");
	By NokiaLumia1520 = By.xpath("")
	
 
}
