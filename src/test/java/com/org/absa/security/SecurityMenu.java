package com.org.absa.security;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.Mobile.MobileTest.AppTest;

public class SecurityMenu  extends AppTest {

	public static void main(String[] args) {
		
		try {
			
			cap();
			Thread.sleep(5000);
			prelogin();
			Thread.sleep(5000);
			securityHamMen();
		} 
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
	   
	    }
	
	public static void securityHamMen()  throws InterruptedException,IOException
	{
        WebDriverWait wait = new WebDriverWait(driver, 80);
		
		//Click On Menu
		
		WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
		menuButton.click();
		
		//Click on Security 
		driver.findElementByAndroidUIAutomator(	"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Security\").instance(0))").click();
		
		//Generate Token
		
		WebElement generateToken = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/btn_generateToken")));
		generateToken.click();
		
		//Click ok for verification Token
		
		WebElement token = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		token.click();
		
		//Click Back to go back to the Explore Hub 
		
		WebElement navigateBack = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")));
		navigateBack.click();
		System.out.println("Security Menu Automated Succesfully");
		
		
	}
	
}


