package PageFactoryObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement txt_uname;
	@FindBy(id="password")
	WebElement txt_password;
	@FindBy(id="login-button")
	WebElement login_button;
	
	public loginPageFactory(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterusername(String username) {
		
		
		txt_uname.sendKeys(username);
	}
	
	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clickLogin() {
		login_button.click();
	}

}
