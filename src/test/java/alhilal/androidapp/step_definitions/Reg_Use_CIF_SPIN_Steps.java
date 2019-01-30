package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.AppStrings.*;

import alhilal.androidapp.pages.Reg_Use_CIF_SPIN_Page;
import cucumber.api.java.en.Then;

public class Reg_Use_CIF_SPIN_Steps extends Reg_Use_CIF_SPIN_Page{
	
	@Then("^Tap on register using your customer number link and navigate to customer registration screen$")
	public void tap_on_register_using_your_customer_number_link_and_navigate_to_customer_registration_screen() {
		Tap_Cus_Reg();
	}

	@Then("^Enter the valid customer number$")
	public void enter_the_valid_customer_number() {
		Ent_Valid_Cus_No();
	}
	
	@Then("^Enter the valid customer number1$")
	public void enter_the_valid_customer_number1() {
		Ent_Valid_Cus_No1();
	}

	@Then("^Enter the valid SMS PIN$")
	public void enter_the_valid_SMS_PIN() {
		Ent_Valid_SMS_PN();
	}

	@Then("^Enter the inactive CIF Card number$")
	public void enter_the_inactive_CIF_Card_number() {
		Ent_inactive_Cus_No();
	
	}
	
	@Then("^Verify the validation message appears for inactive CIF$")
	public void verify_the_validation_message_appears_for_inactive_CIF() {
		Verify_Validation_Message(Inactive_CIF_Validation_Message);
	}
	
	@Then("^Verify the validation message appears for inactive CIF for reset PIN$")
	public void verify_the_validation_message_appears_for_inactive_CIF_for_reset_PIN() {
		Verify_Validation_Message(Inactive_CIF_Validation_Message_R);
	}
	
	@Then("^Verify the validation message appears for inactive CIF for reset PIN1$")
	public void verify_the_validation_message_appears_for_inactive_CIF_for_reset_PIN1() {
		Verify_Validation_Message(Inactive_CIF_Validation_Message_R1);
	}
	
	@Then("^Verify the validation message appears for incorrect CIF$")
	public void verify_the_validation_message_appears_for_incorrect_CIF() {
		Verify_Validation_Message(Inactive_CIF_Validation_Message);
	}
	
	@Then("^Enter the incorrect CIF number$")
	public void enter_the_incorrect_CIF_Card_number() {
		Ent_incor_Cus_No();
	}
	
	@Then("^Enter the incorrect SMS PIN number$")
	public void enter_the_incorrect_SMS_PIN_number() {
		Enter_Incor_Sms_Pin();
	}
	
	@Then("^Enter the customer number with inactive pin$")
	public void enter_the_customer_number_with_inactive_pin(){
		Ent_Cus_No_inactive_SMS_Pin();
	}
	
	@Then("^Enter the customer number with no spin set$")
	public void enter_the_customer_no_with_no_spin_set() {
		Enter_Cus_With_No_SPin();
	}
	
	@Then("^Enter the inactive SMS PIN number$")
	public void enter_the_inactive_SMS_PIN_number(){
		Ent_inactive_SMS_Pin();
	}
	
	@Then("^Enter the invalid SMS PIN number$")
	public void enter_the_invalid_SMS_PIN_number(){
		Ent_invalid_SMS_Pin();
	}

	/*@Then("^Verify the validation for SMS pin fails$")
	public void verify_the_validation_for_SMS_pin_fails(){
		Verify_Validation_Message(Inactive_CIF_Validation_Message);
	}*/

	
	@Then("^Verify the validation for SMS pin fails1$")
	public void verify_the_validation_for_SMS_pin_fails1(){
		Verify_Validation_Message(Inactive_CIF_Validation_Message1);
	}
	
	@Then("^Verify the validation for SMS pin fails$")
	public void verify_the_validation_for_SMS_pin_fails(){
		Verify_Validation_Message(Inactive_CIF_Validation_Message_InvSMS);
	}
	
	@Then("^Verify the validation for Tpin fails$")
	public void verify_the_validation_for_Tpin_fails(){
		Verify_Validation_Message(Inactive_CIF_Validation_Message_InvTPIN);
	}
	
	@Then("^Verify the validation for SMS pin fails for reset PIN$")
	public void verify_the_validation_for_SMS_pin_fails_Reset_PIN1(){
		Verify_Validation_Message(Inactive_CIF_Validation_Message_R1);
	}
	
	@Then("^Enter the invalid SMS PIN number for 5 times$")
	public void enter_the_invalid_Debit_Card_PIN_number_for_5_times() {
		for (int i=0; i<=5; i++) {
			Ent_invalid_SMS_Pin();
			}
	}
}
