package testScripts;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;

public class Script_01_FormFill extends BaseTest{
  @Test
  public void FillForm() throws MalformedURLException {
	  
	  launchApp();
	  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Deepak");
	  driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
	  driver.findElement(By.id("android:id/text1")).click();
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bhutan\"));"));
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Bhutan']")).click();
	  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	  
	  
  }
}
