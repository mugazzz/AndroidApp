package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.appium.java_client.MobileElement;

public class Account_Section_Page extends CommonPage{

	public void Verify_Current_Accounts_List() {
		String Acutal_numer = driver.findElement(ACT_CURRENT_ACC).getText();
		System.out.println("ASP1: "+ Acutal_numer);
		clickOnElement(ACT_CURRENT_ACC);
		appiumHelpers.waitForVisibilityOfElement(AACCOUNT_LABEL);
		String Acc_number = driver.findElement(ACCO_NUMBER).getText();
		System.out.println("ASP: "+Acc_number);
		//assert Acc_number.equals(Acutal_numer): "Account number is equal";
		String acc_bal = driver.findElement(CARD_BAL).getText();
		String acc_balc = acc_bal.substring(0, acc_bal.length()-4);
		System.out.println("Account Balance: "+ acc_balc);
		try {
			float acc_balf = Float.parseFloat(acc_balc);
			assert acc_balf >=0: "Account number is not working";
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		
	}
	
	public void Verify_Saving_Accounts_List() {
		String Acutal_numer = driver.findElement(ACT_SAVING_ACC).getText();
		System.out.println("ASP1: "+ Acutal_numer);
		clickOnElement(ACT_SAVING_ACC);
		appiumHelpers.waitForVisibilityOfElement(AACCOUNT_LABEL);
		String Acc_number = driver.findElement(ACCO_NUMBER).getText();
		System.out.println("ASP: "+Acc_number);
		assert Acc_number.equals(Acutal_numer): "Account number is equal";
		String acc_bal = driver.findElement(CARD_BAL).getText();
		String acc_balc = acc_bal.substring(0, acc_bal.length()-4);
		System.out.println("Account Balance: "+ acc_balc);
		try {
			float acc_balf = Float.parseFloat(acc_balc);
			assert acc_balf >=0: "Account number is not working";
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		
	}
	
	public void Verify_current_addition_details() {
		String Acc_number = driver.findElement(ACCO_NUMBER).getText();
		String acc_bal = driver.findElement(CARD_BAL).getText();
		clickOnElement(INFO_BTN);
		appiumHelpers.waitForVisibilityOfElement(ACC_DETAIL);
		String acc_bala = driver.findElement(ACC_AMT).getText();
		assert acc_bala.equals(acc_bala): "Account balance is different";
		appiumHelpers.assertTrue(elementExists(IBAN), "IBAN is visible");
		String IBANValue = driver.findElement(IBANV).getText();
		System.out.println("IBAN value: "+IBANValue);
		assert IBANValue.equals(IBANValue) : "IBAN value is not equal";
		appiumHelpers.assertTrue(elementExists(Account_Number_D), "Account number is visible");
		String Acc_Numner = driver.findElement(Account_Number_D_V).getText();
		System.out.println("Account number value: "+Acc_Numner);
		assert Acc_Numner.length() != 0 : "Account number is not expected";
		appiumHelpers.assertTrue(elementExists(SCodeD), "SWIFT Code is visible");
		String SWIFT_Code = driver.findElement(SCodeD_V).getText();
		System.out.println("Swift Code number value: "+SWIFT_Code);
		assert SWIFT_Code.length() != 0 : "SWIFT_Code is not expected";
		appiumHelpers.assertTrue(elementExists(Account_holderD), "Account holder name is visible");
		String Account_holder = driver.findElement(Account_holderD_v).getText();
		System.out.println("Account holder value: "+Account_holder);
		assert Account_holder.length() != 0 : "Account holder name is not expected";
		appiumHelpers.assertTrue(elementExists(Account_holder_CIF), "Account holder CIF is visible");
		String Account_holder_CIF = driver.findElement(Account_holder_CIF_v).getText();
		System.out.println("Account holder CIF value: "+Account_holder_CIF);
		assert Account_holder_CIF.length() != 0 : "Account holder CIF is not expected";
		appiumHelpers.assertTrue(elementExists(Branch), "Account holder CIF is visible");
		String Branch = driver.findElement(BranchV).getText();
		System.out.println("Branch value: "+Branch);
		assert Branch.length() != 0 : "Branch value is not expected";
		if (elementExists(LINKEDDEBIT)) {
			appiumHelpers.assertTrue(elementExists(LINKD1), "Linked Debit card is visible");
			String LinkedCard = driver.findElement(LINKD1).getText();
			assert LinkedCard.length() != 0: "Linked Credit card is not working";
			System.out.println("Card Number is: "+driver.findElement(LINKD1).getText());
			String LinkedStatus = driver.findElement(LINKD1V).getText();
			assert LinkedStatus.length() != 0: "Linked Credit card status is not working";
			System.out.println("Linked Debit card status: "+ driver.findElement(LINKD1V).getText());
		}
	}
	
	public void Verify_saving_addition_details() {
		String Acc_number = driver.findElement(ACCO_NUMBER).getText();
		String acc_bal = driver.findElement(CARD_BAL).getText();
		clickOnElement(INFO_BTN);
		appiumHelpers.waitForVisibilityOfElement(ACC_DETAIL);
		String acc_bala = driver.findElement(ACC_AMT).getText();
		assert acc_bala.equals(acc_bala): "Account balance is different";
		appiumHelpers.assertTrue(elementExists(IBAN), "IBAN is visible");
		String IBANValue = driver.findElement(IBANV).getText();
		System.out.println("IBAN value: "+IBANValue);
		assert IBANValue.equals(IBANValue) : "IBAN value is not equal";
		appiumHelpers.assertTrue(elementExists(Account_Number_D), "Account number is visible");
		String Acc_Numner = driver.findElement(Account_Number_D_V).getText();
		System.out.println("Account number value: "+Acc_Numner);
		assert Acc_Numner.length() != 0 : "Account number is not expected";
		appiumHelpers.assertTrue(elementExists(SCodeD), "SWIFT Code is visible");
		String SWIFT_Code = driver.findElement(SCodeD_V).getText();
		System.out.println("Swift Code number value: "+SWIFT_Code);
		assert SWIFT_Code.length() != 0 : "SWIFT_Code is not expected";
		appiumHelpers.assertTrue(elementExists(Account_holderD), "Account holder name is visible");
		String Account_holder = driver.findElement(Account_holderD_v).getText();
		System.out.println("Account holder value: "+Account_holder);
		assert Account_holder.length() != 0 : "Account holder name is not expected";
		appiumHelpers.assertTrue(elementExists(Account_holder_CIF), "Account holder CIF is visible");
		String Account_holder_CIF = driver.findElement(Account_holder_CIF_v).getText();
		System.out.println("Account holder CIF value: "+Account_holder_CIF);
		assert Account_holder_CIF.length() != 0 : "Account holder CIF is not expected";
		appiumHelpers.assertTrue(elementExists(Branch), "Account holder CIF is visible");
		String Branch = driver.findElement(BranchV).getText();
		System.out.println("Branch value: "+Branch);
		assert Branch.length() != 0 : "Branch value is not expected";
		if (elementExists(LINKEDDEBIT)) {
			appiumHelpers.assertTrue(elementExists(LINKD1), "Linked Debit card is visible");
			String LinkedCard = driver.findElement(LINKD1).getText();
			assert LinkedCard.length() != 0: "Linked Credit card is not working";
			System.out.println("Card Number is: "+driver.findElement(LINKD1).getText());
			String LinkedStatus = driver.findElement(LINKD1V).getText();
			assert LinkedStatus.length() != 0: "Linked Credit card status is not working";
			System.out.println("Linked Debit card status: "+ driver.findElement(LINKD1V).getText());
		}
	}
	
	public void Navigate_Back_Dashboard() {
		for(int i =0; i<=1; i++) {
			clickOnElement(GO_BACK);
		}
		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
		clickOnElement(MINIMIZE_CHART);
	}
	
	public void Register_Specific_user() {
			driver.resetApp();
			appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
			appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
			clickOnElement(REG_CUS_NO_LINK);
			appiumHelpers.waitForVisibilityOfElement(REG_CUS_NO_LB);
			enterText(REG_CUS_NO_FD, Act_Cust_No_Spec_Acc);
			enterText(REG_SMS_PN_FD, Act_SMS_PN_Spec_Acc);
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
	
		public void Verify_Absence_Account_Section() {
			appiumHelpers.assertFalse(elementExists(ACCOUNT_LABEL), "My Account Section is available");
		}

}
