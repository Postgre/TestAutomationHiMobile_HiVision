package himobile.testcases;

import himobile.base.TestBase;
import himobile.screens.SettingsScreen;
import himobile.sikuli.HiVisionSikuli;
import himobile.utils.ExcelReader;
import org.sikuli.script.FindFailed;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SettingsScreenHTTPS extends TestBase{
	
	//Verify the  functionality when HTTPs is set as OFF  for HiMobile & For HiVision it is set as ON
	
	//Verify the  functionality when HTTPs is set as OFF for HiMobile & For HiVision also it is set as OFF
	
	//Verify the  functionality when HTTPs is set as ON  for HiMobile & For HiVision it is set as OFF
	
	//Verify the  functionality when HTTPs is set as ON  for HiMobile & For HiVision also it is set as ON
	
	@AfterMethod
	public void resettingApp() throws Exception{
		System.out.println("Reset HiMobile App");
		Thread.sleep(1000);
		driver.resetApp();
		Thread.sleep(1000);
	}
	
	@Test(priority = 1)
	public void enablehttpsServices() throws Exception {
		HiVisionSikuli hvishttps = new HiVisionSikuli();
		System.out.println("enable https functionality in HiVision");
		hvishttps.enableHttps();
		
		System.out.println("Wait to relaunch Hi-Vision");
		hvishttps.waitingOneMin();
		System.out.println("Minimize IHV");
		hvishttps.minimaxmizeIHVApp();
		System.out.println("Done");
	}


	@Test(priority = 2)    
	public void validateHttpsFunctionalityTC1() throws InterruptedException	{
		
		System.out.println("*************************************************************************************");
	    System.out.println("Test Case 41 : HTTPS Validation: HTTPS is ON for HiMobile and ON for HiVision starts");
	    System.out.println("*************************************************************************************");
	            
	    SettingsScreen hostdata = new SettingsScreen(driver);
	    	
		hostdata.changeContextWebview();
		Thread.sleep(5000);
		System.out.println("Enter all values");
		hostdata.enterValidValues();
		Thread.sleep(2000);
		hostdata.minimizeKeyboard();
		Thread.sleep(2000);
		hostdata.changeContextNativeApp();
		System.out.println("Select https checkbox");
		Thread.sleep(5000);
		hostdata.checkedSecureConnectionCheckcbox();	
		Thread.sleep(2000);
		hostdata.changeContextWebview();
		System.out.println("Verify Alert popup");
		Thread.sleep(5000);
		//hostdata.myAlertHttps(data);
		Thread.sleep(2000);
		hostdata.changeContextNativeApp();
		System.out.println("Click on Ok button");
		Thread.sleep(5000);
		hostdata.clickokbtn();
		Thread.sleep(2000);
		System.out.println("Tap Connection Test button");
		hostdata.clickconntestbutton();
		Thread.sleep(2000);
		hostdata.changeContextWebview();
		Thread.sleep(5000);
		
		hostdata.mypopupSuccess();
		Thread.sleep(2000);
		hostdata.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Click Ok button of Alert");
		hostdata.clickokbtn();
		Thread.sleep(5000);
		System.out.println("Scroll up");
		hostdata.scrollup();
		Thread.sleep(2000);
		driver.resetApp();
		System.out.println("************************************************************************************");
	    System.out.println("Test Case 40 : HTTPS Validation: HTTPS is ON for HiMobile and ON for HiVision ends ");
	    System.out.println("************************************************************************************");
	    
	}
		
	 @Test(priority = 3)    
	    public void validateHttpsFunctionalityTC2() throws InterruptedException {
		 	
	    	System.out.println("**************************************************************************************");
	        System.out.println("Test Case 42 : HTTPS Validation: HTTPS is OFF for HiMobile and HiVision starts ");
	        System.out.println("**************************************************************************************");
	        
	    	System.out.println("USER INTERVENTION REQUIRED: Please Turn ON HTTPS in HiVision");
	    	
			SettingsScreen hostdata = new SettingsScreen(driver);
			hostdata.changeContextWebview();
			
			Thread.sleep(5000);
			
			System.out.println("Enter all values");
			hostdata.enterValidValues();
			Thread.sleep(2000);
			hostdata.minimizeKeyboard();
			Thread.sleep(2000);
						
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			System.out.println("Un-Select https checkbox in HiMobile Apps");
			
			System.out.println("Click Connection Test button");
			hostdata.clickconntestbutton();
			Thread.sleep(5000);
			hostdata.changeContextWebview();
			Thread.sleep(5000);
			hostdata.mypopupError();
			Thread.sleep(2000);
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			System.out.println("Click Ok button of Alert Message");
			hostdata.clickokbtn();
			System.out.println("Scroll up");
			Thread.sleep(5000);
			hostdata.scrollup();
			Thread.sleep(2000);
			driver.resetApp();
			System.out.println("Done");
			System.out.println("**************************************************************************************");
	        System.out.println("Test Case 41 : HTTPS Validation: HTTPS is ON for HiMobile and HiVision ends ");
	        System.out.println("**************************************************************************************");
	    }
			   
	@Test(priority = 4)
	public void disableHttpsHiVision() throws FindFailed, Exception{
		HiVisionSikuli hvishttps = new HiVisionSikuli();
	 	hvishttps.disableHttps();
	 	Thread.sleep(5000);
	 	System.out.println("Disable https functionality in HiVision");
	 	Thread.sleep(20000);
	    System.out.println("Disable https from HiVision");
	    Thread.sleep(5000);
	    System.out.println("Done");
	    Thread.sleep(20000);
	}


	@Test(priority = 5)    
	public void validateHttpsFunctionalityTC3() throws InterruptedException, FindFailed 	{
		HiVisionSikuli hvishttps = new HiVisionSikuli();
		Thread.sleep(20000);
		System.out.println("************************************************************************************");
		System.out.println("Test Case 43 : HTTPS Validation: HTTPS is OFF for HiMobile and HiVision starts ");
	    System.out.println("************************************************************************************");
	    Thread.sleep(20000);
	    SettingsScreen hostdata = new SettingsScreen(driver);
	    hostdata.changeContextWebview();
		Thread.sleep(20000);
		System.out.println("Enter all values");
		hostdata.enterValidValues();
		Thread.sleep(2000);
		hostdata.minimizeKeyboard();
		Thread.sleep(2000);
		
		
		hostdata.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("HTTPS is OFF for both HiVision and HiMobile");
		
		hostdata.clickconntestbutton();
		Thread.sleep(5000);
		
		hostdata.changeContextWebview();
		Thread.sleep(5000);
		hostdata.mypopupSuccess();
		Thread.sleep(2000);
		
		hostdata.changeContextNativeApp();
		Thread.sleep(5000);
		hostdata.clickokbtn();
		Thread.sleep(5000);
		hostdata.scrollup();
		driver.resetApp();
		System.out.println("************************************************************************************");
	    System.out.println("Test Case 43 : HTTPS Validation: HTTPS is OFF for HiMobile and HiVision ends ");
	    System.out.println("************************************************************************************");
	    
	}  

	@Test(priority = 6)    
	public void validateHttpsFunctionalityTC4() throws InterruptedException	{
		
		System.out.println("**************************************************************************************");
	    System.out.println("Test Case 44 : HTTPS Validation: HTTPS is ON for HiMobile and OFF for HiVision starts ");
	    System.out.println("**************************************************************************************");
		
	    SettingsScreen hostdata = new SettingsScreen(driver);
		System.out.println("HTTPS is OFF for HiVision and ON for HiMobile");
		hostdata.changeContextWebview();
		Thread.sleep(5000);
		hostdata.enterValidValues();
		Thread.sleep(2000);
		hostdata.minimizeKeyboard();
		hostdata.changeContextNativeApp();
		Thread.sleep(5000);
		hostdata.checkedSecureConnectionCheckcbox();
		Thread.sleep(2000);
		hostdata.clickokbtn1();
		Thread.sleep(2000);
		hostdata.clickconntestbutton();
		Thread.sleep(2000);
		hostdata.changeContextWebview();
		Thread.sleep(5000);
		hostdata.mypopupError();
		Thread.sleep(2000);
		hostdata.changeContextNativeApp();
		Thread.sleep(5000);
		
		hostdata.clickokbtn();
		Thread.sleep(4000);
		hostdata.scrollup();
		System.out.println("Scroll up");
		driver.resetApp();
		System.out.println("**************************************************************************************");
	    System.out.println("Test Case 44 : HTTPS Validation: HTTPS is ON for HiMobile and OFF for HiVision ends ");
	    System.out.println("**************************************************************************************");
	}
    	 
}
