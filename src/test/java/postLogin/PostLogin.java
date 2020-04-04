package postLogin;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PostLogin {
	public static AndroidDriver<MobileElement> driver;
	// public static DesiredCapabilities cap;
	public static URL url;

	public static void main(String[] args) throws InterruptedException {

		cap();
		prelogin();
		Thread.sleep(5000);
		onceOffPay();
		Thread.sleep(5000);
		//payMutipule();
		// passCode();
	}

	public static void cap() throws InterruptedException {

		DesiredCapabilities cap = new DesiredCapabilities();
		// cap.setCapability("deviceName", "HUAWEI P20");
		cap.setCapability("deviceName", "HUAWEI VNC-L31");
		// cap.setCapability("udid", "BPN7N18409003218");
		cap.setCapability("udid", "4TE7N16B25004195");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "6.0");
		cap.setCapability("appPackage", "com.barclays.absa.banking.uat");
		cap.setCapability("appActivity", "com.barclays.absa.banking.v4.presentation.launch.SplashScreen2faActivity");
		// cap.setCapability("appActivity",
		// "com.barclays.absa.banking.passcode.passcodeLogin.SimplifiedLoginActivity");

		// com.barclays.absa.banking.passcode.passcodeLogin.SimplifiedLoginActivity

		try {
			url = new URL("http://127.0.0.1:4723/wd/hub");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = new AndroidDriver<MobileElement>(url, cap);

		System.out.println("Device Connected");

		// Payment Journey

		Thread.sleep(10000);

	}

	public static void prelogin() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement alreadyBut = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/alreadyWithAbsaButton")));

		// WebElement alreadyBut =
		// driver.findElement(By.id("com.barclays.absa.banking.uat:id/alreadyWithAbsaButton"));
		alreadyBut.click();
		Thread.sleep(2000);
		System.out.print("before login Button");

		// Clicking On Log In Button

		WebElement loginBut = driver.findElement(By.id("com.barclays.absa.banking.uat:id/loginButton"));
		Thread.sleep(1000);
		loginBut.click();
		Thread.sleep(5000);

		// Login Screen

		// Enter Your account Number Field

		WebElement acNumberText = driver.findElement(By.xpath(
				"//android.view.ViewGroup[@content-desc=\"Enter your access account number\"]/android.widget.EditText"));
		Thread.sleep(1000);
		// acNumberText.sendKeys("4048272392");
		acNumberText.sendKeys("4047925550");

		//// Enter Your pin Number Field
		Thread.sleep(1000);
		WebElement pinNumberText = driver.findElement(
				By.xpath("//android.view.ViewGroup[@content-desc=\"Enter your pin\"]/android.widget.EditText"));
		Thread.sleep(1000);
		pinNumberText.sendKeys("25550");

		// Click On -----> Button On Screen

		Thread.sleep(1000);

		// Click On Tick Mark

		// click On Login Button

		WebElement loginButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/loginButton"));
		Thread.sleep(1000);
		loginButton.click();

		// Enter password Character

		// First Character of password
		Thread.sleep(6000);

		if (wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/et_password1")))
				.isEnabled()) {
			Thread.sleep(2000);
			WebElement first = driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password1"));
			first.sendKeys("p");
			System.out.println("Entered first Character");

		}

		if (driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password2")).isEnabled()) {
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password2")).sendKeys("a");
			System.out.println("Entered second Character");
		}

		if (driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password3")).isEnabled()) {
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password3")).sendKeys("s");
			System.out.println("Entered 3rd Character");
		}
		if (driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password4")).isEnabled()) {
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password4")).sendKeys("s");
			System.out.println("Entered 4th Character");
		}
		if (driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password5")).isEnabled()) {
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password5")).sendKeys("w");
			System.out.println("Entered 5th Character");

		}
		if (driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password6")).isEnabled()) {
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password6")).sendKeys("o");
			System.out.println("Entered 6th Character");
		}
		if (driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password7")).isEnabled()) {
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password7")).sendKeys("r");
			System.out.println("Entered 7th Character");
		}

		if (driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password8")).isEnabled()) {
			Thread.sleep(3000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password8")).sendKeys("d");
			System.out.println("Entered 8th Character");
		}

		if (driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password9")).isEnabled()) {
			Thread.sleep(4000);
			driver.findElement(By.id("com.barclays.absa.banking.uat:id/et_password9")).sendKeys("1");
			System.out.println("Entered 9th Character");
		}

		// Click On Continue

		WebElement continueButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/btn_linkDeviceContinue")));
		continueButton.click();

		// Input USSD Field

		WebElement ussdInput = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.phone:id/input_field")));
		ussdInput.sendKeys("1");

		// Click on Send Button
		Thread.sleep(4000);
		WebElement ussdSend = driver.findElement(By.id("android:id/button1"));
		ussdSend.click();

		// Click OK On USSD
		Thread.sleep(10000);
		WebElement okUssd = driver.findElement(By.id("android:id/button1"));
		okUssd.click();

		// set Device name
		Thread.sleep(5000);
		WebElement deviceName = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/value_edit_text")));
		deviceName.sendKeys("Reddy");

		Thread.sleep(3000);
		WebElement nextButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/saveAndContinueButton"));
		nextButton.click();

		// PASSCODE SCREEN

		WebElement firstButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button1_text_view")));
		firstButton.click();

		Thread.sleep(3000);
		WebElement secButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button3_text_view"));
		secButton.click();
		;

		Thread.sleep(3000);
		WebElement thirdButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button5_text_view"));
		thirdButton.click();
		;

		Thread.sleep(3000);
		WebElement fourthButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button7_text_view"));
		fourthButton.click();

		Thread.sleep(3000);
		WebElement fifthButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button9_text_view"));
		fifthButton.click();

		// Thread.sleep(4000);
		// Enter Details on Passcode Second screen

		WebElement screenButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button1_text_view")));
		screenButton.click();

		Thread.sleep(10000);
		WebElement screen2Button = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button3_text_view"));
		screen2Button.click();
		;

		Thread.sleep(4000);
		WebElement screenthirdButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button5_text_view"));
		screenthirdButton.click();
		;

		Thread.sleep(4000);
		WebElement secondfourthButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button7_text_view"));
		secondfourthButton.click();

		Thread.sleep(4000);
		WebElement secondfifthButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button9_text_view"));
		secondfifthButton.click();

		// Finger Print No
		Thread.sleep(7000);
		WebElement radioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.RadioGroup/android.widget.RadioButton[2]\r\n"
						+ "")));
		radioButton.click();

		/// click On Continue Button on Passcode character screen
		Thread.sleep(7000);
		WebElement contButton = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/fingerprintAuthProceedButton")));
		contButton.click();

		// Click On Explore Button

		WebElement exploreButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/exploreButton")));
		exploreButton.click();

		// OK ,GOT IT BUTTON

		WebElement goITButton = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/okGotItButton")));
		goITButton.click();

		// Payment Journey

		/*
		 * Thread.sleep(5000); WebElement payButton =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//android.widget.ImageButton[@content-desc=\"Click here to make a payment\"]"
		 * ))); payButton.click();
		 * 
		 * // Click on Pay new beneficiary
		 * 
		 * Thread.sleep(2000); WebElement payNew =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "//android.view.ViewGroup[@content-desc=\"Go here to add a new beneficiary\"]/android.widget.TextView"
		 * ))); payNew.click();
		 * 
		 * // Enter Beneficiary Details
		 * 
		 * Thread.sleep(3000); WebElement benName =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//android.widget.EditText[@content-desc=\"Enter Beneficiary Name\"]"))
		 * ); benName.sendKeys("Anushka"); driver.navigate().back(); // Select Bank
		 * Thread.sleep(2000); WebElement selectBank =
		 * driver.findElement(By.id("com.barclays.absa.banking.uat:id/selectBankView"));
		 * selectBank.click();
		 * 
		 * // Select ABSA BANK
		 * 
		 * Thread.sleep(5000); WebElement absaRadioButton =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[2]/android.widget.CheckBox\r\n"
		 * + ""))); absaRadioButton.click();
		 * 
		 * // Select a Branch for future Use
		 * 
		 * //Select Branch Thread.sleep(10000); WebElement branchButton =
		 * driver.findElement(By.
		 * xpath("//android.widget.TextView[@content-desc=\"Select Beneficiary Branch\"]"
		 * )); branchButton.click();
		 * 
		 * 
		 * // Select Account Type
		 * 
		 * Thread.sleep(10000); WebElement acTypeButton = driver.findElement(By.xpath(
		 * "//android.widget.TextView[@content-desc=\"Select beneficiary account type, usually cheque or savings\"]\r\n"
		 * + "")); acTypeButton.click();
		 * 
		 * // Select An Account Type Screen
		 * 
		 * Thread.sleep(8000); WebElement acTypeSelectButton =
		 * driver.findElement(By.xpath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView\r\n"
		 * + "")); acTypeSelectButton.click();
		 * 
		 * 
		 * // Enter Account Number Thread.sleep(5000); driver.
		 * findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Their reference\").instance(0))"
		 * ); System.out.println("Scroll Program Working");
		 * 
		 * Thread.sleep(2000); WebElement enterAccountNo =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//android.widget.EditText[@content-desc=\"Enter beneficiary account number\"]"
		 * )));
		 * //driver.findElement(By.xpath("//*[Contains(@text,'Enter account number')]"))
		 * ; enterAccountNo.sendKeys("9051114316");
		 * 
		 * 
		 * // SCROLL THE SCREEN TouchActions action = new TouchActions(driver);
		 * WebElement scrol = null; action.scroll(scrol, 10, 100); action.perform();
		 * 
		 * 
		 * // Enter Their reference
		 * 
		 * 
		 * Thread.sleep(7000); WebElement enterReference =
		 * wait.until(ExpectedConditions.visibilityOfElementLocated(By.
		 * xpath("//android.widget.EditText[@content-desc=\"Enter beneficiary reference\"]"
		 * ))); enterReference.sendKeys("AnuTest");
		 * 
		 * // Enter My Reference
		 * 
		 * Thread.sleep(4000); WebElement enterMyReference =
		 * driver.findElement(By.xpath(
		 * "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText"
		 * )); enterMyReference.sendKeys("SriTest");
		 * 
		 * //Click Next on Adding Beneficiary screen Thread.sleep(4000); WebElement
		 * NextButtonBenScreen =
		 * driver.findElement(By.id("com.barclays.absa.banking.uat:id/nextButton"));
		 * NextButtonBenScreen.click();
		 * 
		 * //Pay Beneficiary after adding the Beneficiary Thread.sleep(4000); WebElement
		 * EnterAmount = driver.findElement(By.
		 * xpath("//android.view.ViewGroup[@content-desc=\"Amount to pay\"]/android.widget.EditText"
		 * )); EnterAmount.sendKeys("50"); // money
		 * 
		 * 
		 * Thread.sleep(6000); driver.
		 * findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))"
		 * ); System.out.println("Scroll Program Working on beneficiary Paying Scren");
		 * 
		 * //Click Next on Beneficiary Payment Details screen Thread.sleep(12000);
		 * WebElement NextButtonPayScreen = driver.findElement(By.
		 * xpath("//android.widget.Button[@content-desc=\"Next button to continue to payment overview\"]"
		 * )); NextButtonPayScreen.click();
		 * 
		 * 
		 * //Confirm Payment
		 * 
		 * Thread.sleep(12000); driver.
		 * findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"None\").instance(0))"
		 * ); System.out.println("Scroll Program Working on Confirm Payment Scren");
		 * 
		 * //Click On Pay on Confirmation Screen
		 * 
		 * Thread.sleep(12000); WebElement PayButtonBenScreen =
		 * driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Pay\"]")
		 * ); PayButtonBenScreen.click();
		 * 
		 * //Click On Accept Button Surecheck
		 * 
		 * Thread.sleep(12000); WebElement AcceptButtonSureCheck =
		 * driver.findElement(By.xpath(
		 * "//android.widget.Button[@content-desc=\"Accept\"]"));
		 * AcceptButtonSureCheck.click();
		 * 
		 * //Click On Done
		 * 
		 * Thread.sleep(12000); WebElement DoneButtonSuccess =
		 * driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]"
		 * )); DoneButtonSuccess.click();
		 * 
		 * Thread.sleep(5000);
		 * 
		 */
	}

