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
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

public class SendingEmails {

	
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
	     /*
	     msg.addRecipient(Message.RecipientType.TO, InternetAddress.parse("shukla.vivek@incedoinc.com"));
	     msg.addRecipient(Message.RecipientType.CC, InternetAddress.parse("shradha.pundir@incedoinc.com"));
	     msg.addRecipient(Message.RecipientType.BCC, InternetAddress.parse("varun.walia@incedoinc.com"));
	     msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse("shukla.vivek@incedoinc.com"));
	     
	     //For multiple receiver
	     
	     void addRecipients(Message.RecipientType type, Address[] addresses)throws MessagingException
	     
	     	Address[] cc = new Address[] {InternetAddress.parse("shukla.vivek@incedoinc.com"),
                               InternetAddress.parse("shradha.pundir@incedoinc.com"), 
                               InternetAddress.parse("varun.walia@incedoinc.com")};
					msg.addRecipients(Message.RecipientType.CC, cc);
	      * 
	      */
	     
	     /*
	      * String[] mailAddressTo = new String[3];    
			mailAddressTo[0] = emailId_1;    
			mailAddressTo[1] = emailId_2;    
			mailAddressTo[2] = "xyz@gmail.com";

		InternetAddress[] mailAddress_TO = new InternetAddress[mailAddressTo.length];

			for (int i = 0; i < mailAddressTo.length; i++)	{
			
    		mailAddress_TO[i] = new InternetAddress(mailAddressTo[i]);
    		
			}

			message.addRecipients(Message.RecipientType.TO, mailAddress_TO);
			ress_TO = new InternetAddress[mailAddressTo.length];
	      * 
	      * 
	      */
	     msg.setRecipients(Message.RecipientType.TO, 
	                      InternetAddress.parse("shukla.vivek@incedoinc.com",false));
	     msg.setRecipients(Message.RecipientType.CC, 
                 InternetAddress.parse("shradha.pundir@incedoinc.com",false));
	     msg.setRecipients(Message.RecipientType.BCC, 
                 InternetAddress.parse("varun.walia@incedoinc.com",false));
	     
	     msg.setSubject("HiMobileTestAutomationReport");
	     msg.setText("Please find attached report");
	 
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
        String filePath = "D:\\Automation_Appium\\WorkSpaceeS\\HiMobileTestAutomation\\test-output\\";
        String filename = "emailable-report.html";
        DataSource source = new FileDataSource(filePath+filename);
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
