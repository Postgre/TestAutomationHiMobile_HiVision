package himobile.testcases;


import himobile.screens.HomeScreen;
import himobile.screens.SettingsScreen;
//import himobile.utils.extentRepoManager;
import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
/*
import com.relevantcodes.//extentreports.//extentReports;
//import com.relevantcodes.//extentreports.////extentTest;
import com.relevantcodes.//extentreports.LogStatus;
*/
public class ApplicationInstallationLauncher {

	public static AndroidDriver driver;
	//private static //extentReports //extent = //extentManager.getInstance();
	//public static //extentReports //extent = new //extentReports(System.getProperty("user.dir")+"\\src\\test\\resources\\reporting\\HiMobileAndroidTest.html", false);
    private SoftAssert softAssert = new SoftAssert();
    //public static ////extentTest test;
    
    public static //extentReports //extent;
    //////extentTest test;
    WebDriver driver1;
    
    @BeforeClass
    public void M1(){
     //extent = //extentRepoManager.Instance();
    }
	
	@Test(priority=0)
	public static void verifyInstallationOfApp() throws Exception {
		/*test = //extent.startTest("Test1-Install Hi-Mobile App from D drive Project location in apps package on Device using Appium Desired Capabilities")
	            .assignCategory("NoAssert", "//extentAPI");
	            */
		File app = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\apps\\HiMobile-debug.apk");
		DesiredCapabilities capabilites = new DesiredCapabilities();
		
		////test.log(LogStatus.INFO, "Provide the values required in Desired Capability");
		capabilites.setCapability("device", "Android");
		capabilites.setCapability("deviceName", "Nexus 5");
		capabilites.setCapability("platformVersion", "5.0.1");
		capabilites.setCapability("platformName", "Android");
		capabilites.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		capabilites.setCapability("appPackage", "com.hirschmann.himobile");
		capabilites.setCapability("appActivity", "com.hirschmann.himobile.HiMobile");
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilites);
		driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
		

	    
		SettingsScreen title = new SettingsScreen(driver);
		////test.log(LogStatus.INFO, "Launching App - Splash Screen launched and capture screenshot");
		title.captureScreenshots();
		
		Thread.sleep(5000);
		title.changeContextWebview();
		Thread.sleep(2000);
		
		title.verifyScreentitle1();
		title.changeContextNativeApp();
		//test.log(LogStatus.INFO, "Launching App - To capture screenshot of Default startup Page : <SettingsScreen>");
		title.captureScreenshots();
		
