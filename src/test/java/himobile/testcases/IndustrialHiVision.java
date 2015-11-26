package himobile.testcases;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import himobile.base.TestBase;
import himobile.sikuli.HiVisionSikuli;

//public class IndustrialHiVision extends TestBase{
public class IndustrialHiVision	{	
	
	@Test(priority=0)
	public void stopDeldb() throws Exception{
		
		HiVisionSikuli sikulitest = new HiVisionSikuli();
		Thread.sleep(10000);
		sikulitest.stopService();
		Thread.sleep(10000);
		sikulitest.deletedatabasefolder();
		
	}

@Test(priority=1)
public void startupIndHiVision() throws FindFailed, InterruptedException{
		
		HiVisionSikuli sikulitest = new HiVisionSikuli();
		System.out.println("Start Industrial HiVision Services");
		sikulitest.startIHVServices();
	}
@Test(priority=2)	
public void startupIndHiVisionGUI() throws Exception{
		
		HiVisionSikuli sikulitest = new HiVisionSikuli();
		System.out.println("Start Industrial HiVision GUI");
		sikulitest.launchIHV();
	}
@Test(priority=3)
public void enterUsrCredentials() throws FindFailed, Exception{
	HiVisionSikuli sikulitest = new HiVisionSikuli();
	System.out.println("Start Industrial HiVision GUI");
	sikulitest.enteringPwd();
	System.out.println("Enter usr credentials and login to IHV");
}

}
