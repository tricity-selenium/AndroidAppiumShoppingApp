package testScripts;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;

public class Script_03_AddToCart extends BaseTest{
  @Test
  public void addToCart() throws MalformedURLException {
	  
	  launchApp();
	  driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Deepak");
	  driver.findElement(By.id("android:id/text1")).click();
	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bhutan\"));"));
	  driver.findElement(By.xpath("//android.widget.TextView[@text='Bhutan']")).click();
	  driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	  List<WebElement> productList = driver.findElements(By.id("com.androidsample.generalstore:id/productName"));
	  for(int i = 0; i< productList.size(); i++)
	  {
		  
		 if(productList.get(i).getText().equalsIgnoreCase("Air Jordan 4 Retro"))
		 {
			 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
		 }
		 else
		 {
			 System.out.println(productList.get(i).getText());
		 }
	  }
	  
	  driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	  
	  
	  
	  
  }
}
