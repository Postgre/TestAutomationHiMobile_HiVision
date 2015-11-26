package himobile.screens;


import himobile.base.ScreenBase;
import himobile.sikuli.HiVisionSikuli;
import himobile.utils.CommonUtils;
import himobile.utils.Configuration;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class EventsScreen extends ScreenBase {

	public EventsScreen(AndroidDriver driver) {
		super(driver);
	}
		
	@FindBy(xpath=Configuration.popupmsg)
	public WebElement popupmsg;
	
	@FindBy(xpath=Configuration.pageLabel)
	public WebElement pageLabel;
	
	@FindBy(xpath=Configuration.NetworkLabel)
	public WebElement NetworkLabel;
	
	@FindBy(xpath=Configuration.EventListLabel)
	public WebElement EventListLabel;
	
	@FindBy(xpath=Configuration.DeviceLabel)
	public WebElement DeviceLabel;
	
	@FindBy(xpath=Configuration.eventsheaderlabel)
	public WebElement eventsheaderlabel;
	
	@FindBy(xpath=Configuration.refreshlabel)
	public WebElement refreshlabel;
	
	@FindBy(xpath=Configuration.filterbylabel)
	public WebElement filterbylabel;
	
	@FindBy(xpath=Configuration.warningerrorslabel)
	public WebElement warningerrorslabel;
	
	@FindBy(xpath=Configuration.unackwarningerrorslabel)
	public WebElement unackwarningerrorslabel;
	
	@FindBy(xpath=Configuration.unacklabel)
	public WebElement unacklabel;

	@FindBy(xpath=Configuration.nonelabel)
	public WebElement nonelabel;
	
	@FindBy(xpath=Configuration.popupcontent)
	public WebElement popupcontent;
	
	@FindBy(className=Configuration.contextmenuentry)
	public List <WebElement> contextmenuentry;
	
	@FindBy(xpath=Configuration.nodata)
	public WebElement nodata;
	
	@FindBy(xpath=Configuration.prefeventlabel)
	public WebElement prefeventlabel;
	
	@FindBy(xpath=Configuration.id)
	public WebElement id;
	
	@FindBy(xpath=Configuration.severity)
	public WebElement severity;
	
	@FindBy(xpath=Configuration.category)
	public WebElement category;
	
	@FindBy(xpath=Configuration.time)
	public WebElement time;
	
	@FindBy(xpath=Configuration.user)
	public WebElement user;
	
	@FindBy(xpath=Configuration.source)
	public WebElement source;
	
	@FindBy(xpath=Configuration.comp)
	public WebElement comp;
	
	@FindBy(xpath=Configuration.msgg)
	public WebElement msgg;
	
	@FindBy(xpath=Configuration.ack)
	public WebElement ack;
	
	@FindBy(xpath=Configuration.newevent)
	public WebElement newevent;
	
	@FindBy(xpath=Configuration.eventdetailheader)
	public WebElement eventdetailheader;
	
	@FindBy(xpath=Configuration.idlabel)
	public WebElement idlabel;
	
	@FindBy(xpath=Configuration.severitylabel)
	public WebElement severitylabel;
	
	@FindBy(xpath=Configuration.categorylabel)
	public WebElement categorylabel;
	
	@FindBy(xpath=Configuration.timelabel)
	public WebElement timelabel;
	
	@FindBy(xpath=Configuration.userlabel)
	public WebElement userlabel;
	
	@FindBy(xpath=Configuration.sourcelabel)
	public WebElement sourcelabel;
	
	@FindBy(xpath=Configuration.componentlabel)
	public WebElement componentlabel;
	
	@FindBy(xpath=Configuration.msglabel)
	public WebElement msglabel;
	
	@FindBy(xpath=Configuration.acklabel)
	public WebElement acklabel;
	
	@AndroidFindBy(xpath=Configuration.back)
	public WebElement back ;
	
	@AndroidFindBy(xpath=Configuration.settings)
	public WebElement settings ;
	
	
	@AndroidFindBy(xpath=Configuration.EventList)
	public WebElement EventList ;
	
	@AndroidFindBy(xpath=Configuration.contextmenu)
	public WebElement contextmenu ; 
	
	@AndroidFindBy(xpath=Configuration.filterby)
	public WebElement filterby ;
	
	@AndroidFindBy(xpath=Configuration.refresh)
	public WebElement refresh ;
	
	@AndroidFindBy(xpath=Configuration.warningserrors)
	public WebElement warningserrors ; 
	
	@AndroidFindBy(xpath=Configuration.None)
	public WebElement None ;
	
	@AndroidFindBy(xpath=Configuration.unacknowledged)
	public WebElement unacknowledged;
	
	@AndroidFindBy(xpath=Configuration.unackwarningserrors)
	public WebElement unackwarningserrors;

	
	public EventsScreen clickEvent() throws Exception{
		System.out.println("Tap on Event List");
		EventList.click();
		Thread.sleep(5000);
		
		return this;
		
	}

	public EventsScreen taponeventlist() throws InterruptedException	{
		SettingsScreen hostdata = new SettingsScreen(driver);
		hostdata.checkedAutorefreshCheckcbox();
		Thread.sleep(3000);
		hostdata.clickconntestbutton();
		Thread.sleep(10000);
		hostdata.changeContextWebview();
		hostdata.mypopupSuccess();
		hostdata.changeContextNativeApp();
		Thread.sleep(10000);
		hostdata.clickokbtn();
		Thread.sleep(2000);
				driver.navigate().back();
		Thread.sleep(5000);
				driver.context("NATIVE_APP");
		Thread.sleep(10000);
				System.out.println("Tap on Event List");
		EventList.click();
		Thread.sleep(15000);
		
		return this;
	}
	
	
	public EventsScreen validatelabels() throws InterruptedException	{
				driver.context("WEBVIEW");
		Thread.sleep(10000);
				System.out.println(eventsheaderlabel.getText());
		Assert.assertEquals(eventsheaderlabel.getText(), "Events");
				driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
		Thread.sleep(5000);
		
		driver.context("WEBVIEW");
		Thread.sleep(20000);
		
		System.out.println(contextmenuentry.get(0).getText());
		Assert.assertEquals(contextmenuentry.get(0).getText(), "Refresh");
		
		System.out.println(contextmenuentry.get(1).getText());
		Assert.assertEquals(contextmenuentry.get(1).getText(), "Filter by");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the Filter By option");
		filterby.click();
		Thread.sleep(10000);
		
		driver.context("WEBVIEW");
		Thread.sleep(30000);
		
		System.out.println(contextmenuentry.get(0).getText());
		Assert.assertEquals(contextmenuentry.get(0).getText(), "Warnings & Errors");
		
		System.out.println(contextmenuentry.get(1).getText());
		Assert.assertEquals(contextmenuentry.get(1).getText(), "Unacknowledged Warnings & Errors");
		
		System.out.println(contextmenuentry.get(2).getText());
		Assert.assertEquals(contextmenuentry.get(2).getText(), "Unacknowledged");
		
		System.out.println(contextmenuentry.get(3).getText());
		Assert.assertEquals(contextmenuentry.get(3).getText(), "None");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the None option");
		None.click();
		Thread.sleep(5000);
		
		return this;
	}
	
	public EventsScreen saveXMLfileEventScreen() throws Exception{
		System.out.println("Save the pages source obtained in an xml file format named as eventlist.xml");
		Thread.sleep(2000);
		 CommonUtils.saveXMLFile("eventlist.xml");
		 Thread.sleep(10000);
		System.out.println("This XML file saved within a project under the properties folder");
		Thread.sleep(5000);
		return this;
	}
	
	public EventsScreen readDatafromXMLEventScreen() throws Exception{
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
				Thread.sleep(10000);
				eventshimobile[temp2] = eElement.getAttribute("content-desc");
				System.out.println("The himobile event is " +eventshimobile[temp2]);
				}
        		System.out.println("The number of events listed in HiMobile are " + nListChild.getLength());
				return this;
	}
	
	
	public EventsScreen readDataFrmCSV()	{
	
			System.out.println("CSV file exported successfully from HiVision");
        
		String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\events.csv";
		
        String input;
        int count = 0;
        int temp1 = 0;
        BufferedReader br1 = null;
        String line = "";
    	String cvsSplitBy = ";";
    	String[] eventshivision = new String[200];

		
        try {
        	br1 = new BufferedReader(new FileReader(csvFile));
			while((line = br1.readLine()) != null)
			{
			    
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
		/* 
        Assert.assertEquals(nListChild.getLength(), count);
                
    
		for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
			System.out.println("00");
			Assert.assertTrue(eventshimobile[temp2].contains(eventshivision[temp2]));
			}
		
	return this;
	*/
		return this;
	}
	
	public EventsScreen eventlistHiMobileMatchesHiVison() throws Exception {
		
System.out.println("Native-ContextView is: "+driver.context("NATIVE_APP"));
System.out.println("Source NATIVE "+driver.getPageSource());
Thread.sleep(10000);

        System.out.println("Save the pages source obtained above in an xml file named as eventlist.xml");
        CommonUtils.saveXMLFile("eventlist.xml");
        Thread.sleep(20000);
        
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

			Thread.sleep(10000);
			eventshimobile[temp2] = eElement.getAttribute("content-desc");
			System.out.println("The himobile event is " +eventshimobile[temp2]);
		}
        
		System.out.println("The number of events listed in HiMobile are " + nListChild.getLength());
		
		//System.out.println("USER INTERVENTION REQUIRED: Export the events listed in HiVision in a .csv file and name it as eventlist.csv");
		HiVisionSikuli hivisionSikuli = new HiVisionSikuli();
		/*
		hivisionSikuli.exportCSVfromHiVision();
		Thread.sleep(20000);
		hivisionSikuli.launchCSVFile();
		Thread.sleep(5000);
		hivisionSikuli.deleteSingleRowCSV();
		Thread.sleep(2000);
		hivisionSikuli.deleteSingleRowCSV();
		Thread.sleep(2000);
		hivisionSikuli.deleteSingleRowCSV();
		Thread.sleep(2000);
		hivisionSikuli.deleteSingleRowCSV();
		Thread.sleep(2000);
		hivisionSikuli.saveAndClosedCSV();
		*/
		
		
		//System.out.println("NOTE: Remove the first three rows from the csv file ");
		Thread.sleep(20000);
		System.out.println("CSV file exported successfully from HiVision");
        
		String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\events.csv";
		
        String input;
        int count = 0;
        int temp1 = 0;
        BufferedReader br1 = null;
        String line = "";
    	String cvsSplitBy = ";";
    	String[] eventshivision = new String[200];

		
        try {
        	br1 = new BufferedReader(new FileReader(csvFile));
			while((line = br1.readLine()) != null)
			{
			    
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
		 
        Assert.assertEquals(nListChild.getLength(), count);
                
    
		for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
			System.out.println("00");
			Assert.assertTrue(eventshimobile[temp2].contains(eventshivision[temp2]));
			}
		
	return this;	
	
	}
		
//		driver.context("NATIVE_APP");
//		Thread.sleep(10000);
//		
//		System.out.println("Tap on the context menu");
//		contextmenu.click();
//		Thread.sleep(5000);
//    	
//    	System.out.println("Tap on the 'Filter By' option");
//    	filterby.click();
//    	Thread.sleep(5000);
//    
//    	System.out.println("Tap on the 'None' option");
//    	None.click();
//    	Thread.sleep(5000);
//    	
//    	System.out.println("Trigger an event from HiVision Preferences Menu");
//    	Thread.sleep(10000);
//    	
//    	driver.context("WEBVIEW");
//    	Thread.sleep(15000);
//    	
//    	System.out.println(popupcontent.getText());
//		Assert.assertEquals(popupcontent.getText(), "New HiVision event received");
//		
//		driver.context("NATIVE_APP");
//		Thread.sleep(10000);
//		
//		System.out.println("Click on the context menu");
//		contextmenu.click();
//		Thread.sleep(5000);
//		
//		System.out.println("Click on refresh");
//		refresh.click();
//		Thread.sleep(3000);
//		
//		driver.context("WEBVIEW");
//		Thread.sleep(10000);
//		
//		System.out.println(prefeventlabel.getText());
//		Assert.assertEquals(prefeventlabel.getText(), "Preferences Modified by User");
//		
//		 List<WebElement> NoOfElements = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
//	        
//	     int size = 0;
//	     size = NoOfElements.size();
//	     System.out.println("The number of elements after refresh are " +size);
//	        
//	     Assert.assertEquals( size, nListChild.getLength() + 1  );
//	    	 
//	     return this;
//
//	}

	public EventsScreen nodatacheck() throws InterruptedException {
		
		System.out.println("USER INTERVENTION REQUIRED: Acknowledge all the events in the HiVision");
		driver.context("NATIVE_APP");
		Thread.sleep(60000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
		Thread.sleep(5000);
		
		System.out.println("Tap on the 'Filter' By option");
		filterby.click();
		Thread.sleep(3000);
		
		System.out.println("Tap on the 'Unacknowledged' option");
		unacknowledged.click();
		Thread.sleep(10000);
		
		System.out.println("Retry1: Again Tap on the context menu");
		contextmenu.click();
		Thread.sleep(5000);
		
		System.out.println("Retry1: Again Tap on the refresh option");
		refresh.click();
		Thread.sleep(5000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(nodata.getText());
		Assert.assertEquals(nodata.getText(), "No Data");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
		Thread.sleep(5000);
		
		System.out.println("Tap on the 'Filter' By option");
		filterby.click();
		Thread.sleep(3000);
		
		System.out.println("Tap on the 'None' option");
		None.click();
		Thread.sleep(10000);
		
		return this;
		
		
	}
	
	public EventsScreen unackwarningserrorsfilter() throws InterruptedException, Exception {
	
		System.out.println("USER INTERVENTION REQUIRED: Generate events of the category 'Unacknowledged Warnings  Errors' from the demo network window in HiVision ");
		Thread.sleep(180000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
    	Thread.sleep(5000);
    	
    	System.out.println("Tap on the 'Filter By' option");
    	filterby.click();
    	Thread.sleep(5000);
    
    	System.out.println("Tap on the 'Unacknowledged Warnings & Errors' option");
    	unackwarningserrors.click();
    	Thread.sleep(5000);
   		
    	System.out.println("USER INTERVENTION: Save the page source obtained in an xml file names as unackwarningserrors.xml");
    	
    	System.out.println("Native-ContextView is: "+driver.context("NATIVE_APP"));
        System.out.println("Source NATIVE "+driver.getPageSource());
        Thread.sleep(30000);
        CommonUtils.saveXMLFile("unackwarningserrors.xml");
        Thread.sleep(20000);
       
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\unackwarningserrors.xml");
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
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
		Element e = (Element) nNode;
		NodeList nListChild = e.getChildNodes();
        
		System.out.println("The number of events listed in HiMobile are " + nListChild.getLength());
		
		System.out.println("USER INTERVENTION: Export the unacknowledged warnings & errors events in a .csv file named as unackwarningserrors.csv");
		System.out.println("NOTE: Remove the first three rows from the csv file ");
    	Thread.sleep(120000);
    	
		String[] eventshimobile = new String[100];	
		String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\unackwarningserrors.csv";
		BufferedReader br1 = null;
        String input;
        int count = 0;
        
        try {
        	br1 = new BufferedReader(new FileReader(csvFile));
			while((input = br1.readLine()) != null)
			{
			    count++;
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if (br1 != null) {
				try {
					br1.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}	


        System.out.println("The number of events in HiVision are : "+count);
	
        Assert.assertEquals(nListChild.getLength(), count);
        
        BufferedReader br = null;
    	String line = "";
    	String cvsSplitBy = ";";
    	String[] eventshivision = new String[100];

		try {
			 
			br = new BufferedReader(new FileReader(csvFile));
			
			int temp1 = 0;
			
			while ((line = br.readLine()) != null) {
	 
					int iPos= line.lastIndexOf("\",");
					
					//String temp = "";
					if (iPos > -1){
						line = line.substring(0, iPos);
					}
					
					eventshivision[temp1]= line.split(cvsSplitBy)[8];
					eventshivision[temp1] = eventshivision[temp1].replaceAll("\"", "");
					
					System.out.println("The hivison event is " + eventshivision[temp1] );
					temp1++;
				}
	 
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}	

        
		for (int temp = 0; temp < nListChild.getLength() ; temp++) {
			 
			Node nNode1 = nListChild.item(temp);
			Element eElement = (Element) nNode1;

			Thread.sleep(10000);
			eventshimobile[temp] = eElement.getAttribute("content-desc");
			System.out.println("the himobile event is " +eventshimobile[temp]);
		}
		
	
		for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
			Assert.assertTrue(eventshimobile[temp2].contains(eventshivision[temp2]));
			}
		
		
		return this;
		
	}

	
	public EventsScreen warningserrorsfilter() throws InterruptedException, Exception {
		
		System.out.println("USER INTERVENTION REQUIRED: Trigger events of category warnings and error and then acknowledge them from the demo network window in HiVision ");
		Thread.sleep(120000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
    	Thread.sleep(5000);
    	
    	System.out.println("Tap on the 'Filter By' option");
    	filterby.click();
    	Thread.sleep(5000);
    
    	System.out.println("Tap on the 'Warnings & Errors' option");
    	warningserrors.click();
    	Thread.sleep(5000);
   		
    	System.out.println("USER INTERVENTION: Save the page source obtained in an xml file names as warningserrors.xml");
    	
    	System.out.println("Native-ContextView is: "+driver.context("NATIVE_APP"));
        System.out.println("Source NATIVE "+driver.getPageSource());
        Thread.sleep(30000);
        CommonUtils.saveXMLFile("warningserrors.xml");
        Thread.sleep(20000);
       
    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\warningserrors.xml");
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
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
		Element e = (Element) nNode;
		NodeList nListChild = e.getChildNodes();
        
		System.out.println("The number of events listed in HiMobile are " + nListChild.getLength());
		
		System.out.println("USER INTERVENTION: Export the warnings & errors events in a .csv file named as warningserrors.csv");
		System.out.println("NOTE: Remove the first three rows from the csv file ");
    	Thread.sleep(120000);
    	
		String[] eventshimobile = new String[100];	
		String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\warningserrors.csv";
		BufferedReader br1 = null;
        String input;
        int count = 0;
        
        try {
        	br1 = new BufferedReader(new FileReader(csvFile));
			while((input = br1.readLine()) != null)
			{
			    count++;
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if (br1 != null) {
				try {
					br1.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}	


        System.out.println("The number of events in HiVision are : "+count);
	
        Assert.assertEquals(nListChild.getLength(), count);
        
        BufferedReader br = null;
    	String line = "";
    	String cvsSplitBy = ";";
    	String[] eventshivision = new String[100];

		try {
			 
			br = new BufferedReader(new FileReader(csvFile));
			
			int temp1 = 0;
			
			while ((line = br.readLine()) != null) {
	 
					int iPos= line.lastIndexOf("\",");
					
					//String temp = "";
					if (iPos > -1){
						line = line.substring(0, iPos);
					}
					
					eventshivision[temp1]= line.split(cvsSplitBy)[8];
					eventshivision[temp1] = eventshivision[temp1].replaceAll("\"", "");
					
					System.out.println("The hivison event is " + eventshivision[temp1] );
					temp1++;
				}
	 
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}	

        
		for (int temp = 0; temp < nListChild.getLength() ; temp++) {
			 
			Node nNode1 = nListChild.item(temp);
			Element eElement = (Element) nNode1;

			Thread.sleep(10000);
			eventshimobile[temp] = eElement.getAttribute("content-desc");
			System.out.println("the himobile event is " +eventshimobile[temp]);
		}
		
	
		for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
			Assert.assertTrue(eventshimobile[temp2].contains(eventshivision[temp2]));
			}
		
		
		return this;
		
	}

	
	public EventsScreen unackfilter() throws InterruptedException, Exception {
			
			driver.context("NATIVE_APP");
			Thread.sleep(10000);
			
			System.out.println("Tap on the context menu");
			contextmenu.click();
	    	Thread.sleep(5000);
	    	
	    	System.out.println("Tap on the 'Filter By' option");
	    	filterby.click();
	    	Thread.sleep(5000);
	    
	    	System.out.println("Tap on the 'Unacknowledged' option");
	    	unacknowledged.click();
	    	Thread.sleep(5000);
	   		
	    	System.out.println("USER INTERVENTION: Save the page source obtained in an xml file names as unack.xml");
	    	
	    	System.out.println("Native-ContextView is: "+driver.context("NATIVE_APP"));
	        System.out.println("Source NATIVE "+driver.getPageSource());
	        Thread.sleep(30000);
	        CommonUtils.saveXMLFile("unack.xml");
	        Thread.sleep(20000);
	       
	    	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    	DocumentBuilder dBuilder = null;
	    	File fXmlFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\unack.xml");
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
			System.out.println("\nCurrent Element :" + nNode.getNodeName());
			Element e = (Element) nNode;
			NodeList nListChild = e.getChildNodes();
	        
			System.out.println("The number of events listed in HiMobile are " + nListChild.getLength());
			
			System.out.println("USER INTERVENTION: Export the warnings & errors events in a .csv file named as unack.csv");
			System.out.println("NOTE: Remove the first three rows from the csv file ");
	    	Thread.sleep(60000);
	    	
			String[] eventshimobile = new String[100];	
			String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\unack.csv";
			BufferedReader br1 = null;
	        String input;
	        int count = 0;
	        
	        try {
	        	br1 = new BufferedReader(new FileReader(csvFile));
				while((input = br1.readLine()) != null)
				{
				    count++;
				}
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} finally {
				if (br1 != null) {
					try {
						br1.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}	
	
	
	        System.out.println("The number of events in HiVision are : "+count);
		
	        Assert.assertEquals(nListChild.getLength(), count);
	        
	        BufferedReader br = null;
	    	String line = "";
	    	String cvsSplitBy = ";";
	    	String[] eventshivision = new String[100];
	
			try {
				 
				br = new BufferedReader(new FileReader(csvFile));
				
				int temp1 = 0;
				
				while ((line = br.readLine()) != null) {
		 
						int iPos= line.lastIndexOf("\",");
						
						//String temp = "";
						if (iPos > -1){
							line = line.substring(0, iPos);
						}
						
						eventshivision[temp1]= line.split(cvsSplitBy)[8];
						eventshivision[temp1] = eventshivision[temp1].replaceAll("\"", "");
						
						System.out.println("The hivison event is " + eventshivision[temp1] );
						temp1++;
					}
		 
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				if (br != null) {
					try {
						br.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}	
	
	        
			for (int temp = 0; temp < nListChild.getLength() ; temp++) {
				 
				Node nNode1 = nListChild.item(temp);
				Element eElement = (Element) nNode1;
	
				Thread.sleep(10000);
				eventshimobile[temp] = eElement.getAttribute("content-desc");
				System.out.println("the himobile event is " +eventshimobile[temp]);
			}
			
		
			for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
				Assert.assertTrue(eventshimobile[temp2].contains(eventshivision[temp2]));
				}
			
			
			return this;
			
		}
				
	public EventsScreen nonefilter() throws InterruptedException, Exception {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
		Thread.sleep(5000);
		
		System.out.println("Tap on the 'Filter By' option");
		filterby.click();
		Thread.sleep(5000);
	
		System.out.println("Tap on the 'None' option");
		None.click();
		Thread.sleep(5000);
			
		System.out.println("USER INTERVENTION: Save the page source obtained in an xml file names as none.xml");
		
		System.out.println("Native-ContextView is: "+driver.context("NATIVE_APP"));
	    System.out.println("Source NATIVE "+driver.getPageSource());
	    Thread.sleep(30000);
	    CommonUtils.saveXMLFile("none.xml");
        Thread.sleep(20000);
	   
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = null;
		File fXmlFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\none.xml");
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
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
		Element e = (Element) nNode;
		NodeList nListChild = e.getChildNodes();
	    
		System.out.println("The number of events listed in HiMobile are " + nListChild.getLength());
		
		System.out.println("USER INTERVENTION: Export the warnings & errors events in a .csv file named as none.csv");
		System.out.println("NOTE: Remove the first three rows from the csv file ");
		Thread.sleep(120000);
		
		String[] eventshimobile = new String[100];	
		String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\none.csv";
		BufferedReader br1 = null;
	    String input;
	    int count = 0;
	    
	    try {
	    	br1 = new BufferedReader(new FileReader(csvFile));
			while((input = br1.readLine()) != null)
			{
			    count++;
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			if (br1 != null) {
				try {
					br1.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}	
	
	
	    System.out.println("The number of events in HiVision are : "+count);
	
	    Assert.assertEquals(nListChild.getLength(), count);
	    
	    BufferedReader br = null;
		String line = "";
		String cvsSplitBy = ";";
		String[] eventshivision = new String[100];
	
		try {
			 
			br = new BufferedReader(new FileReader(csvFile));
			
			int temp1 = 0;
			
			while ((line = br.readLine()) != null) {
	 
					int iPos= line.lastIndexOf("\",");
					
					//String temp = "";
					if (iPos > -1){
						line = line.substring(0, iPos);
					}
					
					eventshivision[temp1]= line.split(cvsSplitBy)[8];
					eventshivision[temp1] = eventshivision[temp1].replaceAll("\"", "");
					
					System.out.println("The hivison event is " + eventshivision[temp1] );
					temp1++;
				}
	 
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}	
	
	    
		for (int temp = 0; temp < nListChild.getLength() ; temp++) {
			 
			Node nNode1 = nListChild.item(temp);
			Element eElement = (Element) nNode1;
	
			Thread.sleep(10000);
			eventshimobile[temp] = eElement.getAttribute("content-desc");
			System.out.println("the himobile event is " +eventshimobile[temp]);
		}
		
	
		for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
			Assert.assertTrue(eventshimobile[temp2].contains(eventshivision[temp2]));
			}
		
		return this;
		
	}
	
	public EventsScreen eventdetaillabel() throws InterruptedException, Exception {
		
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("USER INTERVENTION: Save the page source obtained in an xml file names as allevents.xml");
		
		System.out.println("Native-ContextView is: "+driver.context("NATIVE_APP"));
	    System.out.println("Source NATIVE "+driver.getPageSource());
	    Thread.sleep(60000);
	    CommonUtils.saveXMLFile("allevents.xml");
        Thread.sleep(20000);
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\allevents.xml");
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
		System.out.println("\nCurrent Element :" + nNode.getNodeName());
		Element e = (Element) nNode;
		NodeList nListChild = e.getChildNodes();
        
		System.out.println("Tap on the first event in the list");
		 
		Node nNode2 = nListChild.item(0);
		Element eElement = (Element) nNode2;
		
		//System.out.println("Source NATIVE "+driver.getPageSource());
		Thread.sleep(10000);
		
		System.out.println(nNode2.getNodeName() + ": " + eElement.getAttribute("content-desc"));
		
		WebElement Element1 = driver.findElement(By.xpath("//android.view.View[@index='" + String.valueOf(0) +"' and @content-desc = '" + eElement.getAttribute("content-desc") + "']"));
		Thread.sleep(10000);
		
		Element1.click();
		Thread.sleep(10000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(idlabel.getText());
		Assert.assertEquals(idlabel.getText(), "ID");
		
		System.out.println(severitylabel.getText());
		Assert.assertEquals(severitylabel.getText(), "Severity");
		
		System.out.println(categorylabel.getText());
		Assert.assertEquals(categorylabel.getText(), "Category");
		
		System.out.println(timelabel.getText());
		Assert.assertEquals(timelabel.getText(), "Time");
		
		System.out.println(userlabel.getText());
		Assert.assertEquals(userlabel.getText(), "User");
		
		System.out.println(sourcelabel.getText());
		Assert.assertEquals(sourcelabel.getText(), "Source");
		
		System.out.println(componentlabel.getText());
		Assert.assertEquals(componentlabel.getText(), "Component");
		
		System.out.println(msglabel.getText());
		Assert.assertEquals(msglabel.getText(), "Message");
		
		//System.out.println(acklabel.getText());
		//Assert.assertEquals(acklabel.getText(), "Acknowledged");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
		Thread.sleep(5000);
   	
		System.out.println("Tap on the 'Refresh' option");
		refresh.click();
		Thread.sleep(5000);

	
		return this;
	}
	
	
	public EventsScreen eventdetail() throws InterruptedException {
		
		String[] firstevent = new String[100];	
		String csvFile = System.getProperty("user.dir")+"\\src\\test\\resources\\hiVisionFiles\\allevents.csv";
		BufferedReader br = null;
	    String input;
	    String line = "";
	    String cvsSplitBy = ";";
	    
    	try {
			 
			br = new BufferedReader(new FileReader(csvFile));
			line = br.readLine();
			
			if (line != null) {
	 
					//System.out.println("the row content is " +line);
					int iPos1= line.lastIndexOf("\",");
					
					//String temp = "";
					if (iPos1 > -1){
						line = line.substring(0, iPos1);
					}
					
					for ( int j =0; j < 9; j++){
						firstevent[j]= line.split(cvsSplitBy)[j];
						firstevent[j] = firstevent[j].replaceAll("\"", "");	
					}	
					
				}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}	
    	
    	System.out.println("Change the context to WEBVIEW");
    	driver.context("WEBVIEW");
    	Thread.sleep(10000);
    	
    	//System.out.println(id.getText());
    	//System.out.println(firstevent[0]);
    		
    	Assert.assertEquals(id.getText(),firstevent[0]);
    	Assert.assertEquals(category.getText(),firstevent[3]);
    	Assert.assertEquals(user.getText(),firstevent[5]);
    	Assert.assertEquals(source.getText(),firstevent[6]);
    	Assert.assertEquals(comp.getText(),firstevent[7]);
    	Assert.assertEquals(msgg.getText(),firstevent[8]);
    	Assert.assertEquals(ack.getText(),firstevent[1]);
    		
    	Thread.sleep(3000);
   
    	System.out.println("Go back to the Event List screen");
    	driver.navigate().back();
    	
		return this;
	}
	
	public EventsScreen refreshfunctionality() throws InterruptedException {
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		 List<WebElement> NoOfElements = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
	        
	     int size = 0;
	     size = NoOfElements.size();
	     System.out.println("The number of elements before refresh are " +size);
	
		System.out.println("Trigger an event from HiVision Preferences Menu");
    	Thread.sleep(30000);
       	
    	//System.out.println(popupcontent.getText());
		//Assert.assertEquals(popupcontent.getText(), "New HiVision event received");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Click on the context menu");
		contextmenu.click();
		Thread.sleep(5000);
		
		System.out.println("Click on refresh");
		refresh.click();
		Thread.sleep(3000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(prefeventlabel.getText());
		Assert.assertEquals(prefeventlabel.getText(), "Preferences Modified by User");
		
		 List<WebElement> NoOfElementsAfterRefresh = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
	        
	     int newsize = 0;
	     newsize = NoOfElementsAfterRefresh.size();
	     System.out.println("The number of elements after refresh are " +newsize);
	        
	     Assert.assertEquals( newsize, size + 1  );
	    	 
	     return this;

	}

//			System.out.println("Tap on the first event in the list");
//			 
//			Node nNode2 = nListChild.item(0);
//			Element eElement = (Element) nNode2;
//			
//			//System.out.println("Source NATIVE "+driver.getPageSource());
//			Thread.sleep(10000);
//			
//			System.out.println(nNode2.getNodeName() + ": " + eElement.getAttribute("content-desc"));
//			
//			WebElement Element1 = driver.findElement(By.xpath("//android.view.View[@index='" + String.valueOf(0) +"' and @content-desc = '" + eElement.getAttribute("content-desc") + "']"));
//			Thread.sleep(10000);
//			
//			Element1.click();
//			
//        	Thread.sleep(10000);
//		
//        	String[] firstevent = new String[100];
//        	
//        	try {
//   			 
//    			br = new BufferedReader(new FileReader(csvFile));
//    			line = br.readLine();
//    			
//    			if (line != null) {
//    	 
//    					//System.out.println("the row content is " +line);
//    					int iPos1= line.lastIndexOf("\",");
//    					
//    					//String temp = "";
//    					if (iPos1 > -1){
//    						line = line.substring(0, iPos1);
//    					}
//    					
//    					for ( int j =0; j < 9; j++){
//    						firstevent[j]= line.split(cvsSplitBy)[j];
//    						firstevent[j] = firstevent[j].replaceAll("\"", "");	
//    					}	
//    					
//    				}
//
//    		} catch (FileNotFoundException e1) {
//    			e1.printStackTrace();
//    		} catch (IOException e1) {
//    			e1.printStackTrace();
//    		} finally {
//    			if (br != null) {
//    				try {
//    					br.close();
//    				} catch (IOException e1) {
//    					e1.printStackTrace();
//    				}
//    			}
//    		}	
//        	
//        	System.out.println("Change the context to WEBVIEW");
//        	driver.context("WEBVIEW");
//        	Thread.sleep(10000);
//        	
//        	//System.out.println(id.getText());
//        	//System.out.println(firstevent[0]);
//        		
//        	Assert.assertEquals(id.getText(),firstevent[0]);
//        	Assert.assertEquals(category.getText(),firstevent[3]);
//        	Assert.assertEquals(user.getText(),firstevent[5]);
//        	Assert.assertEquals(source.getText(),firstevent[6]);
//        	Assert.assertEquals(comp.getText(),firstevent[7]);
//        	Assert.assertEquals(msg.getText(),firstevent[8]);
//        	Assert.assertEquals(ack.getText(),firstevent[1]);
//        		
//        Thread.sleep(3000);
//       
//       	System.out.println("Go back to the Event List screen");
//       
//       	driver.navigate().back();
//       
//       	driver.context("NATIVE_APP");
//		Thread.sleep(10000);
//		
//		System.out.println("Tap on the context Menu");
//		contextmenu.click();
//		Thread.sleep(5000);
//   	
//		System.out.println("Tap on the 'Filter By' option");
//		filterby.click();
//		Thread.sleep(5000);
//   
//		System.out.println("Tap on the 'None' option");
//		None.click();
//		Thread.sleep(5000);
	
      
	public EventsScreen autorefresh() throws InterruptedException {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the settings icon on the Home Screen");
		settings.click();
		Thread.sleep(10000);
		
		SettingsScreen hostdata = new SettingsScreen(driver);
		hostdata.checkedAutorefreshCheckcbox();
		Thread.sleep(3000);
		
		hostdata.clickconntestbutton();
		Thread.sleep(10000);
		
		hostdata.changeContextWebview();
		Thread.sleep(15000);
		
		hostdata.mypopupSuccess();
		Thread.sleep(5000);
		
		hostdata.changeContextNativeApp();
		Thread.sleep(15000);
		hostdata.clickokbtn();
	
		return this;
		
	}
	public EventsScreen titleText(){
		System.out.println(pageLabel.getText());
		return this;
	}
	
	public EventsScreen autorefreshvalidation() throws InterruptedException {
		
		
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		System.out.println("Tap on the Event list");
		EventList.click();
		Thread.sleep(10000);
		
		System.out.println("USER INTERVENTION REQUIRED: Trigger an event from HiVision using the preferences menu");
    	
		driver.context("WEBVIEW");
    	Thread.sleep(10000);
    	
    	System.out.println(popupcontent.getText());
		Assert.assertEquals(popupcontent.getText(), "New HiVision event received");
		
		System.out.println("Wait for auto-refresh timer of 30 seconds to expire");
		Thread.sleep(35000);
		System.out.println(newevent.getText());
		Assert.assertEquals(newevent.getText(), "New Events: 1");
		
		Thread.sleep(10000);
		
		
			
		return this;
	}
	
	
	public EventsScreen statusmessagefunctionalitypart1() throws InterruptedException {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		driver.navigate().back();
		
		System.out.println("Tap on the Event list");
		EventList.click();
		Thread.sleep(10000);
		
		System.out.println("USER INTERVENTION REQUIRED: Trigger an event from HiVision using the preferences menu");
    	
		driver.context("WEBVIEW");
    	Thread.sleep(10000);
    	
    	System.out.println(popupcontent.getText());
		Assert.assertEquals(popupcontent.getText(), "New HiVision event received");
		
		System.out.println("Wait for auto-refresh timer of 30 seconds to expire");
		Thread.sleep(35000);
		System.out.println(newevent.getText());
		Assert.assertEquals(newevent.getText(), "New Events: 1");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Scroll down the event list");
		driver.swipe(350,850,350,550,10000);
		
		
		
		
			
		return this;
	}
	
	
	public EventsScreen statusmessagefunctionalitypart2() throws InterruptedException {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		driver.navigate().back();
		
		System.out.println("Tap on the Event list");
		EventList.click();
		Thread.sleep(10000);
		
		System.out.println("USER INTERVENTION REQUIRED: Trigger an event from HiVision using the preferences menu");
    	
		driver.context("WEBVIEW");
    	Thread.sleep(10000);
    	
    	System.out.println(popupcontent.getText());
		Assert.assertEquals(popupcontent.getText(), "New HiVision event received");
		
		System.out.println("Wait for auto-refresh timer of 30 seconds to expire");
		Thread.sleep(35000);
		System.out.println(newevent.getText());
		Assert.assertEquals(newevent.getText(), "New Events: 1");
		
		System.out.println("Tap on the status message");
		
		
		
			
		return this;
	}
	
	
	
	public EventsScreen autorefreshnoconnection() throws InterruptedException {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		driver.navigate().back();
		
		System.out.println("Tap on the Event list");
		EventList.click();
		Thread.sleep(10000);
		
		System.out.println("Turn the WiFi OFF in the device");
		System.out.println("Wait for the AutoRefresh timer of 30 seconds to expire");

		Thread.sleep(30000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(popupcontent.getText());
		Assert.assertEquals(popupcontent.getText(), "Unable to update content. Check your connection.");
		Thread.sleep(3000);
		
		System.out.println("USER INTERVENTION REQUIRED: Turn ON the WIFI");
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		driver.navigate().back();
		Thread.sleep(5000);
	
		return this;
	}
	
	
	public EventsScreen autorefreshinterruptionrefresh() throws InterruptedException {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		driver.navigate().back();
	
		System.out.println("Tap on event list");
		EventList.click();
		
		System.out.println("USER INTERVENTION REQUIRED: Trigger an event from HiVision using the preferences menu");
    	driver.context("WEBVIEW");
    	Thread.sleep(10000);
    	
    	List<WebElement> NoOfElements = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
        
	     int elementsbeforerefresh = 0;
	     elementsbeforerefresh = NoOfElements.size();
	     System.out.println("The number of events before refresh are " +elementsbeforerefresh);
	        
    	System.out.println(popupcontent.getText());
		Assert.assertEquals(popupcontent.getText(), "New HiVision event received");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on context menu");
		contextmenu.click();
		
		System.out.println("Tap on 'Refresh' option");
		refresh.click();
		Thread.sleep(2000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		List<WebElement> NoOfElements1 = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
		
		int elementsafterrefresh = 0;
	     elementsafterrefresh = NoOfElements1.size();
	     System.out.println("The number of events after refresh are " +elementsafterrefresh);
	        
	     Assert.assertEquals( elementsafterrefresh,   elementsbeforerefresh + 1  );
	     
	     Thread.sleep(3000);
	     
	     System.out.println("Back key interruption validation test starts");
	     
	     
	     	     
	     driver.context("NATIVE_APP");
			Thread.sleep(10000);
			
			driver.navigate().back();
			
			System.out.println("Tap on the Event List");
			EventList.click();
			
			System.out.println("Trigger an event from HiVision using preferences menu");
	    	driver.context("WEBVIEW");
	    	Thread.sleep(10000);
	    	
	    	List<WebElement> NoOfElements2 = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
	        
		     int elementsbeforeback = 0;
		     elementsbeforeback = NoOfElements2.size();
		     System.out.println("The number of events before refresh are " +elementsbeforeback);
		        
	    	System.out.println(popupcontent.getText());
			Assert.assertEquals(popupcontent.getText(), "New HiVision event received");
			
			driver.context("NATIVE_APP");
			Thread.sleep(10000);
			
			driver.navigate().back();
			
			System.out.println("Tap on the Event List");
			EventList.click();
			
			driver.context("WEBVIEW");
			Thread.sleep(10000);
			
			List<WebElement> NoOfElements3 = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
			
			int elementsafterback = 0;
		     elementsafterback = NoOfElements3.size();
		     System.out.println("The number of events after refresh are " +elementsafterback);
		        
		     Assert.assertEquals( elementsafterback,   elementsbeforeback + 1  );
		     
		
		return this;
	}


	public EventsScreen autorefreshonfilterbyoption() throws InterruptedException {
		
		
	     
	    driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		driver.navigate().back();
		
		System.out.println("Tap on event list");
		EventList.click();
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		List<WebElement> NoOfElements = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
		
		int elementsbefore = 0;
	     elementsbefore = NoOfElements.size();
	     System.out.println("The number of events before the trigger are" +elementsbefore);
	        
	    driver.context("NATIVE_APP");
	    Thread.sleep(10000); 
	    
	    System.out.println("Tap on the context menu");
		contextmenu.click();
		Thread.sleep(3000);
		
		System.out.println("Tap on 'filter by' option");
		filterby.click();
		Thread.sleep(2000);
		
		System.out.println("Tap on 'Warning&Errors' option");
		warningserrors.click();
		Thread.sleep(2000);
		
		System.out.println("Trigger an event from HiVision using preferences menu");
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(popupcontent.getText());
		Assert.assertEquals(popupcontent.getText(), "New HiVision event received");    
		
		Thread.sleep(25000);
		System.out.println(newevent.getText());
		Assert.assertEquals(newevent.getText(), "New Events: 0 (Filtered) / 1 (Total)");
		
		Thread.sleep(30000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the Context Menu");
		contextmenu.click();
		Thread.sleep(5000);
		
		System.out.println("Tap on 'filter by' option");
		filterby.click();
		Thread.sleep(2000);
		
		System.out.println("Tap on the 'None' option");
		None.click();
		Thread.sleep(2000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		EventList.click();
		Thread.sleep(5000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		List<WebElement> NoOfElements1 = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
		
		int elementsafter = 0;
	     elementsafter = NoOfElements1.size();
	     System.out.println("The number of events after refresh are" +elementsafter);
	        
	     Assert.assertEquals( elementsafter,   elementsbefore + 1  );
		
		return this;
	}

	
	public EventsScreen validatestatusmessagehomescreen() throws InterruptedException {
		
		System.out.println("USER INTERVENTION: Enable push notification for the device and Trigger an event from HiVision");
		Thread.sleep(60000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		Assert.assertEquals(popupmsg.getText() , "New HiVision event received" );
		
		return this;
	}
	
	public EventsScreen validatebackkey() throws InterruptedException {
		
		
		
//		System.out.println("Navigate to the Home screen");
//		System.out.println("Tap on the back key");
//		driver.tap(1,60, 1720, 5);
//		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(pageLabel.getText());
		Assert.assertEquals(pageLabel.getText(), "HiMobile");
		
		System.out.println(NetworkLabel.getText());
		Assert.assertEquals(NetworkLabel.getText(), "Network");
		
		System.out.println(EventListLabel.getText());
		Assert.assertEquals(EventListLabel.getText(), "Event List");
		
		System.out.println(DeviceLabel.getText());
		Assert.assertEquals(DeviceLabel.getText(), "Device");
					
		return this;
	}
	
	public EventsScreen screenTitle(){
		System.out.println(pageLabel.getText());
		Assert.assertEquals(pageLabel.getText(), "HiMobile");
		return this;
	}
}
