package com.org.absa.beneficiaries;

import java.io.InterruptedIOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AddEditDeleteElectricity extends AddBeneficiaryCashSend

          {

	
		public static void main(String[] args) {
			
			try {
				
				cap();
				Thread.sleep(5000);
				prelogin();
				Thread.sleep(5000);
				addbenElectricity();
				Thread.sleep(5000);
				editbenElectricity();
				Thread.sleep(5000);
				
			    
			} 
			catch (Exception e) 
			{
				System.out.println(e);
			}
		   
		    }
		
		public static void addbenElectricity() throws InterruptedIOException
		{
			WebDriverWait wait = new WebDriverWait(driver, 80);
			
			//Click On Menu
			
			WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
			menuButton.click();
			
			
			//clicking on Beneficiaries Button 
			
			WebElement beneficiaryButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")));
			beneficiaryButton.click();
			
           //clicking on Electricity Tile 
			
			WebElement electricityTile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Electricity\"]/android.view.ViewGroup/android.widget.TextView\r\n" + "")));
			electricityTile.click();
			
			
			//Add Beneficiary
			
			WebElement electricityBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/caption_text_view")));
			electricityBen.click();
			
			//Enter recipient Number 
			
			WebElement meterNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/value_edit_text")));
			meterNumber.sendKeys("01050020001");
			
			//Tap On Done 
			
			WebElement doneButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/doneButton")));
			doneButton.click();
			
			//Meter Details Screen
			
			//Enter Name 
			
			WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/value_edit_text")));
			nameField.sendKeys("Smith");
			
             //Tap On Continue 
			
			WebElement contButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/continueButton")));
			contButton.click();
			
			
           //Tap On Done 
			
			WebElement done2Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/primaryButton")));
			done2Button.click();	
			
        }
		
		public static void editbenElectricity() throws InterruptedIOException
		{
			WebDriverWait wait = new WebDriverWait(driver, 80);
			
			
           //clicking on Electricity Tile 
			
			WebElement electricityTile = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Electricity\"]/android.view.ViewGroup/android.widget.TextView\r\n" + "")));
			electricityTile.click();
			
			//Click Existing Beneficary 
			
			WebElement existingBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/initials_text_view")));
			existingBen.click();
			
			//Click Edit 
			WebElement editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
		    editButton.click();
		    
		    //click Ben name 
		    
		    WebElement benNameFiled = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/value_edit_text")));
		    benNameFiled.sendKeys("Smithy");
		    
            //click Ben name 
		    
		    WebElement saveField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/saveButton")));
		    saveField.click();
		    
		    //Clicking on Confirm Button
			WebElement confirmExistingBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
			confirmExistingBen.click();
			
           //Tap On Done 
			
			WebElement doneButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/topActionButton")));
			doneButton.click();
			
			
			
			
			//Delete Beneficary
			
			//Click Edit 
			WebElement editdelButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
		    editdelButton.click();
		    
		    
		    //Click On Delete button 
		    
		    //Click Edit ,Id needs to be changed to xpath ,if id doenot work
			WebElement delButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
		    delButton.click();
		    
		    //Confirm button
		    
		    WebElement confButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		    confButton.click();
		    
		    System.out.println("Testing Branches Working")
		    
		    
		    
		}

		    
		}
		
	