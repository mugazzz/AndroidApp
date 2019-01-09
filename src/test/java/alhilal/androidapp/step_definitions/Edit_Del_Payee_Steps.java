package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Edit_Del_Payee_Page;
import cucumber.api.java.en.Then;

public class Edit_Del_Payee_Steps extends Edit_Del_Payee_Page{

	@Then("^Tap on Edit payees link$")
	public void tap_on_Edit_payees_link() throws Throwable {
	   Tap_Edit_Pay();
	}

	@Then("^Select a listed payee to edit$")
	public void select_a_listed_payee_to_edit() throws Throwable {
		Select_Payee_Edit();
	}

	@Then("^Tap on Edit link and navigate to edit name screen$")
	public void tap_on_Edit_link_and_navigate_to_edit_name_screen() throws Throwable {
		Tap_Edit_Nam();
	}

	@Then("^Edit the nick name$")
	public void edit_the_nick_name() throws Throwable {
	   Edit_Nic();
	}

	@Then("^Tap confirm button and verify the validation$")
	public void tap_confirm_button_and_verify_the_validation() throws Throwable {
	  Tap_Cnt_Ver();
	}

	@Then("^Verify the save details$")
	public void verify_the_save_details() throws Throwable {
	  Verify_Edit();
	}
	
	@Then("^Tap on delete button and confirm the process$")
	public void tap_on_delete_button_and_confirm_the_process() throws Throwable {
	   Tap_Delete();
	}

	@Then("^Verify the payee delete confirmation message$")
	public void verify_the_payee_delete_confirmation_message() throws Throwable {
	
	}
}
