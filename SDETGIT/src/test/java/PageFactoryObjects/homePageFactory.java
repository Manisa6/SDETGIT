package PageFactoryObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {
	
	WebDriver driver;
	@FindBy(className="app_logo")
	WebElement lbl_logo;
	public homePageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void isLogoDisplayed() {
		lbl_logo.isDisplayed();
	}
	
}
