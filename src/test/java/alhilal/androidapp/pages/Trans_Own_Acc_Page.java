package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.time.LocalDate;

public class Trans_Own_Acc_Page extends CommonPage{
	 public void Select_Saving_usd() {
		 clickOnElement(SAV_USD_404);
		 appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	 }
	 
	 public void Select_Current_usd() {
		 clickOnElement(CUR_USD404);
		 appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	 }
	 
	 public void Select_Card_usd() {
		 //scrollDown(SAV_USD);
		 clickOnElement(CARD_USD404);
		 appiumHelpers.waitForVisibilityOfElement(FROM_ACC);
	 }
	 
	 public void Select_From_Current() {
		 clickOnElement(FROM_ACC);
		 clickOnElement(FROM_CUR404);
	 }
	 
	 public void Select_From_Current1() {
		 clickOnElement(FROM_ACC);
		 clickOnElement(FROM_CUR1);
	 }
	 
	 public void Verify_Amount() {
		 String Avail_Amt = driver.findElement(AVAI_AMT).getText();
			System.out.println(Avail_Amt);
			String Avail_Amt1 = Avail_Amt.substring(17, Avail_Amt.length()-4);
			System.out.println(Avail_Amt1);
	 }
	 
	 public void Enter_Amount() {
		 enterText(TRAN_AMT, Tran_amt);
	 }
	 
	 public void Verify_Currency() {
//		 clickOnElement(SEL_CUR);
//		 appiumHelpers.waitForVisibilityOfElement(USD);
//		 appiumHelpers.waitForVisibilityOfElement(AED);
//		 clickOnElement(USD);
	 }
	 
	 public void Verify_Currency1() {
//		 clickOnElement(SEL_CUR);
//		 appiumHelpers.waitForVisibilityOfElement(USD);
//		 appiumHelpers.waitForVisibilityOfElement(AED);
//		 clickOnElement(AED);
	 }
	 
	 public void Enter_Remark() {
		 enterText(REMARK, Remark);
		 driver.hideKeyboard();
	 }
	 
	 public void Complete_and_Verify() {
			clickOnElement(CONF_LBL);
			appiumHelpers.waitForVisibilityOfElement(REF_NUM);
			String reference_no = driver.findElement(REF_NUM).getText();
			System.out.println(reference_no);
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
