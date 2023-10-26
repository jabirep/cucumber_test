package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class pageObjects {
	
	public WebDriver ldriver;
	
	//constructor of page objects
	public pageObjects(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
	
	@FindBy(xpath ="//input[@id='Email']")
	@CacheLookup()
	WebElement userName;
	
	@FindBy(xpath ="//input[@id='Password']")
	@CacheLookup()
	WebElement password;
	
	@FindBy(xpath ="//button[@type='submit']")
	@CacheLookup()
	WebElement loginButton;
	
	@FindBy(xpath ="//body/div[@class='wrapper']/aside[@class='main-sidebar sidebar-dark-primary elevation-4 sidebar-focused']/div[@class='sidebar os-host os-theme-light os-host-resize-disabled os-host-scrollbar-horizontal-hidden os-host-transition os-host-scrollbar-vertical-hidden']/div[@class='os-padding']/div[@class='os-viewport os-viewport-native-scrollbars-invisible']/div[@class='os-content']/nav[@class='mt-2']/ul[@role='menu']/li[4]/a[1]")
	@CacheLookup()
	WebElement Customers;
	
	
	
	public void setEmail(String em) {
		//userName.clear();
		userName.clear();
		userName.sendKeys(em);
	}
	
	public void setPassword(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	public void ClickLogin() {
		loginButton.click();
	}
	
	public void CloseBrowser() {
		ldriver.quit();
	}
	
	
}
