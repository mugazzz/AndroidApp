package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.RemoteWebElement;

import io.appium.java_client.MobileElement;

public class Account_Section_Page extends CommonPage{

	public void Verify_Current_Accounts_List() {
		String Acutal_numer = driver.findElement(ACT_CURRENT_ACC).getText();
		System.out.println("ASP1: "+ Acutal_numer);
		clickOnElement(ACT_CURRENT_ACC);
		appiumHelpers.waitForVisibilityOfElement(ACCO_NUMBER);
		String Acc_number = driver.findElement(ACCO_NUMBER).getText();
		System.out.println("ASP: "+Acc_number);
		//assert Acc_number.equals(Acutal_numer): "Account number is equal";
		String acc_bal = driver.findElement(CARD_BAL).getText();
		String acc_balc = acc_bal.substring(0, acc_bal.length()-4);
		System.out.println("Account Balance: "+ acc_balc);
		try {
			float acc_balf = Float.parseFloat(acc_balc);
			assert acc_balf >=0: "Account number is not working";
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		
	}
	
	public void Verify_Saving_Accounts_List() {
		String Acutal_numer = driver.findElement(ACT_SAVING_ACC).getText();
		System.out.println("ASP1: "+ Acutal_numer);
		clickOnElement(ACT_SAVING_ACC);
		appiumHelpers.waitForVisibilityOfElement(AACCOUNT_LABEL);
		String Acc_number = driver.findElement(ACCO_NUMBER).getText();
		System.out.println("ASP: "+Acc_number);
		//assert Acc_number.equals(Acutal_numer): "Account number is equal";
		String acc_bal = driver.findElement(CARD_BAL).getText();
		String acc_balc = acc_bal.substring(0, acc_bal.length()-4);
		System.out.println("Account Balance: "+ acc_balc);
		try {
			float acc_balf = Float.parseFloat(acc_balc);
			assert acc_balf >=0: "Account number is not working";
		  	}
		catch (NumberFormatException e) {
		  		System.out.println("not a number");
		  	}
		
	}
	
	public void Verify_current_addition_details() {
		String Acc_number = driver.findElement(ACCO_NUMBER).getText();
		String acc_bal = driver.findElement(CARD_BAL).getText();
		clickOnElement(INFO_BTN);
		appiumHelpers.waitForVisibilityOfElement(ACC_DETAIL);
		String acc_bala = driver.findElement(ACC_AMT).getText();
		assert acc_bala.equals(acc_bala): "Account balance is different";
		appiumHelpers.assertTrue(elementExists(IBAN), "IBAN is visible");
		String IBANValue = driver.findElement(IBANV).getText();
		System.out.println("IBAN value: "+IBANValue);
		assert IBANValue.equals(IBANValue) : "IBAN value is not equal";
		appiumHelpers.assertTrue(elementExists(Account_Number_D), "Account number is visible");
		String Acc_Numner = driver.findElement(Account_Number_D_V).getText();
		System.out.println("Account number value: "+Acc_Numner);
		assert Acc_Numner.length() != 0 : "Account number is not expected";
		appiumHelpers.assertTrue(elementExists(SCodeD), "SWIFT Code is visible");
		String SWIFT_Code = driver.findElement(SCodeD_V).getText();
		System.out.println("Swift Code number value: "+SWIFT_Code);
		assert SWIFT_Code.length() != 0 : "SWIFT_Code is not expected";
		appiumHelpers.assertTrue(elementExists(Account_holderD), "Account holder name is visible");
		String Account_holder = driver.findElement(Account_holderD_v).getText();
		System.out.println("Account holder value: "+Account_holder);
		assert Account_holder.length() != 0 : "Account holder name is not expected";
		appiumHelpers.assertTrue(elementExists(Account_holder_CIF), "Account holder CIF is visible");
		String Account_holder_CIF = driver.findElement(Account_holder_CIF_v).getText();
		System.out.println("Account holder CIF value: "+Account_holder_CIF);
		assert Account_holder_CIF.length() != 0 : "Account holder CIF is not expected";
		appiumHelpers.assertTrue(elementExists(Branch), "Account holder CIF is visible");
		String Branch = driver.findElement(BranchV).getText();
		System.out.println("Branch value: "+Branch);
		assert Branch.length() != 0 : "Branch value is not expected";
		if (elementExists(LINKEDDEBIT)) {
			appiumHelpers.assertTrue(elementExists(LINKD1), "Linked Debit card is visible");
			String LinkedCard = driver.findElement(LINKD1).getText();
			assert LinkedCard.length() != 0: "Linked Credit card is not working";
			System.out.println("Card Number is: "+driver.findElement(LINKD1).getText());
			String LinkedStatus = driver.findElement(LINKD1V).getText();
			assert LinkedStatus.length() != 0: "Linked Credit card status is not working";
			System.out.println("Linked Debit card status: "+ driver.findElement(LINKD1V).getText());
		}
	}
	
	public void Verify_saving_addition_details() {
		String Acc_number = driver.findElement(ACCO_NUMBER).getText();
		String acc_bal = driver.findElement(CARD_BAL).getText();
		clickOnElement(INFO_BTN);
		appiumHelpers.waitForVisibilityOfElement(ACC_DETAIL);
		String acc_bala = driver.findElement(ACC_AMT).getText();
		assert acc_bala.equals(acc_bala): "Account balance is different";
		appiumHelpers.assertTrue(elementExists(IBAN), "IBAN is visible");
		String IBANValue = driver.findElement(IBANV).getText();
		System.out.println("IBAN value: "+IBANValue);
		assert IBANValue.equals(IBANValue) : "IBAN value is not equal";
		appiumHelpers.assertTrue(elementExists(Account_Number_D), "Account number is visible");
		String Acc_Numner = driver.findElement(Account_Number_D_V).getText();
		System.out.println("Account number value: "+Acc_Numner);
		assert Acc_Numner.length() != 0 : "Account number is not expected";
		appiumHelpers.assertTrue(elementExists(SCodeD), "SWIFT Code is visible");
		String SWIFT_Code = driver.findElement(SCodeD_V).getText();
		System.out.println("Swift Code number value: "+SWIFT_Code);
		assert SWIFT_Code.length() != 0 : "SWIFT_Code is not expected";
		appiumHelpers.assertTrue(elementExists(Account_holderD), "Account holder name is visible");
		String Account_holder = driver.findElement(Account_holderD_v).getText();
		System.out.println("Account holder value: "+Account_holder);
		assert Account_holder.length() != 0 : "Account holder name is not expected";
		appiumHelpers.assertTrue(elementExists(Account_holder_CIF), "Account holder CIF is visible");
		String Account_holder_CIF = driver.findElement(Account_holder_CIF_v).getText();
		System.out.println("Account holder CIF value: "+Account_holder_CIF);
		assert Account_holder_CIF.length() != 0 : "Account holder CIF is not expected";
		appiumHelpers.assertTrue(elementExists(Branch), "Account holder CIF is visible");
		String Branch = driver.findElement(BranchV).getText();
		System.out.println("Branch value: "+Branch);
		assert Branch.length() != 0 : "Branch value is not expected";
		if (elementExists(LINKEDDEBIT)) {
			appiumHelpers.assertTrue(elementExists(LINKD1), "Linked Debit card is visible");
			String LinkedCard = driver.findElement(LINKD1).getText();
			assert LinkedCard.length() != 0: "Linked Credit card is not working";
			System.out.println("Card Number is: "+driver.findElement(LINKD1).getText());
			String LinkedStatus = driver.findElement(LINKD1V).getText();
			assert LinkedStatus.length() != 0: "Linked Credit card status is not working";
			System.out.println("Linked Debit card status: "+ driver.findElement(LINKD1V).getText());
		}
	}
	
	public void Navigate_Back_Dashboard() {
		for(int i =0; i<=1; i++) {
			clickOnElement(GO_BACK);
		}
		appiumHelpers.waitForVisibilityOfElement(DASHBOARD_HEADING);
		clickOnElement(MINIMIZE_CHART);
	}
	
	public void Register_Specific_user() {
			Register_Specific_user(Act_Cust_No_Spec_Acc, Act_SMS_PN_Spec_Acc);
		}
	
		public void Verify_Absence_Account_Section() {
			appiumHelpers.assertFalse(elementExists(ACCOUNT_LABEL), "My Account Section is not available");
		}
		
		public void Verify_Absence_Finance_Section() {
			appiumHelpers.assertFalse(elementExists(FINANCES_LABEL), "My Finance Section is not available");
		}
		
		public void Verify_Absence_Deposit_Section() {
			appiumHelpers.assertFalse(elementExists(DEPOSIT_LABEL), "My Deposit Section is not available");
		}
		
		public void  Verify_My_Finance() {
			appiumHelpers.assertTrue(elementExists(FINANCES_LABEL), "My Finances Section is available");
		}
		
		public void  Verify_My_Deposit() {
			scrollDown(ACT_DEPOSIT_ACC1);
			scrollDown(ACT_DEPOSIT_ACC2);
			scrollDown(FINANCES_LABEL);
			appiumHelpers.waitForVisibilityOfElement(DEPOSIT_LABEL);
			appiumHelpers.assertTrue(elementExists(DEPOSIT_LABEL), "My Deposit Section is available");
		}
		
		/*public void verify_MY_Deposit1()
		{
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    HashMap<String, String> scrollObjects = new HashMap<String, String>();
		    scrollObjects.put("direction", "down");
		    scrollObjects.put("element", ((RemoteWebElement) FINANCES_LABEL).getId());
		    js.executeScript("mobile: scroll", scrollObjects);
		    try {
		        Thread.sleep(ONE_SECOND);
		    } catch (InterruptedException e) {
		        e.printStackTrace();
		    }
		}*/
		
		
		public void Navigate_To_Finance_Details() {
			clickOnElement(MY_FINANCE_CARD);
		}
		
		public void Verify_Finance_Details() {
			appiumHelpers.waitForVisibilityOfElement(FIN_TYPE);
			String Fin_Type = driver.findElement(FIN_TYPE).getText();
			assert Fin_Type.length() >=0: "Finance Type label is visible";
			String Fin_Acc_Num = driver.findElement(FIN_ACC_NUM).getText();
			//String Fin_Acc_Numc = Fin_Acc_Num.substring(0, Fin_Acc_Num.length()-4);
			try {
				int Fin_Acc_Numi = Integer.parseInt(Fin_Acc_Num);
				System.out.println("Account Balance: "+ Fin_Acc_Num);
				assert Fin_Acc_Numi >=0: "Account Balance is not working";
			  	}
			catch (NumberFormatException e) {
			  		System.out.println("not a number");
			}
			String Fin_Out_LB = driver.findElement(FIN_OUT_BAL_LB).getText();
			assert Fin_Out_LB.length() >= 0: "Finance Outstanding Balance Label is visible";
			String Fin_Bal_Amt = driver.findElement(FIN_OUT_BAL_VL).getText();
			String FFin_Bal_Amtc = Fin_Bal_Amt.substring(0, Fin_Bal_Amt.length()-4);
			try {
				float FFin_Bal_Amti = Float.parseFloat(FFin_Bal_Amtc);
				System.out.println("Finance OutStand Balance amount: "+ FFin_Bal_Amti);
				assert FFin_Bal_Amti >=0: "Finance OutStand Balance amount is not working";
			  	}
			catch (NumberFormatException e) {
			  		System.out.println("not a number");
			}
			appiumHelpers.assertTrue(elementExists(NXT_PY_AM_LB), "Next payment amount is visible");
			String Next_payment_amount = driver.findElement(NXT_PY_AM_VL).getText();
			System.out.println("Next payment amount: "+Next_payment_amount);
			String Next_payment_amountc = Next_payment_amount.substring(0, Next_payment_amount.length()-4);
			try {
				float Next_payment_amounti = Float.parseFloat(Next_payment_amountc);
				System.out.println("Next payment amount: "+ Next_payment_amounti);
				assert Next_payment_amounti >=0: "Next payment amount is not working";
			  	}
			catch (NumberFormatException e) {
		  		System.out.println("not a number");
				}
			appiumHelpers.assertTrue(elementExists(NXT_PY_DATE_LB), "Next payment date is visible");
			String Next_payment_date = driver.findElement(NXT_PY_DATE_VL).getText();
			System.out.println("Next payment date is: "+Next_payment_date);
			assert Next_payment_date.length() >=0: "Next payment date is visible";
			
		}
		
		public void Verify_Additional_Details() {
			String Fin_Type = driver.findElement(FIN_TYPE).getText();
			String Fin_Bal_Amt = driver.findElement(FIN_OUT_BAL_VL).getText();
			String Next_payment_amount = driver.findElement(NXT_PY_AM_VL).getText();
			String Next_payment_date = driver.findElement(NXT_PY_DATE_VL).getText();
			String Fin_Acc_Num = driver.findElement(FIN_ACC_NUM).getText();
			clickOnElement(INFO_BTN);
			appiumHelpers.waitForVisibilityOfElement(FIN_DETAIL);
			String Fin_TypeA = driver.findElement(FIN_TYPE_A).getText();
			assert Fin_TypeA.equals(Fin_Type);
			String Fin_Bal_AmtA = driver.findElement(FIN_OUT_BAL_VL_A).getText();
			assert Fin_Bal_AmtA.equals(Fin_Bal_Amt);
			appiumHelpers.assertTrue(elementExists(FIN_NXT_PY_AMT_LB), "Next Payment amount is visible");
			String Next_Payment_Amt = driver.findElement(FIN_NXT_PY_AMT_FD).getText();
			System.out.println("Next Payment Amt value: "+Next_Payment_Amt);
			assert Next_payment_amount.equals(Next_Payment_Amt) : "Next Payment amount is not equal";
			appiumHelpers.assertTrue(elementExists(FIN_NXT_PY_DT_LB), "Next Payment Date is visible");
			String Next_Payment_Date = driver.findElement(FIN_NXT_PY_DT_FD).getText();
			System.out.println("Next Payment Date value: "+Next_Payment_Date);
			assert Next_Payment_Date.equals(Next_payment_date) : "Next Payment date is not equal";
			appiumHelpers.assertTrue(elementExists(FIN_RM_PY_LB), "Remaining payments is visible");
			String Remaining_payments = driver.findElement(FIN_RM_PY_FD).getText();
			System.out.println("Remaining payments value: "+Remaining_payments);
			try {
				float Remaining_paymentsi = Float.parseFloat(Remaining_payments);
				System.out.println("Remaining payments: "+ Remaining_paymentsi);
				assert Remaining_paymentsi >=0: "Remaining payments is not working";
			  	}
			catch (NumberFormatException e) {
		  		System.out.println("not a number");
				}
			appiumHelpers.assertTrue(elementExists(FIN_RE_PY_AC_LB), "Repayment account is visible");
			String Repayment_account = driver.findElement(FIN_RE_PY_AC_FD).getText();
			System.out.println("Next Payment Date value: "+Repayment_account);
			try {
				int Repayment_accounti = Integer.parseInt(Repayment_account);
				System.out.println("Remaining payments: "+ Repayment_accounti);
				assert Repayment_accounti >=0: "Remaining payments is not working";
			  	}
			catch (NumberFormatException e) {
		  		System.out.println("not a number");
				}
			appiumHelpers.assertTrue(elementExists(FIN_CON_NM_LB), "Contract number is visible");
			String Contract_number = driver.findElement(FIN_CON_NM_FD).getText();
			System.out.println("Contract number value: "+Contract_number);
			assert Contract_number.equals(Fin_Acc_Num): "Contract number is not equal";
			appiumHelpers.assertTrue(elementExists(FIN_CON_DT_LB), "Contract number is visible");
			String Contract_date = driver.findElement(FIN_CON_DT_FD).getText();
			System.out.println("Contract date value: "+Contract_date);
			assert Contract_date.length() >=0 : "Contract number is not equal";
			appiumHelpers.assertTrue(elementExists(FIN_OV_DU_LB), "Overdue amount is visible");
			String Overdue_amount = driver.findElement(FIN_OV_DU_FD).getText();
			System.out.println("Overdue amount: "+Overdue_amount);
			assert Overdue_amount.length() >=0 || Overdue_amount.equals("-") : "Overdue amount is not equal";
		}
		
		public void Register_Specific_user_No_Finance() {
			Register_Specific_user(Act_Cust_No_Spec_Fin, Act_SMS_PN_Spec_Dep);
		}
		
		
		public void Register_User_Deposit_Account() {
			Register_Specific_user(Act_Cust_No_Spec_Dep, Act_SMS_PN_Spec_Dep);
		}
		
		public void Navigate_To_Deposit_Details() {
			//appiumHelpers.waitForVisibilityOfElement(DEPOSIT_ACC);
			clickOnElement(DEPOSIT_ACC);
			//appiumHelpers.waitForVisibilityOfElement(CHEQUE_NO);
			
		}
		
		public void Verify_Deposit_Details() {
			appiumHelpers.waitForVisibilityOfElement(DEPOSIT_TYPE);
			String Deposit_Type = driver.findElement(DEPOSIT_TYPE).getText();
			assert Deposit_Type.length() >=0: "Deposit Type label is visible";
			String Deposit_Ac_No = driver.findElement(DEPOSIT_AC_NO).getText();
			assert Deposit_Ac_No.length() >=0: "Deposit Account Number is working fine";
			String Deposit_Ac_Bl_Lb = driver.findElement(DEPOSIT_AV_BAL_LB).getText();
			assert Deposit_Ac_Bl_Lb.length() >=0: "Deposit Available Balance Label is visible";
			String Deposit_Ac_Bl_Amt = driver.findElement(DEPOSIT_AV_BAL_AMT).getText();
			assert Deposit_Ac_Bl_Amt.length() >=0: "Deposit Available Balance amount is working";
			String Deposit_Exp_Pro = driver.findElement(DEP_EPR_LB).getText();
			assert Deposit_Exp_Pro.length() >=0: "Expected Profite Rate is visible";
			String Deposit_Tenure = driver.findElement(DEP_TN_LB).getText();
			assert Deposit_Tenure.length() >=0: "Tenure label is visible";
			String Deposit_Tenure_Fd = driver.findElement(DEP_TN_FD).getText();
			assert Deposit_Tenure_Fd.length() >=0: "Tenure value is not Empty";
			String Maturity_date = driver.findElement(DEP_MT_DT_LB).getText();
			assert Maturity_date.length() >=0: "Maturity date label is visible";
			String Maturity_date_fd = driver.findElement(DEP_MT_DT_FD).getText();
			assert Maturity_date_fd.length() >=0: "Maturity date value is not empty";
			String Profit_account_number = driver.findElement(DEP_PF_AC_LB).getText();
			assert Profit_account_number.length() >=0: "Profit account number label is visible";
			String Profit_account_number_fd = driver.findElement(DEP_PF_AC_FD).getText();
			assert Profit_account_number_fd.length() >=0: "Profit account number is not empty";
		}

}
