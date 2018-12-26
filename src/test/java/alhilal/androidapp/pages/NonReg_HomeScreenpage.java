package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.Locators.*;
import static alhilal.androidapp.utils.AppStrings.*;

public class NonReg_HomeScreenpage extends CommonPage{
	
	public void VerifyRegbtn() {
		appiumHelpers.assertTrue(elementExists(REG_CARD_BTN), "Registration using card details button displayed ");
	}
	
	public void VerifyContactUs() {
		appiumHelpers.assertTrue(elementExists(CONACT_US), "Contact us link displayed ");
	}
	
	public void VerifyBranchLocator() {
		appiumHelpers.assertTrue(elementExists(BRANCH_LOCATOR), "Branch locator link displayed ");
	}
	
	public void VerifyEnroll() {
		appiumHelpers.assertTrue(elementExists(REG_CUS_LINK), "Enroll link displayed ");
	}
	
	public void Change_toggle_button() {
		clickOnElement(ARAB_BTN);
	}
	
	public void VerifyArabChange() {
		appiumHelpers.assertTrue(elementExists(AREG_CARD_BTN), "Registration using card details button is displayed");
		appiumHelpers.assertTrue(elementExists(ACONACT_US), "Contact us link is displayed");
		appiumHelpers.assertTrue(elementExists(ABRANCH_LOCATOR), "Branch locator link is displayed");
		appiumHelpers.assertTrue(elementExists(AREG_CUS_LINK), "Enroll link is displayed");
	}
	
	public void NavigateCardReGArabCheck() {
		clickOnElement(AREG_CARD_BTN);
		appiumHelpers.assertTrue(elementExists(AREG_CARD_NO), "Card field is displayed in Arabic");
		appiumHelpers.assertTrue(elementExists(AREG_CARD_HD), "Page Header is displayed in Arabic");
		appiumHelpers.assertTrue(elementExists(AREG_CARD_PN), "Card Pin field is displayed in Arabic");
		appiumHelpers.assertTrue(elementExists(AREG_CARD_RG), "Page registration button is displayed in Arabic");
		clickOnElement(HEAD_BACK);
	}
	
	public void NavigateCusReGArabCheck() {
		clickOnElement(AREG_CUS_LINK);
		appiumHelpers.assertTrue(elementExists(AREG_CUS_NO), "Customer number field is displayed in Arabic");
		appiumHelpers.assertTrue(elementExists(AREG_CUS_HD), "Page Header is displayed in Arabic");
		appiumHelpers.assertTrue(elementExists(AREG_CUS_PIN), "Customer Pin field is displayed in Arabic");
		appiumHelpers.assertTrue(elementExists(AREG_CUS_SMS), "Customer SMS field is displayed in Arabic");
        appiumHelpers.assertTrue(elementExists(AREG_CUS_RG), "Page registration button is displayed in Arabic");
		clickOnElement(HEAD_BACK);
	}
	
	public void VerifyEngChange() {
		appiumHelpers.waitForVisibilityOfElement(ENG_BTN);
		clickOnElement(ENG_BTN);
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_BTN);
		appiumHelpers.assertTrue(elementExists(REG_CARD_BTN), "Registration using card details button is displayed");
		appiumHelpers.assertTrue(elementExists(CONACT_US), "Contact us link is displayed");
		appiumHelpers.assertTrue(elementExists(BRANCH_LOCATOR), "Branch locator link is displayed");
		appiumHelpers.assertTrue(elementExists(REG_CUS_LINK), "Enroll link is displayed");
	}
}
