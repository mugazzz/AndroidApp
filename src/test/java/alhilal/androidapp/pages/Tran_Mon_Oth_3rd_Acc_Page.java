package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.time.LocalDate;

public class Tran_Mon_Oth_3rd_Acc_Page extends CommonPage{
	
	public void Tap_3rd_Acc() {
		clickOnElement(THIRD_ACC);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	public void Tap_Loc_3rd_Acc() {
		clickOnElement(LOC_THIRD_ACC);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	public void Sel_Cur_Acc() {
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(CUR_ACC_AMT);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
	}
	
	public void Sel_Sav_Acc() {
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(SAV_ACC_AMT);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
	}
	
	public void Veri_Avai_Amt() {
		String Avail_Amt = driver.findElement(AVAI_AMT).getText();
		System.out.println(Avail_Amt);
		String Avail_Amt1 = Avail_Amt.substring(17, Avail_Amt.length()-4);
		System.out.println(Avail_Amt1);
	}
	
	public void Enter_Amt_Cur() {
		enterText(TRAN_AMT, Tran_amt);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_AED);
	}
	
	public void Ver_Indic_Amt() {
		appiumHelpers.waitForVisibilityOfElement(IND_AMT);
	}
	
	public void Select_Charge_Pay() {
		clickOnElement(SEL_CHAR);
		clickOnElement(SEL_ME);
	}
	
	public void Select_Reason() {
		clickOnElement(SEL_REASON);
		clickOnElement(SEL_REASONS);
	}
	
	public void Enter_Remark() {
		enterText(REMARK, Remark);
		driver.hideKeyboard();
	}
	
	public void  Nav_Tran_Con() {
		clickOnElement(CONF_BUT);
		appiumHelpers.waitForVisibilityOfElement(FLX_CONF);
	}
	
	public void Verf_Tran_Detail() {
		String Tran_Amt = driver.findElement(DEBIT_AMT).getText();
		String Tran_Amt1 = Tran_Amt.substring(0, Tran_Amt.length()-4);
		assert Tran_Amt1.equals(Tran_amt): "Debit amount is not equal";
		appiumHelpers.assertTrue(elementExists(CUR_ACC), "Current Account number is not working");
		String Reason = driver.findElement(REAS_CFN).getText();
		assert Reason.equals(Reason_c): "Reason is not equal";
		String Charge = driver.findElement(CHAR_BY).getText();
		assert Charge.equals(Charge_c): "Charge is not equal";
		String Remark_C = driver.findElement(REM_CFN).getText();
		assert Remark_C.equals(Remark): "Remark is not equal";
	}
	
	public void Verf_Sav_Tran_Detail() {
		String Tran_Amt = driver.findElement(DEBIT_AMT).getText();
		String Tran_Amt1 = Tran_Amt.substring(0, Tran_Amt.length()-4);
		assert Tran_Amt1.equals(Tran_amt): "Debit amount is not equal";
		appiumHelpers.assertTrue(elementExists(SAV_ACC), "Savings Account number is not working");
		String Reason = driver.findElement(REAS_CFN).getText();
		assert Reason.equals(Reason_c): "Reason is not equal";
		String Charge = driver.findElement(CHAR_BY).getText();
		assert Charge.equals(Charge_c): "Charge is not equal";
		String Remark_C = driver.findElement(REM_CFN).getText();
		assert Remark_C.equals(Remark): "Remark is not equal";
	}
	
	public void Complete_and_Verify() {
		clickOnElement(CONT_BUT);
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
