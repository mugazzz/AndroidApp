package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

public class Res_Pin_Use_CC_Page extends CommonPage{
	
	public void Verify_ForgotPIN_Link() {
		appiumHelpers.waitForVisibilityOfElement(REG_HOME_FORGOT_PIN);
	}
	
	public void Tap_ForgotPIN_Link() {
		clickOnElement(REG_HOME_FORGOT_PIN);
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_HD);
	}

}