//	public static void passCode() throws InterruptedException {
//		WebDriverWait wait = new WebDriverWait(driver, 40);
//
//		WebElement firstButton = wait.until(ExpectedConditions
//				.visibilityOfElementLocated(By.id("com.barclays.absa.banking.uat:id/button1_text_view")));
//		firstButton.click();
//
//		Thread.sleep(500);
//		WebElement secButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button3_text_view"));
//		secButton.click();
//		;
//
//		Thread.sleep(500);
//		WebElement thirdButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button5_text_view"));
//		thirdButton.click();
//		;
//
//		Thread.sleep(500);
//		WebElement fourthButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button7_text_view"));
//		fourthButton.click();
//
//		Thread.sleep(500);
//		WebElement fifthButton = driver.findElement(By.id("com.barclays.absa.banking.uat:id/button9_text_view"));
//		fifthButton.click();
//	}

	public static void payMutipule() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement PayButtonBenScreen = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageButton[@content-desc=\"Click here to make a payment\"]")));
	
		PayButtonBenScreen.click();
		// click multi acc
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Go here to make multiple payments\"]"))
				.click();
		Thread.sleep(6000);
		// 1st acc
		driver.findElement(By.xpath(
				"(//android.view.ViewGroup[@content-desc=\"beneficiary name is Anushka with account number ,9,0,5,1,1,1,4,3,1,6,\"])[1]"))
				.click();
		// 2nd acc
		driver.findElement(By.xpath(
				"(//android.view.ViewGroup[@content-desc=\"beneficiary name is Anushka with account number ,9,0,5,1,1,1,4,3,1,6,\"])[2]"))
				.click();
		// click next
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"))
				.click();
		Thread.sleep(6000);
		// click acc
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.EditText"))
				.click();
		Thread.sleep(6000);
		// click current acc
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]"))
				.click();

		Thread.sleep(6000);
		// click next
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.Button"))
				.click();

		Thread.sleep(6000);
		// enter amount
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.widget.EditText"))
				.sendKeys("50");
		driver.navigate().back();
		Thread.sleep(6000);
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.EditText"))
				.sendKeys("50");
		Thread.sleep(6000);
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))");
		System.out.println("Scroll Program Working");
		Thread.sleep(2000);
		// next
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.widget.Button"))
				.click();

		Thread.sleep(6000);
		// click on pay
		driver.findElement(By.xpath("")).click();

		Thread.sleep(6000);
		// accecpt
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Accept\"]")).click();

		Thread.sleep(6000);
		// done
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Pay\"] ")).click();
	}

	// Pay Once-Off Journey
	public static void onceOffPay() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		WebElement PayButtonBenScreen = wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//android.widget.ImageButton[@content-desc=\"Click here to make a payment\"]")));
		PayButtonBenScreen.click();
		Thread.sleep(6000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Go here to make a once off payment\"]")).click();
        Thread.sleep(6000);
        
		WebElement benName = driver
				.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Enter Beneficiary Name\"]"));
		benName.sendKeys("Anushka");

		// Select Bank
		Thread.sleep(6000);
		WebElement selectBank = driver.findElement(By.id("com.barclays.absa.banking.uat:id/selectBankView"));
		selectBank.click();

		// Select ABSA BANK

		Thread.sleep(8000);
		WebElement absaRadioButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ExpandableListView/android.view.ViewGroup[2]/android.widget.CheckBox")));
		absaRadioButton.click();
		System.out.println("Anu");

		// Select a Branch for future Use
		/*
		 * //Select Branch Thread.sleep(10000); WebElement branchButton =
		 * driver.findElement(By.
		 * xpath("//android.widget.TextView[@content-desc=\"Select Beneficiary Branch\"]"
		 * )); branchButton.click();
		 */

		// Select Account Type

		Thread.sleep(6000);
		WebElement acTypeButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"//android.widget.TextView[@content-desc=\"Select beneficiary account type, usually cheque or savings\"]\r\n"
						+ "")));
		acTypeButton.click();

		// Select An Account Type Screen

		Thread.sleep(6000);
		WebElement acTypeSelectButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ListView/android.widget.RelativeLayout[1]/android.widget.TextView" 
				)));
		acTypeSelectButton.click();

		// Enter Account Number
		Thread.sleep(5000);
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Enter account number\").instance(0))");
		System.out.println("Scroll Program Working");

		Thread.sleep(6000);
		WebElement enterAccountNo = driver
				.findElement(By.xpath("//android.widget.EditText[@content-desc=\"Enter beneficiary account number\"]"));
		// driver.findElement(By.xpath("//*[Contains(@text,'Enter account number')]"));
		enterAccountNo.sendKeys("9051158867");

		/*
		 * // SCROLL THE SCREEN TouchActions action = new TouchActions(driver);
		 * WebElement scrol = null; action.scroll(scrol, 10, 100); action.perform();
		 */

		// Enter Their reference

		Thread.sleep(6000);
		WebElement enterReference = driver.findElement(
				By.xpath("//android.widget.EditText[@content-desc=\"Enter beneficiary reference\"] "));
		enterReference.sendKeys("AnuTest");

		// Enter My Reference

		Thread.sleep(4000);
		WebElement enterMyReference = driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText"));
		enterMyReference.sendKeys("SriTest");

		// Click Next on Adding Beneficiary screen
		Thread.sleep(4000);
		WebElement NextButtonBenScreen = driver.findElement(By.id("com.barclays.absa.banking.uat:id/nextButton"));
		NextButtonBenScreen.click();

		// click Pay from type
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(
				"com.barclays.absa.banking.uat:id/selected_value_text_view")))
				.click();
		Thread.sleep(7000);

		// Select  current acc
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.CheckBox")))
				.click();
		Thread.sleep(6000);
		// enter amount
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.widget.EditText"))
				.sendKeys("50");

		// scroll
		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Next\").instance(0))");
		System.out.println("Scroll Program Working");
		Thread.sleep(2000);
		// click next
		driver.findElement(By.xpath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.view.ViewGroup/android.widget.Button "))
				.click();
		Thread.sleep(6000);
		// scroll pay

		driver.findElementByAndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Pay\").instance(0))");
		System.out.println("Scroll Program Working");
		Thread.sleep(2000);
		// click on pay
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Pay\"]")).click();
		Thread.sleep(6000);
		// click on accept
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Accept\"]")).click();
		Thread.sleep(6000);
		// done
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Done\"]")).click();
		Thread.sleep(6000);

	}

}
