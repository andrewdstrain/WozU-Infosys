package cucumbertest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class PenguinDefinitions {
    private int expected;
    private int actual;

    @Given("I am punting Penguins")
    public void i_am_punting_penguins() {
        expected = 60;
    }

    @When("less than 60 Penguins are punted")
    public void less_than_60_Penguins_are_punted() {
        actual = 50;
    }

    @When("60 or more Penguins are punted")
    public void sixty_or_more_Penguins_are_punted() {
        actual = 70;
    }

    @Then("the icecaps melt")
    public void the_icecaps_melt() {
        assertTrue(actual < expected);
    }

    @Then("the icecaps stay nice and frosty")
    public void the_icecaps_stay_nice_and_frosty() {
        assertTrue(actual >= expected);
    }
}
