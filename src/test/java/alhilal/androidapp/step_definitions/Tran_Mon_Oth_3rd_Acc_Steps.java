package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Tran_Mon_Oth_3rd_Acc_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Tran_Mon_Oth_3rd_Acc_Steps extends Tran_Mon_Oth_3rd_Acc_Page{
	
	@Then("^Select any third party account and navigate to transfers screen$")
	public void select_any_third_party_account_and_navigate_to_transfers_screen() throws Throwable {
	   Tap_3rd_Acc();
	}
	
	@Then("^Select any local third party account and navigate to transfers screen$")
	public void select_any_local_third_party_account_and_navigate_to_transfers_screen() throws Throwable {
	   Tap_Loc_3rd_Acc();
	}

	@Then("^Tap on from account and select the current account$")
	public void tap_on_from_account_and_select_the_current_account() throws Throwable {
	   Sel_Cur_Acc();
	}
	
	@Then("^Tap on from account and select the savings account$")
	public void tap_on_from_account_and_select_the_savings_account() throws Throwable {
	   Sel_Sav_Acc();
	}

	@Then("^Verify the available balance amount appears$")
	public void verify_the_available_balance_amount_appears() throws Throwable {
	  Veri_Avai_Amt();
	}

	@When("^Enter the amount and change the currency$")
	public void enter_the_amount_and_change_the_currency() throws Throwable {
	   Enter_Amt_Cur();
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

	@Then("^Verify the transfer details$")
	public void verify_the_transfer_details(){
	 Verf_Tran_Detail();
	}
	
	@Then("^Verify the savings transfer details$")
	public void verify_the_Save_transfer_details(){
	 Verf_Sav_Tran_Detail();
	}

	@Then("^Tap confirm button and verify the screen redirected to successfully transfered screen$")
	public void tap_confirm_button_and_verify_the_screen_redirected_to_successfully_transfered_screen() throws Throwable {
	   Complete_and_Verify();
	}

}
