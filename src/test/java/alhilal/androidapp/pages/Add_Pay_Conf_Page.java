package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.Locators.*;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;
import org.openqa.selenium.By;

import static alhilal.androidapp.utils.AppStrings.*;

public class Add_Pay_Conf_Page extends CommonPage{
	
	public void Tap_Cancel() {
		appiumHelpers.waitForVisibilityOfElement(CAN_BTN);
		clickOnElement(CAN_BTN);
		appiumHelpers.waitForVisibilityOfElement(CAN_OK);
	}
	
	public void Tap_OK_Redirect() {
		clickOnElement(CAN_OK);
		appiumHelpers.waitForVisibilityOfElement(ADD_PAYEE);
	}
	
	public void Enter_Inv_OTP() {
		clickOnElement(CTN);
		enterText(OPT_FIELD, InvOTP);
	}
	
	public void Verify_Inv_OTP() {
		elemenDoesnotExists(CNF_IMG);
	}
}
