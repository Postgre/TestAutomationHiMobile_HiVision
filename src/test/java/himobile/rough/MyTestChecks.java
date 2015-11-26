package himobile.rough;

import himobile.base.ScreenBase;
import himobile.screens.SettingsScreen;
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

public class MyTestChecks extends ScreenBase {
	
	public MyTestChecks(AndroidDriver driver)	{
		super(driver);
	}
	@FindBy(xpath=Configuration.screenTitle)
	public WebElement screenTitle;
	
	@FindBy(xpath=Configuration.notification)
	public WebElement notification;
	
	@FindBy(xpath=Configuration.UseSecureConn)
	public WebElement UseSecureConn;
	
	@FindBy(xpath=Configuration.AutoRefresh)
	public WebElement AutoRefresh;
	
	@FindBy(xpath=Configuration.DemoMode)
	public WebElement DemoMode;
	
	@AndroidFindBy(xpath=Configuration.secureconncheckbox)
	public WebElement secureconncheckbox;
	
	@AndroidFindBy(xpath=Configuration.httpscheckBox)
	public WebElement httpscheckBox;
	
	@AndroidFindBy(xpath=Configuration.autorefreshcheckbox)
	public WebElement autorefreshcheckbox;
	
	@AndroidFindBy(xpath=Configuration.demomodecheckbox)
	public WebElement demomodecheckbox;
	
	@AndroidFindBy(xpath=Configuration.secureConnCheckBox)
	public WebElement secureConnCheckBox;
	
	@AndroidFindBy(xpath=Configuration.autoRefreshCheckBox)
	public WebElement autoRefreshCheckBox;
	
	@AndroidFindBy(xpath=Configuration.CheckBoxDemoMode)
	public WebElement CheckBoxDemoMode;

	//To change the context of App to Native App View
		public MyTestChecks changeContextNativeApp() throws InterruptedException{
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
		public MyTestChecks changeContextWebview() throws InterruptedException{
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
		public MyTestChecks scrolldown(){
			driver.swipe(1050, 1600, 1050, 1300, 10000);
			return this;
		}
		
		public MyTestChecks scrollup(){
			driver.swipe(1050, 1300, 1050, 1600, 10000);
			return this;
		}
		
		//minimize keyboard functionality
		public MyTestChecks minimizeKeyboard(){
			
			driver.hideKeyboard();
			return this;
		}
		
		//notification
		public MyTestChecks verifyNotification(String data){
		System.out.println(notification.getText());
		//Assert.assertEquals(notification.getText(),"This is the first time you run this app. Provide the connection settings please.");
		Assert.assertEquals(notification.getText(),data);
		return this;
		}

		//screen title
		public MyTestChecks verifyScreentitle1(){
			System.out.println(screenTitle.getText());
			Assert.assertEquals(screenTitle.getText(),"Settings");
			return this;
		}
		public MyTestChecks verifyScreentitle(String data)	{
			System.out.println(screenTitle.getText());
			//Assert.assertEquals(screenTitle.getText(),"Settings");
			Assert.assertEquals(screenTitle.getText(),data);
			return this;
			}
	//verify labels - secure connection checkbox	
	public MyTestChecks verifySecureConnectionCheckbox(String data) {
				System.out.println(UseSecureConn.getText());
				Assert.assertEquals(UseSecureConn.getText(), data);
				return this;
			}
	//verify labels - autorefresh checkbox	
	public MyTestChecks verifyAutorefreshCheckbox(String data) {
				System.out.println(AutoRefresh.getText());
				Assert.assertEquals(AutoRefresh.getText(), data);
				return this;
			}
	//verify labels - demo mode checkbox	
	public MyTestChecks verifyDemoModeCheckbox(String data) {
				System.out.println(DemoMode.getText());
				Assert.assertEquals(DemoMode.getText(), data);
				return this;
			}
	public MyTestChecks defaultStatusDemocheckboxWeb(){
		System.out.println("Displayed: "+DemoMode.isDisplayed());
		System.out.println("Enabled: "+DemoMode.isEnabled());
		System.out.println("Selected: "+DemoMode.isSelected());
		return this;
	}

//select checkbox - https
				public MyTestChecks checkedSecureConnectionCheckcbox(){
						System.out.println("Tap on the Secure Connection checkbox");
												
						secureconncheckbox.click();  
						System.out.println("Checked the checkbox");  
						return this;
						}
				// uncheck the checkbox - https
				public MyTestChecks uncheckedSecureConnectionCheckcbox(){
					System.out.println("CheckBox is un-checked");
					secureConnCheckBox.click();
							
					System.out.println("Checkbox is already unchecked");
						
					return this;
				}
				//select checkbox - auto refresh
				public MyTestChecks checkedAutorefreshCheckcbox()	{
						System.out.println("Tap on the auto-refresh checkbox");
						 
						autorefreshcheckbox.click();  
						System.out.println("Checked the checkbox");  
						return this;
						}
				// uncheck the checkbox - auto refresh
				public MyTestChecks uncheckedAutorefreshCheckcbox(){
					System.out.println("Uncheck the CheckBox");					
					autoRefreshCheckBox.click();
					System.out.println("CheckBox is un-checked");
						
					return this;
				}
				
				//default checkbox status - demomode
				public MyTestChecks defaultdemomodecheckbox(){
					boolean checkstatus = demomodecheckbox.isSelected();
					if (checkstatus==true){  
						System.out.println("Default Checkbox Status is ON(checked)"); 
						} else 	{
						System.out.println("Default Checkbox Status is OFF(Un-checked)");
						}
					return this;
				}
				//check the checkbox - demomode
				public MyTestChecks checkedDemoModeCheckcbox()	{
					System.out.println("Tap on the demo-mode checkbox");
					demomodecheckbox.click();  
					System.out.println("Checked the checkbox");  
					return this;
					}
				// uncheck the checkbox - demomode
				public MyTestChecks uncheckedDemoModeCheckcbox(){
					System.out.println("Uncheck the CheckBox");
					CheckBoxDemoMode.click();
					System.out.println("CheckBox is un-checked");
					return this;
				}
				
				public MyTestChecks democb(){
						System.out.println(CheckBoxDemoMode.getText());
						System.out.println(CheckBoxDemoMode.isDisplayed());
						CheckBoxDemoMode.click();
						return this;
					}
				
				public MyTestChecks clickokbtn(){
					System.out.println("Tap on Ok button of pop-up message");
					TouchAction okbutton = new TouchAction((MobileDriver)driver);
					okbutton.tap(541, 1044).perform();
					return this;
				}

}
