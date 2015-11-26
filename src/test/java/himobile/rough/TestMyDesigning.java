package himobile.rough;

import java.io.IOException;
import java.net.UnknownHostException;
import himobile.sikuli.HiVisionSikuli;
import himobile.base.TestBase;
import himobile.screens.SettingsScreen;
import himobile.testcases.SettingsScreenTestCases;
import himobile.utils.ExcelReader;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class TestMyDesigning extends TestBase{
	
	String sheetName = "SettingsScreen";
	ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
	String myTitle = dataxls.getCellData(sheetName, "Values", 2);
	String myNotification = dataxls.getCellData(sheetName, "Values", 3);
	String myHostLbl = dataxls.getCellData(sheetName, "Values", 4);
	String myPortLbl = dataxls.getCellData(sheetName, "Values", 5);
	String myUsrnameLbl = dataxls.getCellData(sheetName, "Values", 6);
	String myPasswordLbl = dataxls.getCellData(sheetName, "Values", 7);
	String myCheckbox1 = dataxls.getCellData(sheetName, "Values", 8);
	String myCheckbox2 = dataxls.getCellData(sheetName, "Values", 9);
	String myCheckbox3 = dataxls.getCellData(sheetName, "Values", 10);
	String myBtn = dataxls.getCellData(sheetName, "Values", 11);
	//String cellValueHost = dataxls.getCellData(sheetName, "Values", 15);
	String cellValuePort = dataxls.getCellData(sheetName, "Values", 16);
	String cellValueUsrname = dataxls.getCellData(sheetName, "Values", 17);
	String cellValuePwd = dataxls.getCellData(sheetName, "Values", 18);
	
	String cellInValidHost = dataxls.getCellData(sheetName, "WrongValues", 15);
	String cellInValidPort = dataxls.getCellData(sheetName, "WrongValues", 16);
	String cellInValidUsrname = dataxls.getCellData(sheetName, "WrongValues", 17);
	String cellInValidPwd = dataxls.getCellData(sheetName, "WrongValues", 18);
	
	String cellBlankHost = dataxls.getCellData(sheetName, "BlankValues", 15);
	String cellBlankPort = dataxls.getCellData(sheetName, "BlankValues", 16);
	String cellBlankUsrname = dataxls.getCellData(sheetName, "BlankValues", 17);
	String cellBlankPwd = dataxls.getCellData(sheetName, "BlankValues", 18);
	
	String mySuccessPopup = dataxls.getCellData(sheetName, "Values", 19);
	String myFailurePopup = dataxls.getCellData(sheetName, "Values", 20);
	String myHttpsAlert = dataxls.getCellData(sheetName, "Values", 12);
	String mySuccessAlert = dataxls.getCellData(sheetName, "Values", 13);
	String myFailAlert = dataxls.getCellData(sheetName, "Values", 14);
	
	@Test(priority=0)
	public void enterHostValue() throws InterruptedException, UnknownHostException {
		
		SettingsScreen hostValue = new SettingsScreen(driver);
		hostValue.changeContextWebview();
		Thread.sleep(5000);
		
		System.out.println("*************************************************************************");
		System.out.println("Test Case-3: Verify Enter HostBox Label");
		System.out.println("*************************************************************************");
		System.out.println("Enter host value");
		Thread.sleep(1000);
		System.out.println("Enter host");
		hostValue.enterValidHostValue();
		Thread.sleep(1000);
		System.out.println("Enter port");
		
		hostValue.enterPort(cellValuePort);
		hostValue.minimizeKeyboard();
		Thread.sleep(1000);
		System.out.println("Enter username");
		
		hostValue.enterUname(cellValueUsrname);
		hostValue.minimizeKeyboard();
		Thread.sleep(1000);
		System.out.println("Enter password");
		hostValue.enterPwd(cellValuePwd);
		Thread.sleep(1000);
		System.out.println("Minimize keyboard");
		hostValue.minimizeKeyboard();
				
		System.out.println("Change context to Native");
		hostValue.changeContextNativeApp();
		Thread.sleep(5000);
		
		System.out.println("Click Connection Test button");
		hostValue.clickConnectionTest();
		Thread.sleep(2000);
		
		hostValue.changeContextWebview();
		Thread.sleep(5000);
		WebElement popupText = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[2]"));
		
		System.out.println(popupText.getText());
		
		if(popupText.getText().contentEquals(mySuccessPopup)){
			System.out.println("Pass");
		}
		else	{
			System.out.println("Fail");
		}
		System.out.println("Change context to Native");
		hostValue.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Click Ok button");
		hostValue.clickokbtn();
		Thread.sleep(3000);
		System.out.println("Scrolling up");
		hostValue.scrollup();
		Thread.sleep(5000);
		System.out.println("Reset the App");
		driver.resetApp();
		Thread.sleep(5000);
		System.out.println("Done");
		}
		
		
	@Test(priority=1)
	public void blankInputBox() throws InterruptedException, UnknownHostException{
		System.out.println("Test Case-18: Verify to clear the values from edit boxes");
		
		SettingsScreen blank = new SettingsScreen(driver);
		
		System.out.println("Change context to web view");
		blank.changeContextWebview();
		Thread.sleep(5000);
		
		System.out.println("Make it blank: Host");
		blank.enterHost("");
		Thread.sleep(1000);
		System.out.println("Make it blank: Port");
		blank.enterPort("");
		blank.minimizeKeyboard();
		Thread.sleep(1000);
		System.out.println("Make it blank: Username");
		blank.enterUname("");
		blank.minimizeKeyboard();
		Thread.sleep(1000);
		System.out.println("Make it blank: Password");
		blank.enterPwd("");
		Thread.sleep(1000);
		System.out.println("All the edit boxes are blank");
		blank.minimizeKeyboard();
		//B
				
		System.out.println("Done");
		
	}
	
	@Test(priority=18)
	public void verifyFailureAlertMsg() throws InterruptedException{
		System.out.println("Test Case-19: Verify the Alert of Error failure  message");
		
		SettingsScreen alertmsg = new SettingsScreen(driver);
		
		alertmsg.changeContextNativeApp();
		Thread.sleep(5000);
		
		System.out.println("Tap on Connection Test button");
		
		//alertmsg.clickConnectionTest();
		alertmsg.clickconntestbutton();
		alertmsg.changeContextWebview();
		Thread.sleep(5000);
		WebElement popupText = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div/div/div/div[2]/div"));
		Thread.sleep(2000);
		
		if(popupText.getText().contentEquals(myFailurePopup)){
			System.out.println("Pass");
		}
		else	{
			System.out.println("Fail");
		}
		System.out.println("Failed Message comes up");
		System.out.println("Test passed");
		
		alertmsg.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Click OK");
		alertmsg.clickokbtn();
		Thread.sleep(5000);
		
		alertmsg.scrollup();
		Thread.sleep(5000);
		System.out.println("Done");
	}


	
	/*
	hostValue.changeContextWebview();
	Thread.sleep(2000);
	hostValue.blankHost();
	Thread.sleep(2000);
	hostValue.blankPort();
	Thread.sleep(2000);
	hostValue.blankUser();
	Thread.sleep(2000);
	hostValue.blankPwd();
	Thread.sleep(2000);
	hostValue.changeContextNativeApp();
	Thread.sleep(2000);
	hostValue.checkhttpsheckcbox();
	Thread.sleep(2000);
	hostValue.clickokbtn();
	Thread.sleep(2000);
	hostValue.checkautof5checkbox();
	Thread.sleep(2000);
	hostValue.checkdemomodecheckbox();
	Thread.sleep(2000);
	hostValue.clickconntestbutton();
	*/

	/*
	@Test(priority=26)
	public void exportCSVfrmIHVApp() throws FindFailed, Exception{
		//System.out.println("Testcase-27:Export CSV File from HiVision");
		SettingsScreen values = new SettingsScreen(driver);
		System.out.println("**********************************************************************************");
		System.out.println("Testcase-27: Export CSV File from HiVision");
		System.out.println("**********************************************************************************");
		values.changeContextWebview();
		Thread.sleep(5000);
		values.enterValidValues();
		Thread.sleep(5000);
		values.minimizeKeyboard();
		Thread.sleep(2000);
		values.blankHost();
		Thread.sleep(1000);
		values.blankPort();
		Thread.sleep(1000);
		values.blankUser();
		Thread.sleep(1000);
		values.blankPwd();
		Thread.sleep(1000);
		values.changeContextNativeApp();
		Thread.sleep(5000);
		values.checkhttpsheckcbox();
		Thread.sleep(1000);
		values.clickokbtn();
		values.checkautof5checkbox();
		Thread.sleep(1000);
		values.checkdemomodecheckbox();
		System.out.println("Uncheck");
		values.checkhttpsheckcbox();
		Thread.sleep(1000);
		values.clickokbtn();
		values.checkautof5checkbox();
		Thread.sleep(1000);
		values.checkdemomodecheckbox();
		Thread.sleep(1000);
		System.out.println("Click Connection Test button");
		values.clickconntestbutton();
		System.out.println("Done");
				
		HiVisionSikuli ihv = new HiVisionSikuli();
		ihv.stopService();
		Thread.sleep(5000);
		ihv.deletedatabasefolder();
		Thread.sleep(5000);
		ihv.consolidatedUsecases();
		Thread.sleep(20000);
		ihv.howToExportCsv();
		//reports.log(LogStatus.PASS, "Testcase-27: Pass");
		System.out.println("Pass");
		System.out.println("Test ends");
	}*/
	
}
