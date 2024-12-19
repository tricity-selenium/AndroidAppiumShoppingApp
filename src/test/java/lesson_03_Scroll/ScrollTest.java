package lesson_03_Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;

public class ScrollTest extends BaseTest{
  @Test
  public void checkLongPress() {
	  
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	 // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
	 
	  ScrollToEnd();
	  
  }
}
