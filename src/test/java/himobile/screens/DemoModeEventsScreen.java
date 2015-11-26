package himobile.screens;

import himobile.base.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.io.File;
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

public class DemoModeEventsScreen extends ScreenBase {
	
	@FindBy(id="gwt-uid-23")
	public WebElement refresh;
	
	@FindBy(id="gwt-uid-24")
	public WebElement filterBy;
	
	@FindBy(className="GL3K22LDJO ")
	public List<WebElement> eventBlocks;
	
	@FindBy(className="GL3K22LDMR")
	public List<WebElement> eventContainer;
	
	@FindBy(className="GL3K22LDPR")
	public List<WebElement> eventdescriptionUpperLine;
	
	@FindBy(className="GL3K22LDAS")
	public List<WebElement> eventdescriptionLowerLine;
	
	@FindBy(className="GL3K22LDOR")
	public List<WebElement> dateTime;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-evtcellList\"]/ul/li[2]/div/div[1]/div")
	public List<WebElement> eventsubject;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-evtcellList\"]/ul/li[1]/div/div[2]/div[3]")
	public List<WebElement> hostip;
	
@AndroidFindBy(xpath="//android.view.View[@instance='19']")
	public WebElement settings ;
	
@AndroidFindBy(xpath="//android.view.View[@instance='12']")
	public WebElement EventList ;
	
