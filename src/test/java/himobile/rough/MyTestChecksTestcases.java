package himobile.rough;

import org.testng.annotations.Test;

import himobile.base.TestBase;
import himobile.utils.ExcelReader;

public class MyTestChecksTestcases extends TestBase{
	
	String sheetName = "SettingsScreen";
	ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
	String myTitle = dataxls.getCellData(sheetName, "Values", 2);
	String myNotification = dataxls.getCellData(sheetName, "Values", 3);
	String myCheckbox1 = dataxls.getCellData(sheetName, "Values", 8);
	String myCheckbox2 = dataxls.getCellData(sheetName, "Values", 9);
	String myCheckbox3 = dataxls.getCellData(sheetName, "Values", 10);

	@Test
	public void verifyAllCheckboxes() throws InterruptedException{
		
		MyTestChecks cbVerify = new MyTestChecks(driver);
		
		System.out.println("Change context to Web-View");
		cbVerify.changeContextWebview();
		Thread.sleep(5000);
		cbVerify.verifyScreentitle1();
		Thread.sleep(2000);
		cbVerify.verifyScreentitle(myTitle);
		Thread.sleep(2000);
		cbVerify.verifyNotification(myNotification);
		Thread.sleep(2000);
		System.out.println("Verify Secure connection checkbox");
		cbVerify.verifySecureConnectionCheckbox(myCheckbox1);
		Thread.sleep(2000);
		System.out.println("Verify Auto-autorefresh checkbox");
		cbVerify.verifyAutorefreshCheckbox(myCheckbox2);
		Thread.sleep(2000);
		System.out.println("Verify Demo mode checkbox");
		cbVerify.verifyDemoModeCheckbox(myCheckbox3);
		Thread.sleep(2000);
		System.out.println("Change context to Native-View");
		cbVerify.changeContextNativeApp();
		Thread.sleep(5000);
		System.out.println("Tap Secure connection checkbox");
		Thread.sleep(2000);
		cbVerify.checkedSecureConnectionCheckcbox();
		Thread.sleep(2000);
		cbVerify.clickokbtn();
		System.out.println("Tap Auto-autorefresh checkbox");
		Thread.sleep(2000);
		cbVerify.checkedAutorefreshCheckcbox();
		System.out.println("Tap Demo mode checkbox");
		Thread.sleep(2000);
		cbVerify.checkedDemoModeCheckcbox();
		Thread.sleep(2000);
		System.out.println("Uncheck all");
		cbVerify.uncheckedSecureConnectionCheckcbox();
		Thread.sleep(2000);
		cbVerify.uncheckedAutorefreshCheckcbox();
		Thread.sleep(2000);
		cbVerify.uncheckedDemoModeCheckcbox();
		Thread.sleep(2000);
		System.out.println("Done");
		
	}
}
