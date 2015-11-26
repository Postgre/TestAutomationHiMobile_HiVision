package himobile.testcases;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import himobile.base.TestBase;
import himobile.screens.SettingsScreen;
import himobile.utils.CommonUtils;
import himobile.utils.ExcelReader;

public class SettingsScreenTestCasesNexus7 extends TestBase{
	
	@Test(priority=0)
	public void verifyScreenTitle() throws InterruptedException, FileNotFoundException{
		SettingsScreen title = new SettingsScreen(driver);
		
		System.out.println("*************************************************************************");
		System.out.println("Test Case-1: Verify Screen Title");
		System.out.println("*************************************************************************");
		title.changeContextNativeApp();
		Thread.sleep(5000);
		CommonUtils.saveXMLFile("DataXMLFile.xml");
		//Thread.sleep(10000);
		title.changeContextWebview();
		//Thread.sleep(10000);
		System.out.println("Verify Screen Title");
		CommonUtils.saveXMLFile("SettingsScreenWebCode.html");
		title.verifyScreentitle1();
		
	}
	
	@Test(priority=1)
	public void verifyHostLabel() throws InterruptedException {
		SettingsScreen host = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-2: Verify HostBox Label");
		System.out.println("*************************************************************************");
		System.out.println("Host Address edit box Label");
		//host.textHostbox();
	}
	
	@Test(priority=2)
	public void enterHostValue() throws InterruptedException {
		SettingsScreen hostValue = new SettingsScreen(driver);
		String sheetName = "TestSheet";
		ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
		System.out.println("*************************************************************************");
		System.out.println("Test Case-3: Verify Enter HostBox Label");
		System.out.println("*************************************************************************");
		System.out.println("Enter host value");
		String thatcell = dataxls.getCellData(sheetName, "host", 2);
		//Thread.sleep(5000);
		hostValue.enterHost(thatcell);
	}
	
	
	@Test(priority=3)	
	public void verifyPortLabel(){
		SettingsScreen port = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-4: Verify PortBox Label");
		System.out.println("*************************************************************************");
		System.out.println("Port Address edit box Label");
		
		//port.textPortbox();
	}
	
	@Test(priority=4)
	public void enterPortValue() {
		SettingsScreen portValue = new SettingsScreen(driver);
		String sheetName = "TestSheet";
		ExcelReader exl = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
		System.out.println("*************************************************************************");
		System.out.println("Test Case-5: Verify Enter port value");
		System.out.println("*************************************************************************");
		String portcell = exl.getCellData(sheetName, "port", 2);
		portValue.enterPort(portcell);
		driver.hideKeyboard();
	}
			
	@Test(priority=5)
	public void verifyUserNameLabel(){
		SettingsScreen usrname = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-6: Verify User Name edit box Label");
		System.out.println("*************************************************************************");
		System.out.println("User Name edit box Label");
		//usrname.textUnamebox();
	}
	
	@Test(priority=6)
	public void enterUsernameValue() throws Exception {
		SettingsScreen usernameValue = new SettingsScreen(driver);
		String sheetName = "TestSheet";
		ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
		System.out.println("*************************************************************************");
		System.out.println("Test Case-7: Verify Enter User Name value");
		System.out.println("*************************************************************************");
		System.out.println("Enter User Name");
		String usrcell = dataxls.getCellData(sheetName, "username", 2);
		usernameValue.enterUname(usrcell);
		//Thread.sleep(2000);
		usernameValue.minimizeKeyboard();
	}
	
	@Test(priority=7)	
	public void verifyPwdLabel(){
		SettingsScreen pwdval = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-8: Verify PassWord Address edit box Label");
		System.out.println("*************************************************************************");
		System.out.println("PassWord Address edit box Label");
		//pwdval.textPasswordbox();
	}

	@Test(priority=8)
	public void enterPWDValue() {
		SettingsScreen pwdValue = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-9: Verify Enter User Name value");
		System.out.println("*************************************************************************");
		String sheetName = "TestSheet";
		ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
		System.out.println("Enter User Name");
		String pwdcell = dataxls.getCellData(sheetName, "password", 2);
		pwdValue.enterPwd(pwdcell);
		driver.hideKeyboard();
	}
	/*
	@Test(priority=9)
	public void scrollingSettingsScreen() throws InterruptedException{
		SettingsScreen scroller = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-10: Verify Scrolling Functionality on Settings Screen");
		System.out.println("*************************************************************************");
		scroller.changeContextNativeApp();
		System.out.println("Scrolling Functionality on Settings Screen");
		System.out.println("Scroll Down");
		scroller.scrolldown();
		//Thread.sleep(2000);
		System.out.println("Scroll Up");
		scroller.scrollup();
		//Thread.sleep(2000);
		System.out.println("Scroll Down-again");
		scroller.scrolldown();
		scroller.changeContextWebview();
		}
	*/
	
	@Test(priority=10)
	public void verifyCheckboxHttps(){
		SettingsScreen httpsckbox = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-11: Verify the https secure checkbox label");
		System.out.println("*************************************************************************");
		System.out.println("Verify Secure HTTPS Connection CheckBox Label");
		//httpsckbox.textUseSecureCheckbox();
	}

	@Test(priority=11)
	public void verifyCheckboxAutoRefresh(){
		SettingsScreen autorefreshchkbox = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-12:Verify the auto refresh checkbox label");
		System.out.println("*************************************************************************");
		System.out.println("Verify Auto Refresh CheckBox Label");
		//autorefreshchkbox.textAutoRefreshCheckbox();
	}

