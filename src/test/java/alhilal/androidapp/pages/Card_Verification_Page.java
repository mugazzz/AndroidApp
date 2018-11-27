package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Card_Verification_Page extends CommonPage{

	public void Check_For_MyCards() {
		appiumHelpers.waitForVisibilityOfElement(CARD_LABEL);
		appiumHelpers.assertTrue(elementExists(CARD_LABEL), "Is available");
	}
	
	public void Navigate_Card_Detail(){
		clickOnElement(VISA_GOLD);
		appiumHelpers.waitForVisibilityOfElement(CARD_SLIDE);
	}
	
	public void Verify_Card_Details() {
		appiumHelpers.assertTrue(elementExists(AVL_CRD_LMT_LB), "Available Card limit is visible");
		String Available_Card_Limt = driver.findElement(AVL_CRD_LMT_VL).getText();
		System.out.println("Available Card Limit: "+Available_Card_Limt);
		appiumHelpers.assertTrue(elementExists(OUT_STANDING_LB), "Total OutStanding balance is visible");
		String OutStanding = driver.findElement(OUT_STANDING_VL).getText();
		System.out.println("Total OutStanding is: "+OutStanding);
		String Card_Number = driver.findElement(CARD_NUMBER).getText();
		System.out.println("Card Number is: "+Card_Number);
		String Card_Holder_Name = driver.findElement(CARD_HOLD_NAME).getText();
		System.out.println("Card Holder Name: "+Card_Holder_Name);
	}
	
	public void Verify_Add_Card_Details() {
		String Available_Card_Limt = driver.findElement(AVL_CRD_LMT_VL).getText();
		String Card_Number = driver.findElement(CARD_NUMBER).getText();
		String Ac_card_number = Card_Number.substring(10, 19);
		System.out.println("trimmed number: "+Ac_card_number);
		String OutStanding = driver.findElement(OUT_STANDING_VL).getText();
		String Card_Holder_Name = driver.findElement(CARD_HOLD_NAME).getText();
		clickOnElement(INFO_BTN);
		appiumHelpers.waitForVisibilityOfElement(ADD_CARD_HD);
		String Ac_card_number_A = driver.findElement(CARD_NUM).getText();
		assert Ac_card_number.equals(Ac_card_number_A): "Card number is not equal";
		String Amount = driver.findElement(ACC_AMOUNT).getText();
		assert Amount.equals(Available_Card_Limt) : "Available card limit is not equal";
		String Available_Card_Limt_A = driver.findElement(AVL_CRD_LMT_VL_A).getText();
		assert Available_Card_Limt_A.equals(Available_Card_Limt) : "Available card limit is not equal";
		String OutStanding_A = driver.findElement(OUT_STANDING_VL_A ).getText();
		assert OutStanding_A.equals(OutStanding) : "Outstanding card limit is not equal";
		appiumHelpers.assertTrue(elementExists(STAT_BAL_LB), "Statement Balance is visible");
		String Statement_Balance = driver.findElement(STAT_BAL_FD).getText();
		String Statement_Balances = Statement_Balance.substring(0, Statement_Balance.length()-4);
		try {
			Float sf = Float.parseFloat(Statement_Balances);
			assert sf>=0 : "Statement Balance is not working fine";
			System.out.println("Statement Balance: "+Statement_Balance);
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		appiumHelpers.assertTrue(elementExists(STAT_DATE_LB), "Statement Date is visible");
		String Statement_Date = driver.findElement(STAT_DATE_FD).getText();
		assert Statement_Date.length() !=0 : "Statement Date is not working";
		System.out.println("Statement Date: "+Statement_Date);
		appiumHelpers.assertTrue(elementExists(MIN_AMT_LB), "Minimum Amount is visible");
		String Minimum_amount_due = driver.findElement(MIN_AMT_FD).getText();
		String Minimum_amount_dues = Statement_Balance.substring(0, Statement_Balance.length()-4);
		try {
			Float mf = Float.parseFloat(Minimum_amount_dues);
			assert mf>=0 : "Minimum Amount is not working fine";
			System.out.println("Minimum Amount Due: "+Minimum_amount_due);
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		appiumHelpers.assertTrue(elementExists(CARD_OWNER_A_LB), "Card Owner is visible");
		String Card_Owner = driver.findElement(CARD_OWNER_A_FD).getText();
		System.out.println("Card Owner: "+Card_Owner);
		assert Card_Holder_Name.equals(Card_Owner) : "Card Owner name is not equal";
		appiumHelpers.assertTrue(elementExists(CARD_STATUS_LB), "Card Status is visible");
		String Card_Status = driver.findElement(CARD_STATUS_FD).getText();
		System.out.println("Card Status: "+Card_Status);
		assert Card_Status.length() !=0 : "Card Status is not working";
		appiumHelpers.assertTrue(elementExists(TOT_CARD_LMT_LB), "Total Card Limit is visible");
		String Total_Card_Limit = driver.findElement(TOT_CARD_LMT_FD).getText();
		try {
			Float lf = Float.parseFloat(Total_Card_Limit);
			assert lf>=0 : "Total Card Limit is not working fine";
			System.out.println("Total Card Limit: "+Total_Card_Limit);
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		
	}
	
	public void Verify_Login_check() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		 if(elementExists(REG_CARD_BTN)) {
			 Register_using_Customer_No();
		 }
		 else {
			 System.out.println("User already logged in");
		 }
	}
	
	public void Verify_Absence_Card_Section() {
		appiumHelpers.assertFalse(elementExists(CARD_LABEL), "My Card Section is available");
	}
	
	public void Verify_Presence_Bill_Payment(){
		appiumHelpers.assertTrue(elementExists(BILL_PAYMENT), "Bill payment button is shown");
	}
	
	public void Verify_Absence_Bill_Payment(){
		appiumHelpers.assertFalse(elementExists(BILL_PAYMENT), "Bill payment button is not shown");
	}
	
	public void Register_Specific_user() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		clickOnElement(REG_CUS_NO_LINK);
		appiumHelpers.waitForVisibilityOfElement(REG_CUS_NO_LB);
		enterText(REG_CUS_NO_FD, Act_Cust_No_Spec_Card);
		enterText(REG_SMS_PN_FD, Act_SMS_PN_Spec_Card);
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
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
		if (elementExists(CRE_LOGIN_PIN_LB)) {
			 enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
			 enterText(CRE_LOGIN_REPIN_FD, Enter_Pin);
			 clickOnElement(CRE_LOGIN_PIN_CF);
		}
		appiumHelpers.waitForVisibilityOfElement(ALL_SET);
		appiumHelpers.assertTrue(elementExists(ALL_SET), "Screen navigated to All set screen");
		clickOnElement(SKIP_FINGERPRINT);
		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
		appiumHelpers.assertTrue(elementExists(DASHBOARD_HEADING), "Screen navigated to the dashboard screen");
	}
}
