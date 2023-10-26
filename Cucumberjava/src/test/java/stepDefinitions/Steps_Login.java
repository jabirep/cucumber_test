package stepDefinitions;

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
		
	@Then("close browser")
	public void close_browser() {
		   driver.close();
		
		
	}
	
	@When("user enters admin@yourstore.com and admin")
	public void user_enters_admin_yourstore_com_and_admin(String userName,String password) {
		object=new pageObjects(driver);
		object.setEmail(userName);
		object.setEmail(password);
		object.ClickLogin();


	}
}
	
	
	


