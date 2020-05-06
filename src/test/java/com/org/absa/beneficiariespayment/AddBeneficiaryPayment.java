package com.org.absa.beneficiariespayment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.org.Mobile.MobileTest.AppTest;


public class AddBeneficiaryPayment extends AppTest {

	public static void main(String[] args) {
		
		try {
			
			cap();
			Thread.sleep(5000);
			prelogin();
			Thread.sleep(5000);
			addbenPayment();
			Thread.sleep(5000);
			
		    
		} 
		catch (Exception e) 
		{
			System.out.println(e);
		}
	   
	    }
	
	public static void addbenPayment() throws InterruptedException 
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 80);
		
		//Click On Menu
		
		WebElement menuButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.FrameLayout[@content-desc=\"Menu\"]/android.view.ViewGroup/android.widget.TextView")));
		menuButton.click();
		
		
		//clicking on Beneficiaries Button 
		
		WebElement beneficiaryButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView")));
		beneficiaryButton.click();
		
		//Clicking Add Beneficiary 
		
		WebElement addBen = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/caption_text_view")));
		addBen.click();
		
		//Enter Beneficiary 
		WebElement benName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@content-desc=\"Enter Beneficiary Name\"]\r\n" + "")));
		benName.sendKeys("Anushka");
		
		//Select Bank 
		WebElement selBank = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"Select a bank button. Choose the bank that the beneficiary uses\"]/android.widget.ImageView\r\n" +  "")));
		selBank.click();
		
		//Select A Bank 
		WebElement selABank = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[2]/android.widget.CheckBox ")));
		selABank.click();
		
		//Select Account type
		
		WebElement selaCType = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"Select beneficiary account type, usually cheque or savings\"]/android.widget.ImageView\r\n" + "")));
		selaCType.click();
		
		//Select Account type
		
	   WebElement selChequeAccount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView\r\n" +  "")));
	   selChequeAccount.click();
	   
		//Enter Account Number  
		
		WebElement inputAcNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@content-desc=\"Enter beneficiary account number\"]")));
		inputAcNumber.sendKeys("9051114324");
		
		//enter Their Refernce
		driver.findElementByAndroidUIAutomator(	"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Their reference\").instance(0))");
		WebElement therreference = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.EditText[@content-desc=\"Enter beneficiary reference\"]\r\n" + "")));
		therreference.sendKeys("AnushkaShetty");
		
		
		
		//Enter My Reference
		
		WebElement myReference = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[5]/android.widget.EditText")));
		myReference.sendKeys("Ileana");
		
		//Click Next
		
		WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/nextButton")));
	    nextButton.click();
		
		//Enter Amount
	    WebElement enterAmount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"Amount to pay\"]/android.widget.EditText\r\n" + "")));
	    enterAmount.sendKeys("1000");
	    
	    //Click Next 
	    
	    driver.findElementByAndroidUIAutomator(	"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))").click();
		
       //Click Pay 
	    
	    driver.findElementByAndroidUIAutomator(	"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Pay\").instance(0))").click();
	    
	    //Accept Surecheck
	    
	    WebElement sureCheckButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/btn_positive")));
	    sureCheckButton.click();
	    
	    //Done Button
	    
	    WebElement doneButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/bottomActionButton")));
	    doneButton.click();
	    
	    //May Be later 
	    WebElement maybeLater = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/maybeLaterTextView")));
	    maybeLater.click();
		System.out.println("Added Beneficiary succesfully");
		
		
	}
	}