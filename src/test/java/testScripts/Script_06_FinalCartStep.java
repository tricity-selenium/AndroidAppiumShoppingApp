package testScripts;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;

public class Script_06_FinalCartStep extends BaseTest{
  @Test(priority =0)
  public void addToCart() throws MalformedURLException, InterruptedException {
	  
	  launchApp();
	  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Deepak");
	  driver.findElement(By.id("android:id/text1")).click();
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bhutan\"));"));
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Bhutan']")).click();
	  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	  driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();
	  Thread.sleep(2000);
	  driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();
		  
	  driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	   
  }
  
  @Test(priority = 1)
  public void finalCartStep()
  {
	  WebElement termsConditions = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
	  longPress(termsConditions);
	  driver.findElement(By.id("android:id/button1")).click();
	  driver.findElement(By.className("android.widget.CheckBox")).click();
	  driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	  
	  
  }
  
  
  
  
}
