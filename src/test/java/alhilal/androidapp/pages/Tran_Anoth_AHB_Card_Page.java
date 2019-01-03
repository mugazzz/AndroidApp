package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

public class Tran_Anoth_AHB_Card_Page extends CommonPage{

	public void Ver_Validl() {
		Verify_Validation_Message(Limit_Tran);
	}
	
	public void Ver_Validl1() {
		Verify_Validation_Message(Great_val1);
	}
	
	public void Transfer_30K() {
		clickOnElement(TRANF_TAB);
		appiumHelpers.waitForVisibilityOfElement(CUR_ACC_AM);
		appiumHelpers.waitForVisibilityOfElement(TRANF_TO_OTHERS);
		clickOnElement(TRANF_TO_OTHERS);
		appiumHelpers.waitForVisibilityOfElement(ADD_BENIF);
		appiumHelpers.waitForVisibilityOfElement(OTHER_CARD);
		clickOnElement(OTHER_CARD);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(CUR_ACC_AMT);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
		enterText(TRAN_AMT, Tran_amt2);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_AED);
		enterText(AHB_CARD, Act_Credit_Card_No);
		driver.hideKeyboard();
		enterText(REMARK, Remark);
		driver.hideKeyboard();
		clickOnElement(SUB_SCHED);
		appiumHelpers.waitForVisibilityOfElement(SCHED_HD);
		Select_Mode(SEL_YEAR);
		clickOnElement(DATE_NXT);
		clickOnElement(SEL_DATE);
		clickOnElement(DATE_CTN);
		appiumHelpers.waitForVisibilityOfElement(DEBIT_AMT);
		clickOnElement(CONT_BUT);
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		//Complete_and_Verify();
		OTP();
			appiumHelpers.waitForVisibilityOfElement(REF_NUM);
			String reference_no = driver.findElement(REF_NUM).getText();
			System.out.println(reference_no);
			clickOnElement(CONF_BUT);
	
	}
}
