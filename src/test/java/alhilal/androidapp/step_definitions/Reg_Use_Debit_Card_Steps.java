package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Reg_Use_Debit_Card_Page;
import cucumber.api.java.en.Then;

public class Reg_Use_Debit_Card_Steps extends Reg_Use_Debit_Card_Page{
	
	@Then("^Enter the Active Debit Card number$")
	public void enter_the_Active_Debit_Card_number() {
		Enter_Act_Debit_card();
	}
	
	@Then("^Enter the Active Debit Card PIN number$")
	public void enter_the_Active_Debit_Card_PIN_number() {
		Enter_Act_Debit_Pin();
	}
	
	@Then("^Enter the inactive Debit Card number$")
	public void enter_the_inactive_Debit_Card_number() {
		Enter_Inact_Debit_Card();
	}
	
	@Then("^Enter the inactive Debit Card PIN number$")
	public void enter_the_inactive_Debit_Card_PIN_number() {
		Enter_Inact_Debit_Pin();
	}
	
	@Then("^Enter the incorrect Debit Card number$")
	public void enter_the_incorrect_Debit_Card_number() {
		Enter_Incor_Debit_Card();
	}
	
	@Then("^Enter the incorrect Debit Card PIN number$")
	public void enter_the_incorrect_Debit_Card_PIN_number() {
		Enter_Incor_Debit_Pin();
	}
	
	@Then("^Enter the Active Debit Card number with no Pin$")
	public void enter_the_Active_Debit_Card_number_with_no_Pin() {
		Enter_Act_Debit_card_no_pin();
	}
	
	@Then("^Enter the Active Debit Card number whose Pin is not active$")
	public void enter_the_Active_Debit_Card_number_whose_Pin_is_not_active() {
		Enter_Act_Debit_card_inactive_pin();
	}
	
	@Then("^Enter the Inactive Debit Pin number$")
	public void enter_the_Inactive_Debit_Pin_number() {
		Enter_Act_Debit_card_inactive_pin_no();
	}
	
	@Then("^Enter the Expired Debit Card number$")
	public void enter_the_Expired_Debit_Card_number() {
		Enter_Expired_Debit_card();
	}
	
	@Then("^Enter the invalid Debit Card PIN number$")
	public void enter_the_invalid_Debit_Pin_number() {
		Enter_Inv_Debit_Pin();
	}
	
	@Then("^Enter the invalid Debit Card PIN number for 5 times$")
	public void enter_the_invalid_Debit_Card_PIN_number_for_5_times() {
		for (int i=0; i<=5; i++) {
			Enter_Inv_Debit_Pin();
			}
	}

	
	
}
