package himobile.testcases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;

import himobile.base.TestBase;
import himobile.screens.EventsScreen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.ScreenOrientation;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EventsScreenValidationTest extends TestBase {

	@BeforeTest
	public void changecontext() throws InterruptedException	{
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		System.out.println("Change context to NATIVE");
		Thread.sleep(5000);
	}
	
	@Test(priority = 0)
	public void validateClickOnEventList() throws InterruptedException		{
		System.out.println("****************************************************");
		System.out.println("Test Case 1 : Validation of Events Screen GUI starts");
		System.out.println("****************************************************");
		
		EventsScreen labels = new EventsScreen(driver);
		System.out.println("Tap on the settings icon on the Home Screen");
		driver.tap(1, 1000, 1700, 5);
		
		Thread.sleep(10000);
		
		labels.taponeventlist();
		labels.validatelabels();
	
		System.out.println("****************************************************");
		System.out.println("Test Case 1 : Validation of Events Screen GUI ends");
		System.out.println("****************************************************");
	}
	
	@Test(priority = 1 )
	public void validateEventList() throws Exception		{
		
		System.out.println("**********************************************************************************");
		System.out.println("Test Case 2: Validation of Event list with HiVision starts");
		System.out.println("**********************************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.eventlistHiMobileMatchesHiVison();
		
		System.out.println("********************************************************************************");
		System.out.println("Test Case 2: Validation of Event list with HiVision ends");
		System.out.println("********************************************************************************");
		
		
	}
	
	
	@Test(priority = 2 )
	public void validateUnackFilterFunctionality() throws Exception		{
		
		System.out.println("*******************************************************************");
		System.out.println("Test Case 3 : Validation of 'unacknowledged' filter  output starts ");
		System.out.println("*******************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.unackfilter();
		
		System.out.println("*******************************************************************");
		System.out.println("Test Case 3 : Validation of 'unacknowledged' filter  output ends ");
		System.out.println("*******************************************************************");
		
	}
	
	@Test(priority = 3 )
	public void validateWarningsErrorsFilterFunctionality() throws Exception		{
		
		System.out.println("*******************************************************************");
		System.out.println("Test Case 4 : Validation of 'Warnings & Errors' filter  output starts ");
		System.out.println("*******************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.warningserrorsfilter();
		
		System.out.println("********************************************************************");
		System.out.println("Test Case 4 : Validation of 'Warnings & Errors' filter  output ends ");
		System.out.println("********************************************************************");
		
	}
	
	@Test(priority = 4 )
	public void validateUnackWarningsErrorsFilterFunctionality() throws Exception		{
		
		System.out.println("*************************************************************************************");
		System.out.println("Test Case 5 : Validation of 'Unacknowledged Warnings & Errors' filter  output starts ");
		System.out.println("*************************************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.unackwarningserrorsfilter();
		
		System.out.println("*************************************************************************************");
		System.out.println("Test Case 5 : Validation of 'Unacknowledged Warnings & Errors' filter  output ends ");
		System.out.println("*************************************************************************************");
		
	}
	
	@Test(priority = 5 )
	public void validateNoneFilterFunctionality() throws Exception		{
		
		System.out.println("*************************************************************************************");
		System.out.println("Test Case 6 : Validation of 'None' filter  output starts ");
		System.out.println("*************************************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.nonefilter();
		
		System.out.println("*************************************************************************************");
		System.out.println("Test Case 6 : Validation of 'None' filter  output ends ");
		System.out.println("*************************************************************************************");
		
	}
	
	@Test(priority = 6 )
	public void validateNoDataEventList() throws InterruptedException		{
		
		System.out.println("*****************************************************");
		System.out.println("Test Case 7 : Validation of  'No Data' output starts ");
		System.out.println("*****************************************************");
	
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.nodatacheck();
		
		System.out.println("*****************************************************");
		System.out.println("Test Case 7 : Validation of  'No Data' output ends ");
		System.out.println("*****************************************************");
	}
	
	@Test(priority = 7 )
	public void validateEventDetailGUI() throws Exception		{
		
		System.out.println("**********************************************************");
		System.out.println("Test Case 8 : Validation of Event Detail Screen GUI starts");
		System.out.println("**********************************************************");
	
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.eventdetaillabel();
		
		System.out.println("**********************************************************");
		System.out.println("Test Case 8 : Validation of Event Detail Screen GUI ends");
		System.out.println("**********************************************************");
	}
	
	
	@Test(priority = 8 )
	public void validateEventDetail() throws Exception		{
		
		System.out.println("********************************************************************");
		System.out.println("Test Case 9 : Validation of Event Detail with HiVision starts");
		System.out.println("********************************************************************");
	
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.eventdetaillabel();
		
		System.out.println("********************************************************************");
		System.out.println("Test Case 9 : Validation of Event Detail with HiVision ends");
		System.out.println("********************************************************************");
	}
	
	
	@Test(priority = 9 )
	public void validateRefreshFunctionality() throws InterruptedException		{
		
		System.out.println("********************************************************************");
		System.out.println("Test Case 10 : Validation of Refresh Functionality starts");
		System.out.println("********************************************************************");
	
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.refreshfunctionality();
		
		System.out.println("********************************************************************");
		System.out.println("Test Case 10 : Validation of Refresh Functionality ends");
		System.out.println("********************************************************************");
	}
	
	@Test(priority = 10 )
	public void validateStatusMessageOnHomeSceen() throws InterruptedException		{
		
		System.out.println("********************************************************************************");
		System.out.println("Test Case 11 : Validation of push notification message on app home screen starts");
		System.out.println("********************************************************************************");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Navigate to the Home screen");
		driver.navigate().back();
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.validatestatusmessagehomescreen();
		
		System.out.println("******************************************************************************");
		System.out.println("Test Case 11 : Validation of push notification message on app home screen ends");
		System.out.println("******************************************************************************");
	
	}
	
	@Test(priority = 11 )
	public void validateBackKey() throws InterruptedException		{
		
		System.out.println("********************************************************************");
		System.out.println("Test Case 13 : Validation of back key starts");
		System.out.println("********************************************************************");
	
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.validatebackkey();
		
		System.out.println("********************************************************************");
		System.out.println("Test Case 13 : Validation of back key ends");
		System.out.println("********************************************************************");
	
	}
	
	@Test(priority = 12 )
	public void validateConnectionTestWithAutoRefresh() throws InterruptedException		{
		System.out.println("********************************************************************************");
		System.out.println("Test Case 29 (Settings Screen) : Validation of Connection Test with 'Auto-Refresh' enabled starts ");
		System.out.println("********************************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.autorefresh();
		
		System.out.println("*******************************************************************************");
		System.out.println("Test Case 29 (Settings Screen) : Validation of Connection Test with 'Auto-Refresh' enabled  ends ");
		System.out.println("*******************************************************************************");
	}
	
	@Test(priority = 13 )
	public void validateAutoRefreshFunctionality() throws InterruptedException		{
		System.out.println("********************************************************************************");
		System.out.println("Test Case 30 (Settings Screen) : Validation of 'Auto-Refresh' functionality starts ");
		System.out.println("********************************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.autorefreshvalidation();
		
		System.out.println("*******************************************************************************");
		System.out.println("Test Case 30 (Settings Screen) : Validation of 'Auto-Refresh' functionality ends ");
		System.out.println("*******************************************************************************");
	}
	
	@Test(priority = 14 )
	public void validateStatusMessageWithScroll() throws InterruptedException		{
		System.out.println("********************************************************************************");
		System.out.println("Test Case 31 (Settings Screen) : Validation of 'status message' functionality starts ");
		System.out.println("********************************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.statusmessagefunctionalitypart1();
		
		System.out.println("*******************************************************************************");
		System.out.println("Test Case 31 (Settings Screen) : Validation of 'status message' functionality ends ");
		System.out.println("*******************************************************************************");
	}
	
	@Test(priority = 15 )
	public void validateStatusMessageWithTap() throws InterruptedException		{
		System.out.println("********************************************************************************");
		System.out.println("Test Case 32 (Settings Screen) : Validation of 'status message' functionality starts ");
		System.out.println("********************************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.statusmessagefunctionalitypart2();
		
		System.out.println("***********************************************************************************");
		System.out.println("Test Case 32 (Settings Screen) : Validation of 'status message' functionality ends ");
		System.out.println("***********************************************************************************");
	}
	
	@Test(priority = 16 )
	public void validateAutoRefreshInterruptionFunctionality() throws InterruptedException		{
		System.out.println("****************************************************************************************************");
		System.out.println("Test Case 33 (Settings Screen) :Validation of 'Auto-Refresh with interruption' functionality starts ");
		System.out.println("****************************************************************************************************");
	
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.autorefreshinterruptionrefresh();
		
		System.out.println("**************************************************************************************************");
		System.out.println("Test Case 33 (Settings Screen) :Validation of 'Auto-Refresh with interruption' functionality ends ");
		System.out.println("**************************************************************************************************");
	
	}
	
	@Test(priority = 17 )
	public void validateAutoRefreshOnAFilter() throws InterruptedException		{
		
		System.out.println("*****************************************************************************************************");
		System.out.println("Test Case 35 (Settings Screen) :Validation of 'autorefresh on filter-by option' functionality starts ");
		System.out.println("*****************************************************************************************************");
	
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.autorefreshonfilterbyoption();
		
		System.out.println("***************************************************************************************************");
		System.out.println("Test Case 35 (Settings Screen) :Validation of 'autorefresh on filter-by option' functionality ends ");
		System.out.println("***************************************************************************************************");
	
		
	}
	

	@Test(priority = 18 )
	public void validateAutoRefreshWithNoHiVisionConnection() throws InterruptedException		{
		System.out.println("**********************************************************************************************");
		System.out.println("Test Case 36 (Settings Screen) : Validation of AutoRefresh With No HiVision Connection starts ");
		System.out.println("**********************************************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		hostdata.autorefreshnoconnection();
		
		System.out.println("********************************************************************************************");
		System.out.println("Test Case 36 (Settings Screen) : Validation of AutoRefresh With No HiVision Connection ends ");
		System.out.println("********************************************************************************************");
	}
	
	@Test(priority = 35 )
	public void validateAutoRefreshDisabled() throws InterruptedException		{
		System.out.println("**********************************************************************************************");
		System.out.println("Test Case 37 (Settings Screen) : Validation of AutoRefresh disabled starts ");
		System.out.println("**********************************************************************************************");
		
		EventsScreen hostdata = new EventsScreen(driver);
		
		System.out.println("Tap on the settings icon on the Home Screen");
		driver.tap(1, 1000, 1700, 5);
		
		hostdata.taponeventlist();
		
		System.out.println("********************************************************************************************");
		System.out.println("Test Case 37 (Settings Screen) : Validation of AutoRefresh disabled ends ");
		System.out.println("********************************************************************************************");
	}
}
