package cucumbertest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;
import static utility.Utility.calculateAverage;

import java.util.List;

public class BowlingDefinitions {

    List<Integer> scores;
    private Integer actual;
    private static final Integer perfect_score = 300;

    @Given("a set of scores:")
    public void a_set_of_scores(List<Integer> scores) {
        this.scores = scores;
    }

    @When("I calculate average")
    public void i_calculate_average() {
        actual = calculateAverage(scores);
    }

    @Then("my score is not a perfect score")
    public void my_score_is_not_a_perfect_score() {
        assertThat(perfect_score, Matchers.greaterThan(actual));
    }

    @Then("my score is a perfect score")
    public void my_score_is_a_perfect_score() {
        assertThat(perfect_score, Matchers.equalTo(actual));
    }
}
