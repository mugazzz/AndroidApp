package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.Locators.*;
import static alhilal.androidapp.utils.AppStrings.*;

public class Ad_benefi_Third_Party_Page extends CommonPage{
	
	public void Tap_Tab_Transfer_Icon() {
		clickOnElement(TRANF_TAB);
		//appiumHelpers.waitForVisibilityOfElement(TRANF_TO_OTHERS);
	}
	
	public void Select_other_option() {
		clickOnElement(TRANF_TO_OTHERS);
		appiumHelpers.waitForVisibilityOfElement(ADD_BENIF);
	}
	
	public void Tap_Add_Benficiary() {
		clickOnElement(ADD_BENIF);
		appiumHelpers.waitForVisibilityOfElement(OTHER_BANK);
	}

	public void Tap_Other_Bank() {
		clickOnElement(OTHER_BANK);
		appiumHelpers.waitForVisibilityOfElement(ENT_IBAN);
	}
	
	public void Enter_IBAN_Num() {
		enterText(ENT_IBAN, iban);
		driver.hideKeyboard();
	}
	
	public void Enter_Incoi_IBAN_Num() {
		enterText(ENT_IBAN, inc_iban);
		driver.hideKeyboard();
	}
	
	public void Tap_Next_Btn() {
		clickOnElement(NXT_BTN);
		appiumHelpers.waitForVisibilityOfElement(FUL_NAME);
	}
	
	public void  Enter_Full_Name() {
		 enterText(FUL_NAME, Full_Name);
	}
	
	public void Enter_Nick_Name() {
		enterText(NICK_NAME, Nick_Name);
		driver.hideKeyboard();
	}
	
	public void  Enter_Full_Name1() {
		 enterText(FUL_NAME, Full_Name1);
	}
	
	public void Enter_Nick_Name1() {
		enterText(NICK_NAME, Nick_Name1);
		driver.hideKeyboard();
	}
	
	public void Tap_Next_Btn2() {
		clickOnElement(NXT_BTN);
		appiumHelpers.waitForVisibilityOfElement(BEN_NAME);
	}
	
	public void Benif_Verify_Detials() {
		String BENI_NAME = driver.findElement(BEN_NAME_DATA).getText();
		System.out.println(BENI_NAME);
		assert BENI_NAME.equals(Full_Name) : "Full name matches";
		String CONT_NAME = driver.findElement(CONT_DATA).getText();
		System.out.println(CONT_NAME);
		assert CONT_NAME.equals(Contry) : "Contry name matches";
		String BANK_NAME = driver.findElement(BANK_DATA).getText();
		System.out.println(BANK_NAME);
		assert BANK_NAME.equals(Bank_Name) : "Bank name matches";
		String iBAN = driver.findElement(BRANCH_DATA).getText();
		System.out.println(iBAN);
		assert iBAN.equals(iban1) : "Branch name matches";
		String NICK_NME = driver.findElement(NICK_DATA).getText();
		System.out.println(NICK_NME);
		assert NICK_NME.equals(Nick_Name) : "nick name matches";
		
	}
	
	public void Benif_Verify_Detials1() {
		String BENI_NAME = driver.findElement(BEN_NAME_DATA).getText();
		System.out.println(BENI_NAME);
		assert BENI_NAME.equals(Full_Name) : "Full name matches";
		String CONT_NAME = driver.findElement(CONT_DATA).getText();
		System.out.println(CONT_NAME);
		assert CONT_NAME.equals(Contry1) : "Contry name matches";
		String BANK_NAME = driver.findElement(BANK_DATA).getText();
		System.out.println(BANK_NAME);
		assert BANK_NAME.equals(Bank_Name1) : "Bank name matches";
		String iBAN = driver.findElement(BRANCH_DATA).getText();
		System.out.println(iBAN);
		assert iBAN.equals(iban2) : "Branch name matches";
		String NICK_NME = driver.findElement(NICK_DATA).getText();
		System.out.println(NICK_NME);
		assert NICK_NME.equals(Nick_Name) : "nick name matches";
		String SWIF = driver.findElement(CONT_SWIFT_DA).getText();
		System.out.println(SWIF);
		assert SWIF.equals(Swif_Code) : "SWIF name matches";
		
	}
	
