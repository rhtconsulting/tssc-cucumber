package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.*;

import hellocucumber.OddsEvens;
import hellocucumber.NumChars;


public class StepDefinitions {

private String value;
private String expectedAnswer;
private String actualAnswer;


/**
 * Given for odd or even feature.
 */
@Given("{string} is the chosen number")
public void odd_or_even(String str) {
	value = str;
}
/**
 * When for odd or even feature.
 */
@When("I ask whether the chosen number is odd or even")
public void i_ask_whether_number_is_odd_or_even() {
	actualAnswer = OddsEvens.oddOrEven(value);
}



@Given("{string} is the chosen string")
public void chosen_string(String str) {
	value = str;
}

@When("I ask how many characters are in the given string")
public void i_ask_how_many_chars_in_string() {
	actualAnswer = NumChars.numChars(value);
}


/**
 * Assertion of expected answer versus the actual answer. Works for multiple features
 */
@Then("I should be told {string}")
public void i_should_be_told(String expectedAnswer) {
	assertEquals(expectedAnswer, actualAnswer);
}



}
