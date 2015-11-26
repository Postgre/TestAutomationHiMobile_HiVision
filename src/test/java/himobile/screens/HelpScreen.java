package himobile.screens;

import himobile.base.ScreenBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HelpScreen extends ScreenBase {

	public HelpScreen(AndroidDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/strong/p")
	public WebElement HiMobileLabel;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/strong/p/span")
	public WebElement HiMobileLabelpart2;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/strong/p/text()[2]")
	public WebElement HiMobileLabelpart3;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[1]/div[2]")
	public WebElement NetworkLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[2]/div[2]")
	public WebElement EventListLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-debug-homescreenList\"]/ul/li[3]/div[2]")
	public WebElement DeviceLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-uid-1\"]")
	public WebElement HelpLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-uid-2\"]")
	public WebElement FAQLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-uid-3\"]")
	public WebElement LegalLabel;
	
	@FindBy(xpath="//*[@id=\"gwt-uid-4\"]")
	public WebElement AboutLabel;
	
	@FindBy(xpath="/html/body/div/div[8]/div[2]/img")
	public WebElement zoom;
	
	@FindBy(xpath="/html/body/div/div[1]/h3")
	public WebElement helppageheader;
	
	@FindBy(xpath="/html/body/div/div[2]/p[2]/text()")
	public WebElement helppagecontent;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='18']")
	public WebElement questionmark ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='20']")
	public WebElement help ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='21']")
	public WebElement faq ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='22']")
	public WebElement legal ;
	
	@AndroidFindBy(xpath="//android.view.View[@instance='23']")
	public WebElement about ;
	
	public HelpScreen helpmenuN10() throws Exception{
		TouchAction action = new TouchAction(driver);
		//action.tap(800, 2400).perform();
		driver.tap(1, 800, 2400, 10000);
		Thread.sleep(5000);
		driver.context("WEBVIEW");
        Thread.sleep(10000);
		
		System.out.println(HelpLabel.getText());
		Assert.assertEquals(HelpLabel.getText(), "Help");
		
		System.out.println(FAQLabel.getText());
		Assert.assertEquals(FAQLabel.getText(), "FAQ");
		
		System.out.println(LegalLabel.getText());
		Assert.assertEquals(LegalLabel.getText(), "Legal");
		
		System.out.println(AboutLabel.getText());
		Assert.assertEquals(AboutLabel.getText(), "About");
		
		return this;
	}

	public HelpScreen helpmenu() throws InterruptedException	{
		
		System.out.println("Click on the ? icon in the Home screen");
		questionmark.click();
        Thread.sleep(2000);
        
        driver.context("WEBVIEW");
        Thread.sleep(10000);
		
		System.out.println(HelpLabel.getText());
		Assert.assertEquals(HelpLabel.getText(), "Help");
		
		System.out.println(FAQLabel.getText());
		Assert.assertEquals(FAQLabel.getText(), "FAQ");
		
		System.out.println(LegalLabel.getText());
		Assert.assertEquals(LegalLabel.getText(), "Legal");
		
		System.out.println(AboutLabel.getText());
		Assert.assertEquals(AboutLabel.getText(), "About");
		
		return this;
	
	}
		
	
	public HelpScreen HelpContextMenu() throws InterruptedException {
		
		System.out.println("Changing to NATIVE view");
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Tap on the Help Menu");
		help.click();
		Thread.sleep(3000);
		
//		driver.context("WEBVIEW");
//		Thread.sleep(10000);
//		
//		System.out.println("The heading of the page is " +helppageheader.getText());
//		Assert.assertEquals(helppageheader.getText(), "HiMobile 2.0");
//		
//		Assert.assertEquals(helppagecontent.getText(), "HiMobile allows you to monitor your network using a mobile device. Some functions are only compatible with Industrial HiVision 6.0.");

		
		return this;
	}
	
	public HelpScreen navigationhelpportrait() throws InterruptedException {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Scroll down the help page");
		for (int i =1; i < 6; i++) {
			driver.swipe(600, 1600, 600, 100, 30000);
			Thread.sleep(5000);
		}	
		
		System.out.println("Scroll up the help page");
		for (int i =1; i < 6; i++) {
			driver.swipe(600, 100, 600, 1600, 30000);
			Thread.sleep(5000);
		}
		
//		driver.context("WEBVIEW");
//		Thread.sleep(10000);
//		
//		System.out.println("The heading of the page is " +helppageheader.getText());
//		Assert.assertEquals(helppageheader.getText(), "HiMobile 2.0");

		return this;
	}
	
	public HelpScreen navigationhelplandscape() throws InterruptedException {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Changing orientation to landscape");
		driver.rotate(ScreenOrientation.LANDSCAPE);
		Thread.sleep(5000);
    
		System.out.println("Scroll down the help page");
		for (int i =1; i < 6; i++) {
			driver.swipe(900, 900, 900, 100, 30000);
			Thread.sleep(5000);
		}	
		
		System.out.println("Scroll up the help page");
		for (int i =1; i < 6; i++) {
			driver.swipe(900, 100, 600, 900, 30000);
			Thread.sleep(5000);
		}
		
//		driver.context("WEBVIEW");
//		Thread.sleep(10000);
//		
//		System.out.println("The heading of the page is " +helppageheader.getText());
//		Assert.assertEquals(helppageheader.getText(), "HiMobile 2.0");

		System.out.println("Changing orientation to portrait");
		driver.rotate(ScreenOrientation.PORTRAIT);
		Thread.sleep(5000);
    
		
		return this;
	}
	
	
	public HelpScreen backkeyonhelp() throws InterruptedException {
		
		System.out.println("Tap on the back key");
		driver.navigate().back();
		
		driver.context("WEBVIEW");
		Thread.sleep(10000);
		
		System.out.println("Title: "+HiMobileLabel.getText());
		
		System.out.println(HiMobileLabel.getText());
		Assert.assertEquals(HiMobileLabel.getText(), "HiMobile");

		System.out.println(NetworkLabel.getText());
		Assert.assertEquals(NetworkLabel.getText(), "Network");
		
		System.out.println(EventListLabel.getText());
		Assert.assertEquals(EventListLabel.getText(), "Event List");
		
		System.out.println(DeviceLabel.getText());
		Assert.assertEquals(DeviceLabel.getText(), "Device");
		
		return this;
	}
	
	public HelpScreen FAQContextMenu() throws InterruptedException {
	
		System.out.println("Click on the Help icon in the Home screen");
        questionmark.click();
        Thread.sleep(2000);
		
        System.out.println("Tap on the FAQ menu");
        faq.click();
        Thread.sleep(5000);
        driver.navigate().back();
      
        return this;

	}
	
	
	public HelpScreen LegalContextMenu() throws InterruptedException {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Click on the ? in the home screen");
        questionmark.click();
        Thread.sleep(2000);
		
        System.out.println("Tap on the Legal menu");
        legal.click();
        
        for (int i =1; i < 18; i++) {
			driver.swipe(600, 1600, 600, 100, 25000);
			Thread.sleep(5000);
		}
        
        return this;

	}
	
	public HelpScreen backkeyonlegal() throws InterruptedException {
		
		System.out.println("Tap on the back key");
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
		
		return this;
	}
	
	
	public HelpScreen AboutContextMenu() throws InterruptedException {
		
		driver.context("NATIVE_APP");
		Thread.sleep(10000);
		
		System.out.println("Click on the help icon");
        questionmark.click();
        Thread.sleep(2000);
		
        System.out.println("Tap on the About menu");
        about.click();
        Thread.sleep(5000);
        for (int i =1; i < 18; i++) {
			driver.swipe(600, 1600, 600, 100, 25000);
			Thread.sleep(5000);
		}
        
      
        return this;

	}
	
	public HelpScreen backkeyonabout() throws InterruptedException {
		
		System.out.println("Tap on the back key");
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
		
		return this;
	}
	
}


