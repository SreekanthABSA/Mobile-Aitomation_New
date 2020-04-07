package com.org.absa.beneficiaries;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.Mobile.MobileTest.*;

public class AddBeneficiaryCashSend extends AddBeneficiary

          {

	
		public static void main(String[] args) {
			
			try {
				
				cap();
				Thread.sleep(5000);
				prelogin();
				Thread.sleep(5000);
				addbencashSend();
				Thread.sleep(5000);
				editbencashSend();
				Thread.sleep(5000);
				
			    
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		   
		    }
		public static void addbencashSend() throws InterruptedIOException
		{
			WebDriverWait wait = new WebDriverWait(driver, 80);
			
			//Click On Menu
			
			WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
			menuButton.click();
			
			
			//clicking on Beneficiaries Button 
			
			WebElement beneficiaryButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")));
			beneficiaryButton.click();
			
			//Clicking CashSend Tile 
			
			WebElement cashSendButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"CashSend\"]/android.view.ViewGroup/android.widget.TextView\r\n" + "")));
			cashSendButton.click();
			
			//Clicking Add CashSend Beneficiary 
			
			WebElement cashSendBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/caption_text_view")));
			cashSendBen.click();
			
			//Enter Beneficary Name 
			
			WebElement cashSendBenName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.EditText\r\n" +"")));
			cashSendBenName.sendKeys("Sreekanth");
			
            //Enter Beneficary Surname 
			
			WebElement cashSendSurname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.EditText")));
			cashSendSurname.sendKeys("Chandupatla");
			
            //Enter Beneficary Mobile Number 
			
			WebElement benMobNum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[3]/android.widget.EditText\r\n" + "")));
			benMobNum.sendKeys("0742788029");
			
            //Enter Beneficary Reference  
			
			WebElement benReference = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[4]/android.widget.EditText\r\n" + "")));
			benReference.sendKeys("Test Cash Send");
			
            //Clicking on Next 
			
			WebElement nextBenButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/btnContinue")));
			nextBenButton.click();
			
			//Clicking on Home Screen 
			WebElement homeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/bottomActionButton")));
			homeButton.click();
			
			
		}
		
		public static void editbencashSend() throws InterruptedIOException
		
		{
            WebDriverWait wait = new WebDriverWait(driver, 80);
			
			//Click On Menu
			
			WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
			menuButton.click();
			
			
			//clicking on Beneficiaries Button 
			
			WebElement beneficiaryButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")));
			beneficiaryButton.click();
			
			//Clicking CashSend Tile 
			
			WebElement cashSendButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"CashSend\"]/android.view.ViewGroup/android.widget.TextView\r\n" + "")));
			cashSendButton.click();
			
			//Clicking on Beneficary Screen 
			WebElement existingBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/initials_text_view")));
			existingBen.click();
			
			
			//Clicking on Edit Screen 
			WebElement editBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
			editBen.click();
			
            //Editing Name Field 
			
			WebElement namefield = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText\r\n" + "")));
			namefield.click();
			
			//Clicking on Save Button
			WebElement saveExistingBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/saveButton")));
			saveExistingBen.click();
			
			//Clicking on Confirm Button
			WebElement confirmExistingBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
			confirmExistingBen.click();
			
			
			//Delete Beneficary 
			
			//Clicking on Edit Button for Deleting the Beneficary 
			WebElement delExistingBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
			delExistingBen.click();
			
			//Clicking on delete Button for Deleting the Beneficary ,might need to change the element id to xpath if id doesnt work
			WebElement deleteExistingBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
			deleteExistingBen.click();
			
			
			//Clicking on Confirm Button
			WebElement confirmDeleteBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
			confirmDeleteBen.click();
			
		
		
		
		}
		
		

	}


