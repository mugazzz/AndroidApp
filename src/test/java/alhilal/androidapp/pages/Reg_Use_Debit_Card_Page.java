package alhilal.androidapp.pages;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

public class Reg_Use_Debit_Card_Page extends CommonPage{
	
	public void Enter_Act_Debit_card() {
		enterText(REG_CARD_NO, Act_Debit_Card_No);
	}
	
	public void Enter_Act_Debit_Pin(){
        enterText(REG_CARD_PN, Act_Debit_Card_Pin);
	}
	
	public void Enter_Inact_Debit_Card() {
		enterText(REG_CARD_NO, Inactive_Debit_Card_No);
	}
	
	public void Enter_Inact_Debit_Pin(){
        enterText(REG_CARD_PN, Inactive_Debit_Card_Pin);
	}
	
	public void Enter_Incor_Debit_Card(){
        enterText(REG_CARD_NO, Incor_Debit_Card_No);
	}
	
	public void Enter_Incor_Debit_Pin(){
        enterText(REG_CARD_PN, Incor_Debit_Card_Pin);
	}
	
	public void Enter_Act_Debit_card_no_pin() {
		enterText(REG_CARD_NO, Act_Debit_Card_No_Pin);
	}
	
	public void Enter_Act_Debit_card_inactive_pin() {
		enterText(REG_CARD_NO, Act_Debit_Card_Inact_Pin);
	}
	
	public void Enter_Act_Debit_card_inactive_pin_no() {
		enterText(REG_CARD_PN, Act_Debit_Card_Inact_Pin_Inact);
	}
	
	public void Enter_Expired_Debit_card() {
		enterText(REG_CARD_NO, Exp_Debit_Card_No);
	}
	
	public void Enter_Inv_Debit_Pin() {
        enterText(REG_CARD_PN, Inval_Debit_Card_Pin);
	}
}
