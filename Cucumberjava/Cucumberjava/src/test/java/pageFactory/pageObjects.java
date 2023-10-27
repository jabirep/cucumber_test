package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	@FindBy(xpath ="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/a")
	@CacheLookup()
	WebElement Customers;
	
	@FindBy(xpath ="/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[4]/ul/li[1]/a/p")
	@CacheLookup()
	WebElement SubCustomers;
	
	@FindBy(xpath ="//a[@class='btn btn-primary']")
	@CacheLookup()
	WebElement Add_New_Customer;
	
	//add customer fields locating elements
	@FindBy(xpath ="//input[@id='Email']")
	@CacheLookup()
	WebElement email;
	
	@FindBy(xpath ="//input[@id='Password']")
	@CacheLookup()
	WebElement passwords;
	
	@FindBy(xpath ="//input[@id='FirstName']")
	@CacheLookup()
	WebElement firstName;
	
	@FindBy(xpath ="//input[@id='LastName']")
	@CacheLookup()
	WebElement lastName;
	
	@FindBy(xpath ="//input[@id='Gender_Male']")
	@CacheLookup()
	WebElement gender;
	
	@FindBy(xpath ="//input[@id='DateOfBirth']")
	@CacheLookup()
	WebElement DOB;
	
	@FindBy(xpath ="//input[@id='Company']")
	@CacheLookup()
	WebElement COMPANY_NAME;
	
	@FindBy(xpath ="//input[@id='IsTaxExempt']")
	@CacheLookup()
	WebElement CHECKBOX;
	
	@FindBy(xpath ="//div[@class='k-widget k-multiselect k-multiselect-clearable k-state-hover k-state-focused k-state-border-down']//div[@role='listbox']")
	@CacheLookup()
	WebElement newsLetter;
	
	@FindBy(xpath ="//div[@class='k-widget k-multiselect k-multiselect-clearable k-state-hover k-state-focused k-state-border-down']//div[@role='listbox']")
	@CacheLookup()
	WebElement customerRoles;
	
	@FindBy(xpath ="//select[@id='VendorId']")
	@CacheLookup()
	WebElement ManagerOfvENDOR;
	
	@FindBy(xpath ="//input[@id='Active']")
	@CacheLookup()
	WebElement ACTIVE_CHECK;
	
	@FindBy(xpath ="//textarea[@id='AdminComment']")
	@CacheLookup()
	WebElement comment_box;
	
	@FindBy(xpath ="//button[@name='save']")
	@CacheLookup()
	WebElement save_button;
	
	@FindBy(xpath ="//a[normalize-space()='back to customer list']")
	@CacheLookup()
	WebElement back_to_customersList;
	
	@FindBy(xpath ="//div[contains(@class,'row search-row')]")
	@CacheLookup()
	WebElement open_search_fields;
	
	@FindBy(xpath ="//input[@id='SearchFirstName']")
	@CacheLookup()
	WebElement type_firstName;
	
	@FindBy(xpath ="//button[@id='search-customers']")
	@CacheLookup()
	WebElement search_button;
	
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
	
	public void addNewCustomer(String emm,String pass,String first,String last,String Date,String company,String comment) throws InterruptedException {
		Customers.click();
		SubCustomers.click();
		Add_New_Customer.click();
		email.sendKeys(emm);
		passwords.sendKeys(pass);
		firstName.sendKeys(first);
		lastName.sendKeys(last);
		gender.click();
		DOB.sendKeys(Date);
		CHECKBOX.click();
		COMPANY_NAME.sendKeys(company);
		ACTIVE_CHECK.click();
		comment_box.sendKeys(comment);
		save_button.click();
		Thread.sleep(10000);
		
	}
	
	public void searchForCustomer(String first_after_save) throws InterruptedException {
		//back_to_customersList.click();
		//open_search_fields.click();
		type_firstName.sendKeys(first_after_save);
		Thread.sleep(4000);
		search_button.click();
		Thread.sleep(3000);
	}
	
	
	
}
