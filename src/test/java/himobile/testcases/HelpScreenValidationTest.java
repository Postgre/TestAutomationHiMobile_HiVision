package himobile.testcases;

import himobile.base.TestBase;
import himobile.screens.HelpScreen;
import himobile.screens.SettingsScreen;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HelpScreenValidationTest extends TestBase {

	/*
	@BeforeTest
	public void changecontext() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		System.out.println("Change context to NATIVE View");
	
	}
	*/
	@Test(priority = 0 ) 
	public void validateHelpLabel() throws Exception		{
		
		System.out.println("*********************************************");
		System.out.println("Test Case 1 : Validation of label text starts");
		System.out.println("*********************************************");
		SettingsScreen back = new SettingsScreen(driver);
		back.changeContextNativeApp();
		Thread.sleep(10000);
		back.tapBackN10();
		HelpScreen hostlabel = new HelpScreen(driver);
		Thread.sleep(5000);
		hostlabel.helpmenuN10();
	
		System.out.println("*******************************************");
		System.out.println("Test Case 1 : Validation of label text ends");
		System.out.println("*******************************************");
		
	}
	
	@Test(priority = 1)
	public void HelpMenu() throws InterruptedException{
		
		System.out.println("************************************************");
		System.out.println("Test Case 2 : Help menu test starts");
		System.out.println("************************************************");
		
		HelpScreen hostlabel = new HelpScreen(driver);
		hostlabel.HelpContextMenu();	
		
		System.out.println("************************************************");
		System.out.println("Test Case 2 : Help menu test ends");
		System.out.println("************************************************");
	}
	
	@Test(priority = 2)
	public void HelpMenuNavigationPortrait() throws InterruptedException{
		
		System.out.println("************************************************");
		System.out.println("Test Case 3 : Navigation in Help menu in portrait mode test starts");
		System.out.println("************************************************");
		
		HelpScreen hostlabel = new HelpScreen(driver);
		hostlabel.navigationhelpportrait();	
		
		System.out.println("****************************************************************");
		System.out.println("Test Case 3 : Navigation in Help menu in portrait mode test ends");
		System.out.println("****************************************************************");
	}
	
	@Test(priority = 3)
	public void HelpMenuNavigationLandscape() throws InterruptedException{
		
		System.out.println("************************************************");
		System.out.println("Test Case 4 : Navigation in Help menu in landscape mode test starts");
		System.out.println("************************************************");
		
		HelpScreen hostlabel = new HelpScreen(driver);
		hostlabel.navigationhelplandscape();	
		
		System.out.println("****************************************************************");
		System.out.println("Test Case 4 : Navigation in Help menu in landscape mode test ends");
		System.out.println("****************************************************************");
	}
	
	@Test(priority = 4)
	public void HelpMenuNavigationBackkey() throws InterruptedException{
		
		System.out.println("************************************************");
		System.out.println("Test Case 5 : Navigation using back key test starts");
		System.out.println("************************************************");
		
		HelpScreen hostlabel = new HelpScreen(driver);
		hostlabel.backkeyonhelp();	
		
		System.out.println("****************************************************************");
		System.out.println("Test Case 5 : Navigation using back key test ends");
		System.out.println("****************************************************************");
	}

	@Test(priority = 5)
	public void LegalMenu() throws InterruptedException{
		
		System.out.println("************************************************");
		System.out.println("Test Case 6 : Navigation in Legal menu test starts");
		System.out.println("************************************************");
		
		HelpScreen hostlabel = new HelpScreen(driver);
		hostlabel.LegalContextMenu();
		
		System.out.println("************************************************");
		System.out.println("Test Case 6 : Navigation in Legal menu test ends");
		System.out.println("************************************************");
	}
	
	@Test(priority = 6)
	public void LegalMenuNavigationBackKey() throws InterruptedException{
		
		System.out.println("************************************************");
		System.out.println("Test Case 7 : Navigation in Legal menu test starts");
		System.out.println("************************************************");
		
		HelpScreen hostlabel = new HelpScreen(driver);
		hostlabel.backkeyonlegal();
		
		System.out.println("************************************************");
		System.out.println("Test Case 7 : Navigation in Legal menu test ends");
		System.out.println("************************************************");
	}
	
	@Test(priority = 7)
	public void AboutMenu() throws InterruptedException{
		
		System.out.println("************************************************");
		System.out.println("Test Case 8 : Navigation in About menu test starts");
		System.out.println("************************************************");
		
		HelpScreen hostlabel = new HelpScreen(driver);
		hostlabel.AboutContextMenu();	
		
		System.out.println("************************************************");
		System.out.println("Test Case 8 : Navigation in About menu test ends");
		System.out.println("************************************************");
	}
	
	@Test(priority = 8)
	public void AboutMenuNavigationBackKey() throws InterruptedException{
		
		System.out.println("************************************************");
		System.out.println("Test Case 9 : Navigation in About menu test starts");
		System.out.println("************************************************");
		
		HelpScreen hostlabel = new HelpScreen(driver);
		hostlabel.backkeyonabout();	
		
		System.out.println("************************************************");
		System.out.println("Test Case 9 : Navigation in About menu test ends");
		System.out.println("************************************************");
	}
	
	
	
	
	
	
	
	
	
	
}
