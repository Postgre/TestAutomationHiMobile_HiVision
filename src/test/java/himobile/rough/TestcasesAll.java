package himobile.rough;

import org.testng.annotations.Test;

import himobile.base.TestBase;
import himobile.screens.SettingsScreen;

public class TestcasesAll extends TestBase{
	
	@Test(priority=0)
	public void testSeries() throws Exception{
		SettingsScreen view = new SettingsScreen(driver);
		ForTestCasesScreens vals = new ForTestCasesScreens(driver);
		view.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println(driver.getPageSource());
		
		vals.enterHValues();
		vals.enterPValues();
		vals.enterUValues();
		vals.enterpwdValues();
		
		
	}

}
