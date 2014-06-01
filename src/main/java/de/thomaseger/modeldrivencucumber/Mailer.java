package de.thomaseger.modeldrivencucumber;

public class Mailer {

	private static String lastSentMail;
	
	public static void send(String to, String mail) {
		lastSentMail = mail;
	}

	public static String getLastSentMail() {
		return lastSentMail;
	}
}