	@Test(priority=12)
	public void verifyCheckboxDemoMode(){
		SettingsScreen demomodeChkbox = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-13: Verify the demo mode checkbox label");
		System.out.println("*************************************************************************");
		System.out.println("Verify Demo Mode CheckBox");
		//demomodeChkbox.textDemoModeCheckbox();
	}

	@Test(priority=13)
	public void verifyConnectionTestBtn() throws InterruptedException{
		SettingsScreen connectiontest = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-14: Verify the Connection Test button label");
		System.out.println("*************************************************************************");
		System.out.println("Verify Connection Test Button Label");
		//connectiontest.textConnectionTestButton();
		connectiontest.changeContextNativeApp();
		//Thread.sleep(10000);
		System.out.println("Scroll up");
		connectiontest.scrollup();
	}

	@Test(priority=14)
	public void blankInputBox() throws InterruptedException{
		SettingsScreen blank = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-15: Verify to clear the values from edit boxes");
		System.out.println("*************************************************************************");
		blank.changeContextWebview();
		//Thread.sleep(10000);
		blank.blankHost();
		blank.blankPort();
		blank.blankUser();
		blank.blankPwd();
		System.out.println("All the edit boxes are blank");
	}

	@Test(priority=15)
	public void tapSecurehttpscheckbox() throws InterruptedException{
			SettingsScreen securehttps = new SettingsScreen(driver);
			System.out.println("*************************************************************************");
			System.out.println("Test Case-16 : Check https secure checkbox");
			System.out.println("*************************************************************************");
			securehttps.changeContextNativeApp();
			Thread.sleep(5000);
			securehttps.checkedSecureConnectionCheckcbox();
		
	}

	@Test(priority=16)
	public void verifyHttpsAlert() throws InterruptedException{
		SettingsScreen alerthttps = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-17: Verify Alerts when user tap on https checkbox");
		System.out.println("*************************************************************************");
		alerthttps.changeContextWebview();
		Thread.sleep(5000);
		System.out.println("Alert header when Tap on checkBox");
		Thread.sleep(2000);
		//alerthttps.mypopupAlerthttpsMsg();
		Thread.sleep(2000);
		alerthttps.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Tap on Ok button of pop-up message");
		alerthttps.clickokbtn();
	}
		
	@Test(priority=17)
	public void tapAutorefreshcheckbox() throws InterruptedException{
		SettingsScreen autorefresh = new SettingsScreen(driver);
		autorefresh.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-18: Select auto-refresh checkbox");
		System.out.println("*************************************************************************");
		Thread.sleep(5000);
		System.out.println("Select auto-refresh checkbox");
		autorefresh.checkedAutorefreshCheckcbox();
	}

	@Test(priority=18)
	public void tapDemomodecheckbox() throws InterruptedException{
		SettingsScreen democheckbox = new SettingsScreen(driver);
		democheckbox.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-19: select demo mode check box");
		System.out.println("*************************************************************************");
		Thread.sleep(5000);
		System.out.println("Select demo-mode checkbox");
		democheckbox.checkedDemoModeCheckcbox();
	}

	@Test(priority=19)
	public void tapConnectionTestbtn() throws InterruptedException{
		SettingsScreen testconnection = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-20: Tap on Connection Test button");
		System.out.println("*************************************************************************");
		Thread.sleep(2000);
		System.out.println("Tap on Connection Test Button");
		testconnection.clickconntestbutton();
		Thread.sleep(2000);
		}

	@Test(priority=20)
	public void verifySuccessAlertTapConnTestBtn() throws InterruptedException{
		SettingsScreen alertmsgSuccess = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-21: Verify Success message Alert");
		System.out.println("*************************************************************************");
		alertmsgSuccess.changeContextWebview();
		Thread.sleep(5000);
		alertmsgSuccess.mypopupSuccess();
		
		alertmsgSuccess.changeContextNativeApp();
		Thread.sleep(5000);
		alertmsgSuccess.clickokbtn();
		System.out.println("Yes, scrolling up");
		Thread.sleep(5000);
		alertmsgSuccess.scrollup();
	}

	@Test(priority=21)
	public void uncheckCheckboxes() throws InterruptedException{
		SettingsScreen uncheck = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-22: Verify to uncheck all the checkboxes");
		System.out.println("*************************************************************************");
		uncheck.changeContextNativeApp();
		Thread.sleep(15000);
		System.out.println("Uncheck the secure https checkbox");
		uncheck.uncheckedSecureConnectionCheckcbox();
		Thread.sleep(3000);
		System.out.println("Uncheck the auto refresh checkbox");
		uncheck.uncheckedAutorefreshCheckcbox();
		Thread.sleep(3000);
		System.out.println("Uncheck the demo mode checkbox");
		uncheck.uncheckedDemoModeCheckcbox();
		Thread.sleep(5000);
		System.out.println("Tap on Connection Test Button");
		uncheck.clickconntestbutton();
		Thread.sleep(5000);
		uncheck.scrollup();
		}

	
	@Test(priority=22)
	public void verifyFailureAlertMsg() throws InterruptedException{
		SettingsScreen alertmsg = new SettingsScreen(driver);
		System.out.println("*************************************************************************");
		System.out.println("Test Case-23: Verify the Alert of Error failure  message");
		System.out.println("*************************************************************************");
		alertmsg.changeContextWebview();
		Thread.sleep(5000);
		alertmsg.mypopupError();
		Thread.sleep(1000);
		alertmsg.changeContextNativeApp();
		Thread.sleep(5000);
		alertmsg.clickokbtn();
		Thread.sleep(2000);
		alertmsg.scrollup();
		Thread.sleep(2000);
		driver.resetApp();
	}
	

}
