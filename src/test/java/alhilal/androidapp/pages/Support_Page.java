package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;

public class Support_Page extends CommonPage{
	public void Tap_More() {
		clickOnElement(MORE_OPT);
		appiumHelpers.waitForVisibilityOfElement(SET_OPT);
	}
	
	public void Tap_Settings() {
		clickOnElement(SET_OPT);
		appiumHelpers.waitForVisibilityOfElement(ACT_OPT);
	}
	
	public void Tap_Active_Device() {
		clickOnElement(ACT_OPT);
		appiumHelpers.waitForVisibilityOfElement(SEG_PAG);
	}
	
	public void  Tap_Act_Dev_Edit() {
		clickOnElement(DEV_LIS);
		appiumHelpers.waitForVisibilityOfElement(DEV_NAM);
	}
	
	public void  Tap_Act_Dev_Edit2() {
		clickOnElement(DEV_LIS1);
		appiumHelpers.waitForVisibilityOfElement(DEV_NAM);
	}
	
	public void  Tap_Act_Dev_Edit1() {
		clickOnElement(DEV_LIS);
		appiumHelpers.waitForVisibilityOfElement(DEV_NAM);
	}
	
	public void  Tap_Edit_Link() {
		clickOnElement(NICK_EDIT);
		appiumHelpers.waitForVisibilityOfElement(ENT_NICK);
	}
	
	public void  Ent_Nick_Name() {
		driver.findElement(ENT_NICK).clear();
		enterText(ENT_NICK, Nick_Na);
		//driver.hideKeyboard();
	}
	
	public void  Ent_Nick_Name1() {
		driver.findElement(ENT_NICK).clear();
		enterText(ENT_NICK, Nick_Na1);
		//driver.hideKeyboard();
	}

	public void  Verify_Saved() {
		clickOnElement(CNF_BTN);
		Verify_Validation_Message(Act_Nick_Val);
		String nick = driver.findElement(DEV_NAM).getText();
		assert nick.equals(Nick_Na): "Device nick name is not saved";
	}
	
	public void  Verify_Saved1() {
		clickOnElement(CNF_BTN);
		Verify_Validation_Message(Dup_Nick_Val);
	}
	
	public void  Verify_Not_Saved() {
		clickOnElement(BK_BTN);
		String nick = driver.findElement(DEV_NAM).getText();
		assert !nick.equals(Nick_Na1): "Device nick name is not saved";
	}
	
	public void Tap_Login_Pin() {
		clickOnElement(PIN_LINK);
		appiumHelpers.waitForVisibilityOfElement(ENT_CUR_PIN);
	}
	
	public void Tap_Change_Pin() {
		clickOnElement(CNF_BTN);
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
	}
	
	public void Tap_Change_Pin1() {
		clickOnElement(CNF_BTN);
	}
	
	public void Verify_Login_check_Cancel() {
		appiumHelpers.waitForVisibilityOfElement(FING_CANCEL);
		clickOnElement(FING_CANCEL);
		enterText(LOGIN_PIN_FD, Enter_Pin);
	}
	
}