public DemoModeEventsScreen(AndroidDriver driver) {
		super(driver);
	}
	
	public DemoModeEventsScreen someMoreElements() throws Exception{
		System.out.println("EventBlocks: "+eventBlocks.get(0).getText());
		/*
		EventBlocks: A temporary license will expire soon. Remaining days: 6
		2014-02-18 20:40
		Industrial HiVision Service
		 */
		Thread.sleep(3000);
		System.out.println(eventBlocks.size());//200
		Thread.sleep(2000);
		System.out.println("eventContainer: "+eventContainer.get(0).getText());
		Thread.sleep(3000);
		/*
		 * eventContainer: A temporary license will expire soon. Remaining days: 6
			2014-02-18 20:40
			Industrial HiVision Service
		 * 
		 */
		System.out.println("eventContainer: "+eventContainer.size());//200
		Thread.sleep(2000);
		System.out.println("eventdescriptionUpperLine: "+eventdescriptionUpperLine.get(0).getText());
		//eventdescriptionUpperLine: A temporary license will expire soon. Remaining days: 6
		Thread.sleep(2000);
		System.out.println("eventdescriptionUpperLine: "+eventdescriptionUpperLine.size());//200
		Thread.sleep(2000);
		System.out.println("eventdescriptionLowerLine: "+eventdescriptionLowerLine.get(0).getText());
		/*
		eventdescriptionLowerLine: 2014-02-18 20:40
		Industrial HiVision Service
		*/
		Thread.sleep(2000);
		System.out.println("eventdescriptionLowerLine: "+eventdescriptionLowerLine.size());//200
		Thread.sleep(2000);
		System.out.println("dateTime: "+dateTime.get(0).getText());//dateTime: 2014-02-18 20:40
		Thread.sleep(2000);
		System.out.println("dateTime: "+dateTime.size());//200
		Thread.sleep(2000);
		System.out.println("eventsubject: "+eventsubject.get(0).getText());//eventsubject: Link is Down
		Thread.sleep(2000);
		System.out.println("eventsubject: "+eventsubject.size());//1
		Thread.sleep(2000);
		System.out.println("HostIp: "+hostip.get(0).getText());//HostIp: Industrial HiVision Service
		Thread.sleep(2000);
		System.out.println("HostIp: "+hostip.size());//1
		System.out.println("Done");
		return this;
	}

	public DemoModeEventsScreen selectdemomode() throws InterruptedException	{
		
		System.out.println("Tap on the settings icon on the Home Screen");
		settings.click();
		Thread.sleep(10000);
		
		SettingsScreen hostdata = new SettingsScreen(driver);
		hostdata.checkedDemoModeCheckcbox();
		Thread.sleep(3000);
		hostdata.clickconntestbutton();
		Thread.sleep(10000);
		
		hostdata.mypopupSuccess();
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the Event list");
		EventList.click();
		
		Thread.sleep(10000);
			
		return this;
		
	}
	

	
	public DemoModeEventsScreen verifydemomode() throws InterruptedException	{
		
		 driver.context("WEBVIEW");
		 Thread.sleep(10000);
	  
	     List<WebElement> NoOfElements = driver.findElements(By.xpath("//*[@id='gwt-debug-evtcellList']/ul/*"));
	        //List<WebElement> NoOfElements = driver.findElements(By.xpath("//android.widget.ListView[@index='10']/*"));
	     int size = 0;
	     size = NoOfElements.size();
	     
	     System.out.println("Verfy that number of events in demo mode should be 200");
	     System.out.println("The number of events in demo mode are " +size);
	     
	     Assert.assertEquals(size, 200);
	     Thread.sleep(5000);
	    
	     System.out.println("Native-ContextView is: "+driver.context("NATIVE_APP"));
	     System.out.println("Source NATIVE "+driver.getPageSource());
	     Thread.sleep(10000);
	        
	     System.out.println("USER INTERVENTION REQUIRED: Save the page source obtained above in an xml file named as demoeventlist.xml");
	     Thread.sleep(60000);
	        
	        /*
	        System.out.println("Source NATIVE "+driver.getPageSource());
	        Thread.sleep(5000);
	        
	    	driver.swipe(100, 640, 100, 440, 3000);
	    	Thread.sleep(10000);
	    	System.out.println("Source NATIVE "+driver.getPageSource());
	    	
	    	 Thread.sleep(10000);
	        
	       */
	        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	    	DocumentBuilder dBuilder = null;
	    	File fXmlFile = new File("C:\\Users\\varun.walia.IBTS\\Desktop\\demoevents.xml");
	    	Document doc = null;
			try {
				dBuilder = dbFactory.newDocumentBuilder();
				String s = driver.getPageSource().trim();
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
			String[] str = new String[100];;
			
			System.out.println("Navigation in Demo Events starts");
			for (int temp = 0; temp < nListChild.getLength(); temp++) {
				 
				Node nNode1 = nListChild.item(temp);
				Element eElement = (Element) nNode1;
				
				//System.out.println("Source NATIVE "+driver.getPageSource());
				Thread.sleep(10000);
				str[temp] = eElement.getAttribute("content-desc");
				System.out.println(nNode1.getNodeName() + ": " + eElement.getAttribute("content-desc"));
				
				//String text = eElement.getAttribute("content-desc");
				//driver.scrollTo(text);
				
				WebElement Element1 = driver.findElement(By.xpath("//android.view.View[@index='" + String.valueOf(temp) +"' and @content-desc = '" + eElement.getAttribute("content-desc") + "']"));
				
				Thread.sleep(10000);
				Element1.click();
				
	        	Thread.sleep(10000);
	        	//System.out.println("Source NATIVE "+driver.getPageSource());
	        	//Thread.sleep(10000);
	        	WebElement ContextMenu = driver.findElement(By.xpath("//android.view.View[@instance='9']"));
	        	ContextMenu.click();
	        	Thread.sleep(10000);
	        	//System.out.println("Source NATIVE "+driver.getPageSource());
	        	//Thread.sleep(10000);
	        	WebElement Refresh = driver.findElement(By.xpath("//android.view.View[@content-desc='Refresh']"));
	        	Refresh.click();
	        	Thread.sleep(5000);
	        	
	        	//WebElement BackKey = driver.findElement(By.xpath("//android.view.View[@instance='36']"));
	        	driver.navigate().back();
	        	//BackKey.click();
	        
	        	Thread.sleep(10000);
	        	driver.swipe(100, 640, 100, 440, 3000);
	        	Thread.sleep(10000);
	        	//System.out.println("Source NATIVE "+driver.getPageSource());
	        		
			}
			System.out.println("Navigation in Demo Events starts");
	        
		return this;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
