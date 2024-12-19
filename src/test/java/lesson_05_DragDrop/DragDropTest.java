package lesson_05_DragDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;

public class DragDropTest extends BaseTest{
  @Test
  public void checkDragDrop() {
	  
	  driver.findElement(AppiumBy.accessibilityId("Views")).click();
	  driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
	  
	  WebElement srcElement = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	  
	  DragDrop(srcElement, 438, 697);
	 // ((JavascriptExecutor)driver).executeScript("mobile: dragGesture", ImmutableMap.of(
		//		 "elementId", ((RemoteWebElement)srcElement).getId(), "endX", 438 , "endY", 697));
	  
	  
  }
}
