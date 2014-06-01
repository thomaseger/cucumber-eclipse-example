package de.thomaseger.modeldrivencucumber;

public class User {

	private String email = null;

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void resetPassword() {
		Mailer.send(email,
				"Your link: <a href=\"http://the-correct-address.com/reset?user="
						+ email + "\"></a>");
	}
}
