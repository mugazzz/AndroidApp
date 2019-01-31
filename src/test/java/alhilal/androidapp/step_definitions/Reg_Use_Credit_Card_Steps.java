package alhilal.androidapp.step_definitions;

import java.net.MalformedURLException;

import alhilal.androidapp.pages.Reg_Use_Credit_Card_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static alhilal.androidapp.utils.AppStrings.*;

public class Reg_Use_Credit_Card_Steps extends Reg_Use_Credit_Card_Page {

	// REGISTRATION USING CREDIT CARD PROCESS
	
		@When("^Tap on Register using card number button and navigate to registration screen$")
		public void tap_on_Register_using_card_number_button_and_navigate_to_registration_screen(){
			Redir_Reg_Cred_Card();
		}
	
		@Then("^Enter the Active Credit Card number$")
		public void enter_the_Active_Credit_Card_number(){
			Enter_Act_Cred_card();
		}
		
		@Then("^Enter the Expired Credit Card number$")
		public void enter_the_Expired_Credit_Card_number(){
			Enter_Expired_Cred_card();
		}
		
		@Then("^Verify the card expire validation message appears$")
		public void verify_the_card_expire_validation_message_appears() {
			Verify_Validation_Message(Expired_Card_Validation_Message);
		}

	
		@Then("^Enter the Active Credit Card PIN number$")
		public void enter_the_Active_Credit_Card_PIN_number(){
			Enter_Act_Cred_Pin();
		}
	
		@Then("^Verify the card details are validated on fly and navigate to OTP screen$")
		public void verify_the_card_details_are_validated_on_fly_and_navigate_to_OTP_screen(){
			Verify_AutoFly();
		}
		
		@Then("^Enter the inactive Credit Card number$")
		public void enter_the_Inactive_Credit_Card_number() {
			Enter_Inact_Cred_Card();
		}
		
		@Then("^Enter the inactive Credit Card PIN number$")
		public void enter_the_Inactive_Credit_Card_Pin_number() {
			Enter_Inact_Cred_Pin();
		}
		
		@Then("^Verify the validation message appears for inactive card$")
		public void verify_the_validation_message_appears_for_inactive_card() {
			Verify_Validation_Message(Inactive_crad_Validation_Message);
		}
		
		@Then("^Verify the validation message appears for inactive card1$")
		public void verify_the_validation_message_appears_for_inactive_card1() {
			Verify_Validation_Message(Inactive_crad_Validation_Message);
		}

		
		@Then("^Enter the incorrect Credit Card number$")
		public void enter_the_incorrect_Credit_Card_number() {
			Enter_Incor_Cred_Card();
		}
		
		@Then("^Enter the incorrect Credit Card PIN number$")
		public void enter_the_Incorrect_Credit_Card_PIN_number(){
			Enter_Incor_Cred_Pin();
		}
	
		@Then("^Verify the user is not allowed to proceed further$")
		public void verify_the_user_is_not_allowed_to_proceed() throws InterruptedException {
			Verify_NotFly();
		}
		
		@Then("^Enter the Active Credit Card number with no Pin$")
		public void enter_the_Active_Credit_Card_number_with_no_Pin() {
			Enter_Act_Cred_card_no_pin();
		}
		
		@Then("^Verify the validation for Card pin fails$")
		public void verify_the_validation_for_Card_pin_fails() {
			Verify_Validation_Message(Pin_notSet_notActive_Validation_Message);
		}
		
		@Then("^Verify the validation for Card pin fails2$")
		public void verify_the_validation_for_Card_pin_fails2() {
			Verify_Validation_Message(Pin_notSet_notActive_Validation_Message2);
		}
		
		@Then("^Verify the validation for Card pin fails1$")
		public void verify_the_validation_for_Card_pin_fails1() {
			Verify_Validation_Message(Pin_notSet_notActive_Validation_Message1);
		}

		
		@Then("^Enter the Active Credit Card number whose Pin is not active$")
		public void enter_the_Active_Credit_Card_number_whose_Pin_Is_not_active() {
			Enter_Act_Cred_card_inactive_pin();
		}
		
		@Then("^Enter the Inactive Pin number$")
		public void enter_the_inactive_Pin_number() {
			Enter_Act_Cred_card_inactive_pin_no();
		}
		
		@Then("^Enter the invalid Credit Card PIN number$")
		public void enter_the_invalid_Pin_number() {
			Enter_Inv_Cred_Pin();
		}
		
		@Then("^Verify the invalid card or PIN number Validation appears$")
		public void verify_the_invalid_card_or_PIN_number_Validation_appears() {
			Verify_Validation_Message(Invalid_Card_Validation_Message);
		}
		
		@Then("^Enter the invalid Credit Card PIN number for 5 times$")
		public void enter_the_invalid_Pin_number_5_times() {
			for (int i=0; i<=5; i++) {
			Enter_Inv_Cred_Pin();
			}
		}
		
		@Then("^Verify the card is blocked error message appears$")
		public void verify_the_card_is_blocked_error_message_appears() {
			Verify_Validation_Message(Card_block_Validation_Message);
		}
	
	@Then("^Verify the card details are validated on flying and navigate to OTP screen$")
	public void verify_the_card_details_are_validated_on_flying_and_navigate_to_OTP_screen() throws MalformedURLException{
		Verify_AutoFly();
	}
	
	@Then("^Get the OTP from the third party app and enter the OTP$")
	public void get_the_OTP_from_the_third_party_app_and_enter_the_OTP() throws MalformedURLException{
		Third_PartyApp();
	}
	
	@Then("^Get the OTP from the third party app and enter the OTP1$")
	public void get_the_OTP_from_the_third_party_app_and_enter_the_OTP1() throws MalformedURLException{
		Third_PartyApp1();
	}
	
	@Then("^Get the OTP from the third party app and enter the OTP2$")
	public void get_the_OTP_from_the_third_party_app_and_enter_the_OTP2() throws MalformedURLException{
		Third_PartyApp2();
	}

	@Then("^Confirm the screen navigates to you are all set! screen$")
	public void enter_the_OTP_and_confirm_the_screen_navigates_to_you_are_all_set_screen() {
		VerifyAllsetScreen();
	}
	
	@Then("^Confirm the screen navigates to you are all sets! screen1$")
	public void enter_the_OTP_and_confirm_the_screen_navigates_to_you_are_all_sets_screen() {
		VerifyAllsetScreen_Key();
	}
	
	@Then("^Confirm the screen navigates to you are all sets! screen2$")
	public void enter_the_OTP_and_confirm_the_screen_navigates_to_you_are_all_sets_screen2() {
		VerifyAllsetScreen_Key2();
	}

	@Then("^Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen$")
	public void tap_on_Enable_Fingerprints_button_and_verify_the_screen_redirects_to_Dashboard_screen() {
		EnableFingerPrint();
	}
	
}
