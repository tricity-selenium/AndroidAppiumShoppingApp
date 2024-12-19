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

public class Script_05_VerifyCartTotal extends BaseTest{
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
  public void verifyCartTotal()
  {
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	  wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
	  List<WebElement> productList = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
      double sumOfProductPrice = 0;
	  for(WebElement product : productList)
      {
    	  String priceString = product.getText().substring(1);
    	  double priceFinal = Double.parseDouble(priceString);
    	  sumOfProductPrice = sumOfProductPrice + priceFinal;
    	  System.out.println(sumOfProductPrice);
    	  
      }
	  
	  String cartTotalString = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText().substring(1);
	  double cartTotalFinal = Double.parseDouble(cartTotalString);
	  System.out.println(cartTotalFinal);
	  
	  Assert.assertEquals(sumOfProductPrice, cartTotalFinal);
	  
  
  }
  
  
  
  
}
