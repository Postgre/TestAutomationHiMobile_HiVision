package himobile.demo;

import java.util.Date;
import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendEmailsToTeam {

	public static void main(String[] args) {
		Properties props = System.getProperties();
	    props.setProperty("mail.smtp.host", "mail.incedoinc.com");
	    //props.setProperty("mail.smtp.socketFactory.class", SSL_FACTORY);
	    props.setProperty("mail.smtp.socketFactory.fallback", "false");
	    props.setProperty("mail.smtp.port", "25");
	    props.setProperty("mail.smtp.socketFactory.port", "110");
	    props.put("mail.smtp.auth", "true");
	    props.put("mail.debug", "true");
	    props.put("mail.store.protocol", "pop3");
	    props.put("mail.transport.protocol", "smtp");
	    final String username = "ibts\\shukla.vivek";//
	    final String password = "Pari@280212";
	    try{
	    Session session = Session.getDefaultInstance(props, 
	                         new Authenticator(){
	                            protected PasswordAuthentication getPasswordAuthentication() {
	                               return new PasswordAuthentication(username, password);
	                            }});

	  // -- Create a new message --
	    Message msg = new MimeMessage(session);

	 // -- Set the FROM and TO fields --
	    msg.setFrom(new InternetAddress("shukla.vivek@incedoinc.com"));
	    msg.setRecipients(Message.RecipientType.TO, 
	   		 		InternetAddress.parse("raja.chhabra@incedoinc.com",false));
	    msg.setRecipients(Message.RecipientType.CC, 
   		 		InternetAddress.parse("r.lekhwani@incedoinc.com",false));
	    msg.setRecipients(Message.RecipientType.CC, 
   		 		InternetAddress.parse("varun.walia@incedoinc.com",false));
	    msg.setRecipients(Message.RecipientType.CC, 
   		 		InternetAddress.parse("shradha.pundir@incedoinc.com",false));
	    msg.setRecipients(Message.RecipientType.BCC, 
   		 		InternetAddress.parse("shradha.pundir@incedoinc.com",false));
	                     //InternetAddress.parse("shukla.vivek@incedoinc.com",false));
	    msg.setSubject("Demo-HiMobileTestAutomationReport");
	    msg.setText("Hi Team");
	    msg.setText("Please find attached html report using Extent Report API.");
	    msg.setText("This is Test to send test report as a attachment via Email.");
	    msg.setText("Regards,");
	    msg.setText("Vivek Shukla");
	    // Fill the message
	    msg.setText("This is message body");
	    
	    // Create a multipart message
	    Multipart multipart = new MimeMultipart();

	    // Set text message part
	    //multipart.addBodyPart(messageBodyPart);

	    // Part two is attachment
	 // Create the message part 
	    BodyPart messageBodyPart = new MimeBodyPart();

	    // Fill the message
	    messageBodyPart.setText("This is message body");
	    
	    // Create a multipar message
	    Multipart multiplepart = new MimeMultipart();

	    // Set text message part
	    multiplepart.addBodyPart(messageBodyPart);

	    // Part two is attachment
	    messageBodyPart = new MimeBodyPart();
	    //String attachementPath = System.getProperty("user.dir");
	    String filename = ".\\SettingsScreenTestCasesReport.html";
	    DataSource source = new FileDataSource(filename);
	    messageBodyPart.setDataHandler(new DataHandler(source));
	    messageBodyPart.setFileName(filename);
	    multipart.addBodyPart(messageBodyPart);

	    // Send the complete message parts
	    msg.setContent(multipart );

	    msg.setSentDate(new Date());
	    Transport.send(msg);
	    System.out.println("Message sent.");
	 }catch (MessagingException e){ 
		  System.out.println("Erreur d'envoi, cause: " + e);
	 }

	}

}
