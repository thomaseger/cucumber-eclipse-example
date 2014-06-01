package de.thomaseger.modeldrivencucumber;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.List;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class VegetablesSteps {
	
	private List<Vegetable> vegetables;
	
	private boolean different;
	
	@Given("I have these vegetables:")
	public void I_have_these_vegetables(List<Vegetable> vegetables) {
		this.vegetables = vegetables;
	}
	
	@When("^I compare the both colors$")
	public void I_compare_the_both_colors() throws Throwable {
		Vegetable vegetable1 = vegetables.get(0);
		Vegetable vegetable2 = vegetables.get(1);
		different = vegetable1.getColor() != vegetable2.getColor();
	}

	@Then("^they have to be different$")
	public void they_have_to_be_different() throws Throwable {
		assertThat(different, is(true));
	}
	
}
