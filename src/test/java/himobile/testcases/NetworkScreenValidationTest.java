package himobile.testcases;

import himobile.base.TestBase;
import himobile.screens.NetworkScreen;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class NetworkScreenValidationTest extends TestBase {

	@BeforeTest
	public void changecontext() throws InterruptedException	{
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		System.out.println("Change context to NATIVE");
		Thread.sleep(5000);
	}
	
	@Test(priority = 0)
	public void validateGUILabels() throws InterruptedException		{
		System.out.println("**********************************************************************");
		System.out.println("Test Case 1 : Validation of GUI starts");
		System.out.println("**********************************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validatelabels();
	
		System.out.println("**********************************************************************");
		System.out.println("Test Case 1 : Validation of GUI ends");
		System.out.println("**********************************************************************");
		
	}
	
	
	@Test(priority = 1)
	public void ValidateProjectScreenLabel() throws InterruptedException		{
		System.out.println("****************************************************");
		System.out.println("Test Case:Validation of Project screen label starts ");
		System.out.println("****************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		
	
		System.out.println("****************************************************");
		System.out.println("Test Case:Validation of Project screen label ends ");
		System.out.println("****************************************************");
		
	}
	/*
	@Test(priority = 2)
	public void ValidateProjectScreen2Label() throws InterruptedException		{
		System.out.println("****************************************************");
		System.out.println("Test Case:Validation of Project screen2 label starts ");
		System.out.println("****************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.textvalidationprojectscreen2();
	
		System.out.println("****************************************************");
		System.out.println("Test Case:Validation of Project screen2 label ends ");
		System.out.println("****************************************************");
		
	}
	
	@Test(priority = 3)
	public void ValidateNoDataUnusedDevices() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of No Data in Unused devices starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validatenodata();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of No Data in Unused devices ends ");
		System.out.println("*********************************************************");
		
	}
	
	@Test(priority = 4)
	public void ValidateNewDevicesList() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Devices List starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validatenewdeviceslist();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Devices List ends ");
		System.out.println("*********************************************************");
		
	}
	
	@Test(priority = 5)
	public void ValidateDeviceInfo() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of Device Info starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validatedeviceinfo();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Device Info ends ");
		System.out.println("*********************************************************");
		
	}
	
	@Test(priority = 6)
	public void ValidateDeviceStatus() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of Device Status starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validatedevicestatus();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Device Stauts ends ");
		System.out.println("*********************************************************");
		
	}
	
	
	@Test(priority = 7)
	public void ValidatePortList() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of Port List starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validateportlist();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of Port List ends ");
		System.out.println("*********************************************************");
		
	}
	
	
	@Test(priority = 8)
	public void ValidateEditDeviceList() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of Edit Device List starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validateeditdevice();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of Edit Device List ends ");
		System.out.println("*********************************************************");
		
	}
	
	@Test(priority = 9)
	public void ValidateNewConnection() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Connection starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validatenewconnection();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Connection ends ");
		System.out.println("*********************************************************");
		
	}
	
	@Test(priority = 10)
	public void ValidateNewConnectionStatusFromIcon() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Connection status starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validatenewconnectionstatusfromicon();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Connection status ends ");
		System.out.println("*********************************************************");
		
	}
	
	
	@Test(priority = 11)
	public void ValidateUpdateFolder() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of update Folder status starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validateupdatefolder();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of Update Folder status ends ");
		System.out.println("*********************************************************");
		
	}	
	
	
	@Test(priority = 12)
	public void ValidateSubDomain() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Sub-Domain starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		hostdata.validatesubdomain();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of New Sub-Domain ends ");
		System.out.println("*********************************************************");
		
	}*/
	
	@Test(priority = 13)
	public void ValidateLocation() throws InterruptedException		{
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of Location Co-ordinates starts ");
		System.out.println("*********************************************************");
		
		NetworkScreen hostdata = new NetworkScreen(driver);
		//hostdata.validatelocation();
	
		System.out.println("*********************************************************");
		System.out.println("Test Case:Validation of Location Co-ordinates ends ");
		System.out.println("*********************************************************");
		
	}
	
}


