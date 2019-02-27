package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.util.List;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;

public class Card_Verification_Page extends CommonPage{

	public void Check_For_MyCards() {
		//scrollDown(ACT_SAVING_ACC);
		//scrollDown(CARD_LABEL);
		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_SEGMENT);
		appiumHelpers.waitForVisibilityOfElement(CARD_LABEL);
//		
//		List <MobileElement> listElements = driver.findElements(By.id("lblAvailableExtAccounts"));
//		
////		listElements.stream().filter(x -> x.)
//		if(listElements.contains(driver.findElement(CARD_LABEL)))
//		{
//			
//		}
//
//		for(MobileElement el : listElements){
//		   if(el.getText().equalsIgnoreCase(expected)){
//		       // do some validation //
//		   }
//		}
//		if(!driver.findElements(CARD_LABEL).isEmpty()) 
//		{
//			appiumHelpers.assertTrue(elementExists(CARD_LABEL), "Is available");
//		}
//		else
//		{
//			
//		}
		
	}
	
	public void Navigate_Card_Detail(){
		scrollDown(CARD_LABEL);
		clickOnElement(VISA_GOLD);
		//appiumHelpers.waitForVisibilityOfElement(CARD_SLIDE);
	}
	
	public void Verify_Card_Details() {
		
        //appiumHelpers.assertTrue(elementExists(AVL_CRD_LMT_LB), "Available Card limit is visible");
		String Available_Card_Limt = driver.findElement(AVL_CRD_LMT_VL).getText();
		System.out.println("Available Card Limit: "+Available_Card_Limt);
		//appiumHelpers.assertTrue(elementExists(OUT_STANDING_LB), "Total OutStanding balance is visible");
		String OutStanding = driver.findElement(OUT_STANDING_VL).getText();
		System.out.println("Total OutStanding is: "+OutStanding);
		String Card_Number = driver.findElement(CARD_NUMBER).getText();
		System.out.println("Card Number is: "+Card_Number);
		String Card_Holder_Name = driver.findElement(CARD_HOLD_NAME).getText();
		System.out.println("Card Holder Name: "+Card_Holder_Name);
		
	}
	
	public void Verify_Add_Card_Details() {
		
		String Available_Card_Limt = getValueForKeyInSegment(CARD_SEG_ACC_DET,CARD_SEG_ACC_DET_GROUP,CARD_SEG_ACC_DET_GROUP_KEY,CARD_SEG_ACC_DET_GROUP_VALUE,CardDetail_Limit_Txt);
		String OutStanding = getValueForKeyInSegment(CARD_SEG_ACC_DET,CARD_SEG_ACC_DET_GROUP,CARD_SEG_ACC_DET_GROUP_KEY,CARD_SEG_ACC_DET_GROUP_VALUE,Tot_OutStanding_Bal_Txt);
		String OutStanding_Amt = "-"+OutStanding;
		String Card_Number = driver.findElement(CARD_NUMBER).getText();
		System.out.println("Card number: "+Card_Number);
		String Card_Holder_Name = driver.findElement(CARD_HOLD_NAME).getText();
		
		clickOnElement(INFO_BTN);
		appiumHelpers.waitForVisibilityOfElement(ADD_CARD_HD);
		
	// Validate available card limit in card details screen
		String Available_Card_Limt_Detail_Screen = getValueForKeyInSegment(CARD_DET_ACC_INFO,CARD_DET_ACC_INFO_GROUP,SEGMENT_ITEM_KEY,SEGMENT_ITEM_VALUE,CardDetail_Limit_Txt);
		System.out.println(Available_Card_Limt+"------------"+Available_Card_Limt_Detail_Screen);
		assert Available_Card_Limt_Detail_Screen.equals(Available_Card_Limt) : "Available card limit is not equal";
		
	//Validation for outstanding amount
		String OutStanding_Amount_Detail_Screen = driver.findElement(ACC_AMOUNT).getText();
		assert OutStanding_Amount_Detail_Screen.equals(OutStanding_Amt) : "OutStanding amount is not equal";
		
	//Validation for card name
		driver.findElement(VISA_GOLD).isDisplayed();
		

		
	//Validation for card number
		String Card_Number_Detail_Screen = getValueForKeyInSegment(SEG_CARD_DET,CARD_DET_ACC_INFO_GROUP,SEGMENT_ITEM_KEY,SEGMENT_ITEM_VALUE,Card_Number_Txt);
		assert Card_Number_Detail_Screen.equals(Card_Number) : "Card Number is not equal";

	//Validation for statement Balance
		String Statement_Balance_Detail_Screen = getValueForKeyInSegment(SEG_CARD_DET,CARD_DET_ACC_INFO_GROUP,SEGMENT_ITEM_KEY,SEGMENT_ITEM_VALUE,Statement_Balance_Txt);
		assert Statement_Balance_Detail_Screen != null : "Statement Balance is visible";
		
		String Statement_Balances = Statement_Balance_Detail_Screen.substring(0, Statement_Balance_Detail_Screen.length()-4);
		try {
			Float sf = Float.parseFloat(Statement_Balances);
			assert sf>=0 : "Statement Balance is not working fine";
			System.out.println("Statement Balance: "+Statement_Balance_Detail_Screen);
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		String Statement_Date_Detail_Screen = getValueForKeyInSegment(SEG_CARD_DET,CARD_DET_ACC_INFO_GROUP,SEGMENT_ITEM_KEY,SEGMENT_ITEM_VALUE,Statement_Date_Txt);

		assert Statement_Date_Detail_Screen.length() !=0 : "Statement Date is not working";
		System.out.println("Statement Date: "+Statement_Date_Detail_Screen);
		
		String Minimum_Amount_Detail_Screen = getValueForKeyInSegment(SEG_CARD_DET,CARD_DET_ACC_INFO_GROUP,SEGMENT_ITEM_KEY,SEGMENT_ITEM_VALUE,Minimum_Amt_Txt);
		assert Minimum_Amount_Detail_Screen != null : "Minimum balance is visible";
		
		String Minimum_amount_dues = Minimum_Amount_Detail_Screen.substring(0, Minimum_Amount_Detail_Screen.length()-4);
		Float mf = null;
		try {
			mf = Float.parseFloat(Minimum_amount_dues);
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		assert mf>=0 : "Minimum Amount is not working fine";
		System.out.println("Minimum Amount Due: "+Minimum_amount_dues);
		
		String Card_Owner_Detail_Screen = getValueForKeyInSegment(SEG_CARD_DET,CARD_DET_ACC_INFO_GROUP,SEGMENT_ITEM_KEY,SEGMENT_ITEM_VALUE,Card_Owner_Txt);
		assert Card_Owner_Detail_Screen != null : "Card Owner is visible";
	
		System.out.println("Card Owner: "+Card_Owner_Detail_Screen);
		assert Card_Holder_Name.equals(Card_Owner_Detail_Screen) : "Card Owner name is not equal";
		
		String Card_Status_Detail_Screen = getValueForKeyInSegment(SEG_CARD_DET,CARD_DET_ACC_INFO_GROUP,SEGMENT_ITEM_KEY,SEGMENT_ITEM_VALUE,Card_Status_Txt);
		assert Card_Status_Detail_Screen != null : "Card Status is visible";

		System.out.println("Card Status: "+Card_Status_Detail_Screen);
		assert Card_Status_Detail_Screen.length() !=0 : "Card Status is not working";
		
		String Total_Card_Lmt_Detail_Screen = getValueForKeyInSegment(SEG_CARD_DET,CARD_DET_ACC_INFO_GROUP,SEGMENT_ITEM_KEY,SEGMENT_ITEM_VALUE,Total_Card_Limit_Txt);
		assert Total_Card_Lmt_Detail_Screen != null : "Total Card Limit is visible";
		
		String Total_Card_Lmt_Detail_Screen_value = Total_Card_Lmt_Detail_Screen.replace(",", "").substring(0, Total_Card_Lmt_Detail_Screen.length()-4);
		Float lf = null;
		try {
			lf = Float.parseFloat(Total_Card_Lmt_Detail_Screen_value);
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		assert lf>=0 : "Total Card Limit is not working fine";
		System.out.println("Total Card Limit: "+Total_Card_Lmt_Detail_Screen_value);
	}
	
	
	public String getValueForKeyInSegment( By segment ,By segmentitem ,By KEY_ID , By VALUE_ID , String Key)
	{
		String retVal = null;
//		 By segmentitem = By.id("flxChartsSpending");
//		 By KEY_ID = By.id("lblSpending");
//		 By VALUE_ID = By.id("lblAmountSpent");
		 
		 MobileElement parent = (MobileElement)driver.findElement(segment);
		 List<MobileElement> child1 = parent.findElements(segmentitem);
		 
		 
		 for (MobileElement element : child1)
		 {
			 MobileElement labelText_Element = element.findElement(KEY_ID);
			 MobileElement labelValue_Element = element.findElement(VALUE_ID);
			 if(labelText_Element.getText().equals(Key))
			 {
				 retVal =  labelValue_Element.getText();
			 }
		 }
		 return retVal;
	}
	
	
	public void Verify_Login_check() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		 if(elementExists(REG_CARD_BTN)) {
			 Register_Specific_user(Act_Cust_No, Act_SMS_PN);
			 //Register_using_Credit_Card();
		 }
		 else {
			 System.out.println("User already logged in");
			 enterText(LOGIN_PIN_FD, Enter_Pin);
		 }
	}
	
	public void Verify_Login_Acc_Ver() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		 if(elementExists(REG_CARD_BTN)) {
			 Register_Specific_user(Act_Cust_No3, Act_SMS_PN);
			 //Register_using_Credit_Card();
		 }
		 else {
			 System.out.println("User already logged in");
			 enterText(LOGIN_PIN_FD, Enter_Pin);
		 }
	}
	
	public void Verify_Login_check_Acc() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		 if(elementExists(REG_CARD_BTN)) {
			 Register_Specific_user(Act_Cust_No_Acc, Act_SMS_PN);
			 //Register_using_Credit_Card();
		 }
		 else {
			 System.out.println("User already logged in");
			 enterText(LOGIN_PIN_FD, Enter_Pin);
		 }
	}
	
	public void Verify_Login_check_tran() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		 if(elementExists(REG_CARD_BTN)) {
			 Register_Specific_user(Act_Cust_No, Act_SMS_PN);
			 //Register_using_Credit_Card();
		 }
		 else {
			 System.out.println("User already logged in");
			 enterText(LOGIN_PIN_FD, Enter_Pin);
		 }
	}
	
	public void Verify_Login_Res() {
		driver.resetApp();
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		 if(elementExists(REG_CARD_BTN)) {
			 Register_Specific_user(Act_Cust_No, Act_SMS_PN);
			 driver.closeApp();
			 driver.launchApp();
			 //Register_using_Credit_Card();
		 }
		 else if (elementExists(FINGERPRINTS_POPUP)){
			 driver.findElement(FINGERPRINTS_POPUP_CANCEL).click();
			 System.out.println("Fingerprint cancelled");
		 }
		 else {
			 System.out.println("User already logged in");
		 }
	}
	
	public void Verify_Login_debit() {
		Register_using_Card(Act_Debit_Card_No, Act_Credit_Card_Pin);
			 driver.closeApp();
			 driver.launchApp();
	}
	
	public void Verify_Login_debit_wt_rl() {
		Register_using_Card(Act_Debit_Card_No, Act_Credit_Card_Pin);
	}
	
	public void Verify_Login_credit() {
		Register_using_Card(Act_Credit_Card_No, Act_Credit_Card_Pin);
			 driver.closeApp();
			 driver.launchApp();
	}
	
	public void Verify_Login_Tpin() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
