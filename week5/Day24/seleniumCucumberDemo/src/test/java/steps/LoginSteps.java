package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("browser is open")
	public void browserIsOpen() {
		System.out.println("Browser is open");
	}

	@And("user is on login page")
	public void userIsOnLoginPage() {
		System.out.println("user is on login page");
	}

	@When("user enters username and password")
	public void userEntersUsernameAndPassword() {
		System.out.println("user enters username and password");
	}

	@Then("user goes to home screen")
	public void userGoesToHomeScreen() {
		System.out.println("user goes to home screen");
	}

}
