package com.org.absa.managelimits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.Mobile.MobileTest.*;


public class ChangeDigitalLimits  extends AppTest {

	public static void main(String[] args) {
		
		try {
			
			cap();
			Thread.sleep(5000);
			prelogin();
			Thread.sleep(5000);
			manageLimits();
			
		    
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	   
	    }
	
	public static void manageLimits() throws InterruptedException 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 80);
		
		//Click On Menu
		
		WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
		menuButton.click();
		
		//Click Manage Digital Limits 
		WebElement limits = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.TextView")));
		limits.click();
		
		//Click Edit Button 
		WebElement edit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
		edit.click();
		
		//Daily Payment field
		WebElement dailyPayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText\r\n" + "")));
		dailyPayment.sendKeys("4000");
		
		//Inter-account Daily limit 
		
		WebElement interAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n" +  "")));
		interAccount.sendKeys("90000");
		
		//Recurring Payment 
		WebElement recurringPayment = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText\r\n" +  "")));
		recurringPayment.sendKeys("1000");
		
		//Future Dated Payment
		
		WebElement future = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText\r\n" +  "")));
		future.sendKeys("1000");
		
		//Save Button 
		WebElement saveBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/saveButton")));
		saveBut.click();
		
		//Accept Surecheck
		
		WebElement sureCheck = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/btn_positive")));
		sureCheck.click();
		
		//Accept done
		
		WebElement doneButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/bottomActionButton")));
		doneButton.click();
	    System.out.println("Limits changed succesfully");	
		
		
		
	}
}
		
		
