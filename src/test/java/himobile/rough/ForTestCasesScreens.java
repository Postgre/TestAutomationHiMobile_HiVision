package himobile.rough;

import java.util.List;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import himobile.base.ScreenBase;

public class ForTestCasesScreens extends ScreenBase{

	public ForTestCasesScreens(AndroidDriver driver) {
		super(driver);
	}
	
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
		@AndroidFindBy(className="android.widget.EditText")
	})
	public List<WebElement> editBoxes;
	
	public ForTestCasesScreens enterHValues(){
		editBoxes.get(0).clear();
		editBoxes.get(0).click();
		editBoxes.get(0).sendKeys("192.168.2.100");	
		return this;
	}
	
	public ForTestCasesScreens enterPValues(){
		editBoxes.get(1).clear();
		editBoxes.get(1).clear();
		editBoxes.get(1).click();
		editBoxes.get(1).sendKeys("11159");	
		return this;
	}
	public ForTestCasesScreens enterUValues(){
		editBoxes.get(2).clear();
		editBoxes.get(2).click();
		editBoxes.get(2).sendKeys("admin");	
		return this;
	}
	public ForTestCasesScreens enterpwdValues(){
		editBoxes.get(3).clear();
		editBoxes.get(3).click();
		editBoxes.get(3).sendKeys("admin123");	
		return this;
	}

}
