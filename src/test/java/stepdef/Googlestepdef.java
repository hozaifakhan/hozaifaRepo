package stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googlestepdef {
	public WebDriver driver;
	public String actT;
	public String expT;
	@Given("open the google application")
	public void open_the_google_application() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	    
	}

	@When("User capture current page tittle")
	public void user_capture_current_page_tittle() {
		String expT = "Google";
		String actT = driver.getTitle();
	    
	}

	@Then("Title should match")
	public void title_should_match() {
	Assert.assertTrue(expT.contains("Google"));
	System.out.println("title is matched TC is passed");
	}
}