//		 if(elementExists(REG_CARD_BTN)) {
			 Register_Specific_Tpin(Act_Cust_No2, Act_TPIN_PN);
			 driver.closeApp();
			 driver.launchApp();
			 //Register_using_Credit_Card();
//		 }
//		 else if (elementExists(FINGERPRINTS_POPUP)){
//			 driver.findElement(FINGERPRINTS_POPUP_CANCEL).click();
//			 System.out.println("Fingerprint cancelled");
//		 }
//		 else {
//			 System.out.println("User already logged in");
//		 }
	}
	
	public void Verify_Login_check_Card() {
		appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
		appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
		 if(elementExists(REG_CARD_BTN)) {
			 Register_Specific_user(Card_Sec_Ver, Act_SMS_PN);
			 //Register_using_Credit_Card();
		 }
		 else {
			 System.out.println("User already logged in");
			 enterText(LOGIN_PIN_FD, Enter_Pin);
		 }
	}
	
	public void Verify_Login_check_Bio() {
		if(elementExists(Landing_Screen_Logo))
		{	
			appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
			appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
			if(elementExists(REG_CARD_BTN)) {
				Register_Specific_user_Bio(Act_Cust_No1, Act_SMS_PN);
			}
			else {
				System.out.println("User already logged in");
				enterText(LOGIN_PIN_FD, Enter_Pin);
			}
		}
		else
		{
			clickOnElement(FINGERPRINTS_POPUP_CANCEL);
			enterText(LOGIN_PIN_FD, Enter_Pin);
			
		}
	}
	
	public void Verify_Login_check_Bio1() {
		if(elementExists(FINGERPRINTS_POPUP_CANCEL))
		{	
			clickOnElement(FINGERPRINTS_POPUP_CANCEL);
			enterText(LOGIN_PIN_FD, Enter_Pin);
		}
		else
		{
			appiumHelpers.waitForVisibilityOfElement(Landing_Screen_Logo);
			appiumHelpers.assertTrue(elementExists(Landing_Screen_Logo), "Successfully redirected to landing screen");
			if(elementExists(REG_CARD_BTN)) {
				Register_Specific_user_Bio(Act_Cust_No1, Act_SMS_PN);
			}
			else {
				System.out.println("User already logged in");
				enterText(LOGIN_PIN_FD, Enter_Pin);
			}
		}
	}
	
	
	
	public void Verify_Absence_Card_Section() {
		appiumHelpers.assertFalse(elementExists(CARD_LABEL), "My Card Section is available");
	}
	
	public void Verify_Presence_Bill_Payment(){
		appiumHelpers.assertFalse(elementExists(BILL_PAYMENT), "Bill payment button is shown");
	}
	
	public void Verify_Absence_Bill_Payment(){
		appiumHelpers.assertFalse(elementExists(BILL_PAYMENT), "Bill payment button is not shown");
	}
	
	public void Register_Specific_user() {
		//Register_using_Credit_Card();
		 Register_Specific_user(Act_Cust_No_Acc, Act_SMS_PN);
	}
	
	public void Register_Specific_user_no_bill_pay() {
		//Register_Specific_user(Act_Cust_No_Spec_No_bill, Act_SMS_PN_Spec_No_bill);
		 Register_using_Credit_Card();
	}
}
