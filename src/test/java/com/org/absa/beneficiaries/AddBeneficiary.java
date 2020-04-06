package com.org.absa.beneficiaries;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.Mobile.MobileTest.*;


public class AddBeneficiary  extends AppTest {

	public static void main(String[] args) {
		
		try {
			
			cap();
			Thread.sleep(5000);
			prelogin();
			Thread.sleep(5000);
			addbenAirtime();
			Thread.sleep(5000);
			editBenAirtime();
			Thread.sleep(5000);
			
		    
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	   
	    }
	
	public static void addbenAirtime() throws InterruptedException 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 80);
		
		//Click On Menu
		
		WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
		menuButton.click();
		
		
		//clicking on Beneficiaries Button 
		
		WebElement beneficiaryButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")));
		beneficiaryButton.click();
		
		//Click Prepaid  button from the List of payments , prepaid, cashSend, Electricity
		
		WebElement prepaidButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Prepaid\"]/android.view.ViewGroup/android.widget.TextView")));
		prepaidButton.click();		
		
		//Click Add Beneficiary 
		
		WebElement addBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/caption_text_view")));
		addBen.click();
		
		//Buy Prepaid Screen
		
		Thread.sleep(6000);
		WebElement mobnumText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText")));
		mobnumText.sendKeys("0641234567");
		
		//Enter Beneficiary Reference 
		
		WebElement beneText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText\r\n" + "")));
		beneText.sendKeys("Autotest");
		
		//Click Mobile Network  Operator 
		
		WebElement mobNetwork = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageView[@content-desc=\"Custom icon for view\"]\r\n" + "")));
		mobNetwork.click();
		
		//Select Mobile Network  Operator 
		
				WebElement selOperator = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.CheckBox")));
				selOperator.click();
				
	   //Click Continue Button 
				
	    WebElement contButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/continueAirtimeBeneficiaryAddButton")));
		contButton.click();	
		
		
		//Click SAVE Button 
		
	    WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/saveBeneficiaryButton")));
		saveButton.click();
		
		//Home Button
		
		WebElement homeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/topActionButton")));
        homeButton.click();	
	}
	public static void editBenAirtime() throws InterruptedException 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 80);
		
		//Click On Menu
		
		WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView”")));
		menuButton.click();
		
		
		//clicking on Beneficiaries Button 
		
		WebElement beneficiaryButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView”")));
		beneficiaryButton.click();
		
		//Click Prepaid  button from the List of payments , prepaid, cashSend, Electricity
		
		WebElement prepaidButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//androidx.appcompat.app.ActionBar.Tab[@content-desc=\"Prepaid\"]/android.view.ViewGroup/android.widget.TextView”")));
		prepaidButton.click();	
		
		//Clicking on existing Ben
		
		WebElement existingBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView[1]”")));
		existingBen.click();	
		
		//Clicking Edit Button 
		
		WebElement editButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
        editButton.click();
        
        //Editing the Name 
        
        WebElement editBenName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.EditText\r\n" + "”")));
        editBenName.sendKeys("Nana");
        
        //Click Save 
        
        WebElement saveButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/saveButton")));
        saveButton.click();
         
         //click Confirm
        
        WebElement confButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
        confButton.click();
        
        //Delete Beneficary 
        
        WebElement editdelButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
        editdelButton.click();
        
        
        //Click Delete Button
        
        WebElement delButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/action_edit")));
        delButton.click();
        
        //Confirm Deletion Of Beneficiary
        
        WebElement confDelButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
        confDelButton.click();
        
		
		
	}
}
