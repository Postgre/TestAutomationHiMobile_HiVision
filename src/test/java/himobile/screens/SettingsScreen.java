package himobile.screens;

import himobile.base.ScreenBase;
import himobile.utils.Configuration;
import himobile.utils.ExcelReader;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.TouchScreen;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class SettingsScreen extends ScreenBase{

	public SettingsScreen(AndroidDriver driver)	{
		super(driver);
	}
	
	//WebView Elements
	@FindBy(xpath=Configuration.notification)
	public WebElement notification;
	
	@FindBy(xpath=Configuration.screenTitle)
	public WebElement screenTitle;
	
	@FindBy(xpath=Configuration.editBoxHost)
	public WebElement editBoxHost;
	
	@FindBy(xpath=Configuration.editBoxPort)
	public WebElement editBoxPort;
	
	@FindBy(xpath=Configuration.editBoxUsername)
	public WebElement editBoxUsername;
	
	@FindBy(xpath=Configuration.editBoxPassword)
	public WebElement editBoxPassword;
	
	@FindBy(className=Configuration.EditBoxLabel)
	public List<WebElement> EditBoxLabel;
	
	@FindBy(xpath=Configuration.UseSecureConn)
	public WebElement UseSecureConn;
	
	@FindBy(xpath=Configuration.AutoRefresh)
	public WebElement AutoRefresh;
	
	@FindBy(xpath=Configuration.DemoMode)
	public WebElement DemoMode;
	
	@FindBy(xpath=Configuration.ConnTest)
	public WebElement ConnTest;
	
	// native
	
	@AndroidFindBy(xpath=Configuration.secureconncheckbox)
	public WebElement secureconncheckbox;
	
	@AndroidFindBy(xpath=Configuration.httpscheckBox)
	public WebElement httpscheckBox;
	
	@AndroidFindBy(xpath=Configuration.secureConnCheckBox)
	public WebElement secureConnCheckBox;
	
	@AndroidFindBy(xpath=Configuration.autorefreshcheckbox)
	public WebElement autorefreshcheckbox;
	
	@AndroidFindBy(xpath=Configuration.demomodecheckbox)
	public WebElement demomodecheckbox;
	
	@AndroidFindBy(xpath=Configuration.autoRefreshCheckBox)
	public WebElement autoRefreshCheckBox;
	
	@AndroidFindBy(xpath=Configuration.CheckBoxDemoMode)
	public WebElement CheckBoxDemoMode;

	@AndroidFindBys({
		@AndroidFindBy(className="android.widget.FrameLayout"),
		@AndroidFindBy(className="android.widget.LinearLayout"),
		@AndroidFindBy(id="android:id/content"),
		@AndroidFindBy(className="android.widget.LinearLayout"),
		@AndroidFindBy(className="android.webkit.WebView"),
		@AndroidFindBy(className="android.webkit.WebView"),
		@AndroidFindBy(className="android.widget.ListView"),
		@AndroidFindBy(className="android.view.View")
		})
		public List<WebElement> checkbox;
	
	@AndroidFindBys({
		@AndroidFindBy(className="android.widget.ListView"),
		@AndroidFindBy(className="android.view.View")})
		public List<WebElement> connectiontestbutton;
	
	@AndroidFindBy(xpath=Configuration.conntestbutton)
	public WebElement conntestbutton;
	
	@AndroidFindBy(xpath=Configuration.connectionTestButton)
	public WebElement connectionTestButton;
	
	@AndroidFindBy(xpath=Configuration.backbutton)
	public WebElement backbutton;
		
	@AndroidFindBy(xpath=Configuration.okpopupmsg)
	public WebElement okpopupmsg;
	
	//for Nexus-10 secure connection checkbox
	@AndroidFindBy(xpath=Configuration.securecb)
	public WebElement securecb;
	
	//for Nexus-10 secure connection checkbox
	@AndroidFindBy(xpath=Configuration.autorefreshcb)
	public WebElement autorefreshcb;
	
	//for Nexus-10 secure connection checkbox
	@AndroidFindBy(xpath=Configuration.demomodecb)
	public WebElement demomodecb;
	
	
	
	
	//ThirdParty
	@FindBy(className=Configuration.backBTNImg)
	public WebElement backBTNImg;
	
	@FindBy(className=Configuration.msg)
	public WebElement msg;
	
	@FindBy(className=Configuration.Text)
	public WebElement Text;
	
	@FindBy(className=Configuration.httpsalert)
	public WebElement httpsalert;
	
	@FindBy(className=Configuration.httpspopup)
	public WebElement httpspopup;
	
	@FindBy(xpath=Configuration.popupHead)
	public WebElement popupHead;
	
	@FindBy(xpath=Configuration.popupText)
	public WebElement popupText;
	
	@FindBy(xpath=Configuration.popupOk)
	public WebElement popupOk;
	
	@AndroidFindBy(xpath=Configuration.apps)
	public WebElement apps;
	
	@AndroidFindBy(xpath=Configuration.settings)
	public WebElement settings ;
	
	@AndroidFindBy(xpath=Configuration.himobile)
	public WebElement himobile;
	
	
	//To change the context of App to Native App View
	public SettingsScreen changeContextNativeApp() throws InterruptedException{
		System.out.println("To change context from Webview to Native App View");
		Set<String> contextNames = driver.getContextHandles();
				for (String contextName : contextNames) {
				  if (contextName.contains("NATIVE")){
		    driver.context(contextName);
		  }
		}
		Thread.sleep(10000);
		System.out.println("Current Context is successfully moved to Native App View");
		Thread.sleep(10000);
		return this;
	}
	//To change the context of App to Web View
	public SettingsScreen changeContextWebview() throws InterruptedException{
		System.out.println("To change the context from Native App View to Webview");
		Set<String> contextNames = driver.getContextHandles();
					for (String contextName : contextNames) {
					  if (contextName.contains("WEBVIEW")){
		    driver.context(contextName);
		  }
		}
		Thread.sleep(10000);
		System.out.println("Current Context is successfully moved to Web View");
		Thread.sleep(10000);
		return this;
	}
	
	//scrolling (top-to botton & bottom to top) functionality
	public SettingsScreen scrolldown(){
		driver.swipe(1050, 1600, 1050, 1300, 10000);
		return this;
	}
	
	public SettingsScreen scrollup(){
		driver.swipe(1050, 1300, 1050, 1600, 10000);
		return this;
	}
	
	//minimize keyboard functionality
	public SettingsScreen minimizeKeyboard(){
		
		driver.hideKeyboard();
		return this;
	}
	
	public SettingsScreen verifyNotification(String data){
		System.out.println(notification.getText());
		 //Assert.assertEquals(notification.getText(),"This is the first time you run this app. Provide the connection settings please.");
		 Assert.assertEquals(notification.getText(),data);
		 return this;
	}
	
	public SettingsScreen enterValidValues(){
			String sheetName = "TestSheet";
			ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
			/*
			String hostvals = dataxls.getCellData(sheetName, "Values", 15);
			String portvals = dataxls.getCellData(sheetName, "Values", 16);
		 	String usrvals = dataxls.getCellData(sheetName, "Values", 17);
			String pwdvals = dataxls.getCellData(sheetName, "Values", 18);
			*/
			String hostvals = dataxls.getCellData(sheetName, "host", 2);
			String portvals = dataxls.getCellData(sheetName, "port", 2);
		 	String usrvals = dataxls.getCellData(sheetName, "username", 2);
			String pwdvals = dataxls.getCellData(sheetName, "password", 2);
			editBoxHost.clear();
			editBoxHost.sendKeys(hostvals);
			editBoxPort.clear();
			editBoxPort.sendKeys(portvals);
			editBoxUsername.clear();
			editBoxUsername.sendKeys(usrvals);
			editBoxPassword.clear();
			editBoxPassword.sendKeys(pwdvals);
			return this;
		}
		
		public SettingsScreen enterInValidHostValues(){
			String sheetName = "SettingsScreen";
			ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
			String hostvals = dataxls.getCellData(sheetName, "Values", 19);
			String portvals = dataxls.getCellData(sheetName, "Values", 16);
		 	String usrvals = dataxls.getCellData(sheetName, "Values", 17);
			String pwdvals = dataxls.getCellData(sheetName, "Values", 18);
			editBoxHost.clear();
			editBoxHost.sendKeys(hostvals);
			editBoxPort.clear();
			editBoxPort.sendKeys(portvals);
			editBoxUsername.clear();
			editBoxUsername.sendKeys(usrvals);
			editBoxPassword.clear();
			editBoxPassword.sendKeys(pwdvals);
			return this;
		}
		
		public SettingsScreen enterInValidPortValues(){
			String sheetName = "SettingsScreen";
			ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
			String hostvals = dataxls.getCellData(sheetName, "Values", 15);
			String portvals = dataxls.getCellData(sheetName, "Values", 20);
		 	String usrvals = dataxls.getCellData(sheetName, "Values", 17);
			String pwdvals = dataxls.getCellData(sheetName, "Values", 18);
			editBoxHost.clear();
			editBoxHost.sendKeys(hostvals);
			editBoxPort.clear();
			editBoxPort.sendKeys(portvals);
			editBoxUsername.clear();
			editBoxUsername.sendKeys(usrvals);
			editBoxPassword.clear();
			editBoxPassword.sendKeys(pwdvals);
			return this;
		}
		
		public SettingsScreen enterInValidUsrNameValues(){
			String sheetName = "SettingsScreen";
			ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
			String hostvals = dataxls.getCellData(sheetName, "Values", 15);
			String portvals = dataxls.getCellData(sheetName, "Values", 16);
		 	String usrvals = dataxls.getCellData(sheetName, "Values", 21);
			String pwdvals = dataxls.getCellData(sheetName, "Values", 18);
			editBoxHost.clear();
			editBoxHost.sendKeys(hostvals);
			editBoxPort.clear();
			editBoxPort.sendKeys(portvals);
			editBoxUsername.clear();
			editBoxUsername.sendKeys(usrvals);
			editBoxPassword.clear();
			editBoxPassword.sendKeys(pwdvals);
			return this;
		}
		
		public SettingsScreen enterInValidPwdValues(){
			String sheetName = "SettingsScreen";
			ExcelReader dataxls = new ExcelReader(System.getProperty("user.dir")+"\\Driver\\ExcelTestDataSheet.xlsx");
			String hostvals = dataxls.getCellData(sheetName, "Values", 15);
			String portvals = dataxls.getCellData(sheetName, "Values", 16);
		 	String usrvals = dataxls.getCellData(sheetName, "Values", 17);
			String pwdvals = dataxls.getCellData(sheetName, "Values", 22);
			editBoxHost.clear();
			editBoxHost.sendKeys(hostvals);
			editBoxPort.clear();
			editBoxPort.sendKeys(portvals);
			editBoxUsername.clear();
			editBoxUsername.sendKeys(usrvals);
			editBoxPassword.clear();
			editBoxPassword.sendKeys(pwdvals);
			return this;
		}

		public SettingsScreen disableWiFi() throws InterruptedException{
			
			NetworkConnectionSetting networkConnection = driver.getNetworkConnection();
			networkConnection.setWifi(false); 
			driver.setNetworkConnection(networkConnection);
			Thread.sleep(5000);
			System.out.println("Network/Wi-Fi disconnected, successfully");
			return this;
		}
		
		public SettingsScreen enableWiFi() throws InterruptedException{
			
			NetworkConnectionSetting networkConnection = driver.getNetworkConnection();
			networkConnection.setWifi(true); 
			driver.setNetworkConnection(networkConnection);
			Thread.sleep(5000);
			System.out.println("Network/Wi-Fi re-connected, successfully");
			return this;
		}
	//Native Ok Button
		public SettingsScreen clickokbtn1(){
				System.out.println("Tap on Ok button of pop-up message");
				TouchAction okbutton = new TouchAction((MobileDriver)driver);
				okbutton.tap(535, 1096).perform();
				return this;
			}

		public SettingsScreen verifyScreentitle1(){
		    System.out.println(screenTitle.getText());
		    Assert.assertEquals(screenTitle.getText(),"Settings");
		    return this;
		   }public SettingsScreen verifyScreentitle(String data) {
		    System.out.println(screenTitle.getText());
		    //Assert.assertEquals(screenTitle.getText(),"Settings");
		    Assert.assertEquals(screenTitle.getText(),data);
		    return this;
		    }
		public SettingsScreen allScreentitles(String data) {
		    System.out.println(screenTitle.getText());
		    //Assert.assertEquals(screenTitle.getText(),"Settings");
		    Assert.assertEquals(screenTitle.getText(),data);
		    return this;
		    }
		
	//verify labels - host	
		public SettingsScreen textHostbox(String data)	{
				   System.out.println(EditBoxLabel.get(0).getText());
				   Assert.assertEquals(EditBoxLabel.get(0).getText(), data);
				   return this;
				}
			public SettingsScreen textHostbox1()	{
				   System.out.println(EditBoxLabel.get(0).getText());
				   Assert.assertEquals(EditBoxLabel.get(0).getText(), "Ind. HiVision Host");
				   return this;
				}
		//verify labels - port
				public SettingsScreen textPortbox(String data)	{
							System.out.println(EditBoxLabel.get(1).getText());
							Assert.assertEquals(EditBoxLabel.get(1).getText(), data);
							return this;
						}
				public SettingsScreen textPortbox1()	{
					System.out.println(EditBoxLabel.get(1).getText());
					Assert.assertEquals(EditBoxLabel.get(1).getText(), "Web Server Port");
					return this;
				}
				//verify labels - username
				public SettingsScreen textUnamebox(String data)	{
							System.out.println(EditBoxLabel.get(2).getText());
							Assert.assertEquals(EditBoxLabel.get(2).getText(), data);
							return this;
						}
				public SettingsScreen textUnamebox1()	{
					System.out.println(EditBoxLabel.get(2).getText());
					Assert.assertEquals(EditBoxLabel.get(2).getText(), "Username");
					return this;
				}
				//verify labels - password
				public SettingsScreen textPasswordbox(String data)	{
							System.out.println(EditBoxLabel.get(3).getText());
							Assert.assertEquals(EditBoxLabel.get(3).getText(), data);
							return this;
						}
				
				public SettingsScreen textPasswordbox1()	{
					System.out.println(EditBoxLabel.get(3).getText());
					Assert.assertEquals(EditBoxLabel.get(3).getText(), "Password");
					return this;
				}
				
				//verify labels - connection test button	
				public SettingsScreen textConnectionTestButton(String data) {
						System.out.println(ConnTest.getText());
						Assert.assertEquals(ConnTest.getText(), data);
						return this;
						}
				
				//Enter values in inputbox - host	
				public SettingsScreen enterHost(String data) {
				     editBoxHost.getText();
				     editBoxHost.click();   
				     editBoxHost.clear();
				     editBoxHost.sendKeys(data);
				     return this;
				}
				    
				public SettingsScreen enterValidHostValue() throws UnknownHostException {
				     String myIp = InetAddress.getLocalHost().getHostAddress();
				     System.out.println(myIp);
				     System.out.println(editBoxHost.getText());
				     editBoxHost.clear();
				     editBoxHost.sendKeys(myIp);
				     return this;
				}
				    
				public SettingsScreen getValueEditBox(){
				     System.out.println(editBoxHost.getAttribute("value"));
				     return this;
				}
				
				//clear the values from input box - host
				public SettingsScreen blankHost() {
				     driver.scrollTo(editBoxHost.getText());
				     editBoxHost.click();
				     editBoxHost.clear();
				     return this; 
				}
				
				
				//Enter values in inputbox - port
				public SettingsScreen enterPort(String data)	{
					
							editBoxPort.clear();
							editBoxPort.sendKeys(data);
							
							return this;
						}
				public SettingsScreen getPortVals(){
					System.out.println(editBoxPort.getAttribute("value"));
					
					return this;
				}
				//clear the values from input box - port
				public SettingsScreen blankPort()	{
					System.out.println("Port Value EditBox-Is It Enabled: "+editBoxPort.isEnabled());
					System.out.println("Port Value EditBox-Is It Displayed: "+editBoxPort.isDisplayed());
					
					editBoxPort.click();
					editBoxPort.clear();
					return this;
				}
				//Enter values in inputbox - username
				public SettingsScreen enterUname(String data)	{
							editBoxUsername.clear();
							editBoxUsername.sendKeys(data);
							return this;
						}
				//clear the values from input box - username
				public SettingsScreen blankUser()	{
					System.out.println("UserName Value EditBox-Is It Enabled: "+editBoxUsername.isEnabled());
					System.out.println("UserName Value EditBox-Is It Displayed: "+editBoxUsername.isDisplayed());
					editBoxUsername.click();
					editBoxUsername.clear();
					return this;
				}
				//Enter values in inputbox - password
				public SettingsScreen enterPwd(String data) {
					System.out.println("UserName Value EditBox-Is It Enabled: "+editBoxPassword.isEnabled());
					System.out.println("UserName Value EditBox-Is It Displayed: "+editBoxPassword.isDisplayed());
					editBoxPassword.clear();
					editBoxPassword.sendKeys(data);
							return this;
						}
				//clear the values from input box - password
				public SettingsScreen blankPwd()	{
					System.out.println("UserName Value EditBox-Is It Enabled: "+editBoxPassword.isEnabled());
					System.out.println("UserName Value EditBox-Is It Displayed: "+editBoxPassword.isDisplayed());
					editBoxPassword.click();
					editBoxPassword.clear();
					return this;
				}
				
				//verify labels - secure connection checkbox	
				public SettingsScreen verifySecureConnectionCheckbox(String data) {
							System.out.println(UseSecureConn.getText());
							Assert.assertEquals(UseSecureConn.getText(), data);
							return this;
						}
				//verify labels - autorefresh checkbox	
				public SettingsScreen verifyAutorefreshCheckbox(String data) {
							System.out.println(AutoRefresh.getText());
							Assert.assertEquals(AutoRefresh.getText(), data);
							return this;
						}
				//verify labels - demo mode checkbox	
				public SettingsScreen verifyDemoModeCheckbox(String data) {
							System.out.println(DemoMode.getText());
							Assert.assertEquals(DemoMode.getText(), data);
							return this;
						}
				
				public SettingsScreen defaultStatusDemocheckboxWeb(){
					System.out.println("Displayed: "+DemoMode.isDisplayed());
					System.out.println("Enabled: "+DemoMode.isEnabled());
					System.out.println("Selected: "+DemoMode.isSelected());
					return this;
				}
				
				//select checkbox - https
				public SettingsScreen checkedSecureConnectionCheckcbox(){
						System.out.println("Tap on the Secure Connection checkbox");
						secureconncheckbox.click();  
						System.out.println("Checked the checkbox");  
						return this;
						}
				// uncheck the checkbox - https
				public SettingsScreen uncheckedSecureConnectionCheckcbox(){
					System.out.println("CheckBox is un-checked");
					secureConnCheckBox.click();
					System.out.println("Checkbox is already unchecked");
					return this;
				}
				
				//select checkbox - auto refresh
				public SettingsScreen checkedAutorefreshCheckcbox()	{
						System.out.println("Tap on the auto-refresh checkbox");
						 
						autorefreshcheckbox.click();  
						System.out.println("Checked the checkbox");  
						return this;
						}
				// uncheck the checkbox - auto refresh
				public SettingsScreen uncheckedAutorefreshCheckcbox(){
					System.out.println("Uncheck the CheckBox");					
					autoRefreshCheckBox.click();
					System.out.println("CheckBox is un-checked");
						
					return this;
				}
				
				//check the checkbox - demomode
				public SettingsScreen checkedDemoModeCheckcbox()	{
					System.out.println("Tap on the demo-mode checkbox");
					demomodecheckbox.click();  
					System.out.println("Checked the checkbox");  
					return this;
					}
				// uncheck the checkbox - demomode
				public SettingsScreen uncheckedDemoModeCheckcbox(){
					System.out.println("Uncheck the CheckBox");
					CheckBoxDemoMode.click();
					System.out.println("CheckBox is un-checked");
					return this;
				}
								
				public SettingsScreen clickOkmsg(){
						System.out.println("Tap on Ok button of pop-up message");
						okpopupmsg.click();
						return this;
					}
					// Click on Ok button of pop-up - using co-ordinates
					public SettingsScreen clickokbtn(){
						System.out.println("Tap on Ok button of pop-up message");
						TouchAction okbutton = new TouchAction((MobileDriver)driver);
						okbutton.tap(541, 1044).perform();
						return this;
					}
					//Capture ScreenShots and Saved with current TimeStamp name
					public SettingsScreen captureScreenshots() throws Exception{
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
					
					// Tap on Connection test button		
					public SettingsScreen clickconntestbutton() throws InterruptedException	{
						System.out.println("Tap on the Connection Test Button");
						//driver.swipe(1050, 1600, 1050, 1250, 10000);
						TouchAction action = new TouchAction((MobileDriver)driver);
						Thread.sleep(2000);
						System.out.println("Tap by co-ordinates");
						action.tap(790, 1200).perform();
						return this;
						}
					
					public SettingsScreen clickConnectionTest(){
						System.out.println("Location: "+connectionTestButton.getLocation());
						System.out.println("Text: "+connectionTestButton.getText());
						System.out.println("Size: "+connectionTestButton.getSize());
						
						connectionTestButton.click();
						return this;
					}
					
					
					//Tap on back button
					public SettingsScreen tapBackbtnIcon(){
						backbutton.click();
						return this;
						}
					//tap on back button
					public SettingsScreen tapBackbtn(){
						
						driver.tap(1, 51, 1692, 10000);
						return this;
						}
					
					//tap on back button
					
					public SettingsScreen tapBackN10(){
						driver.tap(1, 30, 2400, 5000);
						
						return this;
						}
					
				/*
				public SettingsScreen validatelabels() throws InterruptedException	{
					   System.out.println(EditBoxLabel.get(0).getText());
					   Assert.assertEquals(EditBoxLabel.get(0).getText(), "Ind. HiVision Host");
					   System.out.println(EditBoxLabel.get(1).getText());
					   Assert.assertEquals(EditBoxLabel.get(1).getText(), "Web Server Port");
					   System.out.println(EditBoxLabel.get(2).getText());
					   Assert.assertEquals(EditBoxLabel.get(2).getText(), "Username");
					   System.out.println(EditBoxLabel.get(3).getText());
					   Assert.assertEquals(EditBoxLabel.get(3).getText(), "Password");
					   System.out.println(UseSecureConn.getText());
					   Assert.assertEquals(UseSecureConn.getText(), "Use secure connection (HTTPS)");
					   System.out.println(AutoRefresh.getText());
					   Assert.assertEquals(AutoRefresh.getText(), "Auto-Refresh Events");
					   System.out.println(DemoMode.getText());
					   Assert.assertEquals(DemoMode.getText(), "Demo Mode");
					   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ConnTest);
					   Thread.sleep(2000);
					   System.out.println(ConnTest.getText());
					   Assert.assertEquals(ConnTest.getText(), "Connection Test");
					   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EditBoxLabel.get(0));
					   Thread.sleep(2000);
				   	   return this;
			}
			*/
				public SettingsScreen enterhostWithoutKeyboardResign(String data) throws InterruptedException	{
					
					editBoxHost.clear();
					editBoxHost.sendKeys(data);
					Thread.sleep(4000);
								
					return this;
			}
				
			public SettingsScreen enterPortWithoutKeyboardResign(String data) throws InterruptedException	{
					
					editBoxPort.clear();
					editBoxPort.sendKeys(data);
					Thread.sleep(2000);
								
					return this;
			}
				
				public SettingsScreen clickconntestbuttonlandscape() throws InterruptedException	{
					
					System.out.println("Tap on the Connection Test Button");
					driver.context("WEBVIEW");
					Thread.sleep(10000);
					
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ConnTest);
					
					driver.context("NATIVE_APP");
			        Thread.sleep(10000);
			        
			        driver.tap(1, 890, 790, 20);
			        Thread.sleep(5000);
			        return this;
			}
				public SettingsScreen clickAlertOkLandscape(){
					TouchAction action = new TouchAction(driver);
					action.tap(896, 694).perform();
					return this;
				}
				
				public SettingsScreen clickBackLandscape(){
					TouchAction touch = new TouchAction(driver);
					touch.tap(51, 996).perform();
					return this;
				}
				
				
				
				public SettingsScreen changetoLandscapeKeyBoardResignAndScroll() throws InterruptedException	{
					
					//EditBoxLabel.get(0).click();
					Thread.sleep(2000);
					driver.context("NATIVE_APP");
			        Thread.sleep(10000);
			        System.out.println("Changing orientation to landscape");
			        driver.rotate(ScreenOrientation.LANDSCAPE);
			        Thread.sleep(5000);
			        
			        driver.context("WEBVIEW");
			        Thread.sleep(10000);
			        
			        //System.out.println("Resign the keyboard");
			        //driver.hideKeyboard();
			        //Thread.sleep(30000);
			        
			        System.out.println("Scroll up and down the page in landscape mode");
			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ConnTest);
			        Thread.sleep(10000);
			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EditBoxLabel.get(0));
			        Thread.sleep(10000);
			        
					return this;
			        
				}
				
				public SettingsScreen changeOrientationLandscape() throws Exception{
					System.out.println("Change Orientation from Portrait to Landscape");
					Thread.sleep(2000);
					driver.rotate(ScreenOrientation.LANDSCAPE);
					return this;
				}
				
				public SettingsScreen scrollingUpDowninLandscapeView() throws Exception{
				
					System.out.println("Scroll up and down the page in landscape mode");
			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ConnTest);
			        Thread.sleep(5000);
			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EditBoxLabel.get(0));
			        Thread.sleep(5000);
					
				return this;
				}
				
				public SettingsScreen scrollingDowninLandscapeView() throws InterruptedException{
					System.out.println("Scroll down the page in landscape mode");
					Thread.sleep(2000);
			        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ConnTest);	
				return this;
				}
				
				public SettingsScreen scrollingUpinLandscapeView() throws Exception{
					System.out.println("Scroll up the page in landscape mode");
					Thread.sleep(2000);
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EditBoxLabel.get(0));
					return this;
					}
				
				public SettingsScreen changeOrientationPortrait() throws Exception{
					System.out.println("Change Orientation from Landscape to Portrait");
					Thread.sleep(2000);
					driver.rotate(ScreenOrientation.PORTRAIT);
					return this;
				}
				//default checkbox status - demomode
				public SettingsScreen defaultdemomodecheckbox(){
					boolean checkstatus = demomodecheckbox.isSelected();
					if (checkstatus==true){  
						System.out.println("Default Checkbox Status is ON(checked)"); 
						} else 	{
						System.out.println("Default Checkbox Status is OFF(Un-checked)");
						}
					return this;
				}
				
				
				//Third Party methods
				public SettingsScreen clickBack(){
					backBTNImg.click();
					return this;
				}
				public SettingsScreen myAlertSuccess(String data){
						System.out.println(msg.getText());
						Assert.assertEquals(msg.getText(), data);	
						return this;
				}
				public SettingsScreen myAlertError(String data){
						System.out.println(msg.getText());
						Assert.assertEquals(msg.getText(), data);
						return this;
				}
				public SettingsScreen mypopupSuccess(){
						System.out.println(msg.getText());
						Assert.assertEquals(msg.getText(), "Success\nConnection Test successful.\nOk");
						return this;
				}
				public SettingsScreen mypopupError(){
							System.out.println(msg.getText());
							Assert.assertEquals(msg.getText(), "Error\nConnection Test failed.\nOk");
							return this;
				}
				public SettingsScreen clickokpopupmsg(){
						System.out.println("Tap on Ok button of pop-up message");
						//Okmsg.click();
						return this;
				}
				public SettingsScreen myPopupText(String data){
					if(msg.getText()==data){
					System.out.println("Test passed");
					} else	{
					System.out.println("Test failed");
					}
					return this;
				}
				public SettingsScreen popuphead(){
					System.out.println(msg.getText());
					Assert.assertEquals(msg.getText(), "Error");
					return this;
				}
				public SettingsScreen verifyFailPopupMsg(){
							Assert.assertEquals(popupHead.getText(), "Error");
							Assert.assertEquals(Text.getText(), "Connection Test failed.");
							return this;
				}
										
				public SettingsScreen popupcontents(){
						System.out.println(Text.getText());
						Assert.assertEquals(Text.getText(), "Connection Test failed.");
						return this;
				}
				public SettingsScreen myAlertHttps(String data){
							System.out.println(httpsalert.getText());
							Assert.assertEquals(httpsalert.getText(),data);
							return this;
				}
				public SettingsScreen mypopuphttpsAlertMsg(String data){
							System.out.println(httpsalert.getText());
							//Assert.assertEquals(httpsalert.getText(), "Note\nHTTPS is operable with a valid certificate exclusively. Please see the Industrial HiVision user manual for instructions.\nOk");
						Assert.assertEquals(httpsalert.getText(),data);
						return this;
				}
				public SettingsScreen mypopupAlerthttpsMsg(String data){
							System.out.println(httpspopup.getText());
							//Assert.assertEquals(httpspopup.getText(), "Note\nHTTPS is operable with a valid certificate exclusively. Please see the Industrial HiVision user manual for instructions.\nOk");
							Assert.assertEquals(httpspopup.getText(),data);
							return this;
				}
				public SettingsScreen successconntestPopupLandscape() throws InterruptedException	{
									System.out.println("Validate the pop-up message");
									driver.context("WEBVIEW");
									Thread.sleep(20000);
									System.out.println(popupHead.getText());	
									Assert.assertEquals(popupHead.getText(), "Success");
									System.out.println(popupText.getText());	
									Assert.assertEquals(popupText.getText(), "Connection Test successful.");
									System.out.println(popupOk.getText());	
									Assert.assertEquals(popupOk.getText(), "Ok");
									System.out.println("Click on the OK pop-up message");
							driver.context("NATIVE_APP");
							        Thread.sleep(20000);
							        
							        driver.tap(1, 890, 705, 10);
							        Thread.sleep(3000);
							        
							        driver.context("WEBVIEW");
									Thread.sleep(10000);
							        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", EditBoxLabel.get(0));
									
							        Thread.sleep(10000);
							        return this;	
				}

				// verify popup header - when connection is successful
				public SettingsScreen popupHeadSuccess(){
											System.out.println(popupHead.getText());
											Assert.assertEquals(popupHead.getText(), "Success");
											return this;
				}
										
										// verify popup header - when connection is failed
				public SettingsScreen popupHeadFail(String data){
											System.out.println(popupHead.getText());
											Assert.assertEquals(popupHead.getText(), "Error");
											return this;
				}
				public SettingsScreen popupTitle(String data){
									if(popupHead.getText()==data){
										System.out.println("Test passed");
									} else	{
										System.out.println("Test failed");
									}
									return this;
				}
				// verify popup header
				public SettingsScreen popupheader(){
									System.out.println(popupHead.getText());
									Assert.assertEquals(popupHead.getText(), "Note");
									return this;
				}
				//verify popup text
				public SettingsScreen popuptextings(){
									System.out.println(popupText.getText());
									Assert.assertEquals(popupText.getText(), "HTTPS is operable with a valid certificate exclusively. Please see the Industrial HiVision user manual for instructions.");
									return this;
				}	
				// verify popup text - when connection is failed
				public SettingsScreen popupTextFail(String data){
							System.out.println(popupText.getText());
							Assert.assertEquals(popupText.getText(), data);
							return this;
				}
				public SettingsScreen popupContent(String data){
							System.out.println(popupText.getText());
							//Assert.assertEquals(popupText.getText(), data);
							if(popupText.getText().contentEquals(data)){
								System.out.println("Test is Pass");
							}	else	{
								System.out.println("Test is Fail");
							}
							return this;
				}

				// verify popup text - when connection is successful
				public SettingsScreen popupTextSuccess(String data){
							System.out.println(popupText.getText());
							//Assert.assertEquals(popupText.getText(), data);
							if(popupText.getText().contentEquals(data)){
								System.out.println("Test is Pass");
							}	else	{
								System.out.println("Test is Fail");
							}
							return this;
				}
				//For Nexus 10
				public SettingsScreen tapsecurecbox1(){
					securecb.click();
					return this;
				}
				
				public SettingsScreen tapautorefreshcbox2(){
					autorefreshcb.click();
					return this;
				}

				public SettingsScreen tapdemocbox3(){
					demomodecb.click();
					return this;
				}
				
				public SettingsScreen uncheckedsecurecbox1(){
					securecb.clear();
					return this;
				}
				
				public SettingsScreen uncheckedautorefreshcbox2(){
					autorefreshcb.clear();
					return this;
				}

				public SettingsScreen uncheckeddemocbox3(){
					demomodecb.clear();
					return this;
				}
				
				public SettingsScreen clickoknexus10(){
					driver.tap(1, 800, 1340, 5);
					return this;
				}

				
				
					private Boolean IsElementPresent(WebDriver driver, By by) {
				        try
				        {
				            driver.findElement(by);
				            return true;
				        }
				        catch (NoSuchElementException e) { return false; }
				    }
				
		
}

