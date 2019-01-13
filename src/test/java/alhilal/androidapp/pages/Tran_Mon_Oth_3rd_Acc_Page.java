package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import org.hamcrest.CoreMatchers;

public class Tran_Mon_Oth_3rd_Acc_Page extends CommonPage{
	
	public void Tap_3rd_Acc() {
		clickOnElement(THIRD_ACC);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	public void Tap_card() {
		clickOnElement(CARD_ACC);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	public void Tap_3rd_Acc1() {
		clickOnElement(THIRD_ACC1);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	
	public void Tap_Loc_3rd_Acc() {
		clickOnElement(LOC_THIRD_ACC);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	public void Tap_own_Acc() {
		clickOnElement(OWN_ACC);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	public void Tap_Loc_3rd_Acc1() {
		clickOnElement(LOC_THIRD_ACC1);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	public void Tap_AHB_ACO() {
		clickOnElement(AHB_ACC7);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	}
	
	public void Sel_Cur_Acc() {
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(CUR_ACC_AMT);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
	}
	
	public void Sel_Cur_Acc1() {
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(CUR_ACC_AMT1);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
	}
	
	public void Sel_Cur_Acc2() {
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(CUR_ACC_AMT2);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
	}
	
	public void Sel_Cur_Acc3() {
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(CUR_ACC_AMT3);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
	}
	
	public void Sel_Cur_Acc100000() {
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(CUR_ACC_AMT100000);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
	}
	
	public void Sel_Sav_Acc() {
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(SAV_ACC_AMT);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
	}
	
	public void Sel_Sav_Acc1() {
		clickOnElement(FROM_ACC_DATA);
		clickOnElement(SAV_ACC_AMT1);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT);
	}
	
	public void Sel_Sav_Acc2() {
		clickOnElement(FROM_ACC_DATA1);
		clickOnElement(SAV_ACC_AMT1);
		appiumHelpers.waitForVisibilityOfElement(AVAI_AMT1);
	}
	
	public void Veri_Avai_Amt() {
		String Avail_Amt = driver.findElement(AVAI_AMT).getText();
		System.out.println(Avail_Amt);
		String Avail_Amt1 = Avail_Amt.substring(17, Avail_Amt.length()-4);
		System.out.println(Avail_Amt1);
	}
	
	public void Enter_Avai_Amt() {
//		try {
//			String Avail_Amt = driver.findElement(AVAI_AMT).getText();
//			System.out.println(Avail_Amt);
//			String Avail_Amt1 = Avail_Amt.substring(17, Avail_Amt.length()-4);
//			System.out.println(Avail_Amt1);
//			float number = Float.valueOf(Avail_Amt1);
//			float inc_amt = number+1;
//			System.out.println("Add: "+inc_amt);
//			String incr_amt = String.valueOf(inc_amt);
//			System.out.println("Tr: "+incr_amt);
//			enterText(TRAN_AMT, incr_amt);
//		  	}
//		catch (NumberFormatException e) {
//		  		System.out.println("not a number");
//		  	};
		enterText(TRAN_AMT, Tran_amt1);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_AED);
	}
	
	public void Enter_Avai_Amt1() {
//		try {
//			String Avail_Amt = driver.findElement(AVAI_AMT).getText();
//			System.out.println(Avail_Amt);
//			String Avail_Amt1 = Avail_Amt.substring(17, Avail_Amt.length()-4);
//			System.out.println(Avail_Amt1);
//			float number = Float.valueOf(Avail_Amt1);
//			float inc_amt = number+1;
//			System.out.println("Add: "+inc_amt);
//			String incr_amt = String.valueOf(inc_amt);
//			System.out.println("Tr: "+incr_amt);
//			enterText(TRAN_AMT, incr_amt);
//		  	}
//		catch (NumberFormatException e) {
//		  		System.out.println("not a number");
//		  	};
		enterText(TRAN_AMT, Tran_amt3);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_AED);
	}
	
	public void Enter_Avai_Amt_USD() {
//		try {
//			String Avail_Amt = driver.findElement(AVAI_AMT).getText();
//			System.out.println(Avail_Amt);
//			String Avail_Amt1 = Avail_Amt.substring(17, Avail_Amt.length()-4);
//			System.out.println(Avail_Amt1);
//			float number = Float.valueOf(Avail_Amt1);
//			float inc_amt = number+1;
//			System.out.println("Add: "+inc_amt);
//			String incr_amt = String.valueOf(inc_amt);
//			System.out.println("Tr: "+incr_amt);
//			enterText(TRAN_AMT, incr_amt);
//		  	}
//		catch (NumberFormatException e) {
//		  		System.out.println("not a number");
//		  	};
		enterText(TRAN_AMT, Tran_amt3);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_USD);
	}
	
	public void Enter_Avai_Amt_USD1() {
//		try {
//			String Avail_Amt = driver.findElement(AVAI_AMT).getText();
//			System.out.println(Avail_Amt);
//			String Avail_Amt1 = Avail_Amt.substring(17, Avail_Amt.length()-4);
//			System.out.println(Avail_Amt1);
//			float number = Float.valueOf(Avail_Amt1);
//			float inc_amt = number+1;
//			System.out.println("Add: "+inc_amt);
//			String incr_amt = String.valueOf(inc_amt);
//			System.out.println("Tr: "+incr_amt);
//			enterText(TRAN_AMT, incr_amt);
//		  	}
//		catch (NumberFormatException e) {
//		  		System.out.println("not a number");
//		  	};
		enterText(TRAN_AMT, Tran_amt2);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_USD);
	}
	
	public void Enter_Avai_Amt_USD_100000() {
//		try {
//			String Avail_Amt = driver.findElement(AVAI_AMT).getText();
//			System.out.println(Avail_Amt);
//			String Avail_Amt1 = Avail_Amt.substring(17, Avail_Amt.length()-4);
//			System.out.println(Avail_Amt1);
//			float number = Float.valueOf(Avail_Amt1);
//			float inc_amt = number+1;
//			System.out.println("Add: "+inc_amt);
//			String incr_amt = String.valueOf(inc_amt);
//			System.out.println("Tr: "+incr_amt);
//			enterText(TRAN_AMT, incr_amt);
//		  	}
//		catch (NumberFormatException e) {
//		  		System.out.println("not a number");
//		  	};
		enterText(TRAN_AMT, Tran_amt4);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_USD);
	}
	
