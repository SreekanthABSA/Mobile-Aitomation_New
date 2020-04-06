package com.org.Mobile.MobileTest;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class AppTest {
	public static AndroidDriver<MobileElement> driver;
	
	public static URL url;

	public static void main(String[] args) throws InterruptedException {

		cap();
		prelogin();
		Thread.sleep(5000);
	}

	public static void cap() throws InterruptedException {

		DesiredCapabilities cap = new DesiredCapabilities();
		 cap.setCapability("deviceName", "HUAWEI P20");
		 cap.setCapability("udid", "BPN7N18409003218");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9.0");
		cap.setCapability("appPackage", "com.barclays.absa.banking.uat");
		cap.setCapability("appActivity", "com.barclays.absa.banking.v4.presentation.launch.SplashScreen2faActivity");
		
		
		// com.barclays.absa.banking.passcode.passcodeLogin.SimplifiedLoginActivity

		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			
			e.printStackTrace();
		}
		driver = new AndroidDriver<MobileElement>(url, cap);

		System.out.println("Device Connected");

		

		Thread.sleep(3000);

	}

	public static void prelogin() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement alreadyBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/alreadyWithAbsaButton")));
		alreadyBut.click();
		Thread.sleep(2000);
		System.out.print("before login Button");

		// Clicking On Log In Button

		WebElement loginBut = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/loginButton")));
		Thread.sleep(1000);
		loginBut.click();
		Thread.sleep(5000);

		// Login Screen

		       // Enter Your account Number Field

		WebElement acNumberText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"Enter your access account number\"]/android.widget.EditText")));
		Thread.sleep(1000);
		 acNumberText.sendKeys("4048270853");
		
		      // Enter Your pin Number Field
		Thread.sleep(1000);
		WebElement pinNumberText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.view.ViewGroup[@content-desc=\"Enter your pin\"]/android.widget.EditText")));
		Thread.sleep(1000);
		pinNumberText.sendKeys("70853");
        Thread.sleep(3000);
		

		       // click On Login Button

		WebElement loginButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/loginButton")));
		Thread.sleep(1000);
		loginButton.click();

		      // Enter password Characters

		
		Thread.sleep(5000);

		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password1"))).isEnabled())
		{
			Thread.sleep(2000);
			WebElement first = driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password1"));
			first.sendKeys("p");
			System.out.println("Entered first Character");

		}

		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password2"))).isEnabled())
		{
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password2")).sendKeys("a");
			System.out.println("Entered second Character");
		}

		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password3"))).isEnabled())
		{
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password3")).sendKeys("s");
			System.out.println("Entered 3rd Character");
		}
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password4"))).isEnabled())
		{
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password4")).sendKeys("s");
			System.out.println("Entered 4th Character");
		}
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password5"))).isEnabled()) 
		{
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password5")).sendKeys("w");
			System.out.println("Entered 5th Character");

		}
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password6"))).isEnabled()) 
		{
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password6")).sendKeys("o");
			System.out.println("Entered 6th Character");
		}
		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password7"))).isEnabled()) 
		{
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password7")).sendKeys("r");
			System.out.println("Entered 7th Character");
		}

		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password8"))).isEnabled()) 
		{
			Thread.sleep(2000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password8")).sendKeys("d");
			System.out.println("Entered 8th Character");
		}

		if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password9"))).isEnabled()) 
		{
			Thread.sleep(2000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password9")).sendKeys("1");
			System.out.println("Entered 9th Character");
		}

		// Click On Continue

		WebElement continueButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/btn_linkDeviceContinue")));
		continueButton.click();

		// Input USSD Field

		WebElement ussdInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.phone:id/input_field")));
		ussdInput.sendKeys("1");

		// Click on Send Button
		Thread.sleep(3000);
		WebElement ussdSend = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		ussdSend.click();

		// Click OK On USSD
		Thread.sleep(3000);
		WebElement okUssd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button1")));
		okUssd.click();

		// set Device name
		Thread.sleep(3000);
		WebElement deviceName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/value_edit_text")));
		deviceName.sendKeys("Reddy");

		Thread.sleep(3000);
		WebElement nextButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/saveAndContinueButton")));
		nextButton.click();

		// PASSCODE SCREEN

		WebElement firstButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button1_text_view")));
		firstButton.click();

		Thread.sleep(2000);
		WebElement secButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button3_text_view")));
		secButton.click();
		

		Thread.sleep(2000);
		WebElement thirdButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button5_text_view")));
		thirdButton.click();
		;

		Thread.sleep(2000);
		WebElement fourthButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button7_text_view")));
		fourthButton.click();

		Thread.sleep(3000);
		WebElement fifthButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button9_text_view")));
		fifthButton.click();

		// Thread.sleep(4000);
		// Enter Details on Passcode Second screen

		WebElement screenButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button1_text_view")));
		screenButton.click();

		Thread.sleep(5000);
		WebElement screen2Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button3_text_view")));
		screen2Button.click();
		

		Thread.sleep(2000);
		WebElement screenthirdButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button5_text_view")));
		screenthirdButton.click();
		

		Thread.sleep(2000);
		WebElement secondfourthButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button7_text_view")));
		secondfourthButton.click();

		Thread.sleep(4000);
		WebElement secondfifthButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button9_text_view")));
		secondfifthButton.click();

		// Finger Print No
		Thread.sleep(3000);
		WebElement radioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RadioGroup/android.widget.RadioButton[2]\r\n"+ "")));
		radioButton.click();

		/// click On Continue Button on Passcode character screen
		Thread.sleep(3000);
		WebElement contButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/fingerprintAuthProceedButton")));
		contButton.click();

		// Click On Explore Button

		WebElement exploreButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/exploreButton")));
		exploreButton.click();

		// OK ,GOT IT BUTTON

		WebElement goITButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/okGotItButton")));
		goITButton.click();
}
}


