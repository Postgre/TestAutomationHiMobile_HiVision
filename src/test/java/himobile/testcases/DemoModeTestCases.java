package himobile.testcases;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import java.io.FileNotFoundException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
/*
import com.relevantcodes.//extentreports.//extentReports;
import com.relevantcodes.//extentreports.////extentTest;
import himobile.utils.extentRepoManager;
import com.relevantcodes.//extentreports.LogStatus;
*/
import himobile.base.TestBase;
import himobile.screens.HomeScreen;
import himobile.screens.SettingsScreen;
import himobile.utils.CommonUtils;


public class DemoModeTestCases extends TestBase{
	//Reporting
	//extentReports //extent;
	////extentReports //extent = new //extentReports(System.getProperty("user.dir")+"\\src\\test\\java\\propertiesLogs\\Reports.html", false);
	////extentTest test;
	
	/*
	@BeforeMethod
	 public void setUp(){
		extent = extentRepoManager.Instance();
		}
		*/
	 //Reporting
	@Test(priority=0)
	public void defaultStatusOfCheckbox() throws InterruptedException{
		SettingsScreen demomode = new SettingsScreen(driver);
		demomode.changeContextWebview();
		Thread.sleep(10000);
		//demomode.textDemoModeCheckbox();
		demomode.defaultStatusDemocheckboxWeb();
		demomode.changeContextNativeApp();
		Thread.sleep(10000);
		demomode.defaultdemomodecheckbox();
		}
	
	@Test(priority=1)
	public void verifyAlertDemoisOFF() throws InterruptedException, FileNotFoundException {
		
		SettingsScreen demoisOff = new SettingsScreen(driver);
		//test.log(LogStatus.INFO, "Select the demo mode checkbox");
		
		demoisOff.changeContextNativeApp();
		
		Thread.sleep(5000);
		
		demoisOff.checkedDemoModeCheckcbox();
		
		Thread.sleep(5000);
	
		demoisOff.uncheckedDemoModeCheckcbox();
		
		Thread.sleep(5000);
		
		demoisOff.clickconntestbutton();
		
		demoisOff.changeContextWebview();
		Thread.sleep(5000);
				
		Thread.sleep(2000);
	
		demoisOff.mypopupError();
		demoisOff.changeContextNativeApp();
		
		Thread.sleep(5000);
		CommonUtils.saveXMLFile("NativeViewSettings.xml");
		Thread.sleep(2000);
		demoisOff.clickokbtn();
		
		
	}
	
	
	
	
	@Test(priority=2)
	public void verifyConnectionDemoisON() throws InterruptedException, FileNotFoundException{
		
		SettingsScreen demoisOn = new SettingsScreen(driver);
	
		
		demoisOn.changeContextNativeApp();
	
		Thread.sleep(5000);
	
		demoisOn.checkedDemoModeCheckcbox();
	
		
		Thread.sleep(2000);
	
		demoisOn.clickconntestbutton();
		
		demoisOn.changeContextWebview();
		Thread.sleep(5000);
		
		demoisOn.mypopupSuccess();
	
	
		demoisOn.changeContextNativeApp();
		Thread.sleep(5000);
	
		Thread.sleep(2000);
		demoisOn.clickokbtn();
	}
		
	@Test(priority=3)
	public void moveToHome() throws InterruptedException, FileNotFoundException{
		
		//TouchAction action = new TouchAction((MobileDriver)driver);
		SettingsScreen back = new SettingsScreen(driver);
		
		Thread.sleep(2000);
		back.scrollup();
		
		
		Thread.sleep(3000);
		back.tapBackbtn();
	
		//action.tap(50, 1690).perform();
	}
	
	
	@Test(priority=4)
	public void verifyHomeScreen() throws FileNotFoundException, InterruptedException{
		HomeScreen homess = new HomeScreen(driver);
		Thread.sleep(5000);
	
		
		homess.changeContextWebview();
	
		Thread.sleep(10000);
		
		homess.verifyScreenTitle();
		
		Thread.sleep(5000);
	
		
		homess.verifyNetworkBtn();
		homess.verifyNetworkLbl();
		homess.verifyNetworkTxt();
		
	
		homess.verifyEventListBtn();
		homess.verifyEventListLbl();
		homess.verifyEventListTxt();
		
		
	
		homess.verifyDeviceBtn();
		homess.verifyDeviceLbl();
		homess.verifyDeviceTxt();
		
		homess.changeContextNativeApp();
		Thread.sleep(10000);
		
	}
	
	@Test(priority=5)
	public void clickNetworkButtonOnHome() throws InterruptedException, FileNotFoundException{
		HomeScreen home = new HomeScreen(driver);
		
		home.changeContextNativeApp();
		Thread.sleep(10000);
	
		Thread.sleep(2000);
		home.tapNetworkOption();
	
		Thread.sleep(5000);
		home.changeContextWebview();
		Thread.sleep(10000);
	
		Thread.sleep(2000);
		home.verifyNetworkScreenTitle();
	
		home.changeContextNativeApp();
		Thread.sleep(10000);
	
		Thread.sleep(2000);
		home.backToHome();
	}
	
