package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Account_Section_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Account_Section_Steps extends Account_Section_Page {

	@Then("^Verify the operative current account details in dashboard$")
	public void verify_the_operative_account_details_in_dashboard() throws Throwable {
		Verify_Current_Accounts_List();
	}

	@Then("^Navigate to current account details and additional account details$")
	public void navigate_to_current_account_details_and_additional_account_details() throws Throwable {
	   Verify_current_addition_details();
	}
	
	@Then("^Verify the operative saving account details in dashboard$")
	public void verify_the_operative_saving_account_details_in_dashboard() throws Throwable {
		Verify_Saving_Accounts_List();
	}

	@Then("^Navigate to saving account details and additional account details$")
	public void navigate_to_saving_account_details_and_additional_account_details(){
	   Verify_saving_addition_details();
	}
	
	@Then("^Return back to dashboard screen$")
	public void navigate_to_back_to_Dashboard(){
	  Navigate_Back_Dashboard();
	}
	
	@Given("^Register the user whose card should not show specific account status$")
	public void register_the_user_whose_card_should_not_show_specific_account_status() {
		Register_Specific_user();
	}

	@Then("^Verify the account section is displayed in case of no accounts$")
	public void verify_the_account_section_is_not_displayed_in_case_of_no_account() {
	 Verify_Absence_Account_Section();
	}
	
	@Then("^Verify my finances is availble for the user$")
	public void verify_my_finances_is_availble_for_the_user() {
	   Verify_My_Finance();
	}

	@Then("^Tap on active finance and navigate to finance detail screen$")
	public void tap_on_active_finance_and_navigate_to_finance_detail_screen() {
	  Navigate_To_Finance_Details();
	}

	@Then("^Verify the finance details for user$")
	public void verify_the_finance_details_for_user() {
	   Verify_Finance_Details();
	}

	@Then("^Navigate to finance additional details screen and verify the details$")
	public void navigate_to_finance_additional_details_screen_and_verify_the_details() {
	    Verify_Additional_Details();
	}
	
	@Given("^Register the user who doesn't have' Finance account section$")
	public void register_the_user_doesnot_have_finance_account_section() {
		Register_Specific_user_No_Finance();
	}
	
	@Given("^Register the user who doesn't have deposit section$")
	public void register_the_user_doesnot_have_deposit_section() {
		Register_Specific_user_No_Finance();
	}
	
	@Then("^Verify the finance section is displayed in case of no accounts$")
	public void verify_the_Finance_section_is_not_displayed_in_case_of_no_account() {
		Verify_Absence_Finance_Section();
	}
	
	@Given("^Register the user who have Deposit account section$")
	public void register_the_user_who_have_Deposit_account_section() {
	   Register_User_Deposit_Account();
	}

	@Then("^Verify my deposits is availble for the user$")
	public void verify_my_deposits_is_availble_for_the_user() {
		Verify_My_Deposit();
	}

	@Then("^Tap on any deposit account and navigate to deposit detail screen$")
	public void tap_on_any_deposit_account_and_navigate_to_deposit_detail_screen() {
		Navigate_To_Deposit_Details();
	}

	@Then("^Verify the deposit details for user$")
	public void verify_the_deposit_details_for_user() {
		Verify_Deposit_Details();
	}
	
	@Then("^Verify the deposit section is not displayed in case of no accounts$")
	public void verify_the_deposit_section_is_not_displayed_in_case_of_no_account() {
		Verify_Absence_Deposit_Section();
	}

}
