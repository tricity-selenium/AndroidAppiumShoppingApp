package basePackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	
	 public AndroidDriver driver;
	 
	 @BeforeClass
	public void launchApp() throws MalformedURLException
	
	{
	  UiAutomator2Options option = new UiAutomator2Options();
	  option.setDeviceName("samsung SM-M127G");
	  option.setApp("C:\\Users\\HP\\Downloads\\TestApp\\resources\\General-Store.apk");
	  
	  driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), option);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	 
	public void longPress(WebElement ele)
	{
		 ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				  "elementId", ((RemoteWebElement)ele).getId(), "duration", 2000));
		  
	}
	
	public void ScrollUntilEleText(String eletext)
	{
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(eletext));"));
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	}
	
	public void ScrollToEnd()
	{
		boolean canScrollMore;
		  do {
		  canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
				    "left", 100, "top", 100, "width", 200, "height", 200,
				    "direction", "down",
				    "percent", 1.0
				));
		  }
		  while(canScrollMore);
	}
	
	public void Swipe(WebElement ele, String direction)
	{
	
	((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
				 "elementId", ((RemoteWebElement)ele).getId(), "direction", direction , "percent", 0.50));
	 	 
    }
	
	public void DragDrop(WebElement ele, int x , int y)
	{
		((JavascriptExecutor)driver).executeScript("mobile: dragGesture", ImmutableMap.of(
				 "elementId", ((RemoteWebElement)ele).getId(), "endX", x , "endY", y));
	}
}

