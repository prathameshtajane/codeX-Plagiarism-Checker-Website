package com.northeastern.msd.team102.plagiarismchecker.antlr.ast;


import java.util.Date;
import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 *
 * This code is referenced from :
 * https://www.tutorialspoint.com/java/java_sending_email.htm
 */
public class SendEmail {

    public static final Logger logger = Logger.getLogger(SendEmail.class.getName());

    private static SendEmail emailInstance = null;

    private SendEmail() {
        //Default constructor
    }

	/**
	 * This function creates and return singleton instance of SendEmail
	 * @param errorMessage string representing error message
	 * @return an singleton instance SendEmail
	 */
    public static SendEmail getInstance (String errorMessage) {
        if(emailInstance == null)
            emailInstance = new SendEmail();
        email(errorMessage);
        return emailInstance;
    }

	/**
	 * This static function sends an email with the error message
	 * @param errorMessage string representing error message
	 */
	private static void email (String errorMessage) {
		
		Properties mailProperty = MailProperties.getProperties();
		String username = MailProperties.getUsername();
		String password = MailProperties.getPassword();
		
		
		try {
			Session session = Session.getDefaultInstance(mailProperty, new Authenticator() {
			    @Override
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(username, password);
				}
			});
		
			
		/*Mime message properties to include into an email.
		 * setting address of a sender, receiver, subject and error message.
		 * Sends an email on common team email-id.	
		 */
		Message msg = new MimeMessage(session);
		msg.setFrom(new InternetAddress(username));
		msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(username, false));
		msg.setSubject("Attention !! Error during implementation of Plagiarism checker");
		msg.setText(errorMessage);
		msg.setSentDate(new Date());
		Transport.send(msg);
		logger.log(Level.INFO,"Message sent.");
		} catch (MessagingException e1) {
			logger.log(Level.ERROR, e1.getMessage());
		}
	}
}
