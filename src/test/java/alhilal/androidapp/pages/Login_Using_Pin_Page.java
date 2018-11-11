package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;


public class Login_Using_Pin_Page extends CommonPage{

	public void Enter_Login_Pin() {
		enterText(LOGIN_PIN_FD, Enter_Pin);
	}
	
	public void Verify_Dashboard() {
	appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
	appiumHelpers.assertTrue(elementExists(DASHBOARD_HEADING), "Screen navigated to the dashboard screen");
	}
	
	public void Enter_Login_Incorrect_Pin() {
		enterText(LOGIN_PIN_FD, Renter_Pin);
	}
	
	public void Verify_Incor_Pin_Msg() {
		Verify_Validation_Message(Invalid_Pin_Validation);
	}
	
//	public void FingerPrint() {
//		 //Runtime.getRuntime().exec("adb -e emu finger touch Alhilal1");
//	}
}
