package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.Locators.*;

public class Logout_Page extends CommonPage{
	
	public void Tap_More() {
		appiumHelpers.waitForVisibilityOfElement(MORE_OPT);
		clickOnElement(MORE_OPT);
	}
	
	public void Verify_Logout_Option() {
		appiumHelpers.waitForVisibilityOfElement(LOGOUT);
	}
	
	public void Logout_User() {
		clickOnElement(LOGOUT);
	}
	
	public void Verify_Login_Screen() {
		appiumHelpers.waitForVisibilityOfElement(LOGIN_PIN_FD);
	}
	
	public void  Verify_Confirm_Popup() {
		appiumHelpers.waitForVisibilityOfElement(POP_UP);
	}
	
	public void  Tap_No() {
		clickOnElement(POP_UP_NO);
	}
	
	public void  Tap_Yes() {
		clickOnElement(POP_UP_YES);
	}
	
	public void Verify_Not_Logout(){
		appiumHelpers.waitForVisibilityOfElement(MORE_OPT);
	}

}
