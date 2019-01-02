package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Tran_Mon_Oth_3rd_Acc_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tran_Mon_Oth_3rd_Acc_Steps extends Tran_Mon_Oth_3rd_Acc_Page{
	
	@Then("^Select any third party account and navigate to transfers screen$")
	public void select_any_third_party_account_and_navigate_to_transfers_screen() throws Throwable {
	   Tap_3rd_Acc();
	}
	
	@Then("^Select the AHB Card and navigate to transfer screen$")
	public void Select_AHB_Card() throws Throwable {
		Tap_card();
	}
	
	@Then("^Select any third party account and navigate to transfers screen1$")
	public void select_any_third_party_account_and_navigate_to_transfers_screen1() throws Throwable {
	   Tap_3rd_Acc1();
	}
	
	
	@Then("^Select any local third party account and navigate to transfers screen$")
	public void select_any_local_third_party_account_and_navigate_to_transfers_screen() throws Throwable {
	   Tap_Loc_3rd_Acc();
	}
	
	@Then("^Select own account and navigate to transfers screen$")
	public void select_own_account_and_navigate_to_transfers_screen() throws Throwable {
	   Tap_own_Acc();
	}
	
	@Then("^Select AHB account and navigate to transfers screen$")
	public void select_AHB_account_and_navigate_to_transfers_screen() throws Throwable {
	   Tap_own_Acc();
	}
	
	@Then("^Select any local third party account and navigate to transfers screen1$")
	public void select_any_local_third_party_account_and_navigate_to_transfers_screen1() throws Throwable {
	   Tap_Loc_3rd_Acc1();
	}

	@Then("^Tap on from account and select the current account$")
	public void tap_on_from_account_and_select_the_current_account() throws Throwable {
	   Sel_Cur_Acc();
	}
	
	
	@Then("^Tap on from account and select the current account1$")
	public void tap_on_from_account_and_select_the_current_account1() throws Throwable {
	   Sel_Cur_Acc1();
	}
	
	@Then("^Tap on from account and select the current account2$")
	public void tap_on_from_account_and_select_the_current_account2() throws Throwable {
	   Sel_Cur_Acc2();
	}
	
	@Then("^Tap on from account and select the current account_1000000$")
	public void tap_on_from_account_and_select_the_current_account1000000() throws Throwable {
	   Sel_Cur_Acc100000();
	}
	
	@Then("^Tap on from account and select the savings account$")
	public void tap_on_from_account_and_select_the_savings_account() throws Throwable {
	   Sel_Sav_Acc();
	}
	
	@Then("^Tap on from account and select the savings account1$")
	public void tap_on_from_account_and_select_the_savings_account1() throws Throwable {
	   Sel_Sav_Acc1();
	}

	@Then("^Verify the available balance amount appears$")
	public void verify_the_available_balance_amount_appears() throws Throwable {
	  Veri_Avai_Amt();
	}

	@When("^Enter the amount and change the currency$")
	public void enter_the_amount_and_change_the_currency() throws Throwable {
	   Enter_Amt_Cur();
	}
	
	@When("^Enter the amount and change the currency3$")
	public void enter_the_amount_and_change_the_currency3() throws Throwable {
	   Enter_Amt_Cur1();
	}

	@Then("^Verify the indicative amount appears$")
	public void verify_the_indicative_amount_appears() throws Throwable {
	   Ver_Indic_Amt();                                            
	}

	@Then("^Select the from charges pay by and choose Me$")
	public void select_the_from_charges_pay_by_and_choose_Me() throws Throwable {
	  Select_Charge_Pay();
	}

	@Then("^Choose the reason as charitable contributions$")
	public void choose_the_reason_as_charitable_contributions() {
	  Select_Reason();
	}

	@Then("^Enter the remarks$")
	public void enter_the_remarks() {
	  Enter_Remark();
	}

	@Then("^Click on next and verify the screen redirect to transfers details screen$")
	public void click_on_next_and_verify_the_screen_redirect_to_transfers_details_screen(){
	 Nav_Tran_Con();
	}
	
	@Then("^Click on next and verify the validation errror appears$")
	public void click_on_next_and_verify_the_validation_error(){
	 Verify_Great();
	}
	
	@Then("^Click on next and verify the validation errror appears1$")
	public void click_on_next_and_verify_the_validation_error1(){
	 Verify_Great1();
	}
	
	@Then("^Click on next and verify the validation errror appears2$")
	public void click_on_next_and_verify_the_validation_error2(){
		Verify_Great4();
	}
	
	@Then("^Verify the validation message$")
	public void Verify_the_validation_message(){
	Verify_Great3();
	}

	@Then("^Verify the transfer details$")
	public void verify_the_transfer_details(){
	 Verf_Tran_Detail();
	}
	
	@Then("^Verify the transfer details for cards$")
	public void verify_the_transfer_details_for_cards(){
	 Verf_Tran_Detail_for_card();
	}
	
	@Then("^Verify the transfer details1$")
	public void verify_the_transfer_details1(){
	 Verf_Tran_Detail1();
	}
	
	@Then("^Verify the transfer details100000$")
	public void verify_the_transfer_details100000(){
	 Verf_Tran_Detail100000();
	}
	
	@Then("^Verify the savings transfer details$")
	public void verify_the_Save_transfer_details(){
	 Verf_Sav_Tran_Detail();
	}
	
	@Then("^Verify the savings transfer details1$")
	public void verify_the_Save_transfer_details1(){
	 Verf_Sav_Tran_Detail1();
	}

	@Then("^Tap confirm button and verify the screen redirected to successfully transfered screen$")
	public void tap_confirm_button_and_verify_the_screen_redirected_to_successfully_transfered_screen(){
	   Complete_and_Verify();
	}
	
	@Then("^Tap confirm button and verify the screen redirected to successfully transfered screen100000$")
	public void tap_confirm_button_and_verify_the_screen_redirected_to_successfully_transfered_screen100000(){
	   Complete_and_Verify100000();
	}
	
	@Then("^Tap on from account and verify the savings account with zero balance is not shown$")
	public void tap_on_from_account_and_verify_the_savings_account_with_zero_balance_is_not_shown() {
	   Verify_Zero_Savings();
	}
	
	@Then("^Tap on from account and verify the inactive savings account is not shown$")
	public void tap_on_from_account_and_verify_the_inactive_savings_account_with_zero_balance_is_not_shown() {
		Verify_Inact_Savings();
	}
	
	@Then("^Tap on from account and verify the Current account with zero balance is not shown$")
	public void tap_on_from_account_and_verify_the_current_account_with_zero_balance_is_not_shown() {
	   Verify_Zero_Current();
	}
	
	@Then("^Tap on from account and verify the inactive current account is not shown$")
	public void tap_on_from_account_and_verify_the_inactive_current_account_with_zero_balance_is_not_shown() {
		Verify_Inact_Current();
	}
	
	@Then("^Tap on from account and verify the inactive current account is not shown1$")
	public void tap_on_from_account_and_verify_the_inactive_current_account_with_zero_balance_is_not_shown1() {
		Verify_Inact_Current1();
	}
	
	@Then("^Tap on from account and verify the inactive current account is not shown2$")
	public void tap_on_from_account_and_verify_the_inactive_current_account_with_zero_balance_is_not_shown2() {
		Verify_Inact_Current2();
	}
	
	@Then("^Enter the Transfer amount and change the currency$")
	public void Enter_the_Transfer_amount_and_change_currency() {
		Enter_Avai_Amt();
	}
	
	@Then("^Enter the Transfer amount and change the currency1$")
	public void Enter_the_Transfer_amount_and_change_currency1() {
		Enter_Avai_Amt1();
	}
	
	@Then("^Enter the Transfer amount and change the currency USD$")
	public void Enter_the_Transfer_amount_and_change_currency_USD() {
		Enter_Avai_Amt_USD();
	}
	
	@Then("^Enter the Transfer amount 100000 and change the currency USD$")
	public void Enter_the_Transfer_amount_100000_and_change_currency_USD() {
		Enter_Avai_Amt_USD_100000();
	}
	
	@Then("^Transfer the amount 30K for 3 times$")
	public void Transfer_the_amount_30K_for_3_times() {
		for (int i=0; i<=3; i++) {
			Transfer_30K();
			System.out.println("Round number: "+i);
		}
	
	}
	
	@Then("^Transfer the amount 30K for 3 times using international$")
	public void Transfer_the_amount_30K_for_3_times_Inter() {
		for (int i=0; i<=3; i++) {
			Transfer_30K_inter();
			System.out.println("Round number: "+i);
		}
	
	}

}
