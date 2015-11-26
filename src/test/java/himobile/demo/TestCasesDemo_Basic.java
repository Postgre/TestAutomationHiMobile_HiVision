package himobile.demo;

import org.testng.annotations.Test;

import himobile.base.TestBase;
import himobile.screens.SettingsScreen;

public class TestCasesDemo_Basic extends TestBase{

	@Test(priority=0)
	public void installationLaunch() throws Exception{
		System.out.println("**********************************************************************************");
		System.out.println("Test Case 1 : Validation of Settings Screen GUI");
		System.out.println("**********************************************************************************");
		SettingsScreen title = new SettingsScreen(driver);
		System.out.println("App installaed & Launched");
		Thread.sleep(5000);
		title.changeContextWebview();
		Thread.sleep(5000);
		System.out.println("Verify Screen Title when app launched:");
		title.verifyScreentitle1();
	}
	
	@Test(priority=1)
	public void labelsEditBoxes(){
		System.out.println("**********************************************************************************");
		System.out.println("Test Case 2 : Validation of Labels of Edit Boxes");
		System.out.println("**********************************************************************************");
		SettingsScreen values = new SettingsScreen(driver);
		System.out.println("Verify the Label of Host input box");
		
		values.textHostbox1();
		System.out.println("Verify the Label of Port input box");
		values.textPortbox1();
		System.out.println("Verify the Label of UserName input box");
		values.textUnamebox1();
		System.out.println("Verify the Label of Password input box");
		values.textPasswordbox1();
	}
}
