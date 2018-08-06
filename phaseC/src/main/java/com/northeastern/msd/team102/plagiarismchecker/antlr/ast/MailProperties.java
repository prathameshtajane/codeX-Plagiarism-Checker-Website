package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;

import java.util.Properties;

/**
 * This class defines all the system properties that 
 * e-mail needs to address.
 */
public class MailProperties {
	
	private MailProperties() {
		//private constructor
	}

	/**
	 * email-id of sender.
	 */
	static String username = "msdAtTeam102@gmail.com";
	/**
	 * password of a sender
	 */
	static String teamPd =  "msd@team102";
	
	/**
	 * 
	 * @return All the system properties required for email-configuration.
	 */
	public static Properties getProperties() {
		
		final String SSL_FACTORY = "javax.net.ssl.SSLSocketFactory";
		Properties mailproperties = System.getProperties();
		mailproperties.setProperty("mail.smtp.host", "smtp.gmail.com");
		mailproperties.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
		mailproperties.setProperty("mail.smtp.socketFactory.fallback", "false");
		mailproperties.setProperty("mail.smtp.port", "465");
		mailproperties.setProperty("mail.smtp.socketFactory.port", "465");
		mailproperties.put("mail.smtp.auth", "true");
		mailproperties.put("mail.debug", "true");
		mailproperties.put("mail.store.protocol", "pop3");
		mailproperties.put("mail.transport.protocol", "smtp");
		
		return mailproperties;
		
	}
	
	/**
	 * 
	 * @return User name  of sender
	 */
	public static String getUsername() {
		
	  return username;
	  }
	
	/**
	 * 
	 * @return password of sender
	 */
	public static String getPassword() {
		  return teamPd;
	  
	
	}
}
