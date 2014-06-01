package de.thomaseger.modeldrivencucumber;

import static org.hamcrest.core.StringContains.*;
import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PasswordSteps {
	
	private User user;
	
	@Given("^a user with email \"([^\"]*)\" exists$")
	public void a_user_with_email_exists(String email) throws Throwable {
		this.user = new User();
		user.setEmail(email);
	}

	@When("^I ask for a password reset$")
	public void I_ask_for_a_password_reset() throws Throwable {
	    user.resetPassword();
	}

	@Then("^an email with a password reset link should be sent$")
	public void an_email_with_a_password_reset_link_should_be_sent() throws Throwable {
		String lastSentMail = Mailer.getLastSentMail();
		assertThat(lastSentMail, containsString("link"));
		assertThat(lastSentMail, containsString(user.getEmail()));
	}

}
