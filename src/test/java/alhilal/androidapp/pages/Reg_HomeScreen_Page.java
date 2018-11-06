package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.Locators.*;

public class Reg_HomeScreen_Page extends CommonPage{
	
	public void VerifyFingerPopup() {
	appiumHelpers.waitForVisibilityOfElement(FINGERPRINTS_POPUP);
	appiumHelpers.assertTrue(elementExists(FINGERPRINTS_POPUP), "Fingerprint popup appears");
	}
	
	public void VerifyNoFingerPopup() {
		appiumHelpers.waitForVisibilityOfElement(REG_HOME_LOGIN);
		appiumHelpers.assertFalse(elementExists(FINGERPRINTS_POPUP), "Fingerprint popup is not appears");
		}
	
	public void ClosePopup() {
		
		clickOnElement(FINGERPRINTS_POPUP_CANCEL);
	}
	
	public void VerifyRegHomeFig() {
		appiumHelpers.waitForVisibilityOfElement(REG_HOME_LOGIN);
		appiumHelpers.assertTrue(elementExists(REG_HOME_LOGIN), "Registered user home screen - Login pin text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_USE_FING), "Registered user home screen - Use fingerprints for login text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_FORGOT_PIN), "Registered user home screen - Forgot login PIN text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_CHANGE_USER), "Registered user home screen - Change User text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_BRANCH_LOCATOR), "Registered user home screen - Branch Locator text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_CONTACT_US), "Registered user home screen - Contact Us text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_ENG_LANG), "Registered user home screen - English button text confirmed");
		
	}
	
	public void SkipEnableFingerPrint() {
		clickOnElement(SKIP_FINGERPRINT);
		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
		appiumHelpers.assertTrue(elementExists(DASHBOARD_HEADING), "Screen navigated to the dashboard screen");
	}
	
	public void TapOnArabicButton() {
		clickOnElement(REG_HOME_ARB_LNG);
	}
	
	public void VerifyArabLang() {
		appiumHelpers.waitForVisibilityOfElement(AREG_HOME_LOGIN);
		appiumHelpers.assertTrue(elementExists(AREG_HOME_LOGIN), "Registered user home screen arabic - Login pin text confirmed");
		//appiumHelpers.assertTrue(elementExists(AREG_HOME_USE_FING), "Registered user home screen arabic - Use fingerprints for login text confirmed");
		appiumHelpers.assertTrue(elementExists(AREG_HOME_FORGOT_PIN), "Registered user home screen arabic - Forgot login PIN text confirmed");
		appiumHelpers.assertTrue(elementExists(AREG_HOME_CHANGE_USER), "Registered user home screen arabic - Change User text confirmed");
		appiumHelpers.assertTrue(elementExists(AREG_HOME_BRANCH_LOCATOR), "Registered user home screen arabic - Branch Locator text confirmed");
		appiumHelpers.assertTrue(elementExists(AREG_HOME_CONTACT_US), "Registered user home screen arabic - Contact Us text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_ENG_LANG), "Registered user home screen arabic - English button text confirmed");
	}
	
	public void TapOnEnglishButton() {
		clickOnElement(REG_HOME_ENG_LNG);
	}
	
	public void VerifyRegHome() {
		appiumHelpers.waitForVisibilityOfElement(REG_HOME_LOGIN);
		appiumHelpers.assertTrue(elementExists(REG_HOME_LOGIN), "Registered user home screen - Login pin text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_FORGOT_PIN), "Registered user home screen - Forgot login PIN text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_CHANGE_USER), "Registered user home screen - Change User text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_BRANCH_LOCATOR), "Registered user home screen - Branch Locator text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_CONTACT_US), "Registered user home screen - Contact Us text confirmed");
		appiumHelpers.assertTrue(elementExists(REG_HOME_ENG_LANG), "Registered user home screen - English button text confirmed");
		
	}
}
