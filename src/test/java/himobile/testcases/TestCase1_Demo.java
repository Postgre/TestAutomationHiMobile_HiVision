package himobile.testcases;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import himobile.base.TestBase;
import himobile.screens.EventsScreen;

import himobile.screens.SettingsScreen;
import himobile.sikuli.HiVisionSikuli;
import himobile.utils.CommonUtils;
import himobile.utils.ExcelReader;

public class TestCase1_Demo extends TestBase{
	
	@Test(priority=0)
	public void handleHiVisionActivities() throws FindFailed, Exception {
		System.out.println("**********************************************************************************");
		System.out.println("Launch HiVision Application on Host Machine");
		System.out.println("**********************************************************************************");
		String destination = "C:\\Program Files\\Hirschmann\\Industrial HiVision 6.0\\database";
		
		FileUtils.deleteDirectory(new File(destination));
		Thread.sleep(10000);
		try{
			/*
			System.out.println("For Demo - In Board Room");
			Process p = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\startLaunchEnterPWDAllforDemo.bat");
			*/
			System.out.println("For Generic Execution");
			Process p = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\startLaunchEnterPWDAll.bat");
			p.waitFor();
			}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)

			}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     

			}
		System.out.println("Enter UserName & Password in Login window of HiVision Application");
		Thread.sleep(20000);
		System.out.println("HiVision Application launched successfully");
				
	}
	
	@Test(priority=1)
	public void installationLaunch() throws Exception{
		System.out.println("**********************************************************************************");
		System.out.println("Test Case 1 : Validation of Settings Screen GUI");
		System.out.println("**********************************************************************************");
		SettingsScreen title = new SettingsScreen(driver);
		System.out.println("App installed & Launched");
		
		title.changeContextWebview();
		
		System.out.println("Verify Screen Title when app launched:");
		title.verifyScreentitle1();
		SettingsScreen values = new SettingsScreen(driver);
		System.out.println("Verify Settings Screen Labels:");
		
		values.textHostbox1();
		
		values.textPortbox1();
		
		values.textUnamebox1();
		
		values.textPasswordbox1();
		
	}
	
	@Test(priority=2)
	public void enterValues() throws Exception{
		System.out.println("**********************************************************************************");
		System.out.println("Test Case 2 :Enter valid values in EditBoxes");
		System.out.println("**********************************************************************************");
		SettingsScreen enteries = new SettingsScreen(driver);
		System.out.println("Enter values");
		
		enteries.enterValidValues();
		
		enteries.minimizeKeyboard();
		
	}
	
	@Test(priority=3)
	public void tapOnConnectionTestButton() throws Exception{
		System.out.println("***********************************************************************************************");
		System.out.println("Test Case 3 : Validation of successful connection of HiMobile with HiVision Application");
		System.out.println("***********************************************************************************************");
		SettingsScreen tapping = new SettingsScreen(driver);
		
		tapping.changeContextNativeApp();
		Thread.sleep(2000);
		System.out.println("Tap on Connection Test button");
		tapping.clickconntestbutton();
		tapping.changeContextWebview();
		
		Thread.sleep(2000);
		tapping.mypopupSuccess();
		//Thread.sleep(2000);
		tapping.changeContextNativeApp();
		Thread.sleep(2000);
		tapping.clickokbtn();
		Thread.sleep(2000);
		tapping.tapBackbtn();
		System.out.println("Done");
	}

	@Test(priority=4)
	public void moveToEventScreen() throws Exception{
		System.out.println("**********************************************************************************");
		System.out.println("Test Case 4 : Navigation from Settings screen to Events screen ");
		System.out.println("**********************************************************************************");
		EventsScreen tapEventbtn = new EventsScreen(driver);
		System.out.println("Verify the Home Screen");
		
		Thread.sleep(2000);
		tapEventbtn.clickEvent();
		
	}	
	
	@Test(priority=5)
	public void fetchEventsSource() throws Exception		{
		
		System.out.println("**********************************************************************************");
		System.out.println("Fetch xml file from HiMobile Apps of Events Screen");
		System.out.println("**********************************************************************************");
		System.out.println("Save the pages source obtained in an xml file format named as eventlist.xml");
		Thread.sleep(2000);
		CommonUtils.saveXMLFile("eventlist.xml");
		Thread.sleep(2000);
		System.out.println("This XML file saved within a project under the properties folder");
		
	}
	@Test(priority=6)
	public void exportCSVfrmIHVApp() throws FindFailed, Exception{
		System.out.println("**********************************************************************************");
		System.out.println("Export CSV File from HiVision");
		System.out.println("**********************************************************************************");
	
		try{    
		    Process p = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\exportcsv.bat");
		    p.waitFor();
		   
		}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)

		}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     

		}
				
		Thread.sleep(10000);
		System.out.println("Done");
		
	}
	
	
	@Test(priority=7)
	public void verifyEventsIHVandHimobile() throws Exception{
		System.out.println("**********************************************************************************");
		System.out.println("Test Case 5 : Validation of of HiMobile data with HiVision");
		System.out.println("**********************************************************************************");
		System.out.println("From HiMobile App: Fetching data from XML File for Comparison");
		System.out.println("Reading data from eventlist.xml which is saved from getPageSource commands from Appium native code");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;
		File fXmlFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\eventlist.xml");
		Document doc = null;
				try {
					dBuilder = dbFactory.newDocumentBuilder();
					doc = dBuilder.parse(fXmlFile);
				} catch (ParserConfigurationException e) {
					System.out.println("dbFactory Thrown ParserConfigurationException");
					e.printStackTrace();
				} catch (SAXException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			doc.getDocumentElement().normalize();
			NodeList nList = doc.getElementsByTagName("android.widget.ListView");
			Node nNode = nList.item(0);
			Element e = (Element) nNode;
			NodeList nListChild = e.getChildNodes();
			String[] eventshimobile = new String[200];
					
		for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
		 	
			Node nNode1 = nListChild.item(temp2);
			Element eElement = (Element) nNode1;
			//Thread.sleep(10000);
			eventshimobile[temp2] = eElement.getAttribute("content-desc");
			System.out.println("The himobile event is " +eventshimobile[temp2]);
			}
    	
			System.out.println("The number of events listed in HiMobile are " + nListChild.getLength());
    		Thread.sleep(10000);
    		System.out.println("From HiVision Application: Fetching data from CSV File for Comparison");
    		
    		System.out.println("CSV file exported successfully from HiVision");
            String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\events.csv";
    		String input;
            int count = 0;
            int temp1 = 0;
            BufferedReader br1 = null;
            String line = "";
        	String cvsSplitBy = ";";
        	String[] eventshivision = new String[200];
    		int iteration = 0;
            try {
            	br1 = new BufferedReader(new FileReader(csvFile));
    			while((line = br1.readLine()) != null)
    			{
    				if(iteration == 0 || iteration == 1 || iteration == 2 || iteration == 3) {
                        iteration++;  
                        continue;
                    }
 
    				int iPos= line.lastIndexOf("\",");	
    				if (iPos > -1){
    					line = line.substring(0, iPos);
    				}
    		
    					eventshivision[temp1]= line.split(cvsSplitBy)[8];
    					eventshivision[temp1] = eventshivision[temp1].replaceAll("\"", "");
    					System.out.println("The hivison event is " + eventshivision[temp1] );
    					temp1++;
    			
    				count++;
    			}
    		} catch (IOException e1) {
    			e1.printStackTrace();
    		}finally {
    			if (br1 != null) {
    				try {
    					br1.close();
    				} catch (IOException e1) {
    					e1.printStackTrace();
    				}
    			}
    		}	

            System.out.println("The number of events in HiVision are : "+count);
            System.out.println("As a Result: Verify the data from both the file");
            Assert.assertEquals(nListChild.getLength(), count);
           	for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
    		Assert.assertTrue(eventshimobile[temp2].contains(eventshivision[temp2]));
    	}
	}
	
	@Test(priority=8)
	public void exitIHV() throws Exception{
		
		try{    
		    /*
		     * System.out.println("For Demo - In Board Room");
			Process m = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\StopIHVPPT.bat");
			*/
			System.out.println("For Generic Execution");
		    Process m = Runtime.getRuntime().exec("D:\\Automation_Appium\\SikuliBatchFiles\\exitIHVfromGUIDup.bat");
		    m.waitFor();
			}catch( IOException ex ){
		    //Validate the case the file can't be accesed (not enought permissions)
			}catch( InterruptedException ex ){
		    //Validate the case the process is being stopped by some external situation     
		}
		//System.out.println("HiVision App exited");
		
		//System.out.println("Hivision database folder deleted successfully");
		}
	
	@Test(priority=9)
	public void testFailedCase() throws Exception{
		System.out.println("Forcefully Failing the Test");
		EventsScreen title = new EventsScreen(driver);
		SettingsScreen views = new SettingsScreen(driver);
		Thread.sleep(5000);
		views.changeContextWebview();
		title.screenTitle();
		
	}
}
