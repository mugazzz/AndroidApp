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
}
