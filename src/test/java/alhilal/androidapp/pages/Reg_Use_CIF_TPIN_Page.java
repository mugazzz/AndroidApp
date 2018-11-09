package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

public class Reg_Use_CIF_TPIN_Page extends CommonPage {

	public void Tap_Tpin_Tab() {
		clickOnElement(REG_CUS_TPIN_TAB);
	}
	
	public void Ent_Valid_TPIN_PN() {
		enterText(REG_CUS_TPIN_FD, Act_TPIN_PN);
	}
	
	public void Tap_On_Next() {
		driver.hideKeyboard();
		clickOnElement(REG_CUS_TPIN_NT);
	}
	
	public void Enter_Incor_TPin() {
		enterText(REG_CUS_TPIN_FD, Incorr_TPN);
	}
	
	public void Enter_Cus_With_No_Pin() {
		enterText(REG_CUS_NO_FD, Cust_No_with_No_Pin);
	}
	
	public void Ent_Cus_No_inactive_TPin() {
		enterText(REG_CUS_NO_FD, Inact_TPN_Cus);
	}
	
	public void Ent_invalid_TPin() {
		enterText(REG_CUS_TPIN_FD, Invalid_SMS_PN);
	}
	
	
}
