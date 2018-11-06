package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Reg_Use_CIF_TPIN_Page;
import cucumber.api.java.en.Then;

public class Reg_Use_CIF_TPIN extends Reg_Use_CIF_TPIN_Page{
	
	@Then("^Tap on T-PIN tab to enter T-PIN$")
	public void tap_on_T_PIN_tab_to_enter_T_PIN(){
		Tap_Tpin_Tab();
	}

	@Then("^Enter the valid T-PIN$")
	public void enter_the_valid_T_PIN(){
		Ent_Valid_TPIN_PN();
	}

	@Then("^Tap on Next button$")
	public void tap_on_Next_button() {
		Tap_On_Next();  
	}
	
	@Then("^Enter the incorrect TPIN number$")
	public void enter_the_incorrect_TPIN_number() {
		Enter_Incor_TPin();
	}
	
	@Then("^Enter the customer number with no pin set$")
	public void enter_the_customer_no_with_no_pin_set() {
		Enter_Cus_With_No_Pin();
	}
	
	@Then("^Enter the customer number with inactive Tpin$")
	public void enter_the_customer_number_with_inactive_Tpin(){
		Ent_Cus_No_inactive_TPin();
	}
	
	@Then("^Enter the invalid TPIN number$")
	public void enter_the_invalid_TPIN_number(){
		Ent_invalid_TPin();
	}
	
	@Then("^Enter the invalid TPIN number for 5 times$")
	public void enter_the_invalid_TPIN_number_for_5_times() {
		for (int i=0; i<=5; i++) {
			Ent_invalid_TPin();
			Tap_On_Next();
			}
	}
	
}
