package himobile.testcases;

import himobile.screens.SettingsScreen;
import himobile.utils.ExcelReader;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import himobile.base.TestBase;

public class EnterValuesSettingsScreen extends TestBase{
	
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
	String cellValueHost = dataxls.getCellData(sheetName, "Values", 15);
	String cellValuePort = dataxls.getCellData(sheetName, "Values", 16);
	String cellValueUsrname = dataxls.getCellData(sheetName, "Values", 17);
	String cellValuePwd = dataxls.getCellData(sheetName, "Values", 18);
	String cellInValidHost = dataxls.getCellData(sheetName, "Values", 19);
	String cellInValidPort = dataxls.getCellData(sheetName, "Values", 20);
	String cellInValidUsrname = dataxls.getCellData(sheetName, "Values", 21);
	String cellInValidPwd = dataxls.getCellData(sheetName, "Values", 22);
	String myHttpsAlert = dataxls.getCellData(sheetName, "Values", 12);
	String mySuccessAlert = dataxls.getCellData(sheetName, "Values", 13);
	String myFailAlert = dataxls.getCellData(sheetName, "Values", 14);
	
	@Test(priority=0)
	public void enterHostValue() throws InterruptedException {
		
		try	{
		SettingsScreen hostValue = new SettingsScreen(driver);
		
		System.out.println("*************************************************************************");
		System.out.println("Test Case-3: Verify Enter HostBox Label");
		System.out.println("*************************************************************************");
		hostValue.changeContextWebview();
		Thread.sleep(5000);
		System.out.println("Enter host value");
			
		hostValue.enterHost(cellValueHost);
		hostValue.minimizeKeyboard();
		System.out.println("PASS, Test Pass");
		} catch(Throwable t)	{
		System.out.println("FAIL, Test Case-4: Fail");	
		}
	}

	@Test(priority=1)
	public void enterPortValue() {
		//reports.startTest("Test Case-6: Verify Enter port value");
		try	{
		SettingsScreen portValue = new SettingsScreen(driver);
		
		System.out.println("*************************************************************************");
		System.out.println("Test Case-6: Verify Enter port value");
		System.out.println("*************************************************************************");
		
		portValue.enterPort(cellValuePort);
		portValue.minimizeKeyboard();
		System.out.println("PASS, Test Pass");
		} catch(Throwable t)	{
			System.out.println("FAIL, Test Case-6: Fail");	
		}
	}

	@Test(priority=2)
	public void enterUsernameValue() throws Exception {
		//reports.startTest("Test Case-8: Verify Enter User Name value");
		try	{
		SettingsScreen usernameValue = new SettingsScreen(driver);
		
		System.out.println("*************************************************************************");
		System.out.println("Test Case-8: Verify Enter User Name value");
		System.out.println("*************************************************************************");
		System.out.println("Enter User Name");
		
		usernameValue.enterUname(cellValueUsrname);
		
		usernameValue.minimizeKeyboard();
		System.out.println("PASS, Test Pass");
		} catch(Throwable t)	{
			System.out.println("FAIL, Test Case-8: Fail");	
		}
	}

	@Test(priority=3)
	public void enterPWDValue() {
		//reports.startTest("Test Case-10: Verify Enter User Name value");
		try{
		SettingsScreen pwdValue = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-10: Verify Enter User Name value");
		System.out.println("*************************************************************************");
		
		System.out.println("Enter the password");
		
		pwdValue.enterPwd(cellValuePwd);
		pwdValue.minimizeKeyboard();
		System.out.println("PASS, Test Pass");
		} catch(Throwable t)	{
		System.out.println("FAIL, Test Case-10: Fail");	
		}
	}
	@Test(priority=4)
	public void scrollingUp() throws InterruptedException{
		SettingsScreen connectiontest = new SettingsScreen(driver);
		connectiontest.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Scroll up");
		connectiontest.scrollup();
		Thread.sleep(5000);
		System.out.println("Done");
	}
	
	@Test(priority=5)
	public void tapConnectionTestbtn() throws InterruptedException{
		//reports.startTest("Test Case-21: Tap on Connection Test button");
		try{
		SettingsScreen testconnection = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-21: Tap on Connection Test button");
		System.out.println("*************************************************************************");
		
		testconnection.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Tap on Connection Test Button");
		testconnection.clickconntestbutton();
		Thread.sleep(2000);
		System.out.println("PASS, Test Pass");
		} catch(Throwable t)	{
		System.out.println("FAIL, Test Case-21: Fail");	
		}
		}
	@Test(priority=6)
	public void verifySuccessAlertTapConnTestBtn() throws InterruptedException{
		//reports.startTest("Test Case-22: Verify Success message Alert");
		try{
		SettingsScreen alertmsgSuccess = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-22: Verify Success message Alert");
		System.out.println("*************************************************************************");
		alertmsgSuccess.changeContextWebview();
		Thread.sleep(2000);
		alertmsgSuccess.myAlertSuccess(mySuccessAlert);
		Thread.sleep(2000);
		alertmsgSuccess.changeContextNativeApp();
		Thread.sleep(2000);
		alertmsgSuccess.clickokbtn();
		System.out.println("Yes, scrolling up");
		Thread.sleep(5000);
		alertmsgSuccess.scrollup();
		System.out.println("PASS, Test Pass");
		} catch(Throwable t)	{
		System.out.println("FAIL, Test Case-22: Fail");	
		}
	}



}
