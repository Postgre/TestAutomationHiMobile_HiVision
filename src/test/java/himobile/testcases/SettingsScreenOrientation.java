package himobile.testcases;

import himobile.base.TestBase;
import himobile.screens.SettingsScreen;
import himobile.utils.ExcelReader;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;

public class SettingsScreenOrientation extends TestBase{

static final ExtentReports reports = ExtentReports.get(SettingsScreenTestCases.class);
	
	@BeforeTest
	public void reporting(){
		reports.init(System.getProperty("user.dir")+"\\SettingsScreenTestCasesReport.html", true);
	}
	
	@AfterMethod
	public void resettingApp() throws Exception{
		System.out.println("Reset HiMobile App");
		driver.resetApp();
		
	}
	
	@Test(priority=31)
	public void scrollinginLandskapeViewTC1() throws Exception{
			reports.startTest("Test Case 31 : Verify Orientation change and scroll starts");
				try	{
				System.out.println("*************************************************************************");
			    System.out.println("Test Case 31 : Verify Orientation change and scroll starts");
			    System.out.println("*************************************************************************");
				System.out.println("Enter host value");
				SettingsScreen orientation = new SettingsScreen(driver);
				String sheetName = "TestSheet";
				ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
				System.out.println("Change orientation to Portrait View");
				
				orientation.changeOrientationPortrait();
				System.out.println("Change context to Web View");
				orientation.changeContextWebview();
				
				String hostvals = dataxls.getCellData(sheetName, "host", 2);
				
				System.out.println("Enter Host value");
				orientation.enterHost(hostvals);
				
				System.out.println("Change context to Native");
				orientation.changeContextNativeApp();
				
				System.out.println("Change orientation to Landscape View");
				orientation.changeOrientationLandscape();
				
				orientation.changeContextWebview();
				
				orientation.scrollingUpDowninLandscapeView();
				
				System.out.println("Change context to Native");
				orientation.changeContextNativeApp();
				
				System.out.println("Change orientation to Portrait View");
				orientation.changeOrientationPortrait();
				Thread.sleep(2000);
				reports.log(LogStatus.PASS, "Test Case-31:Pass");
				} catch(Throwable t)	{
					reports.log(LogStatus.FAIL, "Test Case-31: Fail");	
				}
				System.out.println("Done");
			}

			@Test(priority = 32)    
			public void scrollinginLandskapeViewTC2() throws Exception {
				reports.startTest("Test Case 32 : Orientation change and scroll starts");
				try	{
				System.out.println("*************************************************************************");
			    System.out.println("Test Case 32 : Orientation change and scroll starts");
			    System.out.println("*************************************************************************");
			    SettingsScreen orientations = new SettingsScreen(driver);
			    
			    String sheetName = "TestSheet";
				ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
				orientations.changeContextNativeApp();
			    
			    System.out.println("Changing orientation to landscape");
			    orientations.changeOrientationLandscape();
			    
			    orientations.changeContextWebview();
			    
			    String hostvals = dataxls.getCellData(sheetName, "host", 2);
				System.out.println("Select host ip field");
				orientations.enterhostWithoutKeyboardResign(hostvals);
				
				orientations.scrollingUpDowninLandscapeView();
				
				orientations.changeContextNativeApp();
			    
			    System.out.println("Change the otientation to PORTRAIT");
			    orientations.changeOrientationPortrait();
			    Thread.sleep(2000);
				reports.log(LogStatus.PASS, "Test Case-32:Pass");
				} catch(Throwable t)	{
					reports.log(LogStatus.FAIL, "Test Case-32: Fail");	
				}
			    System.out.println("Done");
			 }

