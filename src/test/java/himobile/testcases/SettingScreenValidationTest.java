package himobile.testcases;

import io.appium.java_client.NetworkConnectionSetting;
import himobile.base.TestBase;
import himobile.screens.SettingsScreen;
import himobile.sikuli.HiVisionSikuli;
import himobile.utils.ExcelReader;

import org.openqa.selenium.ScreenOrientation;
import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class SettingScreenValidationTest extends TestBase		{

String sheetName = "SettingsScreen";
ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
String myHttpsAlert = dataxls.getCellData(sheetName, "Values", 12);
String mySuccessAlert = dataxls.getCellData(sheetName, "Values", 13);
String myFailAlert = dataxls.getCellData(sheetName, "Values", 14);
String cellValueHost = dataxls.getCellData(sheetName, "Values", 15);
String cellValuePort = dataxls.getCellData(sheetName, "Values", 16);
String cellValueUsrname = dataxls.getCellData(sheetName, "Values", 17);
String cellValuePwd = dataxls.getCellData(sheetName, "Values", 18);
String cellValueInValidHost = dataxls.getCellData(sheetName, "Values", 19);
String cellValueInValidPort = dataxls.getCellData(sheetName, "Values", 20);
String cellValueInValidUsrname = dataxls.getCellData(sheetName, "Values", 21);
String cellValueInValidPwd = dataxls.getCellData(sheetName, "Values", 22);
static final ExtentReports reports = ExtentReports.get(SettingsScreenTestCases.class);
	
	@BeforeTest
	public void reporting(){
		reports.init(System.getProperty("user.dir")+"\\SettingsScreenTestCasesReport.html", true);
	}
				
	@AfterMethod
	public void resettingApp() throws Exception{
		System.out.println("Reset HiMobile App");
		Thread.sleep(1000);
		driver.resetApp();
		Thread.sleep(1000);
	}
	
	@Test(priority = 0)    
	public void enterValidData() throws InterruptedException	{
		reports.startTest("Test Case 24 : Verify Connection Test popup window when Enter Valid Data in Editboxes");
		try	{
		SettingsScreen validdata = new SettingsScreen(driver);
		System.out.println("*************************************");
		System.out.println("Test Case 24 : Verify Connection Test popup window when Enter Valid Data in Editboxes");
	    System.out.println("*************************************");
	   
	    validdata.changeContextWebview();
	    Thread.sleep(5000);
		System.out.println("Enter the IP address of the Hivision server");
		validdata.enterValidValues();
		Thread.sleep(2000);
		validdata.minimizeKeyboard();
		Thread.sleep(2000);
		validdata.changeContextNativeApp();
		Thread.sleep(5000);
		validdata.clickconntestbutton();
		Thread.sleep(1000);
		validdata.changeContextWebview();
		Thread.sleep(5000);
		validdata.myAlertSuccess(mySuccessAlert);
		Thread.sleep(1000);
		validdata.changeContextNativeApp();
		Thread.sleep(5000);
		validdata.clickokbtn();
		Thread.sleep(2000);
		reports.log(LogStatus.PASS, "Test Case-24:Pass");
		} catch(Throwable t)	{
		reports.log(LogStatus.FAIL, "Test Case-24: Fail");	
		}
		System.out.println("Test ends");
		
	}

	@Test(priority = 1)    
	public void enterInvalidIpaddress() throws InterruptedException	{
		reports.startTest("Test Case 25 : Verify Connection Test popup window when Enter Invalid IP Address Starts");
		try	{
		System.out.println("*********************************************");
	    System.out.println("Test Case 25 : Verify Connection Test popup window when Enter Invalid IP Address Starts");
	    System.out.println("*********************************************");
	    
		System.out.println("Launch Settings Screen");
		SettingsScreen hostdata = new SettingsScreen(driver);
		hostdata.changeContextWebview();
	    Thread.sleep(5000);
	    hostdata.enterValidValues();
	    Thread.sleep(2000);
	    hostdata.minimizeKeyboard();
	    Thread.sleep(2000);
	    
		System.out.println("Enter a Invalid Host IP");
		hostdata.enterHost(cellValueInValidHost);
		Thread.sleep(2000);
		hostdata.changeContextNativeApp();
		Thread.sleep(3000);
		hostdata.clickconntestbutton();
		Thread.sleep(1000);
		hostdata.changeContextWebview();
		Thread.sleep(10000);
		hostdata.myAlertError(myFailAlert);
		Thread.sleep(2000);
		hostdata.changeContextNativeApp();
		Thread.sleep(2000);
		hostdata.clickokbtn();
		Thread.sleep(2000);
		reports.log(LogStatus.PASS, "Test Case-25:Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-25: Fail");	
		}
		System.out.println("Test ends");
		
	}

	@Test(priority = 2)    
	public void enterInvalidPort() throws InterruptedException	{
		reports.startTest("Test Case 26 : Verify Connection Test popup window when Enter Invalid Port number Starts");
		try	{
		System.out.println("**********************************************");
	    System.out.println("Test Case 26 : Verify Connection Test popup window when Enter Invalid Port number Starts");
	    System.out.println("**********************************************");
	    
		System.out.println("Launch Settings Screen");
		SettingsScreen hostdata = new SettingsScreen(driver);
		hostdata.changeContextWebview();
	    Thread.sleep(5000);
	    hostdata.enterValidValues();
	    Thread.sleep(2000);
	    hostdata.minimizeKeyboard();
	    Thread.sleep(2000);
	    
		System.out.println("Enter a Invalid port number");
		Thread.sleep(1000);
		hostdata.enterPort(cellValueInValidPort);
		Thread.sleep(1000);
		hostdata.minimizeKeyboard();
		Thread.sleep(1000);
		hostdata.changeContextNativeApp();
		Thread.sleep(5000);
		hostdata.clickconntestbutton();
		Thread.sleep(2000);
		hostdata.changeContextWebview();
	    Thread.sleep(3000);
		hostdata.myAlertError(myFailAlert);
		Thread.sleep(2000);	
		hostdata.changeContextNativeApp();
		Thread.sleep(2000);
		hostdata.clickokbtn();
		Thread.sleep(1000);
		Thread.sleep(2000);
		reports.log(LogStatus.PASS, "Test Case-26:Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-26: Fail");	
		}
		System.out.println("Test ends");
		
	}
	@Test(priority = 3)    
	public void enterInvalidUsrname() throws InterruptedException	{
		reports.startTest("Test Case 27 : Verify Connection Test popup window when Enter Invalid Username Starts");
		try	{
		System.out.println("*******************************************");
	    System.out.println("Test Case 27 : Verify Connection Test popup window when Enter Invalid Username Starts");
	    System.out.println("*******************************************");
	    
		SettingsScreen hostdata = new SettingsScreen(driver);
		hostdata.changeContextWebview();
		Thread.sleep(5000);
		hostdata.enterValidValues();
		Thread.sleep(2000);
	    hostdata.minimizeKeyboard();
	    Thread.sleep(2000);
		
		System.out.println("Enter Invalid password credentials");
		Thread.sleep(1000);
		hostdata.enterPwd(cellValueInValidUsrname);
		Thread.sleep(1000);
		hostdata.changeContextNativeApp();
		Thread.sleep(3000);
		System.out.println("Tap on Connection Test button");
		hostdata.clickconntestbutton();
		hostdata.changeContextWebview();
		Thread.sleep(3000);
		System.out.println("Verify the Error message");
		hostdata.myAlertError(myFailAlert);
		Thread.sleep(3000);
		hostdata.changeContextNativeApp();
		Thread.sleep(3000);
		System.out.println("Tap on Ok button of Alert Message");
		hostdata.clickokbtn();
		Thread.sleep(2000);
		reports.log(LogStatus.PASS, "Test Case-27:Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-27: Fail");	
		}
		System.out.println("Test ends");
		
	}

	@Test(priority = 4)    
	public void enterInvalidPwd() throws InterruptedException	{
		reports.startTest("Test Case 28 : Verify Connection Test popup window when Enter Invalid Password Starts");
		try	{
		System.out.println("*******************************************");
	    System.out.println("Test Case 28 : Verify Connection Test popup window when Enter Invalid Password Starts");
	    System.out.println("*******************************************");
	    		SettingsScreen hostdata = new SettingsScreen(driver);
		hostdata.changeContextWebview();
		Thread.sleep(5000);
		hostdata.enterValidValues();
		Thread.sleep(2000);
	    hostdata.minimizeKeyboard();
	    Thread.sleep(2000);
		
		System.out.println("Enter Invalid password credentials");
		Thread.sleep(1000);
		hostdata.enterPwd(cellValueInValidPwd);
		Thread.sleep(1000);
		hostdata.changeContextNativeApp();
		Thread.sleep(3000);
		System.out.println("Tap on Connection Test button");
		hostdata.clickconntestbutton();
		hostdata.changeContextWebview();
		Thread.sleep(3000);
		System.out.println("Verify the Error message");
		hostdata.myAlertError(myFailAlert);
		Thread.sleep(3000);
		hostdata.changeContextNativeApp();
		Thread.sleep(3000);
		System.out.println("Tap on Ok button of Alert Message");
		hostdata.clickokbtn();
		Thread.sleep(2000);
		reports.log(LogStatus.PASS, "Test Case-28:Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-28: Fail");	
		}
		System.out.println("Test ends");
		
	}
	@Test(priority = 5)
	public void networkDisconnectTC1() throws Exception{
		reports.startTest("Test Case 29 : Verify Network Disconnect functionality: WiFi disconnected starts");
		try	{
		SettingsScreen hostdata = new SettingsScreen(driver);
					
		System.out.println("*********************************************************************************");
		System.out.println("Test Case 29 : Verify Network Disconnect functionality: WiFi disconnected starts");
		System.out.println("**********************************************************************************");
			        
		Thread.sleep(3000);
		System.out.println("Change Context to WebView");
		hostdata.changeContextWebview();
		Thread.sleep(5000);
		hostdata.enterValidValues();
		Thread.sleep(1000);
		hostdata.minimizeKeyboard();
		Thread.sleep(2000);
		System.out.println("Change Context to Native App");
		hostdata.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Disable Network connectivity Wi-Fi");
		Thread.sleep(2000);
		hostdata.disableWiFi();
		Thread.sleep(5000);
		System.out.println("Tap on Connection test button");
		Thread.sleep(5000);
		hostdata.clickconntestbutton();
		Thread.sleep(1000);
		System.out.println("Change context to Web");
		hostdata.changeContextWebview();
		Thread.sleep(3000);
		hostdata.mypopupError();
		Thread.sleep(1000);
		System.out.println("Change context to Native App");
		hostdata.changeContextNativeApp();
		Thread.sleep(3000);
		hostdata.clickokbtn();
		Thread.sleep(1000);
		System.out.println("Scrolling up");
		Thread.sleep(1000);
		hostdata.scrollup();
		System.out.println("USER INTERVENTION REQUIRED: Please Turn on the WiFi on the device");
		System.out.println("Network connectivity is available on device");
		System.out.println("Enabled Wi-Fi");
		Thread.sleep(2000);
		hostdata.enableWiFi();
		Thread.sleep(5000);
		System.out.println("Test End");
		reports.log(LogStatus.PASS, "Test Case-29:Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-29: Fail");	
		}
		System.out.println("Done");
	}

	@Test(priority = 6) 
	public void networkDisconnectTC2() throws FindFailed, Exception	{
		reports.startTest("Test Case 30 : Network Disconnect functionality: HiVision services starts");
		try	{					
		System.out.println("*************************************************************************");
		System.out.println("SIKULI: USER INTERVENTION REQUIRED: Turn off the HiVision services");
		HiVisionSikuli stopHivision = new HiVisionSikuli();
		System.out.println("Stop HiVision Services from GUI using Sikuli");
		stopHivision.IHVGUIServicesStopping();
		System.out.println("HiVision GUI stops the IHV services");
		stopHivision.waitingOneMin();
		System.out.println("Wait some time");
	    System.out.println("Test Case 30 : Network Disconnect functionality: HiVision services starts");
	    System.out.println("*************************************************************************");
	    SettingsScreen hostdata = new SettingsScreen(driver);
		
		System.out.println("Click Connection Test button of HiMobile App");
		Thread.sleep(10000);
		hostdata.clickconntestbutton();
		Thread.sleep(5000);
		hostdata.changeContextWebview();
		Thread.sleep(5000);
		hostdata.mypopupError();
		Thread.sleep(3000);
		hostdata.changeContextNativeApp();
		Thread.sleep(5000);
		hostdata.clickokbtn();
		Thread.sleep(5000);
		hostdata.scrollup();
		Thread.sleep(10000);
				
		Thread.sleep(5000);
		stopHivision.consolidatedUsecases();
		Thread.sleep(30000);
		reports.log(LogStatus.PASS, "Test Case-30:Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-30: Fail");	
		}
	 } 

	
}

