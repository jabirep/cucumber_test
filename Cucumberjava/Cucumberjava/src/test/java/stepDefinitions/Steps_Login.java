package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.pageObjects;

public class Steps_Login {
	
	public WebDriver driver;
	
	pageObjects object;
	
	@Given("user launch chromeBrowser and opens url {string}")
	public void user_launch_chrome_browser_and_opens_url(String url) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}
		
	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String email, String password) {
	   
		object=new pageObjects(driver);
		object.setEmail(email);
		object.setPassword(password);

	}
	  
	@And("Click on login button")
	public void click_on_login_button() {
		
		object=new pageObjects(driver);
		object.ClickLogin();
		
		}

	@Then("Page title should be {string}")
	public void page_title_should_be(String tittle) {
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		if(driver.getTitle().equalsIgnoreCase(tittle)) {
			System.out.println("title is ok");
		}
		else {
			System.out.println("title is not ok");

		}
	}
	
	@Then("user go to Customers page and add two customer details including fields like {string} {string} {string} {string} {string} {string} {string}")
	public void user_go_to_customers_page_and_add_two_customer_details_including_fields_like(String string, String string2, String string3, String string4, String string5, String string6, String string7) throws InterruptedException {
		object=new pageObjects(driver);
		object.addNewCustomer(string, string2, string3, string4, string5, string6, string7);
		//Alert alert=driver.switchTo().alert();
		//alert.accept();
	}
	
	@Then("user search for added customer details using {string}")
	public void user_search_for_added_customer_details_using(String string) throws InterruptedException {
		object=new pageObjects(driver);
		object.searchForCustomer(string);
		Thread.sleep(4000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.close();
	}
		

}
	
	
	