	public void Benif_Verify_Detials_ahb() {
		String BENI_NAME = driver.findElement(BEN_NAME_DATA).getText();
		System.out.println(BENI_NAME);
		//assert BENI_NAME.equals(Full_Name_AHB) : "Full name matches";
		String CONT_NAME = driver.findElement(ACC_NUMBER_DA).getText();
		System.out.println(CONT_NAME);
		assert CONT_NAME.equals(AHB_ACC1) : "Account number name matches";
		String BANK_NAME = driver.findElement(BANK_DATA).getText();
		System.out.println(BANK_NAME);
		assert BANK_NAME.equals(Bank_Name_ahb) : "Bank name matches";
		String iBAN = driver.findElement(BRANCH_DATA).getText();
		System.out.println(iBAN);
		assert iBAN.equals(iban_ahb) : "Branch name matches";
		String NICK_NME = driver.findElement(NICK_DATA).getText();
		System.out.println(NICK_NME);
		assert NICK_NME.equals(Nick_Name) : "nick name matches";
		
	}
	
	public void Verify_Fing_Pop() {
		clickOnElement(NXT_BTN);
		appiumHelpers.waitForVisibilityOfElement(FINGERPRINTS_POPUP);
	}
	
	public void Verify_AutoFly() {
		appiumHelpers.waitForVisibilityOfElement(OTP_HD);
		appiumHelpers.assertTrue(elementExists(OTP_HD), "Screen navigated to OTP screen");
	}
	
	public void Tap_And_Nav_Swif() {
		clickOnElement(ACCANDSWIFT);
		appiumHelpers.waitForVisibilityOfElement(ACC_NUM);
	}
	
	public void Enter_Acc_Swif() {
		enterText(ACC_NUM, Acc_Num);
		enterText(SWIF_COD, Swif_Code);
		driver.hideKeyboard();
	}
	
	public void Nav_Con_Code() {
		clickOnElement(NXT_BTN);
		appiumHelpers.waitForVisibilityOfElement(CONT_HD);
	}
	
	public void Dup_Validation() {
		//appiumHelpers.waitForVisibilityOfElement();
		Verify_Validation_Message(DUP_NICK);
	}
	
	public void Dup_iban_Validation() {
		//appiumHelpers.waitForVisibilityOfElement();
		Verify_Validation_Message(DUP_IBAN);
	}
	
	public void Ent_Con_Cod() {
		enterText(CONT_COD, Con_Tm);
		driver.hideKeyboard();
		clickOnElement(CONT_SKIP);
		appiumHelpers.waitForVisibilityOfElement(FUL_NAME);
	}
	
	public void Ent_AHB_Acc() {
		enterText(ACC_NUM, AHB_ACC);
		driver.hideKeyboard();
	}
	
	public void Enter_Full_Name_ahb() {
		 enterText(FUL_NAME, Full_Name_AHB);
	}
	
	public void Verify_sucess() {
		appiumHelpers.waitForVisibilityOfElement(SUCCESS_PAGE);
	}
	
	public void Enter_Acc_Incor_Swif() {
		enterText(ACC_NUM, Acc_Num);
		enterText(SWIF_COD, Incor_Swif_Code);
		driver.hideKeyboard();
	}
	
	public void Veri_Vali() {
		clickOnElement(NXT_BTN);
		Verify_Validation_Message(INVALID_SWIFT);
	}
	
	public void Veri_Vali_iban() {
		clickOnElement(NXT_BTN);
		Verify_Validation_Message(INVALID_IBAN);
	}
}
