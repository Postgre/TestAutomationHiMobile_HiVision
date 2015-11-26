package himobile.demo;

import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.util.Properties;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.Multipart;

public class TestEmailSend {

	/*
	public boolean send(String messageBody,String messageStatus){
        boolean status=false;
    try{
        Properties p=System.getProperties();
        String Host_Name="Put your Host Name";
        p.put("mail.smtp.host",Host_Name);
        Session session=Session.getDefaultInstance(p,null);
        MimeMessage message=new MimeMessage(session);
        String mailFrom="Put From Info";
        String mailTo="Put TO Info";
        //String[] mailAddressTo= ....... ; //can put multiple receivers in the array
        //message.setFrom(new InternetAddress(mailFrom));
        
        InternetAddress[] mailAddress_TO = new InternetAddress [Java:mailAddressTo.length] ;
        for(int i=0;i<mailAddressTo.length;i++){
            mailAddress_TO[i] = new InternetAddress(mailAddressTo[i]);
        }
        message.addRecipients(Message.RecipientType.TO, mailAddress_TO);
        String subject="Put Mail Subject Here";
        message.setSubject(subject);   
        message.setContent(messageBody,"text/html");
        Transport.send(message);
       status=true;
    }
    catch(SendFailedException sfe){
    }
    catch(MessagingException me){
    }
    return status;
    }
    */
	/*
	public boolean send(String messageBody,String messageStatus){
		boolean status=false;
		try{
		    Properties p=System.getProperties();
		    String Host_Name="Put your Host Name";
		     p.put("mail.smtp.host",Host_Name);
		     Session session=Session.getDefaultInstance(p,null);
		     MimeMessage message=new MimeMessage(session);
		    String mailFrom="Put From Info";
		    String mailTo="Put TO Info";
		    String[] mailAddressTo= .......//can put multiple receivers in the array
		 message.setFrom(new InternetAddress(mailFrom));
		 InternetAddress[] mailAddress_TO = new InternetAddress [Java:mailAddressTo.length] ;
		 for(int i=0;i<mailAddressTo.length;i++){
		 mailAddress_TO[i] = new InternetAddress(mailAddressTo[i]);
		}
		 message.addRecipients(Message.RecipientType.TO, mailAddress_TO);
		 String subject="Put Mail Subject Here";
		 message.setSubject(subject);
		// -------- Enhancement for Attachments -----------------------
		 String filename = "Put the Path For the Attachment Here";
		 Multipart multipart = new MimeMultipart();
		 
		 multipart.addBodyPart(messageBodyPart);
		 messageBodyPart = new MimeBodyPart();
		 DataSource source = new FileDataSource(filename);
		 messageBodyPart.setDataHandler(new DataHandler(source));
		 messageBodyPart.setFileName(filename);
		 multipart.addBodyPart(messageBodyPart);
		 
		 message.setContent(multipart);
		//-------- End of Enhancement -----------------------
		 Transport.send(message);
		 status=true;
		}
		 catch(SendFailedException sfe){
		}
		 catch(MessagingException me){
		}
		 return status;
		 }
		 */
}
