package testScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;

public class Script_02_VerifyToast extends BaseTest{
  @Test
  public void verifyToastMessage() throws MalformedURLException {
	  
	  launchApp();
	  driver.findElement(By.id("android:id/text1")).click();
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bhutan\"));"));
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Bhutan']")).click();
	  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	  String ToastMessage = driver.findElement(By.xpath("(//android.widget.Toast)[1]")).getAttribute("Name");
	  Assert.assertEquals("Please enter your name", ToastMessage);
	  
	  
	  
  }
}
