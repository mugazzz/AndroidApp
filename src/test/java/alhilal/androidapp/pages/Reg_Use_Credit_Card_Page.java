package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reg_Use_Credit_Card_Page extends CommonPage{
	private String OTP;
	
	public void Redir_Reg_Cred_Card() {
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_BTNID);
		clickOnElement(REG_CARD_BTNID);
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_HD);
	}
	
	public void Enter_Act_Cred_card() {
		enterText(REG_CARD_NO, Act_Credit_Card_No);
	}
	
	public void Enter_Inact_Cred_Card() {
		enterText(REG_CARD_NO, Inactive_Credit_Card_No);
	}
	
	public void Enter_Expired_Cred_card() {
		enterText(REG_CARD_NO, Exp_Credit_Card_No);
	}
	
	public void Enter_Act_Cred_card_no_pin() {
		enterText(REG_CARD_NO, Act_Credit_Card_No_Pin);
	}
	
	public void Enter_Act_Cred_card_inactive_pin() {
		enterText(REG_CARD_NO, Act_Credit_Card_Inact_Pin);
	}
	
	public void Enter_Act_Cred_card_inactive_pin_no() {
		enterText(REG_CARD_PN, Act_Credit_Card_Inact_Pin_Inact);
	}
	
	
	public void Enter_Act_Cred_Pin_Inact(){
        enterText(REG_CARD_PN, Act_Credit_Card_Pin_Inact);
	}
	
	public void Enter_Act_Cred_Pin(){
        enterText(REG_CARD_PN, Act_Credit_Card_Pin);
	}
	
	public void Enter_Inact_Cred_Pin(){
        enterText(REG_CARD_PN, Inactive_Credit_Card_Pin);
	}
	
	public void Verify_AutoFly() {
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
	}
	
	public void Enter_Incor_Cred_Card(){
        enterText(REG_CARD_NO, Incor_Credit_Card_No);
	}
	
	public void Enter_Incor_Cred_Pin(){
        enterText(REG_CARD_PN, Incor_Credit_Card_Pin);
	}
	
	public void Enter_Inv_Cred_Card(){
        enterText(REG_CARD_NO, Inval_Credit_Card_No);
	}
	
	public void Enter_Inv_Cred_Pin() {
        enterText(REG_CARD_PN, Inval_Credit_Card_Pin);
	}
	
	
	public void Verify_NotFly() throws InterruptedException {
		Thread.sleep(3000);
		//appiumHelpers.assertTrue(elementExists(POPUPALERT), "Validation popup appears");
		appiumHelpers.assertFalse(elementExists(OTP_HD), "Screen navigated to OTP screen");
	}
	
	public void Third_PartyApp() {
		OTP();
		if(elemenDoesnotExists(ALL_SET)){
			if(elemenDoesnotExists(CRE_LOGIN_PIN_LB)){
			clickOnElement(RESEND_OTP);
			OTP();	
		}
		}
		
		/*driver.runAppInBackground(Duration.ofSeconds(3));
		DesiredCapabilities capabilities1 = new DesiredCapabilities();
		capabilities1.setCapability("VERSION", "8.0.0"); 
    	capabilities1.setCapability("deviceName","ce12171ca29fc41504");
    	capabilities1.setCapability("platformName","Android");
		capabilities1.setCapability("appPackage", "com.kriskast.remotedb");
    	capabilities1.setCapability("appActivity", "com.kriskast.remotedb.SplashScreenActivity");
    	AndroidDriver<MobileElement> driver2 = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities1);
		Activity activity = new Activity("com.kriskast.remotedb", "com.kriskast.remotedb.SplashScreenActivity");
		activity.setStopApp(false);
        driver.startActivity(activity);
    	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    	appiumHelpers.waitForVisibilityOfElement(CONFIGBTN);
		driver.findElement(By.id("fab_new")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("text1")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(VENDOR_SELECT).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("et_desc")).sendKeys("SMS");
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("et_host")).sendKeys("10.10.182.44");
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("et_user")).sendKeys("sms");
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("btn_save")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("tv_url")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("et_pass")).sendKeys("sms");
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("button1")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("button1")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[2]")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("et_query")).sendKeys(Query);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.id("btn_execute")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String TotalKey = driver2.findElement(By.xpath("//android.widget.HorizontalScrollView[@index='1']/android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='1']/android.widget.TextView[@index='0']")).getText();
		System.out.println(TotalKey);
		String OTP = TotalKey.substring(55, 62);
		System.out.println(OTP); */
		
	
	}
	
	public void Third_PartyApp1() {
		OTP();
		if(elemenDoesnotExists(SUCCESS_PAGE)){
			clickOnElement(RESEND_OTP);
			OTP();	
		}
	
	}
	
	public void VerifyAllsetScreen() {
		if (elementExists(CRE_LOGIN_PIN_LB)) {
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 clickOnElement(CRE_LOGIN_PIN_CF);
		}
		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
		
	}
	
	public void VerifyAllsetScreen_Key() {
		if (elementExists(CRE_LOGIN_PIN_LB)) {
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			 driver.hideKeyboard();
			 clickOnElement(CRE_LOGIN_PIN_CF);
		}
		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
		
	}
	
	public void VerifyAllsetScreen_Key2() {
		if (elementExists(CRE_LOGIN_PIN_LB)) {
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
			 driver.hideKeyboard();
			 clickOnElement(CRE_LOGIN_PIN_CF);
		}
//		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
//		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
		
	}
	
	public void EnableFingerPrint() {
		try {
			driver.hideKeyboard();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		clickOnElement(ENABLE_FINGERPRINTS);
		appiumHelpers.waitForVisibilityOfElement(FINGERPRINTS_POPUP);
		//appiumHelpers.assertTrue(elementExists(DASHBOARD_HEADING), "Screen navigated to the dashboard screen");
	}
}