	/*
	@Test(priority=6)
	public void clickDevicesOnHome() throws InterruptedException, FileNotFoundException{
		HomeScreen home = new HomeScreen(driver);
		//test.log(LogStatus.INFO, "Change context to Native View");
		home.changeContextNativeApp();
		Thread.sleep(10000);
		
		//test.log(LogStatus.INFO, "Tap on Device button");
		home.tapDeviceOption();
		Thread.sleep(5000);
		//test.log(LogStatus.INFO, "Return back to Home screen");
		home.backToHome();
		//test.log(LogStatus.INFO, "End the Testing");
	}
	*/
	@Test(priority=7)
	public void clickEvntsListsOnHome() throws InterruptedException, FileNotFoundException{
		HomeScreen home = new HomeScreen(driver);
	
		home.changeContextNativeApp();
		Thread.sleep(10000);
		
	
		Thread.sleep(2000);
		home.tapEventListOption();
		
		Thread.sleep(2000);
		home.changeContextWebview();
		Thread.sleep(10000);
		home.verifyEventListScreenTitle();
	
		Thread.sleep(2000);
		home.changeContextNativeApp();
		
		Thread.sleep(10000);
		home.backToHome();
	
		Thread.sleep(2000);
		}
	
	@Test(priority=8)
	public void verifyEventScreenHeader(){
	System.out.println("1. Verify the top header of the screen & text written on it.");
	
	
	

	}
	@Test(priority=9)
	public void verifyEventScreenRightheaderElements(){
		System.out.println("2. Verify that the context menu placed on the right of the header is clickable and opens a menu of options.");
	}
	@Test(priority=10)
	public void verifyLabelinContextMenu(){
		System.out.println("3. Verify the text of the labels present in the context menu options.");
	}
	@Test(priority=11)
	public void verifyClickactionOnContextMenu(){
		System.out.println("4. Verify that the options listed in the context menu are also clickable and perform a desired action on the click event.");
	}
	
	
	
	@Test(priority=12)
public void verifyNumOfEvntsDemoON(){
		System.out.println("To verify the list of events displayed when Demo Mode is enabled.");
	}

	@Test(priority=13)
public void verifyAppTapRefresh(){
		System.out.println("Verify the application behaviour when user taps on the refresh option.");
	}
	@Test(priority=14)
public void verifyPushNotificationFunctionality(){
		System.out.println("Verify the application behaviour when push notification functionality is executed and  Demo mode is set as On.");
	}
	@Test(priority=15)
public void verifyLabelsOnProjectScreen(){
		System.out.println("To verify the labels present in the Project screen");
	}
	@Test(priority=16)
public void verifyRefreshfuncOnProjectScreen(){
		System.out.println("To verify the functionality of Refresh button in the Project screen. ");
	}
	@Test(priority=17)
public void verifyBackFuncOnProjectScreen(){
		System.out.println("To verify the functionality of back key in the Project screen. ");
		
	}
	@Test(priority=18)
public void verifyHomeIconFuncOnProjectScreen(){
		System.out.println("To verify the functionality of Home icon in the Project screen.");
	}
	@Test(priority=19)
public void verifyDeviceListinNetworkOption(){
		System.out.println("Verify that devices list under the Network option should be properly displayed when Demo Mode is enabled.");
		
	}
	@Test(priority=20)
public void verifyTopologyMapImgfunc(){
		System.out.println("Topology map image functionlaity when Demo mode is set as On.");
	}
	@Test(priority=21)
public void verifyTopologymapimgNotEnglish(){
		System.out.println("Topology map image functionality in Demo mode when demo mode image is taken by IHV where  different preferred language is selected  except English");
	}
	@Test(priority=22)
public void verifyLocationMngmntfunc(){
		System.out.println("Location management functionlaity when Demo mode is set as On.");
		
	}
	@Test(priority=23)
public void verifyDeviceDetailInfoScreen(){
		System.out.println("Information on device detail screen.");
		
	}

	
	//Dependencies with Hi-Vision
	@Test(priority=24)
	public void verifyUnAckFilterEvents(){
			System.out.println("Verify the events listed by the Filter: 'Unacknowledged' in HiMobile should match with the events listed in HiVision using the same filter.");
			
		}
		@Test(priority=25)
	public void verifyWarnErrrsFilterEvents(){
			System.out.println("Verify the events listed by the Filter: 'Warnings & Errors' in HiMobile should match with the events listed in HiVision using the same filter.");
		}
		@Test(priority=26)
	public void verifyUnAckWarnErrrsFilterEvents(){
			System.out.println("Verify the events listed by the Filter: 'Unacknowledged Warnings & Errors' in HiMobile should match with the events listed in HiVision using the same filter.");
		}
		@Test(priority=27)
	public void verifyNoneFilterEvents(){
			System.out.println("Verify the events listed by the Filter: 'None' in HiMobile should match with the events listed in HiVision using the same filter.");
		}
	
		
		//////
		/*
		@Test(priority=24)
		public void testMyUseCases17(){
				
			}
			@Test(priority=25)
		public void testMyUseCases18(){
				
			}
			@Test(priority=27)
		public void testMyUseCases19(){
				
			}
			@Test(priority=28)
		public void testMyUseCases20(){
				
			}
			@Test(priority=29)
		public void testMyUseCases21(){
				
			}
			@Test(priority=30)
		public void testMyUseCases22(){
				
			}
			@Test(priority=31)
			public void testMyUseCases(){
				
			}
		*/	
	
}
