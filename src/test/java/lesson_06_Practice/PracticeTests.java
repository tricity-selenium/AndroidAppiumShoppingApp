package lesson_06_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import basePackage.BaseTest;
import io.appium.java_client.AppiumBy;

public class PracticeTests extends BaseTest{
  @Test(priority = 0)
  public void isAppMenuDisplayed() {
	  
	  boolean appMenuDisplay = driver.findElement(AppiumBy.accessibilityId("App")).isDisplayed();
	  Assert.assertEquals(appMenuDisplay, true);
  }
  
  @Test(priority = 1, dependsOnMethods = {"isAppMenuDisplayed"})
  public void ClickAppMenu() {
	  
	  driver.findElement(AppiumBy.accessibilityId("App")).click();
	 
  }
  
  @Test(priority = 2)
  public void isAlertDialogsDisplayed() {
	  
	  boolean alertDialogsDisplay = driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).isDisplayed();
	  Assert.assertEquals(alertDialogsDisplay, true);
  }
  
  @Test(priority = 3, dependsOnMethods = {"isAlertDialogsDisplayed"})
  public void ClickAlertDialogs() {
	  
	  driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
	 
  }
  
  @Test(priority = 4)
  public void longMessageDialogClickOK() {
	  
	  driver.findElement(By.id("io.appium.android.apis:id/two_buttons2")).click();
	  driver.findElement(By.id("android:id/button1")).click();
	 
  }
  
  @Test(priority = 5)
  public void ClickListDialog() {
	  
	  driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
	  List<WebElement> dialogList = driver.findElements(By.className("android.widget.TextView"));
	  for(WebElement listItem : dialogList)
	  {
		  if(listItem.getText().contains("two"))
		  {
			  listItem.click();
			  break;
		  }
	  }
	  
	  String selectionText = driver.findElement(By.id("android:id/message")).getText();
	  Assert.assertEquals(selectionText, "You selected: 1 , Command two");
	 
  }
  
  @Test(priority = 6)
  public void ClickSingleChoiceList() {
	  
	  driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
	  List<WebElement> choiceList = driver.findElements(By.className("android.widget.CheckedTextView"));
	  for(WebElement choiceItem : choiceList)
	  {
		  System.out.println(choiceItem.getText());
		  if(choiceItem.getText().contains("Traffic"))
		  {
			  choiceItem.click();
			  break;
		  }
	  }
	  
	  driver.findElement(By.id("android:id/button1")).click();
    }
  
  }
  