	public void Enter_Amt_Cur() {
		enterText(TRAN_AMT, Tran_amt);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_AED);
	}
	
	public void Enter_Amt_Cur3() {
		enterText(TRAN_AMT, Tran_amt4);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_AED);
	}
	
	public void Enter_Amt_Cur1() {
		enterText(TRAN_AMT, Tran_amt4);
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
	
	public void  Verify_Great() {
		clickOnElement(CONF_BUT);
		String xmlFormat = driver.getPageSource();
		assertThat(xmlFormat, CoreMatchers.containsString(Great_val));
	}
	
	public void  Verify_Great1() {
		clickOnElement(CONF_BUT);
		String xmlFormat = driver.getPageSource();
		assertThat(xmlFormat, CoreMatchers.containsString(Great_val1));
	}
	
	public void  Verify_Great2() {
		clickOnElement(CONF_BUT);
		String xmlFormat = driver.getPageSource();
		assertThat(xmlFormat, CoreMatchers.containsString(Great_val1));
	}
	
	public void  Verify_Great3() {
		//clickOnElement(CONF_BUT);
		Verify_Validation_Message(Limit_Tran);
	}
	
	public void  Verify_Great4() {
		clickOnElement(CONT_BUT);
		Verify_Validation_Message(Limit_Tran);
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
	
	public void Verf_Tran_Detail_for_card1() {
		String Tran_Amt = driver.findElement(DEBIT_AMT).getText();
		String Tran_Amt1 = Tran_Amt.substring(0, Tran_Amt.length()-4);
		System.out.println("DEbit: "+Tran_Amt1);
		assert Tran_Amt1.equals(Tran_amt3): "Debit amount is not equal";
		appiumHelpers.assertTrue(elementExists(CUR_ACC), "Current Account number is not working");
		String Remark_C = driver.findElement(REM_CFN).getText();
		assert Remark_C.equals(Remark): "Remark is not equal";
	}
	
	public void Verf_Tran_Detail_for_card() {
		String Tran_Amt = driver.findElement(DEBIT_AMT).getText();
		String Tran_Amt1 = Tran_Amt.substring(0, Tran_Amt.length()-4);
		assert Tran_Amt1.equals(Tran_amt): "Debit amount is not equal";
		appiumHelpers.assertTrue(elementExists(CUR_ACC), "Current Account number is not working");
		String Remark_C = driver.findElement(REM_CFN).getText();
		assert Remark_C.equals(Remark): "Remark is not equal";
	}
	
	public void Verf_Tran_Detail_for_card_s() {
		String Tran_Amt = driver.findElement(DEBIT_AMT).getText();
		String Tran_Amt1 = Tran_Amt.substring(0, Tran_Amt.length()-4);
		assert Tran_Amt1.equals(Tran_amt): "Debit amount is not equal";
		appiumHelpers.assertTrue(elementExists(SAV_ACC1), "Current Account number is not working");
		String Remark_C = driver.findElement(REM_CFN).getText();
		assert Remark_C.equals(Remark): "Remark is not equal";
	}
	
	public void Verf_Tran_Detail1() {
		String Tran_Amt = driver.findElement(DEBIT_AMT).getText();
		String Tran_Amt1 = Tran_Amt.substring(0, Tran_Amt.length()-4);
		assert Tran_Amt1.equals(Tran_amt): "Debit amount is not equal";
		appiumHelpers.assertTrue(elementExists(CUR_ACC1), "Current Account number is not working");
		String Reason = driver.findElement(REAS_CFN).getText();
		assert Reason.equals(Reason_c): "Reason is not equal";
		String Charge = driver.findElement(CHAR_BY).getText();
		assert Charge.equals(Charge_c): "Charge is not equal";
		String Remark_C = driver.findElement(REM_CFN).getText();
		assert Remark_C.equals(Remark): "Remark is not equal";
	}
	
	public void Verf_Tran_Detail100000() {
		String Tran_Amt = driver.findElement(DEBIT_AMT).getText();
		String Tran_Amt1 = Tran_Amt.substring(0, Tran_Amt.length()-4);
		assert Tran_Amt1.equals(Tran_amt4): "Debit amount is not equal";
		appiumHelpers.assertTrue(elementExists(CUR_ACC100000), "Current Account number is not working");
		String Reason = driver.findElement(REAS_CFN).getText();
		assert Reason.equals(Reason_c): "Reason is not equal";
		String Charge = driver.findElement(CHAR_BY).getText();
		assert Charge.equals(Charge_c): "Charge is not equal";
		String Remark_C = driver.findElement(REM_CFN).getText();
		assert Remark_C.equals(Remark): "Remark is not equal";
	}
	
	public void Verf_Tran_Detail1000001() {
		String Tran_Amt = driver.findElement(DEBIT_AMT).getText();
		String Tran_Amt1 = Tran_Amt.substring(0, Tran_Amt.length()-4);
		assert Tran_Amt1.equals(Tran_amt4): "Debit amount is not equal";
		appiumHelpers.assertTrue(elementExists(CUR_ACC100000), "Current Account number is not working");
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
	
	public void Verf_Sav_Tran_Detail1() {
		String Tran_Amt = driver.findElement(DEBIT_AMT).getText();
		String Tran_Amt1 = Tran_Amt.substring(0, Tran_Amt.length()-4);
		assert Tran_Amt1.equals(Tran_amt): "Debit amount is not equal";
		appiumHelpers.assertTrue(elementExists(SAV_ACC1), "Savings Account number is not working");
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
	
	public void Complete_and_Verify2() {
		clickOnElement(CONT_BUT);
		appiumHelpers.waitForVisibilityOfElement(REF_NUM);
		String reference_no = driver.findElement(REF_NUM).getText();
		System.out.println(reference_no);
		appiumHelpers.assertTrue(elementExists(AMT_CNF2), "Debited amount is not working");
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
	
	public void Complete_and_Verify1() {
		clickOnElement(CONT_BUT);
		appiumHelpers.waitForVisibilityOfElement(REF_NUM);
		String reference_no = driver.findElement(REF_NUM).getText();
		System.out.println(reference_no);
		appiumHelpers.assertTrue(elementExists(AMT_CNF1), "Debited amount is not working");
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
	
	public void Complete_and_Verify100000() {
		clickOnElement(CONT_BUT);
		appiumHelpers.waitForVisibilityOfElement(REF_NUM);
		String reference_no = driver.findElement(REF_NUM).getText();
		System.out.println(reference_no);
		appiumHelpers.assertTrue(elementExists(AMT_CNF100000), "Debited amount is not working");
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
	
	public void Complete_and_Verify1000001() {
		appiumHelpers.waitForVisibilityOfElement(REF_NUM);
		String reference_no = driver.findElement(REF_NUM).getText();
		System.out.println(reference_no);
		appiumHelpers.assertTrue(elementExists(AMT_CNF100000), "Debited amount is not working");
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
	
	public void Verify_Zero_Current() {
		clickOnElement(FROM_ACC_DATA);
		appiumHelpers.assertFalse(elementExists(ZERO_CUR_ACC), "Zero Balance Current Account should not Appear");
	}
	
	public void Verify_Zero_Savings() {
		clickOnElement(FROM_ACC_DATA);
		appiumHelpers.assertFalse(elementExists(ZERO_SAV_ACC), "Zero Balance Savings Account should not Appear");
	}
	
	public void Verify_Inact_Savings() {
		clickOnElement(FROM_ACC_DATA);
		appiumHelpers.assertFalse(elementExists(INAC_SAV_ACC), "Zero Balance Savings Account should not Appear");
	}
	
	public void Verify_Inact_Current() {
		clickOnElement(FROM_ACC_DATA);
		appiumHelpers.assertFalse(elementExists(INAC_CUR_ACC), "Zero Balance Savings Account should not Appear");	
	}
	
	public void Verify_Inact_Current1() {
		clickOnElement(FROM_ACC_DATA);
		appiumHelpers.assertFalse(elementExists(INAC_CUR_ACC1), "Inactive Account should not Appear");	
	}
	
	public void Verify_Inact_Current2() {
		clickOnElement(FROM_ACC_DATA);
		appiumHelpers.assertFalse(elementExists(INAC_CUR_ACC2), "Inactive Account should not Appear");	
	}
	
	
	public void Transfer_30K() {
		clickOnElement(TRANF_TAB);
		appiumHelpers.waitForVisibilityOfElement(CUR_ACC_AM);
		appiumHelpers.waitForVisibilityOfElement(TRANF_TO_OTHERS);
		clickOnElement(TRANF_TO_OTHERS);
		appiumHelpers.waitForVisibilityOfElement(ADD_BENIF);
		appiumHelpers.waitForVisibilityOfElement(LOC_THIRD_ACC);
		clickOnElement(LOC_THIRD_ACC);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC_DATA);
		Sel_Cur_Acc2();
		Veri_Avai_Amt();
		enterText(TRAN_AMT, Tran_amt2);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_AED);
		clickOnElement(SEL_CHAR);
		clickOnElement(SEL_ME);
		Select_Reason();
		Enter_Remark();
		Nav_Tran_Con();
		Complete_and_Verify2();
		clickOnElement(MY_ACC);
		
	}
	
	public void Transfer_30K_inter() {
		clickOnElement(TRANF_TAB);
		appiumHelpers.waitForVisibilityOfElement(CUR_ACC_AM);
		appiumHelpers.waitForVisibilityOfElement(TRANF_TO_OTHERS);
		clickOnElement(TRANF_TO_OTHERS);
		appiumHelpers.waitForVisibilityOfElement(ADD_BENIF);
		appiumHelpers.waitForVisibilityOfElement(THIRD_ACC);
		clickOnElement(THIRD_ACC);
		appiumHelpers.waitForVisibilityOfElement(FROM_ACC_DATA);
		Sel_Cur_Acc();
		Veri_Avai_Amt();
		enterText(TRAN_AMT, Tran_amt2);
		clickOnElement(SEL_CUR);
		clickOnElement(SEL_AED);
		clickOnElement(SEL_CHAR);
		clickOnElement(SEL_ME);
		Select_Reason();
		Enter_Remark();
		Nav_Tran_Con();
		Complete_and_Verify();
		clickOnElement(MY_ACC);
		
	}

}
