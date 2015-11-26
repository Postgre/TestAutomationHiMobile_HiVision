package himobile.testcases;

import himobile.base.TestBase;
import himobile.screens.SettingsScreen;
import himobile.sikuli.HiVisionSikuli;
import himobile.utils.ExcelReader;

import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class SettingsScreenUserMangmntFunc extends TestBase{

	static final ExtentReports reports = ExtentReports.get(SettingsScreenUserMangmntFunc.class);
	
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
	
	@AfterTest
	public void tearDown(){
	
		reports.endTest();
	
	}
	
		@Test(priority = 1)    
		public void disablingUsrMngmnt() throws FindFailed, Exception{
			HiVisionSikuli usrmang = new HiVisionSikuli();
			usrmang.launchIHV();
			Thread.sleep(10000);
			usrmang.enteringPwd();
			Thread.sleep(10000);
			System.out.println("Hivision Launched successfully");
			System.out.println("Disable User Management functionality from HiVision");
			usrmang.disableUsrManagement();
			usrmang.waitingOneMin();
		    System.out.println("Minimize IHV");
			usrmang.waitingOneMin();
			usrmang.minimaxmizeIHVApp();
			System.out.println("Done after One Minute");
		}

		@Test(priority = 2)    
		public void validateUsermanagementFunctionalityTC1() throws FindFailed, Exception	{
			reports.startTest("Test Case 37 : Verify User management disbaled and Username/Pwd left blank starts");
			try	{
			System.out.println("*************************************************************************");
		    System.out.println("Test Case 37 : Verify User management disbaled and Username/Pwd left blank starts");
		    System.out.println("*************************************************************************");
		   	SettingsScreen hostdata = new SettingsScreen(driver);
		   			
			hostdata.changeContextWebview();
			Thread.sleep(5000);
			hostdata.enterValidValues();
			Thread.sleep(5000);
			System.out.println("Do not enter any data in username and password");
			Thread.sleep(5000);
			hostdata.blankUser();
			Thread.sleep(2000);
			hostdata.blankPwd();
			Thread.sleep(2000);
			
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			hostdata.clickconntestbutton();
			Thread.sleep(2000);
			hostdata.changeContextWebview();
			Thread.sleep(5000);
			hostdata.mypopupSuccess();
			
			Thread.sleep(2000);
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			hostdata.clickokbtn();
			Thread.sleep(2000);
			driver.resetApp();
			Thread.sleep(2000);
			reports.log(LogStatus.PASS, "Test Case-37: Pass");
			} catch(Throwable t)	{
				reports.log(LogStatus.FAIL, "Test Case-37: Fail");	
			}
			System.out.println("Done");
				
		}	

		@Test(priority = 3)    
		public void validateUsermanagementFunctionalityTC2() throws InterruptedException	{
			reports.startTest("Test Case 38 : Verify User management disbaled and Incorrect Username/Pwd starts");
			try	{
			System.out.println("*************************************************************************");
		    System.out.println("Test Case 38 : Verify User management disbaled and Incorrect Username/Pwd starts");
		    System.out.println("*************************************************************************");
		    String sheetName = "TestSheet";
		   	ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
		    SettingsScreen hostdata = new SettingsScreen(driver);
		    
			System.out.println("Enter invalid user credentials");
			String usrvals = dataxls.getCellData(sheetName, "username", 3);
			String pwdvals = dataxls.getCellData(sheetName, "password", 3);
			hostdata.changeContextWebview();
			Thread.sleep(5000);
			hostdata.enterValidValues();
			Thread.sleep(2000);
			hostdata.enterUname(usrvals);
			Thread.sleep(2000);
			hostdata.enterPwd(pwdvals);
			Thread.sleep(5000);
			hostdata.minimizeKeyboard();
			Thread.sleep(2000);
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			hostdata.clickconntestbutton();
			Thread.sleep(2000);
			hostdata.changeContextWebview();
			Thread.sleep(5000);
			hostdata.mypopupSuccess();
			
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			hostdata.clickokbtn();
			Thread.sleep(2000);
			driver.resetApp();
			Thread.sleep(2000);
			reports.log(LogStatus.PASS, "Test Case-38: Pass");
			} catch(Throwable t)	{
				reports.log(LogStatus.FAIL, "Test Case-38: Fail");	
			}
			System.out.println("Done");
		}	
		@Test(priority = 4)
		public void enableUsrManagmnt() throws Exception{
			HiVisionSikuli usrmang = new HiVisionSikuli();
		    System.out.println("USER INTERVENTION REQUIRED:Please enable User management functionality in HiVision");
		    usrmang.enableUsrMangmnt();
		    usrmang.waitingOneMin();
		    System.out.println("Minimize IHV");
			usrmang.waitingOneMin();
			usrmang.minimaxmizeIHVApp();
			System.out.println("Done after Two Minute");
		    
		}
		@Test(priority = 5)    
		public void validateUsermanagementFunctionalityTC3() throws FindFailed, Exception	{
			reports.startTest("Test Case 39 : Verify User management enabled and Incorrect Username/Pwd starts");
			try	{
			String sheetName = "TestSheet";
		   	ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
			System.out.println("*************************************************************************");
		    System.out.println("Test Case 39 : Verify User management enabled and Incorrect Username/Pwd starts");
		    System.out.println("*************************************************************************");
		    SettingsScreen hostdata = new SettingsScreen(driver);
		    
		    hostdata.changeContextWebview();
		    Thread.sleep(5000);
		    hostdata.enterValidValues();
		    System.out.println("Enter invalid user credentials"); 
		    String usrvals = dataxls.getCellData(sheetName, "username", 3);
			String pwdvals = dataxls.getCellData(sheetName, "password", 3);
		    Thread.sleep(2000);
		    hostdata.enterUname(usrvals);
		    Thread.sleep(2000);
		    hostdata.enterPwd(pwdvals);
			
			Thread.sleep(2000);
			hostdata.minimizeKeyboard();
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			hostdata.clickconntestbutton();
			Thread.sleep(2000);
			hostdata.changeContextWebview();
			Thread.sleep(5000);
			hostdata.mypopupError();
			
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			hostdata.clickokbtn();
			Thread.sleep(2000);
			driver.resetApp();
			Thread.sleep(2000);
			reports.log(LogStatus.PASS, "Test Case-39: Pass");
			} catch(Throwable t)	{
				reports.log(LogStatus.FAIL, "Test Case-39: Fail");	
			}
			System.out.println("Done");
		}


		@Test(priority = 6)    
		public void validateUsermanagementFunctionalityTC4() throws InterruptedException	{
			reports.startTest("Test Case-1: Verify Screen Title");
			try	{
			
			System.out.println("*************************************************************************");
		    System.out.println("Test Case 40 : Verify User management disbaled and blank Username/Pwd starts");
		    System.out.println("*************************************************************************");
		    
		    SettingsScreen hostdata = new SettingsScreen(driver);
		    
			System.out.println("Do not enter any data in username and password");
			hostdata.changeContextWebview();
			Thread.sleep(5000);
			hostdata.enterValidValues();
			
			Thread.sleep(2000);
			
			hostdata.blankUser();
			Thread.sleep(2000);
			hostdata.blankPwd();
			Thread.sleep(2000);
			hostdata.minimizeKeyboard();
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			hostdata.clickconntestbutton();
			Thread.sleep(2000);
			hostdata.changeContextWebview();
			Thread.sleep(5000);
			hostdata.mypopupError();
			
			hostdata.changeContextNativeApp();
			Thread.sleep(5000);
			hostdata.clickokbtn();
			Thread.sleep(2000);
			driver.resetApp();
			Thread.sleep(2000);
			reports.log(LogStatus.PASS, "Test Case-40: Pass");
			} catch(Throwable t)	{
				reports.log(LogStatus.FAIL, "Test Case-40: Fail");	
			}
		}
		
	}
