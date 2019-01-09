package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

public class Add_Pay_Benifi extends CommonPage{
	
	public void  Tap_Pay_Bill() {
		clickOnElement(PAY_BILL);
		//appiumHelpers.waitForVisibilityOfElement(FLX_PAYEE);
	}
	
	public void Tap_Make_Payment() {
		clickOnElement(PAY_MANAGE);
		appiumHelpers.waitForVisibilityOfElement(ADD_PAYEE);
	}
	
	public void Add_Payee() {
		clickOnElement(ADD_PAYEE);
		appiumHelpers.waitForVisibilityOfElement(SELECT_SERVICE);
	}
	
	public void Tap_Nxt_Scr_SALIK() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details(SALIK1, Pay_Cons, Pay_nick);
		clickOnElement(CTN);
		
	}
	
	public void Tap_Nxt_Scr_ADDC() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details(ADDC1, Pay_Cons1, Pay_nick1);
		clickOnElement(CTN);
		
	}
	
	public void Tap_Nxt_Scr_AADC() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details(AADC1, Pay_Cons2, Pay_nick2);
		clickOnElement(CTN);
		
	}
	
	public void Tap_Nxt_Scr_AADC1() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details(AADC1, Pay_Cons5, Pay_nick5);
		clickOnElement(CTN);
		
	}
	
	public void Tap_Nxt_Scr_DEWA() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details(DEWA1, Pay_Cons3, Pay_nick3);
		clickOnElement(CTN);
		
	}
	
	public void Tap_Nxt_Scr_GSM() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details(DEWA1, Pay_Cons3, Pay_nick3);
		clickOnElement(CTN);
		
	}
	
	public void Tap_Nxt_Scr_DEWA1() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details(DEWA1, Pay_Cons4, Pay_nick4);
		clickOnElement(CTN);
		
	}
	
	public void Verify_Fing_Pop() {
		appiumHelpers.waitForVisibilityOfElement(FINGERPRINTS_POPUP);
	}
	
	public void Verify_Details(String service_LB, String consumer_LB, String Nick_LB) {
		String Service = driver.findElement(SER_PRO_VAL).getText();
		System.out.println(Service);
		assert Service.equals(service_LB) : "SERVICE IS EQUAL";
		String Consumer = driver.findElement(CONS_LB_VAL).getText();
		System.out.println(Consumer);
		assert Consumer.equals(consumer_LB) : "Consumer IS EQUAL";
		String Nick = driver.findElement(NICK_LB_VAL).getText();
		System.out.println(Nick);
		assert Nick.equals(Nick_LB) : "Nick IS EQUAL";
	}
	
	public void Verify_Details_Etisalat(String service_LB, String consumer_LB, String Nick_LB, String Type_LB) {
		String Service = driver.findElement(SER_PRO_VAL).getText();
		System.out.println(Service);
		assert Service.equals(service_LB) : "SERVICE IS EQUAL";
		String Consumer = driver.findElement(CONS_LB_VAL).getText();
		System.out.println(Consumer);
		assert Consumer.equals(consumer_LB) : "Consumer IS EQUAL";
		String Nick = driver.findElement(NICK_LB_VAL).getText();
		System.out.println(Nick);
		assert Nick.equals(Nick_LB) : "Nick IS EQUAL";
		String Type = driver.findElement(SER_TYPE_VAL).getText();
		System.out.println(Type);
		assert Type.equals(Type_LB) : "Type IS EQUAL";
	}
	
	public void Verify_validation() {
		clickOnElement(NXT);
		Verify_Validation_Message(Incorrect_Cons);
	}
	
	public void Verify_validation_dup_con() {
		clickOnElement(NXT);
		Verify_Validation_Message(Alrea_Payee);
	}
	
	public void Verify_validation_dup_nick() {
		clickOnElement(NXT);
		Verify_Validation_Message(Alrea_Nick);
	}
	
	public void Verify_validation_Gsm() {
		clickOnElement(NXT);
		Verify_Validation_Message(GSM_Digiti_Valid);
	}
	
	public void Verify_validation_Gsm1() {
		clickOnElement(NXT);
		Verify_Validation_Message(GSM_Digiti_Valid1);
	}
	
	public void Verify_validation_Gsm2() {
		clickOnElement(NXT);
		Verify_Validation_Message(GSM_Digiti_Valid2);
	}
	
	public void Verify_validation_Gsm3() {
		clickOnElement(NXT);
		Verify_Validation_Message(GSM_Digiti_Valid3);
	}
	
	public void Verify_validation_Gsm4() {
		clickOnElement(NXT);
		Verify_Validation_Message(GSM_Digiti_Valid4);
	}
	
	public void Verify_Gsm_Details() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details_Etisalat (ETISALAT1, Pay_Cons_GSM, Pay_nick_gsm, Pay_type_gsm);
		clickOnElement(CTN);
	}
	
	public void Verify_WASEL_Details() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details_Etisalat (ETISALAT1, Pay_Cons_WASEL, Pay_nick_wasel, Pay_type_wasel);
		clickOnElement(CTN);
	}
	
	public void Verify_Landline_Details() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details_Etisalat (ETISALAT1, Pay_Cons_Landline, Pay_nick_Landline, Pay_type_Landline);
		clickOnElement(CTN);
	}
	
	public void Verify_Landline_Details1() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details_Etisalat (ETISALAT1, Pay_Cons_Landline1, Pay_nick_Landline1, Pay_type_Landline);
	}
	
	public void Verify_SHAMIL_Details() {
		clickOnElement(NXT);
		appiumHelpers.waitForVisibilityOfElement(SER_PRO);
		Verify_Details_Etisalat (ETISALAT1, Pay_Cons_SHAMIL, Pay_nick_SHAMIL, Pay_type_SHAMIL);
		clickOnElement(CTN);
	}
}
