package himobile.testcases;

import himobile.base.TestBase;
import himobile.screens.SettingsScreen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.testng.annotations.Test;

public class SikuliScriptingHiVision extends TestBase{
	
	@Test
	public void startupIhv() throws IOException, InterruptedException{
		SettingsScreen tapping = new SettingsScreen(driver);
		
		tapping.changeContextNativeApp();
		Thread.sleep(2000);
		
		/*
		System.out.println("Launch Industrial HiVision");
		try{
			
			System.out.println("For Demo - In Board Room");
			Process p = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\startLaunchEnterPWDAllforDemo.bat");
			
			System.out.println("For Generic Execution");
			System.out.println("Enter UserName & Password in Login window of HiVision Application");
			Process p = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\startLaunchEnterPWDAll.bat");
			p.waitFor();
		}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)

		}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     

		}
		
		Thread.sleep(20000);
		System.out.println("HiVision Application launched successfully");
		*/
	}

}
