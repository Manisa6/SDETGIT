package PageObjects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class loginPage {
	WebDriver driver;
	By txt_uname=By.id("user-name");
	By txt_pwd=By.id("password");
	By login_button=By.id("login-button");
	By logo=By.className("app_logo");
	
	public loginPage(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	public void enterusername(String username) {
		driver.findElement(txt_uname).sendKeys(username);
	}
	
	public void enterpassword(String password) {
		driver.findElement(txt_pwd).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(login_button).click();
	}
	
	public void isLogoDisplayed() {
		driver.findElement(logo).isDisplayed();
	}
	

}
