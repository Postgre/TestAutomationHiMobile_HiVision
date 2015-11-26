package himobile.rough;

import io.appium.java_client.android.AndroidDriver;
import himobile.screens.SettingsScreen;
import himobile.utils.ExcelReader;
import himobile.base.TestBase;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class IncorporateExcel extends TestBase {
	
	//public static AndroidDriver driver;
	
	String sheetName = "SettingsScreen";
	ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
	//String cellValueHost = dataxls.getCellData(sheetName, "Values", 15);
	String cellValuePort = dataxls.getCellData(sheetName, "Values", 16);
	String cellValueUsrname = dataxls.getCellData(sheetName, "Values", 17);
	String cellValuePwd = dataxls.getCellData(sheetName, "Values", 18);
	
	String cellInValidHost = dataxls.getCellData(sheetName, "Values", 19);
	String cellInValidPort = dataxls.getCellData(sheetName, "Values", 20);
	String cellInValidUsrname = dataxls.getCellData(sheetName, "Values", 21);
	String cellInValidPwd = dataxls.getCellData(sheetName, "Values", 22);
	
	String mySuccessAlert = dataxls.getCellData(sheetName, "Values", 13);
	String myFailAlert = dataxls.getCellData(sheetName, "Values", 14);
	
	@Test(priority=0)
	public void checkTest1() throws Exception{
		SettingsScreen vals = new SettingsScreen(driver);
		vals.changeContextWebview();
		System.out.println("Enter host");
		vals.enterValidHostValue();
		vals.minimizeKeyboard();
		System.out.println("Enter port");
		vals.enterPort(cellValuePort);
		vals.minimizeKeyboard();
		System.out.println("Enter usrname");
		vals.enterUname(cellValueUsrname);
		vals.minimizeKeyboard();
		System.out.println("Enter pwd");
		vals.enterPwd(cellValuePwd);
		vals.minimizeKeyboard();
		
		vals.changeContextNativeApp();
		Thread.sleep(5000);
		vals.clickconntestbutton();
		Thread.sleep(5000);
		vals.changeContextWebview();
		vals.myAlertSuccess(mySuccessAlert);
		vals.changeContextNativeApp();
		Thread.sleep(5000);
		vals.clickokbtn();
		Thread.sleep(2000);
		vals.scrollup();
		Thread.sleep(2000);
		System.out.println("Done this");
	}
	
	@Test(priority=1)
	public void checkTest2() throws Exception{
		SettingsScreen valus = new SettingsScreen(driver);
		valus.changeContextWebview();
		Thread.sleep(5000);
		valus.enterHost(cellInValidHost);
		Thread.sleep(1000);
		valus.minimizeKeyboard();
		valus.enterPort(cellValuePort);
		Thread.sleep(1000);
		valus.minimizeKeyboard();
		valus.enterUname(cellValueUsrname);
		Thread.sleep(1000);
		valus.minimizeKeyboard();
		valus.enterPwd(cellValuePwd);
		Thread.sleep(1000);
		valus.minimizeKeyboard();
		valus.changeContextNativeApp();
		
		Thread.sleep(5000);
		valus.clickconntestbutton();
		Thread.sleep(5000);
		valus.changeContextWebview();
		valus.myAlertError(myFailAlert);
		valus.changeContextNativeApp();
		valus.clickokbtn();
		Thread.sleep(1000);
	}

	/*
	public void checkTitleValue() throws InterruptedException{
		SettingsScreen title = new SettingsScreen(driver);
		String sheetName = "TestSheetGUI";
		ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
		String cellVal = dataxls.getCellData(sheetName, "screen1", 2);
		title.changeContextWebview();
		title.allScreentitles(cellVal);
	}*/

	@AfterTest
	public void rstApp(){
		
		driver.resetApp();
		
	}
}
