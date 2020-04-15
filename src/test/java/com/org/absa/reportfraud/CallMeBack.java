package com.org.absa.reportfraud;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.Mobile.MobileTest.AppTest;

public class CallMeBack  extends AppTest {

	public static void main(String[] args) {
		
		try {
			
			cap();
			Thread.sleep(5000);
			prelogin();
			Thread.sleep(5000);
			callmeHamMen();
		} 
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
	   
	    }
	
	public static void callmeHamMen() throws InterruptedException,IOException
	{
        WebDriverWait wait = new WebDriverWait(driver, 80);
		
		//Click On Menu
		
		WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
		menuButton.click();
		
		//Click on Report Fraud  
		driver.findElementByAndroidUIAutomator(	"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Report fraud\").instance(0))").click();
		
		//click On Call me Back 
		WebElement callMe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/callMeBackButton")));
		callMe.click();
		
		//Click 
		WebElement okCallMe = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		okCallMe.click();
		
		
	}
}