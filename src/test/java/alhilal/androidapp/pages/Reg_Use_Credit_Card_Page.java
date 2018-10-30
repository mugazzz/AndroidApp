package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.Activity;

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
	
	public void Enter_Act_Cred_Pin(){
        enterText(REG_CARD_PN, Act_Credit_Card_Pin);
	}
	
	public void Verify_AutoFly() {
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
	}
	
	public void Enter_Inv_Cred_Card(){
        enterText(REG_CARD_NO, Inval_Credit_Card_No);
	}
	
	public void Enter_Inv_Cred_Pin(){
        enterText(REG_CARD_PN, Inval_Credit_Card_Pin);
	}
	
	public void Verify_NotFly() throws InterruptedException {
		Thread.sleep(3000);
		appiumHelpers.assertFalse(elementExists(OTP_HD), "Screen navigated to OTP screen");
	}
	
	public void Third_PartyApp() throws MalformedURLException {
		//driver.runAppInBackground(Duration.ofSeconds(3));
//		DesiredCapabilities capabilities1 = new DesiredCapabilities();
//		capabilities1.setCapability("VERSION", "8.0.0"); 
//    	capabilities1.setCapability("deviceName","ce12171ca29fc41504");
//    	capabilities1.setCapability("platformName","Android");
//		capabilities1.setCapability("appPackage", "com.kriskast.remotedb");
//    	capabilities1.setCapability("appActivity", "com.kriskast.remotedb.SplashScreenActivity");
//    	 AppiumDriver<MobileElement> driver2 = new AppiumDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities1);
		Activity activity = new Activity("com.kriskast.remotedb", "com.kriskast.remotedb.SplashScreenActivity");
		activity.setStopApp(false);
        driver.startActivity(activity);
    	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("fab_new")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("text1")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(VENDOR_SELECT).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("et_desc")).sendKeys("SMS");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("et_host")).sendKeys("10.10.182.44");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("et_user")).sendKeys("sms");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("btn_save")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("tv_url")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("et_pass")).sendKeys("sms");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("button1")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("button1")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.support.v7.app.ActionBar.Tab[2]")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("et_query")).sendKeys(Query);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.id("btn_execute")).click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String TotalKey = driver.findElement(By.xpath("//android.widget.HorizontalScrollView[@index='1']/android.support.v7.widget.RecyclerView[@index='0']/android.widget.LinearLayout[@index='0']/android.widget.FrameLayout[@index='1']/android.widget.TextView[@index='0']")).getText();
		System.out.println(TotalKey);
		String OTP = TotalKey.substring(55, 62);
		System.out.println(OTP);
	}
	
	public void EnterOTP() {
		Activity activity = new Activity("com.ahb.mb.dev", "com.ahb.mb.dev.AlHilalBank");
        activity.setStopApp(false);
        driver.startActivity(activity);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		enterText(OPT_FIELD, OTP);
	}
}
