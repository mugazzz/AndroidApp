package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.time.LocalDate;

public class Set_Recur_Trans_Page extends CommonPage {
	public void Select_Alhilal() {
		clickOnElement(OTHER_CARD);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	public void Enter_AHB() {
		enterText(AHB_CARD, Act_Credit_Card_No);
//		driver.hideKeyboard();
		hideKeyboard();
	}
	
	public void Enter_OWN() {
		enterText(AHB_CARD, Own_Credit_Card_No);
//		driver.hideKeyboard();
		hideKeyboard();
	}
	
	public void Confirm_OTP() {
		clickOnElement(CONT_LBL);
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
	}
	
	public void Verify_Success() {
		appiumHelpers.waitForVisibilityOfElement(REF_NUM);
		String reference_no = driver.findElement(REF_NUM).getText();
		System.out.println(reference_no);
		appiumHelpers.assertTrue(elementExists(AMT_CNF), "Debited amount is not working");
		LocalDate date = LocalDate.now();
        String nextDate = date.toString();
        System.out.println(nextDate);
        String today = nextDate.substring(8, 10);
        System.out.println(today);
        String date2 = driver.findElement(CNF_DATE).getText();
		String date1 = date2.substring(6, date2.length()-8);
		System.out.println(date1);
		assert date1.equals(today): "Date is not equal";
	}
	
}
