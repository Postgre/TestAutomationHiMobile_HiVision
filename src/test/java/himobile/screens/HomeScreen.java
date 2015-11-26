package himobile.screens;

import himobile.base.ScreenBase;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.io.File;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;



public class HomeScreen extends ScreenBase{

	public HomeScreen(AndroidDriver driver)	{
		super(driver);
	}

	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[1]/strong/p")
	public WebElement screenTitle;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div/div[1]")
	public WebElement HomeScreenTitle;
	
	@FindBy(id="gwt-debug-homescreenList")
	public List<WebElement> homeScreenList;
	
	@FindBy(className="GL3K22LDJS")
	public List<WebElement> listview;
	
	@FindBy(className="GL3K22LDIS")
	public List<WebElement> components;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[1]/div[1]/img")
	public WebElement networkImg;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[1]")
	public WebElement networkLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[1]/div[2]")
	public WebElement networktext;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[2]")
	public WebElement eventLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[2]/div[2]")
	public WebElement eventtext;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[3]")
	public WebElement deviceLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[3]/div[2]")
	public WebElement devicetext;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-deviceHeaderLbl\"]")
	public WebElement networkscreenTitle;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-evtheaderLabel\"]")
	public WebElement evntlistscreenTitle;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-evtcellList\"]/ul/li")
	public List<WebElement> eventlist;
	
	@AndroidFindBys({
		@AndroidFindBy(className="android.webkit.WebView"),
		@AndroidFindBy(className="android.view.View")
	})
	public List<WebElement> bottombarElemnts;
	
	@AndroidFindBys({
		@AndroidFindBy(className="android.widget.ListView"),
		@AndroidFindBy(className="android.view.View")})
		public List<WebElement> buttons;
	
	@AndroidFindBys({
		@AndroidFindBy(className="android.widget.ListView"),
		@AndroidFindBy(className="android.view.View")})
		public List<WebElement> events;
	
	
	//change context from webview to native
	public HomeScreen changeContextNativeApp() throws InterruptedException{
		System.out.println("Change the Context to Native");
		Set<String> contextNames = driver.getContextHandles();
		System.out.println("contextNames>>"+contextNames+"<<");
		for (String contextName : contextNames) {
		  System.out.println("App type: "+contextName);
		  if (contextName.contains("NATIVE")){
		    driver.context(contextName);
		  }
		}
		Thread.sleep(20000);
		return this;
	}
	
	//scroll down
	public HomeScreen scrolldown(){
		driver.swipe(1050, 1700, 1050, 1100, 5000);
		
		return this;
	}
	
	//scroll up
	public HomeScreen scrollup(){
		driver.swipe(1050, 1100, 1050, 2000, 5000);
		return this;
	}
	//minimize keyboard
	public HomeScreen minimizeKeyboard(){
		driver.hideKeyboard();
		return this;
	}
	
	public HomeScreen verifyScreenTitle(){
		System.out.println("Screen Title-Home Screen");
		System.out.println("HomeScreen Title: "+screenTitle.getText());
		Assert.assertEquals(screenTitle.getText(),"HiMobile");
		return this;
	}
	
	public HomeScreen verifyNetworkBtn(){
		System.out.println("Network button: "+listview.get(0).getText());
		Assert.assertEquals(listview.get(0).getText(),"Network");
		return this;
	}
	
	public HomeScreen tapNetworkButton(){
		listview.get(0).click();
		return this;
	}
	
	public HomeScreen verifyNetworkLbl(){
	System.out.println("Network1: "+networkLabel.getText());
	Assert.assertEquals(networkLabel.getText(),"Network");
	return this;
	}
	
	public HomeScreen tapNetworkLabel(){
		networkLabel.click();
		return this;
	}
	
	public HomeScreen verifyNetworkTxt(){
	System.out.println("Network2: "+networktext.getText());
	Assert.assertEquals(networktext.getText(),"Network");
	return this;
	}
	
	public HomeScreen tapNetworkText(){
		networktext.click();
		return this;
	}
	
	public HomeScreen verifyEventListBtn(){
		System.out.println("EventList: "+listview.get(1).getText());
		Assert.assertEquals(listview.get(1).getText(),"Event List");
		return this;
	}
	
	public HomeScreen verifyEventListLbl(){
		System.out.println("EventList1: "+eventLabel.getText());
		Assert.assertEquals(eventLabel.getText(),"Event List");
		return this;
	}
	
	public HomeScreen verifyEventListTxt(){
		System.out.println("EventList2: "+eventtext.getText());
		Assert.assertEquals(eventtext.getText(),"Event List");
		return this;
	}
	
	public HomeScreen verifyDeviceBtn(){
		System.out.println("Devices: "+listview.get(2).getText());
		Assert.assertEquals(listview.get(2).getText(),"Device");
		return this;
	}

	public HomeScreen verifyDeviceLbl(){
		System.out.println("Devices1: "+deviceLabel.getText());
		Assert.assertEquals(deviceLabel.getText(),"Device");
		return this;
	}
	
	public HomeScreen verifyDeviceTxt(){
		System.out.println("Devices2: "+devicetext.getText());
		Assert.assertEquals(devicetext.getText(),"Device");
		return this;
	}
	
	public HomeScreen countEvents(){
		System.out.println(eventlist.size());
		return this;
	}
	
	public HomeScreen nameAllEvents(){
		for(int i=0; i <= eventlist.size(); i++){
			System.out.println(eventlist.get(i).getText());
		}
		return this;
	}
	
	public HomeScreen nameFiveEvents(){
		System.out.println(eventlist.get(0).getText());
		System.out.println(eventlist.get(1).getText());
		System.out.println(eventlist.get(2).getText());
		System.out.println(eventlist.get(3).getText());
		System.out.println(eventlist.get(4).getText());
		return this;
	}


	
	//change context from native to webview
			public HomeScreen changeContextWebview() throws InterruptedException{
				System.out.println("Change the Context to WebView");
				Set<String> contextNames = driver.getContextHandles();
				System.out.println(driver.getContextHandles());
				System.out.println("contextNames>>"+contextNames+"<<");
				for (String contextName : contextNames) {
				  System.out.println("App type: "+contextName);
				  if (contextName.contains("WEBVIEW")){
				    driver.context(contextName);
				  }
				}
				Thread.sleep(20000);
				return this;
			}

			public HomeScreen tapNetworkOption(){
				buttons.get(0).click();
				return this;
			}
			
			public HomeScreen backToHome(){
				TouchAction action = new TouchAction((MobileDriver)driver);
				action.tap(50, 1695).perform();
				return this;
			}
			
			public HomeScreen tapEventListOption(){
				buttons.get(4).click();
				return this;
			}
			
			public HomeScreen tapDeviceOption(){
				buttons.get(8).click();
				return this;
			}
			
			public HomeScreen tapOnQuestionMark(){
				bottombarElemnts.get(5).click();
				return this;
			}
			
			public HomeScreen clickOnQuestionMark(){
				TouchAction action = new TouchAction(driver);
				action.tap(545, 1700).perform();
				return this;
			}
			
			public HomeScreen tapOnSettingsIcn(){
				bottombarElemnts.get(6).click();
				return this;
			}
			
			public HomeScreen clickOnSettingsIcn(){
				TouchAction action = new TouchAction(driver);
				action.tap(1000, 1700).perform();
				
				return this;
			}
	
			public HomeScreen verifyNetworkScreenTitle(){
				System.out.println(networkscreenTitle.getText());
				Assert.assertEquals(networkscreenTitle.getText(),"Hirschmann");
				return this;
			}
			
			public HomeScreen verifyEventListScreenTitle(){
				System.out.println(evntlistscreenTitle.getText());
				Assert.assertEquals(evntlistscreenTitle.getText(),"Events");
				return this;
			}
			
			public HomeScreen captureScreenshots() throws Exception{
				Calendar cal = new GregorianCalendar();
				  int month = cal.get(Calendar.MONTH); //3
				  int year = cal.get(Calendar.YEAR); //2014
				  int sec =cal.get(Calendar.SECOND);
				  int min =cal.get(Calendar.MINUTE);
				  int date = cal.get(Calendar.DATE);
				  int day =cal.get(Calendar.HOUR_OF_DAY);
				
				String timestamp = year+"_"+date+"_"+(month+1)+"_"+day+"_"+min+"_" +sec;
			
				
				String screenshotpath = System.getProperty("user.dir")+"\\screenshots\\Image"+timestamp+".jpeg";
						
				WebDriver augmentedDriver = new Augmenter().augment(driver);
				File scrFile = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE); 
				FileUtils.copyFile(scrFile, new File(screenshotpath));
				return this;
			}
	}

	  


