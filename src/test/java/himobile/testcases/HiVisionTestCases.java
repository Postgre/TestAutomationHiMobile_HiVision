package himobile.testcases;

import java.io.IOException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;
import himobile.sikuli.HiVisionSikuli;

public class HiVisionTestCases {

	
	@Test(priority=0)
	public void launchIHivision() throws FindFailed, Exception{
	
		/*
		HiVisionSikuli start = new HiVisionSikuli();
		start.startIHVServices();
		start.launchIHV();
		start.enteringPwd();
		*/
		
		try{  
			/*
		    Process p = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\startIHVServicesDup.bat");
		    p.waitFor();
		    Process q = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\launchIHVDup.bat");
		    q.waitFor();
		    Process r = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\enterPasswordDup.bat");
		    r.waitFor();
		    */
		    //Or
		    //D:\\Automation_Appium\\SikuliBatchFiles\\startLaunchEnterPWDAll.bat
	Process p = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\startLaunchEnterPWDAll.bat");
	p.waitFor();
		}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)

		}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     

		}
		}
	
	@Test(priority=1)
	public void exportTestcsv() throws Exception{
		
		try{    
		    Process a = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\exportcsv.bat");
		    a.waitFor();
		}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)

		}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     

		}
		
	}
	@Test(priority=2)
	public void launchtestcsvfile() throws Exception{
		HiVisionSikuli launching = new HiVisionSikuli();
		launching.launchCSVFile();
	}
	
	@Test(priority=3)
	public void deleterowsfromcsv(){
		try{    
		    Process b = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\deletecsvrows.bat");
		    b.waitFor();
		}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)

		}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     

		}
	}
	
	@Test(priority=4)
	public void saveCloseTestCsv(){
		try{    
		    Process b = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\saveandclosecsv.bat");
		    b.waitFor();
		}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)

		}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     

		}
	}
}
