package himobile.base;

import himobile.screens.SettingsScreen;
import himobile.sikuli.HiVisionSikuli;
import himobile.sikuli.HiVisionSikuli;
import himobile.utils.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import himobile.base.*;
import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {

	public static AndroidDriver driver;
		
	
	@BeforeSuite
		public void setUp() throws Exception{
		
		if(driver==null){
		
		CommonUtils.appiumServicesStarted();
		
		/*
		HiVisionSikuli.stop();
		Thread.sleep(20000);
		//Delete DataBase Folder
		//HiVisionSikuli.deletedatabasefolder();
		HiVisionSikuli.deletedbfolder();
		Thread.sleep(20000);
		HiVisionSikuli.start();
		HiVisionSikuli.launch();
		Thread.sleep(20000);
		*/
		CommonUtils.loadConfigProp("himobile.properties");
		
		CommonUtils.setCapabilities();
		driver = CommonUtils.getDriver();
		
		
		}
	}
	
	@AfterSuite
	public void tearDown() throws Exception{
		Thread.sleep(5000);
		CommonUtils.appiumServicesStopped();
		
		//HiVisionSikuli.exitgui();
		
		System.out.println("Appium Server Stopped");
		Thread.sleep(5000);
		driver.quit();
	}
	
	
	//capture screen shot
		public void captureScreenshots() throws Exception{
			
			WebDriver augmentedDriver = new Augmenter().augment(driver);
			
			Calendar cal = new GregorianCalendar();
			  int month = cal.get(Calendar.MONTH); //3
			  int year = cal.get(Calendar.YEAR); //2014
			  int sec =cal.get(Calendar.SECOND);
			  int min =cal.get(Calendar.MINUTE);
			  int date = cal.get(Calendar.DATE);
			  int day =cal.get(Calendar.HOUR_OF_DAY);
			
			String timestamp = year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec;
	      File scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE); 
	      FileUtils.copyFile(scrFile, new File("screenshots/screenshot_"+timestamp+".jpg"), false);
			
		}

}

