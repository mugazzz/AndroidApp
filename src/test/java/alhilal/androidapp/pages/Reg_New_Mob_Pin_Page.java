package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;

public class Reg_New_Mob_Pin_Page extends CommonPage {

	public void Enter_Re_Incor_Pin() {
	enterText(CRE_LOGIN_PIN_FD, Inc_Enter_Pin);
	enterText(CRE_LOGIN_REPIN_FD, Inc_Enter_Pin);
	}
	
	public void Verify_Page_Stay() {
		appiumHelpers.assertTrue(elementExists(CRE_LOGIN_PIN_LB), "Screen stays in Create PIN screen");
	}
	
	public void Verify_Incor_Conf_Pin() {
		enterText(CRE_LOGIN_PIN_FD, Enter_Pin);
		enterText(CRE_LOGIN_REPIN_FD, Renter_Pin);
	}
	
	public void Verify_Pin_Validation() {
		String xmlFormat = driver.getPageSource();
		assertThat(xmlFormat, CoreMatchers.containsString("Both login PIN entered do not match!"));
	}
}
