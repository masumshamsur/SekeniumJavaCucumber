package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;



public class GoogleSearchSteps {
	WebDriver driver;

	@Given("browser is open")
	public void browser_is_open() {
		driver = new ChromeDriver();

	}


	@And("user is on google search page")
	public void user_is_on_google_search_page() {
		driver.get("https://www.google.com/");
	}


	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() {
		driver.findElement(By.name("q")).sendKeys("bangladesh");

	}

	@And("hits enter")
	public void hits_enter() {

		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("user is navigated to search sesults")
	public void user_is_navigated_to_search_sesults() {
		driver.getPageSource().contains("Liberation War");
		driver.close();
		driver.quit();
	}

}