		//extent.endTest(test);
	}
	
	@Test(priority=1)
	public void verifyAppInstallChecks() throws Exception {
	////extentTest test = //extent.startTest("Test2-Verify if App is installed on the target Device");
	
	String imgPath = System.getProperty("user.dir")+"\\screenshots\\ImageTest2.png";
	Thread.sleep(3000);
	Boolean isItInstall = driver.isAppInstalled("com.hirschmann.himobile");
		if(isItInstall = true)
		{
		//test.log(LogStatus.PASS, "App is Installed on Device-Test Pass");	
		}	else {
			//test.log(LogStatus.FAIL, "App is not Installed on Device-Test Fail" +test.addScreenCapture(imgPath));
		}
		SettingsScreen installed = new SettingsScreen(driver);
		
		installed.captureScreenshots();
		//extent.endTest(test);
	}
	
	@Test(priority=2)
	public void verifyUninstallationApp() throws Exception{
		////extentTest test = //extent.startTest("Test3-To verify the Un-Installation process of HiMobile App from Device");
		Thread.sleep(5000);
		driver.removeApp("com.hirschmann.himobile");
		
		Thread.sleep(10000);
		//test.log(LogStatus.INFO, "Check if app un-installed successfully from device");
		Boolean isItInstall = driver.isAppInstalled("com.hirschmann.himobile");		
		SettingsScreen screenshot = new SettingsScreen(driver);
		
		
		if(isItInstall != true){
			//test.log(LogStatus.PASS, "App removes successfully, from the Device. So Test3 pass.");
		}	else {
			//test.log(LogStatus.FAIL, "App is not removed successfully from this Device. Hence, Test3 fails");
			screenshot.captureScreenshots();
			
		}
		//extent.endTest(test);
	}
	
	@Test(priority=3)
	public void verifyReInstallApp() throws Exception{
		////extentTest test = //extent.startTest("Test4-Test Installation of the HiMobile App on the device from the below mentioned location.");
		Thread.sleep(5000);
		driver.installApp(System.getProperty("user.dir")+"\\src\\test\\resources\\apps\\HiMobile-debug.apk");
		Boolean isItInstall = driver.isAppInstalled("com.hirschmann.himobile");
		
		Thread.sleep(2000);
		if(isItInstall = true){
			//test.log(LogStatus.PASS, "App Re-Installed successfully - Test4 Pass");
		
		} else	{
			//test.log(LogStatus.FAIL, "App does not Re-Installed successfully - Test4 Fail");
		}
		driver.removeApp("com.hirschmann.himobile");
		//extent.endTest(test);
		
	}
	
	@Test(priority=4)
	public void verifyReinstallation() throws Exception{
		////extentTest test = //extent.startTest("Test5-Verify reinstallation of HiMobile App when App is already installed on the device");
		Thread.sleep(5000);
		driver.installApp("D:\\Automation_Appium\\wrkspace\\HiMobileFinalTestCodeAppium\\src\\test\\resources\\apps\\HiMobile-debug.apk");
		Thread.sleep(5000);
		SettingsScreen screenshot = new SettingsScreen(driver);
		
		screenshot.captureScreenshots();
		
		Boolean isItInstall = driver.isAppInstalled("com.hirschmann.himobile");
		Thread.sleep(2000);
		if(isItInstall = true){
			//test.log(LogStatus.PASS, "App Re-Installed successfully - Test5 Pass");
		} else	{
			//test.log(LogStatus.FAIL, "App Re-Installed successfully - Test5 Fail");
		}
		Thread.sleep(2000);
		driver.startActivity("com.hirschmann.himobile", ".HiMobile");
		Thread.sleep(5000);
		//extent.endTest(test);
	}
	
	@Test(priority=5)
	public void verifyCloseTheApp() throws Exception{
		////extentTest test = //extent.startTest("Test6-To Verify the HiMobile App closed");
		Thread.sleep(2000);
		driver.closeApp();
		//test.log(LogStatus.INFO, "Application closed");
		Thread.sleep(5000);
		//test.log(LogStatus.PASS, "App Closed successfully - Test6 Pass");
		//extent.endTest(test);
	}
	
	@Test(priority=6)
	public void verifyRelaunchApp() throws Exception{
		////extentTest test = //extent.startTest("Test7-To Test the ADB System relaunch App");
		Thread.sleep(2000);
		driver.launchApp();
		Thread.sleep(2000);
		
		SettingsScreen screenshot = new SettingsScreen(driver);
		
		screenshot.captureScreenshots();
		//test.log(LogStatus.PASS, "App relaunched successfully - Test7 Pass");
		//extent.endTest(test);
	}
	
	@Test(priority=7)
	public void verifyCloseMyApp() throws Exception{
		////extentTest test = //extent.startTest("Test8-To verify the Closing of HiMobile App");
		Thread.sleep(2000);
		driver.closeApp();
		Thread.sleep(2000);
		//test.log(LogStatus.PASS, "App closed successfully - Test8 Pass");
		//extent.endTest(test);
		
		
	}
	//fail
	@Test(priority=8)
	public void verifyAppRemovedfromDevice() throws Exception{
		////extentTest test = //extent.startTest("Test9-To verify the Removing of HiMobile App from Mobile device");
		driver.launchApp();
		SettingsScreen screenshot = new SettingsScreen(driver);
		
		screenshot.captureScreenshots();
		Thread.sleep(5000);
		driver.removeApp("com.hirschmann.himobile");
		Thread.sleep(2000);
		//test.log(LogStatus.INFO, "Check if app removes from device");
		Boolean isItInstall = driver.isAppInstalled("com.hirschmann.himobile");
		Thread.sleep(2000);
		if(isItInstall != true){
			//test.log(LogStatus.PASS, "App removes successfully, from the Device. So Test9 pass.");
		}	else {
			//test.log(LogStatus.FAIL, "App is not removed successfully from this Device. Hence, Test9 fails");
			
		}
		//extent.endTest(test);
	}
	//fail
	@Test(priority=9)
	public void verifyAppInstalledfromADB() throws Exception{
		////extentTest test = //extent.startTest("Test10-Installed Hi-Mobile App on target device");
		Thread.sleep(2000);
		driver.installApp("D:\\Automation_Appium\\wrkspace\\HiMobileFinalTestCodeAppium\\src\\test\\resources\\apps\\HiMobile-debug.apk");
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Verify if App installed on Device");
		Boolean isItInstall = driver.isAppInstalled("com.hirschmann.himobile");
		SettingsScreen screenshot = new SettingsScreen(driver);
		
		screenshot.captureScreenshots();
		Thread.sleep(2000);
		if(isItInstall = true){
			//test.log(LogStatus.PASS, "App Installed successfully - Test10 Pass");
		} else	{
			//test.log(LogStatus.FAIL, "App doesn't install - Test10 Fail");
		}
		//test.log(LogStatus.INFO, "Close the App");
		//extent.endTest(test);
	}
	
	
	@Test(priority=10)
	public void verifyAppRunningInBackground() throws Exception{
		////extentTest test = //extent.startTest("Test11-Verify Hi-Mobile App is running in background of target device");
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Reset app");
	    driver.resetApp();
	    SettingsScreen screenshot = new SettingsScreen(driver);
		
		screenshot.captureScreenshots();
	    Thread.sleep(2000);
	    //test.log(LogStatus.INFO, "Send app in Background");
	    driver.runAppInBackground(10);
		Thread.sleep(2000);
		//test.log(LogStatus.INFO, "App Send to Background - Test11 Pass");
		//extent.endTest(test);
		
		}
	@Test(priority=11)
	public void verifyAppIconsOnDevice() throws Exception{
		////extentTest test = //extent.startTest("Test12-Verify the GUI  of application icon & Name");
		SettingsScreen title = new SettingsScreen(driver);
		TouchAction action = new TouchAction(driver);
		title.changeContextWebview();
		Thread.sleep(5000);
		title.verifyScreentitle1();
		title.changeContextNativeApp();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Home Screen by closing app");
		Thread.sleep(2000);
		//driver.sendKeyEvent(3);
		
		Thread.sleep(2000);
		action.tap(540, 1655).perform();
		//driver.tap(1, 540, 1655, 5000);
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Tap on HiMobile icons");
		title.captureScreenshots();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//android.widget.TextView[@index='19']")).click();
		//extent.endTest(test);
	}
	@Test(priority=12)
	public void verifyAppPlaceNameVersion() throws Exception{
		////extentTest test = //extent.startTest("Test13-This test verifies the places where the name of the application has to be written.'TOP-CENTER of APP");
		SettingsScreen backb = new SettingsScreen(driver);
		//test.log(LogStatus.INFO, "tap on Back button on Settings Screen");
		backb.clickBack();
		backb.changeContextWebview();
		Thread.sleep(5000);
		HomeScreen title = new HomeScreen(driver);
		title.verifyScreenTitle();
		title.changeContextNativeApp();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Capture screen shot");
		title.captureScreenshots();
		//extent.endTest(test);
	}
	@Test(priority=13)
	public void verifyVisibilityOfAppIconAllScreens() throws Exception{
		////extentTest test = //extent.startTest("Test14-This test verifies the icon of the APP is visible on all places in the APP.Icon on each Screen");
		SettingsScreen title = new SettingsScreen(driver);
		
		//test.log(LogStatus.INFO, "Default screen is Settings - Change context to Web View");
		title.changeContextWebview();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Title of Settings Screen in Web View: "+driver.getTitle());
		title.changeContextNativeApp();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Tap on Back button");
		Thread.sleep(2000);
		title.tapBackbtn();
		//test.log(LogStatus.INFO, "New Screen is Home Screen");
		HomeScreen home = new HomeScreen(driver);
		title.changeContextWebview();
		Thread.sleep(2000);
		//test.log(LogStatus.INFO, "Title of Home Screen in Web View: "+driver.getTitle());
		title.changeContextNativeApp();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Tap on Network button");
		home.tapNetworkOption();
		Thread.sleep(2000);
		home.changeContextWebview();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Network Screen Title in Web View: "+driver.getTitle());
		home.changeContextNativeApp();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Tap on Back Button");
		home.backToHome();
		//test.log(LogStatus.INFO, "Return back to Home Screen");
		Thread.sleep(2000);
		//test.log(LogStatus.INFO, "Tap Event List button on Home Screen");
		home.tapEventListOption();
		Thread.sleep(2000);
		//test.log(LogStatus.INFO, "Event List Page open");
		home.changeContextWebview();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Title of Event List Screen: "+driver.getTitle());
		home.changeContextNativeApp();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Return back to Home Screen");
		home.backToHome();
		//test.log(LogStatus.INFO, "Done all Tests");
		//extent.endTest(test);
	}
	@Test(priority=14)
	public void verifyAppBehaviour() throws Exception{
		////extentTest test = //extent.startTest("Test15-Verify when user enters wrong details in the setting screen.");
		SettingsScreen val = new SettingsScreen(driver);
		val.changeContextWebview();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Enter wrong values in Settings Screen");
		val.enterHost("abcdefg");
		val.enterPort("0000");
		val.enterUname("1234Abcd");
		val.enterPwd("XXXXYYZ");
		val.changeContextNativeApp();
		Thread.sleep(5000);
		val.clickconntestbutton();
		Thread.sleep(2000);
		val.clickokbtn();
		//test.log(LogStatus.INFO, "Tap on Back Button");
		val.tapBackbtn();
		Thread.sleep(2000);
		val.changeContextWebview();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Home Screen Launched");
		HomeScreen itsTitle = new HomeScreen(driver);
		itsTitle.verifyScreenTitle();
		val.changeContextNativeApp();
		Thread.sleep(5000);
		//extent.endTest(test);
	}
	
	@Test(priority=15)
	public void verifyBehavAppwhenReLaunch() throws Exception{
		////extentTest test = //extent.startTest("Test16-To verify the behaviour of HiMobile application when it is re-launched again");
		SettingsScreen moveHome = new SettingsScreen(driver);
		moveHome.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("App launched");
		Thread.sleep(3000);
		System.out.println("capture photo");
		moveHome.captureScreenshots();
		Thread.sleep(3000);
		System.out.println("App navigates to Home Screen");
		moveHome.tapBackbtn();
		Thread.sleep(5000);
		System.out.println("capture HomeScreen photo");
		moveHome.captureScreenshots();
		System.out.println("Reset App");
		Thread.sleep(2000);
		driver.resetApp();
		Thread.sleep(5000);
		System.out.println("capture photo");
		moveHome.captureScreenshots();
		System.out.println("Close the App");
		Thread.sleep(2000);
		driver.closeApp();
		System.out.println("Relaunch the App");
		Thread.sleep(2000);
		driver.launchApp();
		
		
		//extent.endTest(test);
	}
	@Test(priority=16)
	public void verifyAppWhenFailToFetchData1() throws Exception{
		////extentTest test = //extent.startTest("Test17-To verify the functionlaity ​whenever aaplication fails to fetch data from HiVision.");
		SettingsScreen enterValues = new SettingsScreen(driver);
		System.out.println("When HiMobile App is not connected to HiVision");
		System.out.println("Reason1_Launch HiMobile App when no network on Device");
		enterValues.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("1- Launch HiMobile App");
		driver.resetApp();
		Thread.sleep(2000);
		NetworkConnectionSetting networkConnection = driver.getNetworkConnection(); 
		System.out.println(networkConnection.wifiEnabled());

		if (!driver.getNetworkConnection().wifiEnabled()) { 
		NetworkConnectionSetting WifiEnablesetting = new NetworkConnectionSetting(false, true, false); 
		driver.setNetworkConnection(WifiEnablesetting); 
		System.out.println(driver.getNetworkConnection().wifiEnabled());

		} else { 
		NetworkConnectionSetting WifiDisablesetting = new NetworkConnectionSetting(false, false, false); 
		driver.setNetworkConnection(WifiDisablesetting); 
		}

		/*
		NetworkConnectionSetting networkConnection = driver.getNetworkConnection(); 
		System.out.println("Reset App and disconnect wi-fi on the device ");
		networkConnection .setWifi(false); 
		driver.setNetworkConnection(networkConnection);
		*/
		/*
		NetworkConnectionSetting networkConnection = (driver).getNetworkConnection();
		Boolean status = networkConnection.wifiEnabled();
		System.out.println("wifi status:" + status);
		Boolean status2 = networkConnection.dataEnabled();
		Boolean status3 = networkConnection.airplaneModeEnabled();
		
		System.out.println("Status2[dataEnabled]: "+status2+" and Satatus3[AirPlaneMode]: "+status3);
		System.out.println("Set Wi-Fi Disabled");
		Thread.sleep(3000);
		networkConnection.setWifi(false);
		System.out.println("abcd: "+driver.getNetworkConnection());
		*/
		enterValues.changeContextWebview();
		Thread.sleep(10000);
		System.out.println("check demomode checkbox");
		enterValues.enterHost("10.11.202.128");
		enterValues.enterPort("11159");
		enterValues.enterUname("system1");
		enterValues.enterPwd("123system");
		enterValues.minimizeKeyboard();
		enterValues.changeContextNativeApp();
		Thread.sleep(5000);
		enterValues.clickconntestbutton();
		Thread.sleep(1000);
		System.out.println("Verify popup of fail msg");
		enterValues.changeContextWebview();
		Thread.sleep(5000);
		System.out.println("Verify Alerts");
		enterValues.mypopupError();
		Thread.sleep(1000);
		enterValues.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Click Ok of Popup");
		enterValues.clickokbtn();
		System.out.println("Reason1_Launch HiMobile App when User doesn't enters correct Host,Port,UserName & Password on SettingsScreen");
		
		System.out.println("Enable Wi-fi on the device");
		networkConnection .setWifi(true); 
		driver.setNetworkConnection(networkConnection);
		//extent.endTest(test);
	}
	@Test(priority=17)
	public void verifyAppWhenFailToFetchData2() throws InterruptedException{
		////extentTest test = //extent.startTest("Test18-To verify the functionlaity ​whenever aaplication fails to fetch data from HiVision.");
		System.out.println("When user enters wrong data into the input box");
		SettingsScreen enterWrongVal = new SettingsScreen(driver);
		enterWrongVal.changeContextWebview();
		Thread.sleep(5000);
		enterWrongVal.enterHost("1.1.11.111");
		enterWrongVal.enterPort("8888");
		enterWrongVal.enterUname("sys");
		enterWrongVal.enterPwd("sys12345");
		enterWrongVal.minimizeKeyboard();
		enterWrongVal.changeContextNativeApp();
		Thread.sleep(5000);
		enterWrongVal.clickconntestbutton();
		enterWrongVal.changeContextWebview();
		Thread.sleep(5000);
		enterWrongVal.mypopupError();
		enterWrongVal.changeContextNativeApp();
		Thread.sleep(5000);
		enterWrongVal.clickokbtn();
	}
	
	@Test(priority=18)
	public void verifyFetchData() throws Exception{
		////extentTest test = //extent.startTest("Test18-To verify the functionlaity whenever application tries to fetch data from HiVision.");
		System.out.println("When user enters correct data into the input box");
		SettingsScreen enterCorrectVal = new SettingsScreen(driver);
		enterCorrectVal.changeContextWebview();
		Thread.sleep(5000);
		enterCorrectVal.enterHost("1.1.11.111");
		enterCorrectVal.enterPort("8888");
		enterCorrectVal.enterUname("sys");
		enterCorrectVal.enterPwd("sys12345");
		enterCorrectVal.minimizeKeyboard();
		enterCorrectVal.changeContextNativeApp();
		Thread.sleep(5000);
		enterCorrectVal.clickconntestbutton();
		enterCorrectVal.changeContextWebview();
		Thread.sleep(5000);
		enterCorrectVal.mypopupSuccess();
		enterCorrectVal.changeContextNativeApp();
		Thread.sleep(5000);
		enterCorrectVal.clickokbtn();
		//extent.endTest(test);
	}
	@Test(priority=19)
	public void verifyAppGUIDiffScreenSize(){
		////extentTest test = //extent.startTest("Test19-To verify the applicatio UI for different screen sizes.");
		
		
		//extent.endTest(test);
	}
	@Test(priority=20)
	public void verifyHomeScreenGUI() throws Exception{
		////extentTest test = //extent.startTest("Test20-To verify the GUI of the home screen of HiMobile application.");
		System.out.println("Launch App");
		SettingsScreen myVals = new SettingsScreen(driver);
		myVals.changeContextWebview();
		Thread.sleep(5000);
		System.out.println("Enter valid data");
		myVals.enterHost("10.11.202.128");
		myVals.enterPort("11159");
		myVals.enterUname("system1");
		myVals.enterPwd("123system");
		myVals.minimizeKeyboard();
		System.out.println("Tap on Connection Test button");
		myVals.clickconntestbutton();
		myVals.changeContextWebview();
		Thread.sleep(5000);
		System.out.println("Verify successfull Alert");
		myVals.mypopupSuccess();
		myVals.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Tap on Ok button of Alert Message");
		myVals.clickokbtn();
		System.out.println("Tap on Back button");
		Thread.sleep(2000);
		myVals.clickBack();
		System.out.println("Home Screen appears");
		HomeScreen guis = new HomeScreen(driver);
		guis.changeContextWebview();
		Thread.sleep(5000);
		guis.verifyScreenTitle();
		guis.captureScreenshots();
		guis.verifyNetworkTxt();
		guis.verifyEventListTxt();
		guis.verifyDeviceTxt();
		System.out.println("Verify Bottom bar of Home Screen");
		guis.changeContextNativeApp();
		System.out.println("Tap on Settings icon at extream right on bottom bar");
		Thread.sleep(5000);
		
		guis.clickOnSettingsIcn();
		Thread.sleep(3000);
		myVals.clickBack();
		Thread.sleep(3000);
		System.out.println("Tap on  at bottom bar");
		guis.clickOnQuestionMark();
		guis.captureScreenshots();
		Thread.sleep(5000);
		//extent.endTest(test);
	}
	@Test(priority=20)
	public void verifyMainScreenGUI(){
		////extentTest test = //extent.startTest("Test21-Verify the GUI of main screen i.e. Home screen when the connection with HiVision does not exist.");
		
		
		//extent.endTest(test);
	}
	
	@Test(priority=21)
	public void verifyGUILandskape(){
		////extentTest test = //extent.startTest("Test22-Verify the GUI of main screen i.e. Home screen in landscape mode.");
		
		
		
		
		//extent.endTest(test);
	}
	@Test(priority=22)
	public void verifyGestureScroll(){
		////extentTest test = //extent.startTest("Test23. wipe the screen up and down (Scroll)");
		
		//extent.endTest(test);
	}
	
	@Test(priority=23)
	public void verifyGestureFlicks(){
		////extentTest test = //extent.startTest("Test24. wipe the screen horizontal (Flick)");
		
		
		
		//extent.endTest(test);
	}
	
	@Test(priority=24)
	public void verifyGestureWiping(){
		////extentTest test = //extent.startTest("Test25. do different wipeing gestures on the Screen");
		
		
		
		//extent.endTest(test);
	}
	@Test(priority=25)
	public void verifyOtherGestures(){
		////extentTest test = //extent.startTest("Test26. use two finger tap on the screen and make a zooming (pinch open) movement");
		//test.log(LogStatus.INFO, "Hint: open your fingers on the screen");
		
		//extent.endTest(test);
	}
	
	@Test(priority=26)
	public void verifyOtherGesturePinch(){
		////extentTest test = //extent.startTest("Test27. use two finger tap on the screen and make a scale down (pinch close)");
		//test.log(LogStatus.INFO, "movementHint: close your fingers on the screen");
		
		
		
		
		//extent.endTest(test);
	}
	
	@Test(priority=27)
	public void verifyOtherGesturecompass(){
		////extentTest test = //extent.startTest("Test28. use two finger tap on the screen and make a rotation");
		//test.log(LogStatus.INFO, "movementHint: use your fingers as a compass on the screen (one finger fixed and one is moving in a circle around)");
		
		
		
		
		//extent.endTest(test);
	}
	
	@AfterClass
	public void tearDown(){
		////extent.flush();
		////extent.close();
	}
	 }
