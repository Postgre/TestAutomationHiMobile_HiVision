package himobile.screens;



import himobile.base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NetworkScreen extends ScreenBase {

	public NetworkScreen(AndroidDriver driver) {
		super(driver);
	}
	
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/strong/p")
	public WebElement HiMobileLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[1]/div[2]")
	public WebElement NetworkLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[2]/div[2]")
	public WebElement EventListLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[3]/div[2]")
	public WebElement DeviceLabel;

	@FindBy(xpath="//*[@id=\"gwt-debug-deviceHeaderLbl\"]")
	public WebElement HeaderLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li/div/div[1]/div")
	public WebElement ProjectLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li/div/div[2]/div[3]")
	public WebElement FolderLabel;
	
	@FindBy(xpath="/html/body/div[3]/div/table/tbody/tr/td")
	public WebElement popupcontent;
	
	
	//*[@id="gwt-debug-deviceCellList"]/ul/li[2]/div/div[2]/div[3]	
	//@FindBy(className="GL3K22LDCS GL3K22LDET")
	//public List<WebElement> WidgetListLabel;
	
	//@FindBy(className="GL3K22LDNR GL3K22LDET")
	//public List<WebElement> WidgetListSubLabel;
	
	
	//*[@id="gwt-debug-deviceCellList"]/ul/li[1]/div/div[1]/div
	//*[@id="gwt-debug-deviceCellList"]/ul/li[1]/div/div[2]/div[3]
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[1]/div/div[1]/div")
	public WebElement NewDevicesLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[2]/div/div[1]/div")
	public WebElement UnusedDevicesLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[3]/div/div[1]/div")
	public WebElement MyNetworkLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[4]/div/div[1]/div")
	public WebElement RogueDevicesLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[1]/div/div[2]/div[3]")
	public WebElement Folder1Label;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[2]/div/div[2]/div[3]")
	public WebElement Folder2Label;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[3]/div/div[2]/div[3]")
	public WebElement Folder3Label;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[4]/div/div[2]/div[3]")
	public WebElement Folder4Label;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/div/div/div")
	public WebElement nodata;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceDetailLbl\"]")
	public WebElement devicedetailheader;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceStatusLbl\"]")
	public WebElement devicestatusheader;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portHeaderLbl\"]")
	public WebElement portlistheader;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[1]/div[2]")
	public WebElement devicelabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[5]/div[2]")
	public WebElement devicevendor;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[6]/div[2]")
	public WebElement deviceproduct;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[7]/div[2]")
	public WebElement devicechassis;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[9]/div[2]")
	public WebElement devicename;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[10]/div[2]")
	public WebElement devicelocation;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[11]/div[2]")
	public WebElement devicecontact;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[12]/div[2]")
	public WebElement devicestarttime;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[13]/div[2]")
	public WebElement deviceqrcode;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[14]/div[2]")
	public WebElement devicetemp;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[15]/div[2]")
	public WebElement deviceserialno;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[16]/div[2]")
	public WebElement devicewlan;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[1]/div[2]")
	public WebElement GlobalStatusValue;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[2]/div[1]")
	public WebElement Status1Label;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[2]/div[2]")
	public WebElement Status1Value;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[3]/div[1]")
	public WebElement Message1Label;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[3]/div[2]")
	public WebElement Message1Value;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[4]/div[1]")
	public WebElement Status2Label;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[4]/div[2]")
	public WebElement Status2Value;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[5]/div[1]")
	public WebElement Message2Label;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[5]/div[2]")
	public WebElement Message2Value;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[1]/div/div[2]/div[1]")
	public WebElement StatusIconDevice1;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[1]/div/div[1]/div")
	public WebElement FirstDeviceLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portCellList\"]/ul/li[1]/div/div[1]/div")
	public WebElement port1label;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portCellList\"]/ul/li[1]/div/div[2]/div[2]")
	public WebElement port1status;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portCellList\"]/ul/li[2]/div/div[2]/div[2]")
	public WebElement port2status;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDetailLbl\"]")
	public WebElement portdetailheader;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceStatusLbl\"]")
	public WebElement portstatusheader;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement autoneg;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement duplex;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement mediatype;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement type;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement speed;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement admin;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement link;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement vlan;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement inload;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement outload;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement portname;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement portid;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement filter;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement pvid;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-portDeatilCellList\"]/ul/li[18]/div[2]")
	public WebElement portmacaddress;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCellList\"]/ul/li[12]/div/div[1]/div")
	public WebElement newconnection;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-connectionDetailLbl\"]")
	public WebElement NewConnectionInfoHeader;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceStatusLbl\"]")
	public WebElement NewConnectionStatusHeader;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-connectionCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[1]/div[1]")
	public WebElement NewConnectionLabelText;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-connectionCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[1]/div[2]")
	public WebElement NewConnectionLabelValue;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-connectionCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[3]/div[1]")
	public WebElement NewConnectionDeviceAText;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-connectionCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[3]/div[2]")
	public WebElement NewConnectionDeviceAValue;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-connectionCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[5]/div[1]")
	public WebElement NewConnectionDeviceBText;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-connectionCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[5]/div[2]")
	public WebElement NewConnectionDeviceBValue;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceStatusLbl\"]")
	public WebElement SubDomainHeader;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[1]/div[2]")
	public WebElement SubDomainGlobalStatus;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[2]/div[2]")
	public WebElement SubDomainStatus;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-statusCellList\"]/ul/li[3]/div[2]")
	public WebElement SubDomainMessage;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceCarouselView\"]/div[1]/div/div[2]/div/div[2]/div[1]/ul/li[7]/div[2]")
	public WebElement LocationCoordinates;

	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div[1]")
	public WebElement EditLocationHeader;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div[2]/div/ul/li[1]/div/div[1]")
	public WebElement LatitudeLabel;

	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div[2]/div/ul/li[2]/div/div[1]")
	public WebElement LongitudeLabel;

	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div[2]/div/ul/li[1]/div/div[2]/input")
	public WebElement LatitudeValue;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div[2]/div/ul/li[2]/div/div[2]/input")
	public WebElement LongitudeValue;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div[3]/div[1]")
	public WebElement ApplyLabel;
	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/div/div[3]/div[2]")
	public WebElement CancelLabel;
	
	@FindBy(xpath="/html/body/div[3]/div/table/tbody/tr/td")
	public WebElement LocationUpdatedPopup;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='8']")
	public WebElement Network ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='11']")
	public WebElement Project ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='9']")
	public WebElement contextmenu ;
	
	@AndroidFindBy(xpath="//android.view.View[@content-desc='Refresh']")
	public WebElement refresh ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='11']")
	public WebElement NewDevices ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='14']")
	public WebElement UnusedDevices ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='11']")
	public WebElement Device1 ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='14']")
	public WebElement Device2 ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='18']")
	public WebElement Device3 ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='54']")
	public WebElement Device12 ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='13']")
	public WebElement SubDomain ;
	
	
	public NetworkScreen validatelabels() throws InterruptedException	{
		
		System.out.println("Tap on Network in the Home Screen");
		Network.click();
		Thread.sleep(25000);
		
		System.out.println("Source NATIVE "+driver.getPageSource());
		Thread.sleep(5000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(HeaderLabel.getText());
		Assert.assertEquals(HeaderLabel.getText(), "Project");
		
		System.out.println(ProjectLabel.getText());
		Assert.assertEquals(ProjectLabel.getText(), "Project");
		
		System.out.println(FolderLabel.getText());
		Assert.assertEquals(FolderLabel.getText(), "Folder");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
			
		System.out.println("Tap on the Project");
		Project.click();
		Thread.sleep(15000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
	
		System.out.println(HeaderLabel.getText());
		Assert.assertEquals(HeaderLabel.getText(), "Project");
		
		System.out.println(NewDevicesLabel.getText());
		Assert.assertEquals(NewDevicesLabel.getText(), "New Devices");
		
		System.out.println(UnusedDevicesLabel.getText());
		Assert.assertEquals(UnusedDevicesLabel.getText(), "Unused Devices");
	
		System.out.println(MyNetworkLabel.getText());
		Assert.assertEquals(MyNetworkLabel.getText(), "My Network");
		
		System.out.println(RogueDevicesLabel.getText());
		Assert.assertEquals(RogueDevicesLabel.getText(), "Rogue Devices");
		
		System.out.println(Folder1Label.getText());
		Assert.assertEquals(Folder1Label.getText(), "Folder");
		
		System.out.println(Folder2Label.getText());
		Assert.assertEquals(Folder2Label.getText(), "Folder");
			
		System.out.println(Folder3Label.getText());
		Assert.assertEquals(Folder3Label.getText(), "Folder");
		
		System.out.println(Folder4Label.getText());
		Assert.assertEquals(Folder4Label.getText(), "Folder");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
		Thread.sleep(3000);
		
		System.out.println("Tap on the refresh option");
		refresh.click();
		Thread.sleep(20000);
		
		System.out.println("Tap on the back key");
		driver.navigate().back();
		Thread.sleep(20000);
		
		return this;
				
	}
	
	public NetworkScreen validaterefreshfunctionality() throws InterruptedException	{
	
		System.out.println("Tap on the context menu");
		contextmenu.click();
		Thread.sleep(3000);
		
		System.out.println("Tap on the refresh option");
		refresh.click();
		Thread.sleep(20000);
		
		System.out.println("Verify the GUI labels after Resfrsh");
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(HeaderLabel.getText());
		Assert.assertEquals(HeaderLabel.getText(), "Project");
		
		System.out.println(ProjectLabel.getText());
		Assert.assertEquals(ProjectLabel.getText(), "Project");
		
		System.out.println(FolderLabel.getText());
		Assert.assertEquals(FolderLabel.getText(), "Folder");
		
		return this;
	
	}
	
	public NetworkScreen validatebackkey() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the Back key");
		driver.navigate().back();
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(HiMobileLabel.getText());
		Assert.assertEquals(HiMobileLabel.getText(), "HiMobile");
		
		System.out.println(NetworkLabel.getText());
		Assert.assertEquals(NetworkLabel.getText(), "Network");
		
		System.out.println(EventListLabel.getText());
		Assert.assertEquals(EventListLabel.getText(), "Event List");
		
		System.out.println(DeviceLabel.getText());
		Assert.assertEquals(DeviceLabel.getText(), "Device");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on Network in the Home Screen");
		Network.click();
		Thread.sleep(25000);
		
		return this;
	}
	
	public NetworkScreen validatehomeicon() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the home icon");
		driver.tap(1, 530, 1706, 5);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(HiMobileLabel.getText());
		Assert.assertEquals(HiMobileLabel.getText(), "HiMobile");
		
		System.out.println(NetworkLabel.getText());
		Assert.assertEquals(NetworkLabel.getText(), "Network");
		
		System.out.println(EventListLabel.getText());
		Assert.assertEquals(EventListLabel.getText(), "Event List");
		
		System.out.println(DeviceLabel.getText());
		Assert.assertEquals(DeviceLabel.getText(), "Device");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on Network in the Home Screen");
		Network.click();
		Thread.sleep(25000);
		
		return this;
	}
	
	public NetworkScreen validaterefreshwithnoHiVisionConn() throws InterruptedException	{
		
		System.out.println("USER INTERVENTION REQUIRED");
		System.out.println("Turn the WiFi of the device OFF");
		Thread.sleep(5000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
		Thread.sleep(3000);
		
		System.out.println("Tap on the refresh option");
		refresh.click();
		Thread.sleep(20000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(popupcontent.getText());
		Assert.assertEquals(popupcontent.getText(), "Unable to update content. Check your connection.");
		
		System.out.println("USER INTERVENTION REQUIRED");
		System.out.println("Turn the WiFi of the device ON");
		Thread.sleep(5000);
		
		return this;
	}
	
	
	public NetworkScreen validatenodata() throws InterruptedException	{
	
		System.out.println("Tap on the Unused Devices");
		UnusedDevices.click();
		Thread.sleep(20000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		Assert.assertEquals(nodata.getText(), "No Data");
		
		System.out.println("Tap on the context Menu");
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		contextmenu.click();
		
		System.out.println("Tap on the refresh option");
		refresh.click();
		Thread.sleep(10000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		Assert.assertEquals(nodata.getText(), "No Data");
		
		driver.navigate().back();
		Thread.sleep(20000);
			
		return this;
		
	}
	
	
	public NetworkScreen validatenewdeviceslist() throws InterruptedException	{
	
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the New Devices option");
		NewDevices.click() ;
		Thread.sleep(20000);
		
				//remove this
		
				//System.out.println("Tap on the New Devices option");
				//Device2.click() ;
				//Thread.sleep(20000);
				
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(HeaderLabel.getText());
		Assert.assertEquals(HeaderLabel.getText(), "New Devices");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("USER INTERVENTION REQUIRED: Save the Page source as xml file named as DevicesList.xml ");
		
		System.out.println("Source NATIVE "+driver.getPageSource());
		Thread.sleep(20000);
		
		System.out.println("USER INTERVENTION REQUIRED: Export the Devices tab as csv file amd name it as DevicesList.csv ");
		System.out.println("NOTE: Remove the first three rows from the csv file ");
		Thread.sleep(60000);
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\DevicesList.xml");
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
        
		System.out.println("The number of new devices listed in HiMobile are " + nListChild.getLength());
		
		String csvFile = "C:\\Users\\varun.walia.IBTS\\Desktop\\DevicesList.csv";
		String[] deviceshimobile = new String[100];
		String input;
		int count = 0;
        BufferedReader br1 = null;
		
        try {
        	br1 = new BufferedReader(new FileReader(csvFile));
			
			while((input = br1.readLine()) != null)
			{
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

        System.out.println("The number of new devices in HiVision are : "+count);
		
        Assert.assertEquals(nListChild.getLength(), count);
                
        BufferedReader br2 = null;
    	String line = "";
    	String cvsSplitBy = ";";
    	String[] deviceshivision = new String[100];

		try {
			 
			br2 = new BufferedReader(new FileReader(csvFile));
			int temp1 = 0;
		
			while ((line = br2.readLine()) != null) {
	
				int iPos= line.lastIndexOf("\",");	
				if (iPos > -1){
					line = line.substring(0, iPos);
				}
		
					deviceshivision[temp1]= line.split(cvsSplitBy)[2];
					deviceshivision[temp1] = deviceshivision[temp1].replaceAll("\"", "");
					System.out.println("The hivison device name is " + deviceshivision[temp1] );
					temp1++;
				}
	 
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (br2 != null) {
				try {
					br2.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}	

        
		for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
			 
			Node nNode1 = nListChild.item(temp2);
			Element eElement = (Element) nNode1;

			Thread.sleep(10000);
			deviceshimobile[temp2] = eElement.getAttribute("content-desc");
			System.out.println("The himobile device name is " +deviceshimobile[temp2]);
		}
		
		
		for (int temp3 = 0; temp3 < nListChild.getLength(); temp3++) {
			int count1 = 0;
			for (int temp4 = 0; temp4 < nListChild.getLength(); temp4++){
				
				if (deviceshimobile[temp3].contains(deviceshivision[temp4])){
					count1++;
					break;
				} else {
					count1 = 0;
				}
				
			}
			Assert.assertEquals(count1 , 1);
			}
	
		Thread.sleep(10000);
	
		return this;
	}
	
	
	public NetworkScreen validatedeviceinfo() throws InterruptedException	{
		
	
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\DevicesList.xml");
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
		String[] devicelist = new String[100];
		
		for (int temp2 = 0; temp2 < 3; temp2++) {
			 
			Node nNode1 = nListChild.item(temp2);
			Element eElement = (Element) nNode1;

			Thread.sleep(10000);
			devicelist[temp2] = eElement.getAttribute("content-desc");
				
		}
		
		System.out.println("Tap on one of the top three devices listed except the ping device");
		
		//System.out.println("device name"+Device1.getAttribute("content-desc"));
		
		String device1info = devicelist[0];
		String device2info = devicelist[1];
		//String device3info = Device3.getAttribute("content-desc");
		
		if(device1info.contains("Ping")){
			
			if(device2info.contains("Ping")){
				Device3.click();
			}
			else {
				Device2.click();
				Thread.sleep(10000);
				
				System.out.println("Swipe to the left to the device status screen");
				driver.swipe(350, 750, 750, 750, 10000);
				
				driver.context("WEBVIEW");
				Thread.sleep(10000);
				
				if (GlobalStatusValue.getText().matches("OK")){
					
					driver.navigate().back();
					Thread.sleep(15000);
					
					driver.context("NATIVE_APP");
					Thread.sleep(10000);
					
					Device3.click();
					
				}
				
			}
		}	
		else {
			Device1.click();
			 }
		
		Thread.sleep(15000);
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("The device name which is tapped " + devicelabel.getText());
		
		System.out.println(devicedetailheader.getText());
		Assert.assertEquals(devicedetailheader.getText(), devicelabel.getText()+" - Detail");
		
		
		BufferedReader br2 = null;
        String csvFile = "C:\\Users\\varun.walia.IBTS\\Desktop\\DeviceInfo.csv";
		String line = "";
    	String cvsSplitBy = ";";
    	String[] deviceinfo = new String[100];

		try {
			 
			br2 = new BufferedReader(new FileReader(csvFile));
			int temp1 = 0;
			//String[] deviceinfo = new String[100];
		
			while ((line = br2.readLine()) != null) {
	
				int iPos= line.lastIndexOf("\",");	
				if (iPos > -1){
					line = line.substring(0, iPos);
				}
		
					deviceinfo[temp1]= line.split(cvsSplitBy)[3];
					deviceinfo[temp1] = deviceinfo[temp1].replaceAll("\"", "");
					temp1++;
    			}
						
			        	Assert.assertEquals(devicewlan.getText(),deviceinfo[1]);
			        	Assert.assertEquals(deviceserialno.getText(),deviceinfo[2]);
			        	Assert.assertEquals(devicetemp.getText(),deviceinfo[3]);
			        	Assert.assertEquals(deviceqrcode.getText(),deviceinfo[5]);
			        	Assert.assertEquals(devicestarttime.getText(),deviceinfo[6]);
			        	Assert.assertEquals(devicecontact.getText(),deviceinfo[7]);
			        	Assert.assertEquals(devicelocation.getText(),deviceinfo[8]);
			        	Assert.assertEquals(devicename.getText(),deviceinfo[9]);
			        	Assert.assertEquals(devicechassis.getText(),deviceinfo[11]);
			        	Assert.assertEquals(deviceproduct.getText(),deviceinfo[12]);
			        	Assert.assertEquals(devicevendor.getText(),deviceinfo[13]);
			        	//Assert.assertEquals(devicemacaddress.getText(),deviceinfo[10]);
			       
			        	
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (br2 != null) {
				try {
					br2.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

        driver.context("NATIVE_APP");
        Thread.sleep(10000);
        
		return this;
		
	}
	
	
	public NetworkScreen validaterefreshondevicedetail() throws InterruptedException	{
		
		System.out.println("USER INTERVENTION REQUIRED: Change the Name of the device to abc from HiVision ");
		Thread.sleep(20000);
		
		driver.context("NATIVE_APP");
        Thread.sleep(10000);
        
        System.out.println("Tap on the context Menu");
		contextmenu.click();
		
		System.out.println("Tap on the refresh option");
		refresh.click();
		Thread.sleep(20000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("Validate that the Name of the device gets updated after refresh");
		System.out.println("The Name of the device is " +devicename.getText());
		Assert.assertEquals(devicename.getText(), "abc");
		
		return this;
		
	}
	
	public NetworkScreen validatebackkeyondevicedetail() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
        Thread.sleep(10000);
        
        System.out.println("Tap on the back key");
		driver.navigate().back();
		
		System.out.println("Validate that the app navigates to the New Devices screen");
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("The screen header is " +HeaderLabel.getText());
		Assert.assertEquals(HeaderLabel.getText(), "New Devices");
		
		return this;
		
	}
	
	
	
	public NetworkScreen validatedevicestatus() throws InterruptedException	{
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\DevicesList.xml");
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
		String[] devicelist = new String[100];
		
		for (int temp2 = 0; temp2 < 3; temp2++) {
			 
			Node nNode1 = nListChild.item(temp2);
			Element eElement = (Element) nNode1;

			Thread.sleep(10000);
			devicelist[temp2] = eElement.getAttribute("content-desc");
				
		}
		
		System.out.println("Tap on one of the top three devices listed except the ping device");
		
		//System.out.println("device name"+Device1.getAttribute("content-desc"));
		
		String device1info = devicelist[0];
		String device2info = devicelist[1];
		//String device3info = Device3.getAttribute("content-desc");
		
		if(device1info.contains("Ping")){
			
			if(device2info.contains("Ping")){
				Device3.click();
			}
			else {
				Device2.click();
				Thread.sleep(10000);
				
				System.out.println("Swipe to the left to the device status screen");
				driver.swipe(350, 750, 750, 750, 10000);
				
				driver.context("WEBVIEW");
				Thread.sleep(10000);
				
				if (GlobalStatusValue.getText().matches("OK")){
					
					driver.navigate().back();
					Thread.sleep(15000);
					
					driver.context("NATIVE_APP");
					Thread.sleep(10000);
					
					Device3.click();
					
				}
				
			}
		}	
		else {
			Device1.click();
			 }
		
		Thread.sleep(15000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(devicelabel.getText());
		String a = devicelabel.getText();
		
		driver.context("NATIVE_APP");
        Thread.sleep(30000);
        
		System.out.println("Swipe to the left to the device status screen");
        driver.swipe(350, 750, 750, 750, 8000);
        
        System.out.println("USER INTERVENTION REQUIRED: Get the status of the device from Hivision and save it in .csv format named as devicestatus.csv");
        System.out.println("NOTE: Remove the first three rows from the csv file ");
        
        driver.context("WEBVIEW");
        Thread.sleep(30000);
        
        Assert.assertEquals(devicestatusheader.getText(), a + " - Status");
        
        Assert.assertEquals(Status1Label.getText(), "Status");
        Assert.assertEquals(Message1Label.getText(), "Message");
        Assert.assertEquals(Status2Label.getText(), "Status");
        Assert.assertEquals(Message2Label.getText(), "Message");
		
        BufferedReader br2 = null;
        String csvFile = "C:\\Users\\varun.walia.IBTS\\Desktop\\devicestatus.csv";
		String line = "";
    	String cvsSplitBy = ";";
    	String[] securitycheck = new String[100];
    	int temp2 = 0;
    	
		try {
			 
			br2 = new BufferedReader(new FileReader(csvFile));
			int temp1 = 0;
			String[] statusmessage = new String[100];
		
			while ((line = br2.readLine()) != null) {
	
				int iPos= line.lastIndexOf("\",");	
				if (iPos > -1){
					line = line.substring(0, iPos);
				}
					
					securitycheck[temp1]= line.split(cvsSplitBy)[3];
					securitycheck[temp1] = securitycheck[temp1].replaceAll("\"", "");
					System.out.println("The value is " + securitycheck[temp1]);
					
					if (securitycheck[temp1].matches("Unsecure")){
						   
						//for ( int j =0; j < 15; j++){
							System.out.println("The value of temp is " + temp1);
							statusmessage[temp2]= line.split(cvsSplitBy)[4];
							statusmessage[temp2] = statusmessage[temp2].replaceAll("\"", "");	
    					
						
						Assert.assertTrue(statusmessage[temp2].contains(Message1Value.getText())||statusmessage[temp2].contains(Message2Value.getText()) );
			        
					}
					
					temp1++;
					temp2++;
								
				}
	 
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (br2 != null) {
				try {
					br2.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}
        
		Thread.sleep(1000);

		
		return this;
		
	}
	
	public NetworkScreen validatebackkeydevicestatus() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
        Thread.sleep(10000);
        
        System.out.println("Tap on the back key");
		driver.navigate().back();
		
		System.out.println("Validate that the app navigates to the New Devices screen");
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("The screen header is " +HeaderLabel.getText());
		Assert.assertEquals(HeaderLabel.getText(), "New Devices");
		
		return this;

	}
	
	public NetworkScreen validatedevicestatusfromicon() throws InterruptedException	{
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		String str = FirstDeviceLabel.getText();
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the first device in the list");
		
		driver.tap(1,120,320,20);
		Thread.sleep(10000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		Assert.assertTrue(devicestatusheader.getText().contains(FirstDeviceLabel.getText()));
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Swipe to the right to the device info screen");
        driver.swipe(750, 750, 350, 750, 10000);
        
        System.out.println("Swipe to the right to the port status screen");
        driver.swipe(750, 750, 350, 750, 10000);
		
		driver.navigate().back();
		Thread.sleep(10000);
		
		
		return this;
	}
	
	
	public NetworkScreen validateportlist() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\DevicesList.xml");
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
		String[] devicelist = new String[100];
		
		for (int temp2 = 0; temp2 < 3; temp2++) {
			 
			Node nNode1 = nListChild.item(temp2);
			Element eElement = (Element) nNode1;

			Thread.sleep(10000);
			devicelist[temp2] = eElement.getAttribute("content-desc");
				
		}
		
		System.out.println("Tap on one of the top three devices listed except the ping device");
		
		//System.out.println("device name"+Device1.getAttribute("content-desc"));
		
		String device1info = devicelist[0];
		String device2info = devicelist[1];
		//String device3info = Device3.getAttribute("content-desc");
		
		if(device1info.contains("Ping")){
			
			if(device2info.contains("Ping")){
				Device3.click();
			}
			else {
				Device2.click();
				Thread.sleep(10000);
				
				System.out.println("Swipe to the left to the device status screen");
				driver.swipe(350, 750, 750, 750, 10000);
				
				driver.context("WEBVIEW");
				Thread.sleep(10000);
				
				if (GlobalStatusValue.getText().matches("OK")){
					
					driver.navigate().back();
					Thread.sleep(15000);
					
					driver.context("NATIVE_APP");
					Thread.sleep(10000);
					
					Device3.click();
					
				}
				
			}
		}	
		else {
			Device1.click();
			 }
		
		Thread.sleep(15000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(devicelabel.getText());
		String a = devicelabel.getText();
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Swipe to the right to the port list screen");
        driver.swipe(750, 750, 350, 750, 8000);
		
		System.out.println("USER INTERVENTION REQUIRED: Get the status of the ports for the device used in the test case from Hivision and save it in .csv format named as portstatus.csv");
		System.out.println("NOTE: Remove the first three rows from the csv file ");
		Thread.sleep(30000);
        
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println(portlistheader.getText());
		Assert.assertEquals(portlistheader.getText(), a + " - Ports");
		
		  	BufferedReader br2 = null;
		  	String csvFile = "C:\\Users\\varun.walia.IBTS\\Desktop\\portlist.csv";
			String line = "";
	    	String cvsSplitBy = ";";
	    	String[] portlist = new String[100];
	    	int temp2 = 0;
	    	int temp3 = 0;
	    	
			try {
				 
				br2 = new BufferedReader(new FileReader(csvFile));
				int temp1 = 0;
				String[] portstatus = new String[100];
				String[] portnumber = new String[100];
				String status = null;
			
				while ((line = br2.readLine()) != null) {
		
					int iPos= line.lastIndexOf("\",");	
					if (iPos > -1){
						line = line.substring(0, iPos);
					}
						
						portlist[temp1]= line.split(cvsSplitBy)[0];
						portlist[temp1] = portlist[temp1].replaceAll("\"", "");
						
						if (portlist[temp1].matches("port")){
							   
								portnumber[temp2]= line.split(cvsSplitBy)[3];
								portnumber[temp2] = portnumber[temp2].replaceAll("\"", "");
								
								portstatus[temp3]= line.split(cvsSplitBy)[7];
								portstatus[temp3] = portstatus[temp3].replaceAll("\"", "");
								//System.out.println("The conn is " + portstatus[temp3]);
								
								if (portstatus[temp3].matches("Connected")) {
										status = "UP"; 
								}
								else{
										status = "DOWN";
								}
								//System.out.println("The status is " +  status);
								
								if (portnumber[temp2].matches("2")){
									System.out.println("Port 2 status is " +port2status.getText());
								
									Assert.assertEquals(port2status.getText(),status);
								}
								else{
									
									if (portnumber[temp2].matches("1")){
										System.out.println("Port 1 status is " +port1status.getText());
									
										Assert.assertEquals(port1status.getText(),status);
									}
								}		        
						}
						
						temp1++;
						temp2++;
						temp3++;			
					}
		 
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			} finally {
				if (br2 != null) {
					try {
						br2.close();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
			}	
			
		return this;
	}
	
	public NetworkScreen validatebackkeyportlist() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
        Thread.sleep(10000);
        
        System.out.println("Tap on the back key");
		driver.navigate().back();
		
		System.out.println("Validate that the app navigates to the New Devices screen");
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("The screen header is " +HeaderLabel.getText());
		Assert.assertEquals(HeaderLabel.getText(), "New Devices");
		
		return this;

	}

	
	public NetworkScreen validateportinfo() throws InterruptedException	{
	
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\DevicesList.xml");
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
		String[] devicelist = new String[100];
		
		for (int temp2 = 0; temp2 < 3; temp2++) {
			 
			Node nNode1 = nListChild.item(temp2);
			Element eElement = (Element) nNode1;

			Thread.sleep(10000);
			devicelist[temp2] = eElement.getAttribute("content-desc");
				
		}
		
		System.out.println("Tap on one of the top three devices listed except the ping device");
		
		//System.out.println("device name"+Device1.getAttribute("content-desc"));
		
		String device1info = devicelist[0];
		String device2info = devicelist[1];
		//String device3info = Device3.getAttribute("content-desc");
		
		if(device1info.contains("Ping")){
			
			if(device2info.contains("Ping")){
				Device3.click();
			}
			else {
				Device2.click();
				Thread.sleep(10000);
				
				System.out.println("Swipe to the left to the device status screen");
				driver.swipe(350, 750, 750, 750, 10000);
				
				driver.context("WEBVIEW");
				Thread.sleep(10000);
				
				if (GlobalStatusValue.getText().matches("OK")){
					
					driver.navigate().back();
					Thread.sleep(15000);
					
					driver.context("NATIVE_APP");
					Thread.sleep(10000);
					
					Device3.click();
					
				}
				
			}
		}	
		else {
			Device1.click();
			 }
		
		Thread.sleep(15000);

		System.out.println("Swipe to the right to the port list screen");
        driver.swipe(750, 750, 350, 750, 8000);
		
		
		System.out.println("USER INTERVENTION REQUIRED: Get the status of the port for the device used in the previous test case from Hivision and save it in .csv format named as portstatus.csv");
		System.out.println("NOTE: Remove the first three rows from the csv file ");
		Thread.sleep(30000);
        
        //System.out.println(portlistheader.getText());
		//Assert.assertEquals(portlistheader.getText(), a + " - Ports");
		
		driver.context("WEBVIEW");
        Thread.sleep(10000);
        
		System.out.println("The port is " + port1label.getText());
		String a = port1label.getText();
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on Port1");
        driver.tap(1, 350, 350, 20);
        Thread.sleep(10000);
        
        driver.context("WEBVIEW");
        Thread.sleep(10000);
        
        System.out.println("The header is " + portdetailheader.getText());
        Assert.assertEquals(portdetailheader.getText(), a + " - Detail");
        
        BufferedReader br2 = null;
        String csvFile = "C:\\Users\\varun.walia.IBTS\\Desktop\\port1info.csv";
		String line = "";
    	String cvsSplitBy = ";";
    	String[] port1info = new String[100];

		try {
			 
			br2 = new BufferedReader(new FileReader(csvFile));
			int temp1 = 0;
			String[] deviceinfo = new String[100];
		
			while ((line = br2.readLine()) != null) {
	
				int iPos= line.lastIndexOf("\",");	
				if (iPos > -1){
					line = line.substring(0, iPos);
				}
		
					port1info[temp1]= line.split(cvsSplitBy)[3];
					port1info[temp1] = port1info[temp1].replaceAll("\"", "");
					temp1++;
			        	
					}
					
			Assert.assertEquals(autoneg.getText(),deviceinfo[0]);
        	Assert.assertEquals(duplex.getText(),deviceinfo[1]);
        	Assert.assertEquals(mediatype.getText(),deviceinfo[2]);
        	Assert.assertEquals(type.getText(),deviceinfo[3]);
        	Assert.assertEquals(speed.getText(),deviceinfo[4]);
        	Assert.assertEquals(admin.getText(),deviceinfo[5]);
        	Assert.assertEquals(link.getText(),deviceinfo[6]);
        	Assert.assertEquals(vlan.getText(),deviceinfo[7]);
        	Assert.assertEquals(inload.getText(),deviceinfo[8]);
        	Assert.assertEquals(outload.getText(),deviceinfo[9]);
        	Assert.assertEquals(portname.getText(),deviceinfo[10]);
        	Assert.assertEquals(portid.getText(),deviceinfo[11]);
        	Assert.assertEquals(filter.getText(),deviceinfo[12]);
        	Assert.assertEquals(pvid.getText(),deviceinfo[13]);
        	Assert.assertEquals(portmacaddress.getText(),deviceinfo[14]);

        	 
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} finally {
			if (br2 != null) {
				try {
					br2.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		}

		
		
//		System.out.println("Swipe to the left to the port status screen");
//        driver.swipe(350, 750, 750, 750, 8000);
//        
//        Thread.sleep(5000);
//        
//        System.out.println("Swipe to the right to the port info screen");
//        driver.swipe(750, 750, 350, 750, 8000);

		return this;
	}
	
	public NetworkScreen validatebackkeyportinfo() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
        Thread.sleep(10000);
        
        System.out.println("Tap on the back key");
		driver.navigate().back();
		
		System.out.println("Validate that the app navigates to the PortList screen");
		
		driver.context("WEBVIEW");
        Thread.sleep(10000);
        
		System.out.println(portlistheader.getText());
		//Assert.assertEquals(portlistheader.getText(), a + " - Ports");
		
		return this;

	}

	public NetworkScreen validateportstatus() throws InterruptedException	{
		
		driver.context("WEBVIEW");
        Thread.sleep(10000);
        
		System.out.println("The port is " + port1label.getText());
		String a = port1label.getText();
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on Port1");
        driver.tap(1, 350, 350, 20);
        Thread.sleep(10000);
        
        System.out.println("Swipe to the left to the port status screen");
	      driver.swipe(350, 750, 750, 750, 8000);
	      
	      driver.context("WEBVIEW");
	      Thread.sleep(10000);
	      
	      System.out.println("The header is " +portstatusheader.getText());
	      Thread.sleep(5000);
	      
	      Assert.assertEquals(portlistheader.getText(), a + " - Status");
	      
	      		
		return this;

	}

	public NetworkScreen validatebackkeyportstatus() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
        Thread.sleep(10000);
        
        System.out.println("Tap on the back key");
		driver.navigate().back();
		
		System.out.println("Validate that the app navigates to the PortList screen");
		
		driver.context("WEBVIEW");
        Thread.sleep(10000);
        
		System.out.println(portlistheader.getText());
		//Assert.assertEquals(portlistheader.getText(), a + " - Ports");
		
		
		return this;

	}

	
	public NetworkScreen validateupdatefolder() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Move back to the Project Screen ");
		
		driver.navigate().back();
		Thread.sleep(10000);
		
		driver.navigate().back();
		Thread.sleep(10000);
		
		System.out.println("USERINTERVENTION REQUIRED: From HiVision update a folder name from 'Unused Devices' to 'Unusable Devices'");
		Thread.sleep(20000);
		
		contextmenu.click();
		Thread.sleep(5000);
		
		refresh.click();
		Thread.sleep(30000);
		
		System.out.println("USER INTERVENTION REQUIRED: Save the page source as UpdateFolder.xml");
		System.out.println("Source Native: " +driver.getPageSource());
		Thread.sleep(30000);
		
		DocumentBuilderFactory dbFactory2 = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder2 = null;
    	File fXmlFile2 = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\UpdateFolder.xml");
    	Document doc2 = null;
		try {
			dBuilder2 = dbFactory2.newDocumentBuilder();
			doc2 = dBuilder2.parse(fXmlFile2);
		} catch (ParserConfigurationException e2) {
			System.out.println("dbFactory Thrown ParserConfigurationException");
			e2.printStackTrace();
		} catch (SAXException e2) {
			e2.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		doc2.getDocumentElement().normalize();
		NodeList nList2 = doc2.getElementsByTagName("android.widget.ListView");
		Node nNode2 = nList2.item(0);
		Element e2 = (Element) nNode2;
		NodeList nListChild2 = e2.getChildNodes();
		String[] newdevicelist2 = new String[100];
		int m = 0;

		
		for (int temp4 = 0; temp4 < nListChild2.getLength(); temp4++) {
			 
			Node nNodenewcontent1 = nListChild2.item(temp4);
			Element eElementnew1 = (Element) nNodenewcontent1;

			Thread.sleep(10000);
			newdevicelist2[temp4] = eElementnew1.getAttribute("content-desc");
			//System.out.println("value os temp is " +temp4);
			//System.out.println("device is " +eElementnew1.getAttribute("content-desc"));
			if((newdevicelist2[temp4]).contains("Unusable Devices")){
				
				System.out.println("The folder name has been updated successfully");
				m++;
				break;
			}
		}

		Assert.assertEquals(m,1);
		
		return this;
		
	}
	
	public NetworkScreen validateeditdevice() throws InterruptedException	{
	
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the New Devices option");
		NewDevices.click() ;
		Thread.sleep(20000);
		
		System.out.println("USER INTERVENTION REQUIRED: Rename the ping device in HiVision from 127.0.0.2 to 'PING DEVICE'");
		Thread.sleep(60000);
		
		contextmenu.click();
		Thread.sleep(5000);
		
		refresh.click();
		Thread.sleep(30000);
		
		System.out.println("USER INTERVENTION REQUIRED: Save the page source as NewDevicesList.xml");
		System.out.println("Source Native: " +driver.getPageSource());
		Thread.sleep(20000);
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\NewDevicesList.xml");
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
		String[] newdevicelist = new String[100];
		int k = 0;
		System.out.println("The number of devices listed in HiMobile are " + nListChild.getLength());
		
		for (int temp2 = 0; temp2 < nListChild.getLength(); temp2++) {
			 
			Node nNodecontent = nListChild.item(temp2);
			Element eElement = (Element) nNodecontent;

			Thread.sleep(10000);
			newdevicelist[temp2] = eElement.getAttribute("content-desc");
		
			//Assert.assertFalse(newdevicelist[temp2].contains("127.0.0.2"));
			if((newdevicelist[temp2]).contains("PING DEVICE")){
				
				System.out.println("The device has been renamed successfully");
				k++;
				break;
			}
			
		}
		
		Assert.assertEquals(k,1);
		
		
		return this;
	}
	
	public NetworkScreen validatecopydevice() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder = null;
    	File fXmlFile = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\NewDevicesList.xml");
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
		System.out.println("The number of devices listed in HiMobile are " + nListChild.getLength());
		
	
		System.out.println("USER INTERVENTION REQUIRED: Create a copy of the ping device in HiVision and name it as 'PING DEVICE COPY'");
		Thread.sleep(60000);
		
		contextmenu.click();
		Thread.sleep(5000);
		
		refresh.click();
		Thread.sleep(30000);
		
		System.out.println("USER INTERVENTION REQUIRED: Save the page source as NewDevices1List.xml");
		System.out.println("Source Native: " +driver.getPageSource());
		Thread.sleep(30000);
		
		DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder1 = null;
    	File fXmlFile1 = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\NewDevices1List.xml");
    	Document doc1 = null;
		try {
			dBuilder1 = dbFactory1.newDocumentBuilder();
			doc1 = dBuilder1.parse(fXmlFile1);
		} catch (ParserConfigurationException e1) {
			System.out.println("dbFactory Thrown ParserConfigurationException");
			e1.printStackTrace();
		} catch (SAXException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		doc1.getDocumentElement().normalize();
		NodeList nList1 = doc1.getElementsByTagName("android.widget.ListView");
		Node nNode1 = nList1.item(0);
		Element e1 = (Element) nNode1;
		NodeList nListChild1 = e1.getChildNodes();
		String[] newdevicelist1 = new String[100];
		int l = 0;
		
		System.out.println("The number of devices listed after addition in HiMobile are " + nListChild1.getLength());
		
		Assert.assertEquals(nListChild1.getLength(), nListChild.getLength() + 1);
		
		for (int temp3 = 0; temp3 < nListChild1.getLength(); temp3++) {
			 
			Node nNodenewcontent = nListChild1.item(temp3);
			Element eElementnew = (Element) nNodenewcontent;

			Thread.sleep(10000);
			newdevicelist1[temp3] = eElementnew.getAttribute("content-desc");
			System.out.println("value os temp is " +temp3);
			System.out.println("device is " +eElementnew.getAttribute("content-desc"));
			if((newdevicelist1[temp3]).contains("PING DEVICE COPY")){
				
				System.out.println("The device has been added successfully");
				l++;
				break;
			}
		}

		Assert.assertEquals(l,1);
	
		return this;

	}
	
	public NetworkScreen validateeditcopydevice() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Swipe down to the new device added");
		driver.swipe(600, 14000, 600, 750, 20);
	
		driver.tap(1, 550, 1500, 5);
		Thread.sleep(10000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("The header is " + devicedetailheader.getText());
		Assert.assertEquals(devicedetailheader.getText(),"PING DEVICE COPY - DETAIL");
		
		System.out.println("USER INTERVENTION: Change the name of the device to PING DEVICE");
		Thread.sleep(30000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
		
		System.out.println("Tap on the refresh option");
		refresh.click();
		Thread.sleep(10000);
	
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("The header is " + devicedetailheader.getText());
		Assert.assertEquals(devicedetailheader.getText(),"PING DEVICE - DETAIL");
		
		System.out.println("The Label is " + devicelabel.getText());
		Assert.assertEquals(devicelabel.getText(),"PING DEVICE");
		
		driver.navigate().back();
		Thread.sleep(10000);
		
		return this;
		
	}
	
	public NetworkScreen validatecreatenewconnection() throws InterruptedException	{
		
		
		DocumentBuilderFactory dbFactory1 = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder1 = null;
    	File fXmlFile1 = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\NewDevices1List.xml");
    	Document doc1 = null;
		try {
			dBuilder1 = dbFactory1.newDocumentBuilder();
			doc1 = dBuilder1.parse(fXmlFile1);
		} catch (ParserConfigurationException e1) {
			System.out.println("dbFactory Thrown ParserConfigurationException");
			e1.printStackTrace();
		} catch (SAXException e1) {
			e1.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		doc1.getDocumentElement().normalize();
		NodeList nList1 = doc1.getElementsByTagName("android.widget.ListView");
		Node nNode1 = nList1.item(0);
		Element e1 = (Element) nNode1;
		NodeList nListChild1 = e1.getChildNodes();
		
		System.out.println("The number of devices listed after addition in HiMobile are " + nListChild1.getLength());
		

		
		System.out.println("USER INTERVENTION REQUIRED: From HiVision Create a link between PING DEVICE and PING DEVICE COPY");
		Thread.sleep(10000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		contextmenu.click();
		Thread.sleep(5000);
		
		refresh.click();
		Thread.sleep(30000);
		
		System.out.println("USER INTERVENTION REQUIRED: Save the page source as NewDevices2List.xml");
		System.out.println("Source Native: " +driver.getPageSource());
		Thread.sleep(30000);
		
		DocumentBuilderFactory dbFactory2 = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder2 = null;
    	File fXmlFile2 = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\NewDevices2List.xml");
    	Document doc2 = null;
		try {
			dBuilder2 = dbFactory2.newDocumentBuilder();
			doc2 = dBuilder2.parse(fXmlFile2);
		} catch (ParserConfigurationException e2) {
			System.out.println("dbFactory Thrown ParserConfigurationException");
			e2.printStackTrace();
		} catch (SAXException e2) {
			e2.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		doc2.getDocumentElement().normalize();
		NodeList nList2 = doc2.getElementsByTagName("android.widget.ListView");
		Node nNode2 = nList2.item(0);
		Element e2 = (Element) nNode2;
		NodeList nListChild2 = e2.getChildNodes();
		String[] newdevicelist2 = new String[100];
		int m = 0;
		
		System.out.println("The number of devices listed after addition in HiMobile are " + nListChild2.getLength());
		
		Assert.assertEquals(nListChild2.getLength(), nListChild1.getLength() + 1);
		
		for (int temp4 = 0; temp4 < nListChild2.getLength(); temp4++) {
			 
			Node nNodenewcontent1 = nListChild2.item(temp4);
			Element eElementnew1 = (Element) nNodenewcontent1;

			Thread.sleep(10000);
			newdevicelist2[temp4] = eElementnew1.getAttribute("content-desc");
			//System.out.println("value os temp is " +temp4);
			//System.out.println("device is " +eElementnew1.getAttribute("content-desc"));
			if((newdevicelist2[temp4]).contains("PING DEVICE-PING DEVICE COPY")){
				
				System.out.println("The device has been added successfully");
				m++;
				break;
			}
		}

		Assert.assertEquals(m,1);
	
		
		
		return this;
	}
	
	
	public NetworkScreen validatenewconnection() throws InterruptedException	{
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("Move to the new device added");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newconnection);
		Thread.sleep(5000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		Device12.click();
		Thread.sleep(10000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		Assert.assertEquals(NewConnectionInfoHeader.getText(),"PING DEVICE-PING DEVICE COPY - Detail");
		Assert.assertEquals(NewConnectionLabelText.getText(),"Label");
		Assert.assertEquals(NewConnectionLabelValue.getText(),"PING DEVICE-PING DEVICE COPY");
		Assert.assertEquals(NewConnectionDeviceAText.getText(),"Device A");
		Assert.assertEquals(NewConnectionDeviceAValue.getText(),"127.0.0.2");
		Assert.assertEquals(NewConnectionDeviceBText.getText(),"Device B");
		Assert.assertEquals(NewConnectionDeviceBValue.getText(),"127.0.0.2");
	  
		return this;
		
	}
	
	
	public NetworkScreen validateeditnewconnection() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("USER INTERVENTION: Change the name of the device to NEWLINK");
		Thread.sleep(30000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the context menu");
		contextmenu.click();
		
		System.out.println("Tap on the refresh option");
		refresh.click();
		Thread.sleep(10000);
	
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("The header is " + devicedetailheader.getText());
		Assert.assertEquals(devicedetailheader.getText(),"NEWLINK - DETAIL");
		
		System.out.println("The Label is " + devicelabel.getText());
		Assert.assertEquals(devicelabel.getText(),"NEWLINK");
		
		
		return this;
		
	}
	
	public NetworkScreen validatenewconnectionstatus() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Swipe to the left to the connection status screen");
        driver.swipe(350, 750, 750, 750, 8000);
        
        driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		Assert.assertEquals(NewConnectionStatusHeader.getText(),"NEWLINK - Status");
		
        Thread.sleep(5000);
        
        System.out.println("Swipe to the right to the connection detail screen");
        driver.swipe(750, 750, 350, 750, 8000);
		
        driver.navigate().back();
        Thread.sleep(10000);
      
		
		return this;
	}
	
	
	
	public NetworkScreen validatenewconnectionstatusfromicon() throws InterruptedException	{
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("Move to the new device added");
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newconnection);
		Thread.sleep(5000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		driver.tap(1,100,1500,20);
		Thread.sleep(10000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		Assert.assertEquals(NewConnectionStatusHeader.getText(),"PING DEVICE-PING DEVICE COPY - Status");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Swipe to the right to the connection detail screen");
        driver.swipe(750, 350, 750, 750, 8000);
        
        Thread.sleep(5000);
        
        System.out.println("Swipe to the right to the port info screen");
        driver.swipe(750, 750, 350, 750, 8000);
		
		return this;
		
	}
	
	public NetworkScreen validatebackkeynewconnectionstatus() throws InterruptedException	{
		
		driver.context("NATIVE_APP");
        Thread.sleep(10000);
        
        System.out.println("Tap on the back key");
		driver.navigate().back();
		
		System.out.println("Validate that the app navigates to the New Devices screen");
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("The screen header is " +HeaderLabel.getText());
		Assert.assertEquals(HeaderLabel.getText(), "New Devices");
		
		return this;

	}

	public NetworkScreen validateeditlocationpopup() throws InterruptedException	{
		
		System.out.println("Swipe to the top of the devicelist screen");
        driver.swipe(750, 350, 750, 750, 8000);
        
		//System.out.println("USERINTERVENTION REQUIRED: From HiVision update the location co-ordinates of the ping device 127.0.0.2 to 50,100");
		//Thread.sleep(40000);
		
		Device1.click();
		
		//driver.context("WEBVIEW");
		//Thread.sleep(10000);
		
		//Assert.assertEquals(LocationCoordinates.getText(),"50,100");
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the Get location icon");
		driver.tap(1,975,1180,20);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		Assert.assertEquals(EditLocationHeader.getText(),"Edit Location");
		Assert.assertEquals(LatitudeLabel.getText(),"Latitude");
		Assert.assertEquals(LongitudeLabel.getText(),"Longitude");
		Assert.assertEquals(ApplyLabel.getText(),"Apply");
		Assert.assertEquals(CancelLabel.getText(),"Cancel");
		
		//LatitudeValue.sendKeys("10");
		//LongitudeValue.sendKeys("15");
		
		//driver.hideKeyboard();
		//Thread.sleep(3000);
		
//		driver.context("NATIVE_APP");
//		Thread.sleep(10000);
//		
//		System.out.println("NATIVE SOURCE: " +driver.getPageSource());
//		
//		driver.tap(1,350,1350,20);
//		Thread.sleep(30000);
//		
//		driver.context("WEBVIEW");
//		Thread.sleep(10000);
//		
//		
//		Assert.assertEquals(LocationCoordinates.getText(),"10,15");
//		Assert.assertEquals(LocationUpdatedPopup.getText(),"Location updated");
//	
		return this;
	}
	
	public NetworkScreen validatebackkeyeditlocation() throws InterruptedException	{
		
		
		
		
		return this;
	}
	
	
	public NetworkScreen validatelocationwhenservicesoff() throws InterruptedException	{
		
		
		
		
		return this;
	}
	
	public NetworkScreen validatelocationwhenserviceson() throws InterruptedException	{
		
		
		
		
		return this;
	}
	
	public NetworkScreen validatefetchlocationdata() throws InterruptedException	{
		
		
		
		
		return this;
	}
	
	public NetworkScreen validateeditlocationhivision() throws InterruptedException	{
		
		
		
		
		return this;
	}

	public NetworkScreen validateenterlocation() throws InterruptedException	{
	
	
	
	
	return this;
	}
	
	
	public NetworkScreen validatecreatesubdomain() throws InterruptedException	{
		
		System.out.println("Move back to the Project Screen");
		driver.navigate().back();
		
		System.out.println("From HiVision create a subdomain with name as'HiMobile' and ip-address as 1.1.1.1");
		Thread.sleep(30000);
		
		contextmenu.click();
		Thread.sleep(5000);
		
		refresh.click();
		Thread.sleep(30000);
		
		System.out.println("USER INTERVENTION REQUIRED: Save the page source as CreateSubdomain.xml");
		System.out.println("Source Native: " +driver.getPageSource());
		Thread.sleep(30000);
		
		DocumentBuilderFactory dbFactory2 = DocumentBuilderFactory.newInstance();
    	DocumentBuilder dBuilder2 = null;
    	File fXmlFile2 = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\CreateSubDomain.xml");
    	Document doc2 = null;
		try {
			dBuilder2 = dbFactory2.newDocumentBuilder();
			doc2 = dBuilder2.parse(fXmlFile2);
		} catch (ParserConfigurationException e2) {
			System.out.println("dbFactory Thrown ParserConfigurationException");
			e2.printStackTrace();
		} catch (SAXException e2) {
			e2.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		doc2.getDocumentElement().normalize();
		NodeList nList2 = doc2.getElementsByTagName("android.widget.ListView");
		Node nNode2 = nList2.item(0);
		Element e2 = (Element) nNode2;
		NodeList nListChild2 = e2.getChildNodes();
		String[] newdevicelist2 = new String[100];
		int m = 0;

		
		for (int temp4 = 0; temp4 < nListChild2.getLength(); temp4++) {
			 
			Node nNodenewcontent1 = nListChild2.item(temp4);
			Element eElementnew1 = (Element) nNodenewcontent1;

			Thread.sleep(10000);
			newdevicelist2[temp4] = eElementnew1.getAttribute("content-desc");
			//System.out.println("value os temp is " +temp4);
			//System.out.println("device is " +eElementnew1.getAttribute("content-desc"));
			if((newdevicelist2[temp4]).contains("HiMobile")){
				
				System.out.println("The subdomain has been added successfully");
				m++;
				break;
			}
		}

		Assert.assertEquals(m,1);
		
		return this;
	}
	
	public NetworkScreen validatesubdomain() throws InterruptedException	{
	
		System.out.println("Tap on the sub-domain option");
		SubDomain.click();
		Thread.sleep(10000);
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		Assert.assertEquals(SubDomainHeader.getText(),"HiMobile - Status");
		Assert.assertEquals(SubDomainGlobalStatus.getText(),"UNAVAILABLE");
		Assert.assertEquals(SubDomainStatus.getText(),"UNAVAILABLE");
		Assert.assertEquals(SubDomainMessage.getText(),"UNAVAILABLE");
	
		return this;
	
	}
	
	
	
	
	
		
	
	

}
