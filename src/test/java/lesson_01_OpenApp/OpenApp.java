package lesson_01_OpenApp;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;


public class OpenApp extends BaseTest{
  @Test
  public void wifiSettingsName() throws MalformedURLException {
	  
	 driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	 driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();
	 driver.findElement(By.id("android:id/checkbox")).click();
	 driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	 String popUpText = driver.findElement(By.id("android:id/alertTitle")).getText();
	 Assert.assertEquals("WiFi settings", popUpText);
	  
     //driver.findElement(By.id("android:id/edit")).sendKeys("NamanWifi");
	// driver.findElement(By.id("android:id/button1")).click();
  }
}
