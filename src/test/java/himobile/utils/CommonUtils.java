package himobile.utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

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

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CommonUtils {

	private static Properties prop = new Properties();
	
	public static int EXPLICIT_WAIT_TIME;
	public static int IMPLICIT_WAIT_TIME;
	public static int DEFAULT_WAIT_TIME;
	public static int PORT_VALUE;
	public static String APPLICATION_NAME;
	public static String BASE_PKG;
	public static String APP_ACTIVITY;
	public static String APP_PASSWORD;
	private static String APPIUM_PORT;
	public static String AUTOMATION_INSTRUMENTATION;
	public static String BROWSER_NAME;
	public static String PLATFORM_NAME;
	public static String NEW_COMMAND_TIMEOUT;
	public static String PLATFORM_VERSION;
	public static String DEVICE_READY_TIMEOUT;
	public static String DEVICE_NAME;
	private static DesiredCapabilities capabilities = new DesiredCapabilities();
	private static URL serverUrl;
	private static AndroidDriver driver;
	
	public static void loadConfigProp(String propertyFileName) throws IOException
	 {
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\"+propertyFileName);
		
		prop.load(fis);
		
		EXPLICIT_WAIT_TIME = Integer
				.parseInt(prop.getProperty("explicit.wait"));
		IMPLICIT_WAIT_TIME = Integer
				.parseInt(prop.getProperty("implicit.wait"));
		DEFAULT_WAIT_TIME = Integer.parseInt(prop.getProperty("default.wait"));
		APPLICATION_NAME = prop.getProperty("application.path");
		BASE_PKG = prop.getProperty("base.pkg");
		APP_ACTIVITY = prop.getProperty("application.activity");
		APPIUM_PORT = prop.getProperty("appium.server.port");
		AUTOMATION_INSTRUMENTATION=prop.getProperty("automation.instumentation");
		DEVICE_NAME=prop.getProperty("device.name");
		BROWSER_NAME=prop.getProperty("browser.name");
		PLATFORM_NAME=prop.getProperty("platform.name");
		PLATFORM_VERSION=prop.getProperty("platform.version");
		NEW_COMMAND_TIMEOUT=prop.getProperty("new.command.timeout");
		DEVICE_READY_TIMEOUT=prop.getProperty("device.ready.timeout");

}
	//Start Appium server
	public static void appiumServicesStarted() throws Exception{
		AppiumDriverLocalService service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"))
				.withAppiumJS(new File("D:/Automation_Appium/Appium/node_modules/appium/bin/appium.js"))		
				.withLogFile(new File(System.getProperty("user.dir")+"/src/test/resources/logs/appiumLogs.txt")));
		service.start();
		Thread.sleep(10000);
		System.out.println("Appium Server started, Successfully");
	}
	//Stop Appium server
	public static void appiumServicesStopped() throws Exception{
		AppiumDriverLocalService service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"))
				.withAppiumJS(new File("D:/Automation_Appium/Appium/node_modules/appium/bin/appium.js"))		
				.withLogFile(new File(System.getProperty("user.dir")+"/src/test/resources/logs/appiumLogs.txt")));
		service.stop();
		Thread.sleep(5000);
		System.out.println("Appium Server Stopped");
	}
	public static void setCapabilities() {
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,
				CommonUtils.BROWSER_NAME);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
				CommonUtils.PLATFORM_VERSION);
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,
				CommonUtils.PLATFORM_NAME);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
				CommonUtils.DEVICE_NAME);
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,
				CommonUtils.AUTOMATION_INSTRUMENTATION);
		capabilities.setCapability(MobileCapabilityType.APP, CommonUtils.APPLICATION_NAME);
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,
				CommonUtils.NEW_COMMAND_TIMEOUT);
		capabilities.setCapability(MobileCapabilityType.DEVICE_READY_TIMEOUT,
				CommonUtils.DEVICE_READY_TIMEOUT);
		capabilities.setCapability(MobileCapabilityType.APP_ACTIVITY,
				CommonUtils.APP_ACTIVITY);
		capabilities.setCapability(MobileCapabilityType.APP_PACKAGE,
				CommonUtils.BASE_PKG);
	}

	public static AndroidDriver getDriver() throws MalformedURLException {
		serverUrl = new URL("http://localhost:" + APPIUM_PORT + "/wd/hub");		
		driver = new AndroidDriver(serverUrl, capabilities);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void saveXMLFile(String xmlFileName) throws FileNotFoundException{
		String xmlData = driver.getPageSource();
		System.out.println(xmlData);
		PrintStream console = System.out;
		File file = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\"+xmlFileName);
		FileOutputStream fos = new FileOutputStream(file);
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		System.out.println(xmlData);
		System.setOut(console);
	}
	
	public static void captureAndSavedScreenshot() throws Exception	{
		
		Calendar cal = new GregorianCalendar();
		  int month = cal.get(Calendar.MONTH); //3
		  int year = cal.get(Calendar.YEAR); //2014
		  int sec =cal.get(Calendar.SECOND);
		  int min =cal.get(Calendar.MINUTE);
		  int date = cal.get(Calendar.DATE);
		  int day =cal.get(Calendar.HOUR_OF_DAY);
		
		String timestamp = year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec;
		
		String screenshotpath = System.getProperty("user.dir")+"\\screenshots\\Image"+timestamp+".jpeg";
		WebDriver augmentedDriver = new Augmenter().augment(driver);
		File scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE); 
		FileUtils.copyFile(scrFile, new File(screenshotpath));
		}
		
	/*
	public static void findandsetmyIp() throws Exception{
		String sheetName = "TestSheet";
		ExcelReader exl = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
		String myIp = InetAddress.getLocalHost().getHostAddress();
		System.out.println(myIp);
		exl.setCellData(sheetName, "Values", 15, myIp);
		exl.setCellData(sheetName, "port", 2, "11159");
		exl.setCellData(sheetName, "username", 2, "admin");
		exl.setCellData(sheetName, "password", 2, "admin123");
		System.out.println("Upload excel file");
		exl.setCellData(sheetName, "host", 3, "127.0.0.1");
		exl.setCellData(sheetName, "port", 3, "8888");
		exl.setCellData(sheetName, "username", 3, "system1234");
		exl.setCellData(sheetName, "password", 3, "system");
		
	}
	*/
	
	public static void sendingMail(){
		
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
	    		 		//InternetAddress.parse("raja.chhabra@incedoinc.com",false));
	                      InternetAddress.parse("shukla.vivek@incedoinc.com",false));
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
         String attachementPath = System.getProperty("user.dir")+"\\test-output\\";
         String filename = "emailable-report.html";
         /*
         String homedir = System.getProperty("user.dir")+"/";
         String TestcaseReport = "SettingsScreenTestCasesReport.html";
         String TestsuiteReport = "HiMobileAndroidTestSuiteReport.html";
         */
         DataSource source = new FileDataSource(attachementPath+filename);
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
