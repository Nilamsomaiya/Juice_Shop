package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	public WebDriver driver;
	public Steps hp;
	
	@Given("launch Chrome Browser")
	public void launch_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mitul\\eclipse-workspace\\DS_ALGo_Sample\\Driver\\chromedriver");
		driver=new ChromeDriver();
		hp=new Steps();
	}

	@And("The user opens DS Algo portal link {string}")
	public void the_user_opens_ds_algo_portal_link(String url) {
	    driver.get(url);
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
	    hp.clickDataStrIntroGetStarted();
	
	}
	

	
	

	private void clickDataStrIntroGetStarted() {
		// TODO Auto-generated method stub
		
	}

	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() {
		driver=new ChromeDriver();
		hp=new Steps();
		driver.get("https://dsportalapp.herokuapp.com/");
	}

	@When("the user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
		hp.clickGetStartedButton();
	}

	private void clickGetStartedButton() {
		// TODO Auto-generated method stub
		
	}

	@Then("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() {
	   driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("The user clicks on Get Started link on homepage {string} without login")
	public void the_user_clicks_on_get_started_link_on_homepage_without_login(String string) {
	    hp.clickGetStartedButton();
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
	 System.out.println("You are not logged in");
	}

	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		driver.get("https://dsportalapp.herokuapp.com/home");
	    
	}

	
	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
	   hp.clickDataStrIntroGetStarted();
	}

	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    hp.clickGetStartedButton();
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
		hp.clickRegisterButton();
	}

	private void clickRegisterButton() {
		// TODO Auto-generated method stub
		
	}


}
