package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import cucumber.api.java.en.Then;

public class Reg_Use_CIF_SPIN_Page extends CommonPage {
	
	public void Tap_Cus_Reg() {
		clickOnElement(REG_CUS_NO_LINK);
		appiumHelpers.waitForVisibilityOfElement(REG_CUS_NO_LB);
	}
	
	public void Ent_Valid_Cus_No() {
		enterText(REG_CUS_NO_FD, Act_Cust_No_Reg_CIF_SMS_PIN);
	}
	
	public void Ent_Valid_Cus_No1() {
		enterText(REG_CUS_NO_FD, Act_Cust_No2);
	}
	
	public void Ent_Valid_SMS_PN() {
		enterText(REG_SMS_PN_FD, Act_SMS_PN);
	}
	
	public void Ent_inactive_Cus_No() {
		enterText(REG_CUS_NO_FD, Inact_Cust_No);
	}
	
	
	public void Ent_incor_Cus_No() {
		enterText(REG_CUS_NO_FD, Incorr_Cust_No);
	}
	
	public void Enter_Incor_Sms_Pin() {
		enterText(REG_SMS_PN_FD, Incorr_SMS_PN);
	}
	
	public void Ent_inactive_SMS_Pin() {
		enterText(REG_SMS_PN_FD, Inact_SMS_PN);
	}
	
	public void Ent_Cus_No_inactive_SMS_Pin() {
		enterText(REG_CUS_NO_FD, Inact_SMS_PN_Cus);
	}
	
	public void Enter_Cus_With_No_SPin() {
		enterText(REG_CUS_NO_FD, Cust_No_with_No_SPin);
	}
	
	public void Ent_invalid_SMS_Pin() {
		enterText(REG_SMS_PN_FD, Invalid_SMS_PN);
	}
	
	
}