			@Test(priority=3)
			public void keyboardinLandskapeViewTC1() throws Exception{
				reports.startTest("Test Case 33 : Verify Handling keyboard from portrait to Landscape Orientation");
				try	{
				System.out.println("*******************************************************************************");
			    System.out.println("Test Case 33 : Verify Handling keyboard from portrait to Landscape Orientation");
			    System.out.println("********************************************************************************");
				System.out.println("Enter port value");
				SettingsScreen orientation = new SettingsScreen(driver);
				
				String sheetName = "TestSheet";
				ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
				
				System.out.println("Change orientation to Portrait View");
				
				orientation.changeOrientationPortrait();
				System.out.println("Change context to Web View");
				orientation.changeContextWebview();
				
				String usrvals = dataxls.getCellData(sheetName, "username", 2);
				String pwdvals = dataxls.getCellData(sheetName, "password", 2);
				System.out.println("Enter Pwd value");
				orientation.enterUname(usrvals);
				
				orientation.enterPwd(pwdvals);
				System.out.println("Change context to Native");
				orientation.changeContextNativeApp();
				
				System.out.println("Change orientation to Landscape View");
				orientation.changeOrientationLandscape();
				
				System.out.println("Minimize Keyboard");
				
				orientation.minimizeKeyboard();
				
				System.out.println("Change orientation to Portrait View");
				orientation.changeOrientationPortrait();
				Thread.sleep(2000);
				reports.log(LogStatus.PASS, "Test Case-33:Pass");
				} catch(Throwable t)	{
					reports.log(LogStatus.FAIL, "Test Case-33: Fail");	
				}
				System.out.println("Done");
			}

			@Test(priority = 4)    
			public void keyboardinLandskapeViewTC2() throws Exception {
				reports.startTest("Test Case 34 : Handle keyboard in landscape to portrait view-Orientation");
				try	{
				System.out.println("*************************************************************************");
			    System.out.println("Test Case 34 : Handle keyboard in landscape to portrait view-Orientation ");
			    System.out.println("*************************************************************************");
			    SettingsScreen orientations = new SettingsScreen(driver);
			    String sheetName = "TestSheet";
				ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
				
				orientations.changeContextNativeApp();
			    
			    System.out.println("Changing orientation to landscape");
			    orientations.changeOrientationLandscape();
			    
			    orientations.changeContextWebview();
			    
				 	String portvals = dataxls.getCellData(sheetName, "username", 2);
			    System.out.println("Select port field");
				orientations.enterPortWithoutKeyboardResign(portvals);
				
				orientations.changeContextNativeApp();
				
				System.out.println("Change orientation to Portrait view");
				orientations.changeOrientationPortrait();
				Thread.sleep(2000);
				reports.log(LogStatus.PASS, "Test Case-34:Pass");
				} catch(Throwable t)	{
					reports.log(LogStatus.FAIL, "Test Case-34: Fail");	
				}
				//orientations.minimizeKeyboard();
			    }
			@Test(priority=5)
			public void clickConnectionTestinLandscapeView() throws Exception{
				reports.startTest("Test Case 35 : Click Connection Test button in Landscape Orientation");
				try	{
			
					SettingsScreen orientation = new SettingsScreen(driver);
					System.out.println("*************************************************************************");
			        System.out.println("Test Case 35 : Click Connection Test button in Landscape Orientation");
			        System.out.println("*************************************************************************");
					orientation.changeContextNativeApp();
					
					System.out.println("Change in Portrait view");
					orientation.changeOrientationPortrait();
					
					System.out.println("Change Orientation in Landscapre view");
					
					orientation.changeOrientationLandscape();
					
					System.out.println("Click on Connection Test button");
					orientation.clickconntestbuttonlandscape();
					
					System.out.println("Click Ok button of Alert Message");
					orientation.clickAlertOkLandscape();
					
					System.out.println("Returning back to Portrait view");
					orientation.changeOrientationPortrait();
					Thread.sleep(2000);
					reports.log(LogStatus.PASS, "Test Case-35:Pass");
					} catch(Throwable t)	{
						reports.log(LogStatus.FAIL, "Test Case-35: Fail");	
					}
					System.out.println("Done");
				}
				
			@Test(priority=6)
				public void clickBackinLandscapeView() throws Exception{
				reports.startTest("Test Case 36 : Click back button in LandscapeView-Orientation");
				try	{	
				System.out.println("*************************************************************************");
			        System.out.println("Test Case 36 : Click back button in LandscapeView-Orientation");
			        System.out.println("*************************************************************************");
					SettingsScreen orientation = new SettingsScreen(driver);
					orientation.changeContextNativeApp();
					
					System.out.println("Change Orientation in Landscapre view");
					
					orientation.changeOrientationLandscape();
					
					orientation.clickBackLandscape();
					
					System.out.println("Return back to Portrait view");
					
					orientation.changeOrientationPortrait();
					Thread.sleep(2000);
					reports.log(LogStatus.PASS, "Test Case-36:Pass");
					} catch(Throwable t)	{
						reports.log(LogStatus.FAIL, "Test Case-36: Fail");	
					}
					System.out.println("Done");
			}

		
		@AfterTest
		public void tearDown(){
		
			reports.endTest();
		
		}

}
