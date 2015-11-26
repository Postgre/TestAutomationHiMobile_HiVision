package himobile.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import himobile.base.TestBase;
import himobile.screens.SettingsScreen;
import himobile.utils.ExcelReader;

public class MyTestCasesSettingsScreen extends TestBase{
	
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
	public void verifyNotification(){
		//("Test Case-1: Verify Screen Title");
		try	{
		SettingsScreen notify = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-1: Verify Screen Title");
		System.out.println("*************************************************************************");
		notify.changeContextWebview();
		System.out.println("Verify Notification text when app launched first time");
		notify.verifyNotification(myNotification);
		System.out.println("PASS, Notification text Validation Pass");
		} catch(Throwable t)	{
			System.out.println("FAIL, Test Case-1: Fail");	
		}
		
	}
	
	@Test(priority=1)
	public void verifyScreenTitle() throws InterruptedException, FileNotFoundException{
		//("Test Case-2: Verify Screen Title");
		try	{
		SettingsScreen title = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-2: Verify Screen Title");
		System.out.println("*************************************************************************");
		title.changeContextWebview();
		System.out.println("Verify Screen Title");
		title.verifyScreentitle(myTitle);
		System.out.println("PASS, SettingsScreen Title Validation Pass");
		} catch(Throwable t)	{
			System.out.println("FAIL, Test Case-2: Fail");	
		}
	}
	
	@Test(priority=2)
	public void verifyHostLabel() throws InterruptedException {
		//("Test Case-3: Verify HostBox Label");
		try	{
		SettingsScreen host = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-3: Verify HostBox Label");
		System.out.println("*************************************************************************");
		System.out.println("Host Address edit box Label");
		host.textHostbox(myHostLbl);
		System.out.println("PASS, Test Pass");
	} catch(Throwable t)	{
		System.out.println("FAIL, Test Case-3: Fail");	
	}
	}
	
	@Test(priority=3)	
	public void verifyPortLabel(){
		//("Test Case-5: Verify PortBox Label");
		try	{
		SettingsScreen port = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-4: Verify PortBox Label");
		System.out.println("*************************************************************************");
		System.out.println("Port Address edit box Label");
		
		port.textPortbox(myPortLbl);
		System.out.println("PASS, Test Pass");
		} catch(Throwable t)	{
			System.out.println("FAIL, Test Case-4: Fail");	
		}
	}
	
	
	
		
	@Test(priority=4)
	public void verifyUserNameLabel(){
		//("Test Case-7: Verify User Name edit box Label");
		try	{
		SettingsScreen usrname = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-5: Verify User Name edit box Label");
		System.out.println("*************************************************************************");
		System.out.println("User Name edit box Label");
		usrname.textUnamebox(myUsrnameLbl);
		System.out.println("PASS, Test Pass");
		} catch(Throwable t)	{
			System.out.println("FAIL, Test Case-5: Fail");	
		}
	}
	
@Test(priority=5)	
public void verifyPwdLabel(){
	//("Test Case-9: Verify PassWord Address edit box Label");
	try{
	SettingsScreen pwdval = new SettingsScreen(driver);
	System.out.println("*************************************************************************");
	System.out.println("Test Case-6: Verify PassWord Address edit box Label");
	System.out.println("*************************************************************************");
	System.out.println("PassWord Address edit box Label");
	pwdval.textPasswordbox(myPasswordLbl);
	System.out.println("PASS, Test Pass");
	} catch(Throwable t)	{
		System.out.println("FAIL, Test Case-6: Fail");	
	}
	}
@Test(priority=6)
public void verifyCheckboxHttps(){
	//("Test Case-12: Verify the https secure checkbox label");
	try{
	SettingsScreen httpsckbox = new SettingsScreen(driver);
	System.out.println("*************************************************************************");
	System.out.println("Test Case-7: Verify the https secure checkbox label");
	System.out.println("*************************************************************************");
	System.out.println("Verify Secure HTTPS Connection CheckBox Label");
	httpsckbox.verifySecureConnectionCheckbox(myCheckbox1);
	System.out.println("PASS, Test Pass");
	} catch(Throwable t)	{
		System.out.println("FAIL, Test Case-7: Fail");	
	}
}

@Test(priority=7)
public void verifyCheckboxAutoRefresh(){
	//("Test Case-13:Verify the auto refresh checkbox label");
	try	{
	SettingsScreen autorefreshchkbox = new SettingsScreen(driver);
	System.out.println("*************************************************************************");
	System.out.println("Test Case-8:Verify the auto refresh checkbox label");
	System.out.println("*************************************************************************");
	System.out.println("Verify Auto Refresh CheckBox Label");
	autorefreshchkbox.verifyAutorefreshCheckbox(myCheckbox2);
	System.out.println("PASS, Test Pass");
	} catch(Throwable t)	{
		System.out.println("FAIL, Test Case-8: Fail");	
	}
}

@Test(priority=8)
public void verifyCheckboxDemoMode(){
	//("Test Case-14: Verify the demo mode checkbox label");
	try{
	SettingsScreen demomodeChkbox = new SettingsScreen(driver);
	System.out.println("*************************************************************************");
	System.out.println("Test Case-9: Verify the demo mode checkbox label");
	System.out.println("*************************************************************************");
	System.out.println("Verify Demo Mode CheckBox");
	demomodeChkbox.verifyDemoModeCheckbox(myCheckbox3);
	System.out.println("PASS, Test Pass");
	} catch(Throwable t)	{
		System.out.println("FAIL, Test Case-9: Fail");	
	}
}

@Test(priority=9)
public void verifyConnectionTestBtn() throws InterruptedException{
	//("Test Case-15: Verify the Connection Test button label");
	try{
	SettingsScreen connectiontest = new SettingsScreen(driver);
	System.out.println("*************************************************************************");
	System.out.println("Test Case-10: Verify the Connection Test button label");
	System.out.println("*************************************************************************");
	System.out.println("Verify Connection Test Button Label");
	connectiontest.textConnectionTestButton(myBtn);
	
	System.out.println("PASS, Test Pass");
	} catch(Throwable t)	{
	System.out.println("FAIL, Test Case-10: Fail");	
	}
}

/*

*/

}
