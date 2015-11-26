package himobile.rough;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

public class AppiumServerJavaClient {

	public static AndroidDriver driver;
	
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
	
		AppiumDriverLocalService service = AppiumDriverLocalService
											.buildService(new AppiumServiceBuilder()
											.usingDriverExecutable(new File("C:/Program Files/nodejs/node.exe"))
											.withAppiumJS(new File("D:/Automation_Appium/Appium/node_modules/appium/bin/appium.js"))		
											.withLogFile(new File(System.getProperty("user.dir")+"/src/test/resources/logs/appiumLogs.txt")));

			service.start();
			
			File app = new File(System.getProperty("user.dir")+"/src/test/resources/apps/HiMobile-debug.apk");
			 DesiredCapabilities capabilities = new DesiredCapabilities();
			 capabilities.setCapability("automationName","Appium");
			 capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			 capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "4.4.2");
			 capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android");
			 capabilities.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
			  
		  
		       driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		       
		      driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
		      
		      System.out.println("To change the context from Native App View to Webview");
				Set<String> contextNames = driver.getContextHandles();
							for (String contextName : contextNames) {
							  if (contextName.contains("WEBVIEW")){
				    driver.context(contextName);
				  }
				}
			Thread.sleep(10000);
		      WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div[2]"));
		      WebElement host = driver.findElement(By.xpath("//input[@id='hostInputTxtbox']"));
		      WebElement port = driver.findElement(By.xpath("//input[@id=\"portInputTxtbox\"]"));
		      WebElement username = driver.findElement(By.xpath("//input[@id=\"pwdInputTxtBox\"]"));
		      WebElement password = driver.findElement(By.xpath("//input[@id=\"usernameInputTxtBox\"]"));
		      	
		      String Expected = "Settings";
		      String Actual = title.getText();
		      Thread.sleep(5000);
		      Assert.assertEquals(Actual, Expected);
		      Thread.sleep(5000);
		      host.clear();
		      host.sendKeys("192.168.1.100");
		      Thread.sleep(2000);
		      port.clear();
		      port.sendKeys("11159");
		      Thread.sleep(2000);
		      username.clear();
		      username.sendKeys("admin");
		      Thread.sleep(2000);
		      password.clear();
		      password.sendKeys("admin123");
		      Thread.sleep(2000);
		      driver.hideKeyboard();
		      Thread.sleep(2000);
		      driver.quit();
		      Thread.sleep(2000);
		      service.stop();

	}

}
