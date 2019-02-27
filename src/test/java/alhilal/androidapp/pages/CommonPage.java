package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;

import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.jna.platform.win32.WinDef.BOOL;

import static alhilal.androidapp.utils.Locators.*;
import static org.junit.Assert.assertThat;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import alhilal.androidapp.utils.AppiumHelpers;
import alhilal.androidapp.utils.ConfigDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;


public class CommonPage extends ConfigDriver {

    protected AppiumHelpers appiumHelpers = new AppiumHelpers();

    public void clickOnElement(By element) {
        appiumHelpers.waitForVisibilityOfElement(element);
        driver.findElement(element).click();
    }

    public void scrollDown(By locator) {
    	 MobileElement slider = driver.findElement(locator);
         Dimension size = slider.getSize();
         TouchAction scroll = new TouchAction(driver).press(ElementOption.element(slider, size.width / 2, -(size.height / 2 + size.height / 6)))
                 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(5)))
                 .moveTo(ElementOption.element(slider, 20, -690)).release();
         scroll.perform();
    }

    public void navigateBack() {
        driver.navigate().back();
    }
    
    public void hideKeyboard() {
    	try 
    	{
    		if(driver.isKeyboardShown()) {
    			driver.hideKeyboard();
        	}
    	}
    	catch (Exception ex)
    	{
    		System.out.println("So "+ex);
    	}
    	
    }
    
    public void enterText(By idLocator, String keys) {
//        driver.findElement(idLocator).sendKeys(keys);
    	driver.findElement(idLocator).clear();
    	clickOnElement(idLocator);
    	enterText_Runtime(idLocator,keys);
    }
    
    public void enterText_Runtime(String text) {
    	String Comm = "adb shell input text \""+ text +"\"";
		try {
			System.out.println("Input value to field -----" + text);
			Process result = Runtime.getRuntime().exec(Comm);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void enterText_Runtime(By idLocator, String text) {
    	String Comm = "adb shell input text \""+ text +"\"";
		try {
			System.out.println("Input value to field -----" + text);
			Process result = Runtime.getRuntime().exec(Comm);
			result.waitFor();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void clearText(By text) {
        driver.findElement(text).clear();
    }
    
    public void relaunchApp() {
        driver.launchApp();
    }

    public void waitForProgressBarToDismiss() {
        try {
            appiumHelpers.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (elementExists(PROGRESS_BAR)) {
            appiumHelpers.waitForInVisibilityOfElement(PROGRESS_BAR);
        }
    }
    
    public boolean elementExists(By locator) {
        appiumHelpers.implicitWait(2);
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        } finally {
            appiumHelpers.implicitWait(IMPLICIT_WAIT_TIME);
        }

    }
    
    public boolean elemenDoesnotExists(By locator) {
        appiumHelpers.implicitWait(2);
        try {
            driver.findElement(locator);
            return false;
        } catch (NoSuchElementException e) {
            return true;
        } finally {
            appiumHelpers.implicitWait(IMPLICIT_WAIT_TIME);
        }

    }
    
    public void Verify_Validation_Message(String Message){
    		waitForProgressBarToDismiss();
    		String xmlFormat = driver.getPageSource();
    		assertThat(xmlFormat, CoreMatchers.containsString(Message));
    	}
    
    public void Verify_Validation_Message_InactiveCIF(String Message ,String Message2){
		waitForProgressBarToDismiss();
		String xmlFormat = driver.getPageSource();
		boolean isValid = xmlFormat.contains(Message);
		boolean isValid2 = xmlFormat.contains(Message2);
		if(!isValid && !isValid2)
		{
			assert false : "Inactive CIF Error Message not shown";
		}
	}
    
    public boolean verifyValidationMessageShown(String Message){
    	 appiumHelpers.implicitWait(2);
		waitForProgressBarToDismiss();
		String xmlFormat = driver.getPageSource();
		boolean isValid = xmlFormat.contains(Message);
		System.out.println("----verifyValidationMessageShown----" + isValid);
		return isValid;
	}
    
    public void OTP() {
    	String path = System.getProperty("user.dir");
		String chromepath = path+"/src/test/build/chromedriver";
		System.setProperty("webdriver.chrome.driver", chromepath);
		driver2 = new ChromeDriver();
		driver2.get(OTPweb);
		driver2.findElement(By.name("userId")).sendKeys(web_username);
		driver2.findElement(By.name("password")).sendKeys(web_password);
		driver2.findElement(By.name("go")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(1);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(0);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.xpath("/html/body/table/tbody/tr[16]/td/div/strong")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.linkText("Reports")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().defaultContent();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(1);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.switchTo().frame(1);
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.linkText("Message Statistics")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.name("button")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver2.findElement(By.xpath("//td[5]/a")).click();
		driver2.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		String OTPMSG = driver2.findElement(By.xpath("//tr[2]/td[3]")).getText();
		System.out.println(OTPMSG);
		driver2.close();
		String OTP = OTPMSG.substring(0, 6);
		System.out.println(OTP);
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		enterText(OPT_FIELD, OTP);
	}
    
    public void Register_using_Credit_Card() {
		driver.resetApp();
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		appiumHelpers.assertTrue(elementExists(REG_CARD_BTN), "Registration using card details button displayed");
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_BTNID);
		clickOnElement(REG_CARD_BTNID);
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_HD);
		enterText(REG_CARD_NO, Act_Credit_Card_No);
		enterText(REG_CARD_PN, Act_Credit_Card_Pin);
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
		OTP();
		if(verifyValidationMessageShown(Incorrect_OTP_Validation_Message))
		{
			System.out.println("----RESEND_OTP----");
			hideKeyboard();
			clickOnElement(RESEND_OTP);
			OTP();	
		}
		else if(elementExists(CRE_LOGIN_PIN_LB)) 
		{
			 System.out.println("----CRE_LOGIN_PIN_LB----");
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 appiumHelpers.waitForVisibilityOfElement(CRE_LOGIN_REPIN_FD);
			 clickOnElement(CRE_LOGIN_REPIN_FD);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 clickOnElement(CRE_LOGIN_PIN_CF);
			 
			 appiumHelpers.waitForVisibilityOfElement(ALL_SET);
				appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
				clickOnElement(SKIP_FINGERPRINT);
		}
		else
		{
			System.out.println("----ALL_SET----");
			appiumHelpers.waitForVisibilityOfElement(ALL_SET);
			appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
			clickOnElement(SKIP_FINGERPRINT);
		}
		
//		if(elemenDoesnotExists(ALL_SET)){
//			if(elemenDoesnotExists(CRE_LOGIN_PIN_LB)){
//			clickOnElement(RESEND_OTP);
//			OTP();	
//		}
//		}
//			if(elementExists(CRE_LOGIN_PIN_LB)) {
//			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
//			 appiumHelpers.waitForVisibilityOfElement(CRE_LOGIN_REPIN_FD);
//			 clickOnElement(CRE_LOGIN_REPIN_FD);
//			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
//			 clickOnElement(CRE_LOGIN_PIN_CF);
//		}
//		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
//		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
//		clickOnElement(SKIP_FINGERPRINT);
		
		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
		appiumHelpers.assertTrue(elementExists(DASHBOARD_HEADING), "Screen navigated to the dashboard screen");
	}
    
    public void Register_using_Card(String Act_Credit_Card_No, String Act_Credit_Card_Pin) {
		driver.resetApp();
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		appiumHelpers.assertTrue(elementExists(REG_CARD_BTN), "Registration using card details button displayed");
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_BTNID);
		clickOnElement(REG_CARD_BTNID);
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_HD);
		enterText(REG_CARD_NO, Act_Credit_Card_No);
		enterText(REG_CARD_PN, Act_Credit_Card_Pin);
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
		OTP();
		if(elemenDoesnotExists(ALL_SET)){
			if(elemenDoesnotExists(CRE_LOGIN_PIN_LB)){
			hideKeyboard();
			clickOnElement(RESEND_OTP);
			OTP();	
		}
		}
			if(elementExists(CRE_LOGIN_PIN_LB)) {
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 appiumHelpers.waitForVisibilityOfElement(CRE_LOGIN_REPIN_FD);
			 clickOnElement(CRE_LOGIN_REPIN_FD);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 clickOnElement(CRE_LOGIN_PIN_CF);
		}
		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
		clickOnElement(SKIP_FINGERPRINT);
		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
		appiumHelpers.assertTrue(elementExists(DASHBOARD_HEADING), "Screen navigated to the dashboard screen");
	}
    
    
    public void Register_Specific_user(String Act_Cust_No_Spec, String Act_SMS_PN_No_Spec) {
		driver.resetApp();
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		clickOnElement(REG_CUS_NO_LINK);
		appiumHelpers.waitForVisibilityOfElement(REG_CUS_NO_LB);
		enterText(REG_CUS_NO_FD, Act_Cust_No_Spec);
		enterText(REG_SMS_PN_FD, Act_SMS_PN_No_Spec);
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
		OTP();
		if(elemenDoesnotExists(ALL_SET)){
			if(elemenDoesnotExists(CRE_LOGIN_PIN_LB)){
			hideKeyboard();
			clickOnElement(RESEND_OTP);
			OTP();	
		}
		}
			if(elementExists(CRE_LOGIN_PIN_LB)) {
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 appiumHelpers.waitForVisibilityOfElement(CRE_LOGIN_REPIN_FD);
			 clickOnElement(CRE_LOGIN_REPIN_FD);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 clickOnElement(CRE_LOGIN_PIN_CF);
		}
		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
		clickOnElement(SKIP_FINGERPRINT);
		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
		appiumHelpers.assertTrue(elementExists(DASHBOARD_HEADING), "Screen navigated to the dashboard screen");
	}
    
    public void Register_Specific_Tpin(String Act_Cust_No_Spec, String Act_TPIN_PN) {
		driver.resetApp();
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		clickOnElement(REG_CUS_NO_LINK);
		appiumHelpers.waitForVisibilityOfElement(REG_CUS_NO_LB);
		enterText(REG_CUS_NO_FD, Act_Cust_No_Spec);
		clickOnElement(REG_CUS_TPIN_TAB);
		enterText(REG_CUS_TPIN_FD, Act_TPIN_PN);
		driver.hideKeyboard();
		clickOnElement(REG_CUS_TPIN_NT); 
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
		OTP();
		
//		if(verifyValidationMessageShown(Incorrect_OTP_Validation_Message))
//		{
//			System.out.println("----RESEND_OTP----");
//			hideKeyboard();
//			clickOnElement(RESEND_OTP);
//			OTP();	
//		}
//		else if(elementExists(CRE_LOGIN_PIN_LB)) 
//		{
//			 System.out.println("----CRE_LOGIN_PIN_LB----");
//			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
//			 appiumHelpers.waitForVisibilityOfElement(CRE_LOGIN_REPIN_FD);
//			 clickOnElement(CRE_LOGIN_REPIN_FD);
//			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
//			 clickOnElement(CRE_LOGIN_PIN_CF);
//			 
//			 appiumHelpers.waitForVisibilityOfElement(ALL_SET);
//				appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
//				clickOnElement(SKIP_FINGERPRINT);
//		}
//		else
//		{
//			System.out.println("----ALL_SET----");
//			appiumHelpers.waitForVisibilityOfElement(ALL_SET);
//			appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
//			clickOnElement(SKIP_FINGERPRINT);
//		}
		
		
		if(elemenDoesnotExists(ALL_SET)){
			if(elemenDoesnotExists(CRE_LOGIN_PIN_LB)){
				hideKeyboard();
			clickOnElement(RESEND_OTP);
			OTP();	
		}
		}
			if(elementExists(CRE_LOGIN_PIN_LB)) {
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 appiumHelpers.waitForVisibilityOfElement(CRE_LOGIN_REPIN_FD);
			 clickOnElement(CRE_LOGIN_REPIN_FD);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 clickOnElement(CRE_LOGIN_PIN_CF);
		}
		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
		clickOnElement(SKIP_FINGERPRINT);
		
		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
		appiumHelpers.assertTrue(elementExists(DASHBOARD_HEADING), "Screen navigated to the dashboard screen");
	}
    
    public void Register_Specific_user_Bio(String Act_Cust_No_Spec, String Act_SMS_PN_No_Spec) {
		driver.resetApp();
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		clickOnElement(REG_CUS_NO_LINK);
		appiumHelpers.waitForVisibilityOfElement(REG_CUS_NO_LB);
		enterText(REG_CUS_NO_FD, Act_Cust_No_Spec);
		enterText(REG_SMS_PN_FD, Act_SMS_PN_No_Spec);
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
		OTP();
		if(elemenDoesnotExists(ALL_SET)){
			if(elemenDoesnotExists(CRE_LOGIN_PIN_LB)){
			hideKeyboard();
			clickOnElement(RESEND_OTP);
			OTP();	
		}
		}
			if(elementExists(CRE_LOGIN_PIN_LB)) {
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 appiumHelpers.waitForVisibilityOfElement(CRE_LOGIN_REPIN_FD);
			 clickOnElement(CRE_LOGIN_REPIN_FD);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 clickOnElement(CRE_LOGIN_PIN_CF);
		}
		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
		clickOnElement(ENABLE_FINGERPRINTS);
//		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
//		appiumHelpers.assertTrue(elementExists(DASHBOARD_HEADING), "Screen navigated to the dashboard screen");
	}
    
    public void Register_using_Card_Bio(String Act_Credit_Card_No, String Act_Credit_Card_Pin) {
		driver.resetApp();
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		appiumHelpers.assertTrue(elementExists(REG_CARD_BTN), "Registration using card details button displayed");
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_BTNID);
		clickOnElement(REG_CARD_BTNID);
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_HD);
		enterText(REG_CARD_NO, Act_Credit_Card_No);
		enterText(REG_CARD_PN, Act_Credit_Card_Pin);
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
		OTP();
		if(elemenDoesnotExists(ALL_SET)){
			if(elemenDoesnotExists(CRE_LOGIN_PIN_LB)){
			hideKeyboard();
			clickOnElement(RESEND_OTP);
			OTP();	
		}
		}
			if(elementExists(CRE_LOGIN_PIN_LB)) {
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 appiumHelpers.waitForVisibilityOfElement(CRE_LOGIN_REPIN_FD);
			 clickOnElement(CRE_LOGIN_REPIN_FD);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 clickOnElement(CRE_LOGIN_PIN_CF);
		}
		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
		clickOnElement(ENABLE_FINGERPRINTS);
		appiumHelpers.waitForVisibilityOfElement(FINGERPRINTS_POPUP_CANCEL);
	}

}
