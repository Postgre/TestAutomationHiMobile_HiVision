package himobile.rough;

import himobile.base.TestBase;
import himobile.demo.TestCase1_DemoReporting;
import himobile.screens.EventsScreen;
import himobile.screens.HomeScreen;
import himobile.screens.SettingsScreen;
import himobile.sikuli.HiVisionSikuli;
import himobile.testcases.SettingsScreenTestCases;
import himobile.utils.CommonUtils;
import himobile.utils.ExcelReader;
import io.appium.java_client.NetworkConnectionSetting;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SettingsScreenTestsTestCases extends TestBase{

	
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

	String myHttpsAlert = dataxls.getCellData(sheetName, "Values", 12);
	String mySuccessAlert = dataxls.getCellData(sheetName, "Values", 13);
	String myFailAlert = dataxls.getCellData(sheetName, "Values", 14);
	String mySuccessPopup = dataxls.getCellData(sheetName, "Values", 23);
	String myFailurePopup = dataxls.getCellData(sheetName, "Values", 24);
	static final ExtentReports reports = ExtentReports.get(SettingsScreenTestCases.class);
		
		@BeforeTest
		public void reporting(){
			reports.init(System.getProperty("user.dir")+"\\SettingsScreenTestCasesReport.html", true);
		}
		
		@Test(priority=0)
		public void verifyNotification(){
			reports.startTest("Test Case-1: Verify Screen Title");
			try	{
			SettingsScreen notify = new SettingsScreen(driver);
			System.out.println("*************************************************************************");
			System.out.println("Test Case-1: Verify Screen Title");
			System.out.println("*************************************************************************");
			notify.changeContextWebview();
			System.out.println("Verify Notification text when app launched first time");
			notify.verifyNotification(myNotification);
			reports.log(LogStatus.PASS, "Notification text Validation Pass");
			} catch(Throwable t)	{
				reports.log(LogStatus.FAIL, "Test Case-1: Fail");	
			}
			
		}
		
		@Test(priority=1)
		public void verifyScreenTitle() throws InterruptedException, FileNotFoundException{
			reports.startTest("Test Case-2: Verify Screen Title");
			try	{
			SettingsScreen title = new SettingsScreen(driver);
			System.out.println("*************************************************************************");
			System.out.println("Test Case-2: Verify Screen Title");
			System.out.println("*************************************************************************");
			title.changeContextWebview();
			System.out.println("Verify Screen Title");
			title.verifyScreentitle(myTitle);
			reports.log(LogStatus.PASS, "SettingsScreen Title Validation Pass");
			} catch(Throwable t)	{
				reports.log(LogStatus.FAIL, "Test Case-2: Fail");	
			}
		}
		
		@Test(priority=2)
		public void verifyHostLabel() throws InterruptedException {
			reports.startTest("Test Case-3: Verify HostBox Label");
			try	{
			SettingsScreen host = new SettingsScreen(driver);
			System.out.println("*************************************************************************");
			System.out.println("Test Case-3: Verify HostBox Label");
			System.out.println("*************************************************************************");
			System.out.println("Host Address edit box Label");
			host.textHostbox(myHostLbl);
			reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-3: Fail");	
		}
		}
		
		@Test(priority=3)	
		public void verifyPortLabel(){
			reports.startTest("Test Case-4: Verify PortBox Label");
			try	{
			SettingsScreen port = new SettingsScreen(driver);
			System.out.println("*************************************************************************");
			System.out.println("Test Case-4: Verify PortBox Label");
			System.out.println("*************************************************************************");
			System.out.println("Port Address edit box Label");
			
			port.textPortbox(myPortLbl);
			reports.log(LogStatus.PASS, "Test Pass");
			} catch(Throwable t)	{
				reports.log(LogStatus.FAIL, "Test Case-4: Fail");	
			}
		}
		
		@Test(priority=4)
		public void verifyUserNameLabel(){
			reports.startTest("Test Case-5: Verify User Name edit box Label");
			try	{
			SettingsScreen usrname = new SettingsScreen(driver);
			System.out.println("*************************************************************************");
			System.out.println("Test Case-5: Verify User Name edit box Label");
			System.out.println("*************************************************************************");
			System.out.println("User Name edit box Label");
			usrname.textUnamebox(myUsrnameLbl);
			reports.log(LogStatus.PASS, "Test Pass");
			} catch(Throwable t)	{
				reports.log(LogStatus.FAIL, "Test Case-5: Fail");	
			}
		}
		
	@Test(priority=5)	
	public void verifyPwdLabel(){
		reports.startTest("Test Case-6: Verify PassWord Address edit box Label");
		try{
		SettingsScreen pwdval = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-6: Verify PassWord Address edit box Label");
		System.out.println("*************************************************************************");
		System.out.println("PassWord Address edit box Label");
		pwdval.textPasswordbox(myPasswordLbl);
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-6: Fail");	
		}
		}

	@Test(priority=6)
	public void verifyCheckboxHttps(){
		reports.startTest("Test Case-7: Verify the https secure checkbox label");
		try{
		SettingsScreen httpsckbox = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-7: Verify the https secure checkbox label");
		System.out.println("*************************************************************************");
		System.out.println("Verify Secure HTTPS Connection CheckBox Label");
		httpsckbox.checkedSecureConnectionCheckcbox();
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-7: Fail");	
		}
	}

	@Test(priority=7)
	public void verifyCheckboxAutoRefresh(){
		reports.startTest("Test Case-8:Verify the auto refresh checkbox label");
		try	{
		SettingsScreen autorefreshchkbox = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-8:Verify the auto refresh checkbox label");
		System.out.println("*************************************************************************");
		System.out.println("Verify Auto Refresh CheckBox Label");
		autorefreshchkbox.verifyAutorefreshCheckbox(myCheckbox2);
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-8: Fail");	
		}
	}

	@Test(priority=8)
	public void verifyCheckboxDemoMode(){
		reports.startTest("Test Case-9: Verify the demo mode checkbox label");
		try{
		SettingsScreen demomodeChkbox = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-9: Verify the demo mode checkbox label");
		System.out.println("*************************************************************************");
		System.out.println("Verify Demo Mode CheckBox");
		demomodeChkbox.verifyDemoModeCheckbox(myCheckbox3);
		demomodeChkbox.changeContextNativeApp();
		Thread.sleep(2000);
		demomodeChkbox.scrolldown();
		Thread.sleep(2000);
		demomodeChkbox.changeContextWebview();
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-9: Fail");	
		}
	}

	@Test(priority=9)
	public void verifyConnectionTestBtn() throws InterruptedException{
		reports.startTest("Test Case-10: Verify the Connection Test button label");
		try{
		SettingsScreen connectiontest = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-10: Verify the Connection Test button label");
		System.out.println("*************************************************************************");
		System.out.println("Verify Connection Test Button Label");
		connectiontest.textConnectionTestButton(myBtn);
		connectiontest.changeContextNativeApp();
		Thread.sleep(2000);
		connectiontest.scrollup();
		Thread.sleep(2000);
		connectiontest.changeContextWebview();
		Thread.sleep(2000);
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-10: Fail");	
		}
	}

	@Test(priority=10)
	public void scrollingSettingsScreen() throws InterruptedException{
		reports.startTest("Test Case-11: Verify Scrolling Functionality on Settings Screen");
		try{
		SettingsScreen scroller = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-11: Verify Scrolling Functionality on Settings Screen");
		System.out.println("*************************************************************************");
		scroller.changeContextNativeApp();
		System.out.println("Scrolling Functionality on Settings Screen");
		System.out.println("Scroll Down");
		scroller.scrolldown();
		
		System.out.println("Scroll Up");
		scroller.scrollup();
		
		scroller.changeContextWebview();
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-11: Fail");	
		}
		}

	@Test(priority=11)
	public void enterHostValue() throws InterruptedException {
		reports.startTest("Test Case-12: Verify Enter HostBox Label");
		try	{
		SettingsScreen hostValue = new SettingsScreen(driver);
		
		System.out.println("*************************************************************************");
		System.out.println("Test Case-12: Verify Enter HostBox Label");
		System.out.println("*************************************************************************");
		System.out.println("Enter host value");
		
		
		hostValue.enterValidHostValue();
		reports.log(LogStatus.PASS, "Test Pass");
	} catch(Throwable t)	{
		reports.log(LogStatus.FAIL, "Test Case-12: Fail");	
	}
	}

	@Test(priority=12)
	public void enterPortValue() {
		reports.startTest("Test Case-13: Verify Enter port value");
		try	{
		SettingsScreen portValue = new SettingsScreen(driver);
		
		System.out.println("*************************************************************************");
		System.out.println("Test Case-13: Verify Enter port value");
		System.out.println("*************************************************************************");
		
		portValue.enterPort(cellValuePort);
		portValue.minimizeKeyboard();
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-13: Fail");	
		}
	}

	@Test(priority=13)
	public void enterUsernameValue() throws Exception {
		reports.startTest("Test Case-14: Verify Enter User Name value");
		try	{
		SettingsScreen usernameValue = new SettingsScreen(driver);
		
		System.out.println("*************************************************************************");
		System.out.println("Test Case-14: Verify Enter User Name value");
		System.out.println("*************************************************************************");
		System.out.println("Enter User Name");
		
		usernameValue.enterUname(cellValueUsrname);
		
		usernameValue.minimizeKeyboard();
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-14: Fail");	
		}
	}

	@Test(priority=14)
	public void enterPWDValue() {
		reports.startTest("Test Case-15: Verify Enter User Name value");
		try{
		SettingsScreen pwdValue = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-15: Verify Enter User Name value");
		System.out.println("*************************************************************************");
		
		System.out.println("Enter the password");
		
		pwdValue.enterPwd(cellValuePwd);
		pwdValue.minimizeKeyboard();
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-15: Fail");	
		}
	}

	@Test(priority=15)
	public void tapConnectionTestbtn() throws InterruptedException{
		reports.startTest("Test Case-16: Tap on Connection Test button");
		try{
		SettingsScreen testconnection = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-16: Tap on Connection Test button");
		System.out.println("*************************************************************************");
		testconnection.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Tap on Connection Test Button");
		testconnection.clickConnectionTest();
		Thread.sleep(2000);
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-16: Fail");	
		}
		}

	@Test(priority=16)
	public void verifySuccessAlertTapConnTestBtn() throws InterruptedException{
		reports.startTest("Test Case-17: Verify Success message Alert");
		try{
		SettingsScreen alertmsgSuccess = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-17: Verify Success message Alert");
		System.out.println("*************************************************************************");
		alertmsgSuccess.changeContextWebview();
		Thread.sleep(5000);
		WebElement popupText = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/div[2]"));
		System.out.println(popupText.getText());
		if(popupText.getText().contentEquals(mySuccessPopup)){
			System.out.println("Pass");
		}
		else	{
			System.out.println("Fail");
		}
		alertmsgSuccess.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Find Ok button: "+driver.getPageSource());
		System.out.println("Click Ok button");
		alertmsgSuccess.clickokbtn();
		
		Thread.sleep(5000);
		System.out.println("scrolling up");
		alertmsgSuccess.scrollup();
		Thread.sleep(5000);
		System.out.println("Reset the App");
		driver.resetApp();
		Thread.sleep(5000);
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-17: Fail");	
		}
	}

	@Test(priority=17)
	public void blankInputBox() throws InterruptedException{
		reports.startTest("Test Case-18: Verify to clear the values from edit boxes");
		try{
		SettingsScreen blank = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-18: Verify to clear the values from edit boxes");
		System.out.println("*************************************************************************");
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
		/*
		blank.blankHost();
		blank.blankPort();
		blank.blankUser();
		blank.blankPwd();
		*/
		System.out.println("All the edit boxes are blank");
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-18: Fail");	
		}
	}

	@Test(priority=18)
	public void verifyFailureAlertMsg() throws InterruptedException{
		reports.startTest("Test Case-19: Verify the Alert of Error failure  message");
		
		SettingsScreen alertmsg = new SettingsScreen(driver);
		alertmsg.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Tap on Connection Test button");
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
		System.out.println("*************************************************************************");
		System.out.println("Test Case-19: Verify the Alert of Error failure  message");
		System.out.println("*************************************************************************");
		
		alertmsg.changeContextNativeApp();
		Thread.sleep(5000);
		alertmsg.clickokbtn();
		Thread.sleep(5000);
		//driver.resetApp();
		alertmsg.scrollup();
		Thread.sleep(5000);
		System.out.println("App reset successfully");
	}


	@Test(priority=19)
	public void tapSecurehttpscheckbox() throws InterruptedException{
			reports.startTest("Test Case-20 : Check https secure checkbox");
			try{
			SettingsScreen securehttps = new SettingsScreen(driver);
			System.out.println("*************************************************************************");
			System.out.println("Test Case-20 : Check https secure checkbox");
			System.out.println("*************************************************************************");
			securehttps.changeContextNativeApp();
			Thread.sleep(5000);
			securehttps.checkedAutorefreshCheckcbox();
			reports.log(LogStatus.PASS, "Test Pass");
			} catch(Throwable t)	{
				reports.log(LogStatus.FAIL, "Test Case-20: Fail");	
			}
		
	}

	@Test(priority=20)
	public void verifyHttpsAlert() throws InterruptedException{
		reports.startTest("Test Case-21: Verify Alerts when user tap on https checkbox");
		try{
		SettingsScreen alerthttps = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-21: Verify Alerts when user tap on https checkbox");
		System.out.println("*************************************************************************");
		alerthttps.changeContextWebview();
		
		System.out.println("Alert header when Tap on checkBox");
		
		alerthttps.myAlertHttps(myHttpsAlert);
		
		alerthttps.changeContextNativeApp();
		
		System.out.println("Tap on Ok button of pop-up message");
		alerthttps.clickokbtn();
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-21: Fail");	
		}
	}
		
	@Test(priority=21)
	public void tapAutorefreshcheckbox() throws InterruptedException{
		reports.startTest("Test Case-22: Select auto-refresh checkbox");
		try{
		SettingsScreen autorefresh = new SettingsScreen(driver);
		autorefresh.changeContextNativeApp();
		
		System.out.println("*************************************************************************");
		System.out.println("Test Case-22: Select auto-refresh checkbox");
		System.out.println("*************************************************************************");
		
		System.out.println("Select auto-refresh checkbox");
		autorefresh.checkedAutorefreshCheckcbox();
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-22: Fail");	
		}
	}

	@Test(priority=22)
	public void tapDemomodecheckbox() throws InterruptedException{
		reports.startTest("Test Case-23: select demo mode check box");
		try{
		SettingsScreen democheckbox = new SettingsScreen(driver);
		democheckbox.changeContextNativeApp();
		Thread.sleep(2000);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-23: select demo mode check box");
		System.out.println("*************************************************************************");
		Thread.sleep(2000);
		System.out.println("Select demo-mode checkbox");
		democheckbox.checkedDemoModeCheckcbox();
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-23: Fail");	
		}
	}

	@Test(priority=23)
	public void uncheckCheckboxes() throws InterruptedException{
		reports.startTest("Test Case-24: Verify to uncheck all the checkboxes");
		try{
		SettingsScreen uncheck = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-24: Verify to uncheck all the checkboxes");
		System.out.println("*************************************************************************");
		uncheck.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Uncheck the secure https checkbox");
		
		uncheck.uncheckedSecureConnectionCheckcbox();
		Thread.sleep(5000);
		System.out.println("Uncheck the auto refresh checkbox");
		uncheck.uncheckedAutorefreshCheckcbox();
		Thread.sleep(5000);
		System.out.println("Uncheck the demo mode checkbox");
		uncheck.uncheckedDemoModeCheckcbox();
		
		System.out.println("Tap on Connection Test Button");
		uncheck.clickConnectionTest();
		Thread.sleep(2000);
		
		reports.log(LogStatus.PASS, "Test Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-24: Fail");	
		}
		}
	@Test(priority = 24)    
	public void moveToEventPage() throws Exception{
		reports.startTest("TestCase-25: Move to Event Screen");
		try	{
		SettingsScreen back = new SettingsScreen(driver);
		HomeScreen title = new HomeScreen(driver);
		EventsScreen tapEventbtn = new EventsScreen(driver);
		System.out.println("**********************************************************************************");
		System.out.println("TestCase-25: Move to Event Screen");
		System.out.println("**********************************************************************************");
		Thread.sleep(5000);
		back.tapBackbtn();
		System.out.println("Verify the Home Screen");
		Thread.sleep(10000);
			
		reports.log(LogStatus.INFO, "Tap on Events Button");
		tapEventbtn.clickEvent();
		Thread.sleep(10000);
		reports.log(LogStatus.PASS, "Test Case-25:Pass");
		} catch(Throwable t)	{
		reports.log(LogStatus.FAIL, "Test Case-25: Fail");	
		}
		System.out.println("Test ends");
	}
	
	@Test(priority=25)
	public void fetchEventsSource() throws Exception		{
	reports.startTest("Testcase-26:Fetch xml file from HiMobile Apps of Events Screen");
	try	{
	System.out.println("**********************************************************************************");
	System.out.println("TestCase26- Fetch xml file from HiMobile Apps of Events Screen");
	System.out.println("**********************************************************************************");
	System.out.println("Save the pages source obtained in an xml file format named as eventlist.xml");
	Thread.sleep(5000);
	CommonUtils.saveXMLFile("eventlist.xml");
	Thread.sleep(10000);
	System.out.println("This XML file saved within a project under the properties folder");
	reports.log(LogStatus.PASS, "Testcase-26: Pass");
	} catch(Throwable t)	{
		reports.log(LogStatus.FAIL, "Test Case-26: Fail");	
		}
	Thread.sleep(5000);
		System.out.println("Test ends");
	}

	@Test(priority=26)
	public void exportCSVfrmIHVApp() throws FindFailed, Exception{
		reports.startTest("Testcase-27:Export CSV File from HiVision");
		try		{
		System.out.println("**********************************************************************************");
		System.out.println("Testcase-27: Export CSV File from HiVision");
		System.out.println("**********************************************************************************");

		HiVisionSikuli ihv = new HiVisionSikuli();
		Thread.sleep(10000);
		ihv.howToExportCsv();
		Thread.sleep(10000);
		System.out.println("Done");		
		Thread.sleep(10000);
		System.out.println("Done");
		reports.log(LogStatus.PASS, "Testcase-27: Pass");
		} catch(Throwable t)	{
			reports.log(LogStatus.FAIL, "Test Case-27: Fail");	
			}
			System.out.println("Test ends");
	}

	
	@Test(priority=27)
	public void verifyEventsIHVandHimobile() throws Exception{
		reports.startTest("Test Case 28 : Validation of of HiMobile data with HiVision");
		System.out.println("**********************************************************************************");
		System.out.println("Test Case 28 : Validation of of HiMobile data with HiVision");
		System.out.println("**********************************************************************************");
		System.out.println("From HiMobile App: Fetching data from XML File for Comparison");
		System.out.println("Reading data from eventlist.xml which is saved from getPageSource commands from Appium native code");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;
		File fXmlFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\eventlist.xml");
		Document doc = null;
				try {
					dBuilder = dbFactory.newDocumentBuilder();
					doc = dBuilder.parse(fXmlFile);
				} catch (ParserConfigurationException e) {
					System.out.println("dbFactory Thrown ParserConfigurationException");
					e.printStackTrace();
				} catch (SAXException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("android.widget.ListView");
			Node nNode = nList.item(0);
			Element e = (Element) nNode;
			NodeList nListChild = e.getChildNodes();
			String[] eventshimobile = new String[200];
					
		for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
		 	
			Node nNode1 = nListChild.item(temp2);
			Element eElement = (Element) nNode1;
			//Thread.sleep(10000);
			eventshimobile[temp2] = eElement.getAttribute("content-desc");
			System.out.println("The himobile event is " +eventshimobile[temp2]);
			}
		
			System.out.println("The number of events listed in HiMobile are " + nListChild.getLength());
			Thread.sleep(10000);
			System.out.println("From HiVision Application: Fetching data from CSV File for Comparison");
			
			System.out.println("CSV file exported successfully from HiVision");
	        String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\events.csv";
			String input;
	        int count = 0;
	        int temp1 = 0;
	        BufferedReader br1 = null;
	        String line = "";
	    	String cvsSplitBy = ";";
	    	String[] eventshivision = new String[200];
			int iteration = 0;
	        try {
	        	br1 = new BufferedReader(new FileReader(csvFile));
				while((line = br1.readLine()) != null)
				{
					if(iteration == 0 || iteration == 1 || iteration == 2 || iteration == 3) {
	                    iteration++;  
	                    continue;
	                }

					int iPos= line.lastIndexOf("\",");	
					if (iPos > -1){
						line = line.substring(0, iPos);
					}
			
						eventshivision[temp1]= line.split(cvsSplitBy)[8];
						eventshivision[temp1] = eventshivision[temp1].replaceAll("\"", "");
						System.out.println("The hivison event is " + eventshivision[temp1] );
						temp1++;
				
					count++;
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}finally {
				if (br1 != null) {
					try {
						br1.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}	

	        System.out.println("The number of events in HiVision are : "+count);
	        System.out.println("As a Result: Verify the data from both the file");
	        Assert.assertEquals(nListChild.getLength(), count);
	       	for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
			Assert.assertTrue(eventshimobile[temp2].contains(eventshivision[temp2]));
		}
	       	
	}
	
	@AfterTest
	public void tearDown(){
		
			reports.endTest();
			}
}
