package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.*;

public class searchsteps {

	 private WebDriver driver;

	    @Given("I am on the Amazon home page")
	    public void i_am_on_the_amazon_home_page() {
	        // Set up Chrome driver
	        System.setProperty("webdriver.gecko.driver","C:\\firefoxdriver\\geckodriver.exe");
	        driver = new FirefoxDriver();

	        // Navigate to Amazon home page
	        driver.get("https://www.amazon.in/");
	    }

	    @When("I search for {string}")
	    public void i_search_for(String searchTerm) {
	        // Enter search term and submit search
	        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchTerm);
	        driver.findElement(By.id("nav-search-submit-button")).click();
	    }

	    @Then("I should see search results for {string}")
	    public void i_should_see_search_results_for(String searchTerm) {
	        // Verify search results
	        String pageTitle = driver.getTitle();
	        assert pageTitle.contains(searchTerm);

	        // Close the browser
	       // driver.quit();
	    }
}
