package lesson_02_LongPress;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;

public class LongPressTest extends BaseTest{
  @Test
  public void checkLongPress() {
	  
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
	  driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	  WebElement ele = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	  
	  longPress(ele);
  }
}
