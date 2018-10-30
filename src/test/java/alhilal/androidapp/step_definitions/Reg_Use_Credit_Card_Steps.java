package alhilal.androidapp.step_definitions;

import java.net.MalformedURLException;

import alhilal.androidapp.pages.Reg_Use_Credit_Card_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Reg_Use_Credit_Card_Steps extends Reg_Use_Credit_Card_Page {

	@When("^Tap on Register using card number button and navigate to registration screen$")
	public void tap_on_Register_using_card_number_button_and_navigate_to_registration_screen(){
		Redir_Reg_Cred_Card();
	}

	@Then("^Enter the Active Credit Card number$")
	public void enter_the_Active_Credit_Card_number(){
		Enter_Act_Cred_card();
	}

	@Then("^Enter the Active Credict Card PIN number$")
	public void enter_the_Active_Credict_Card_PIN_number(){
		Enter_Act_Cred_Pin();
	}

	@Then("^Verify the card details are validated on fly and navigate to OTP screen$")
	public void verify_the_card_details_are_validated_on_fly_and_navigate_to_OTP_screen(){
		Verify_AutoFly();
	}
	
	@Then("^Enter the Inactive Credit Card number$")
	public void enter_the_Inactive_Credit_Card_number() {
		Enter_Inv_Cred_Card();
	}
	
	@Then("^Enter the Invalid Credict Card PIN number$")
	public void enter_the_Invalid_Credict_Card_PIN_number(){
		Enter_Inv_Cred_Pin();
	}

	@Then("^Verify the user is not allowed the user to proceed forward while incorrect number of card numbers$")
	public void verify_the_user_is_not_allowed_the_user_to_proceed_forward_while_incorrect_number_of_card_numbers() throws InterruptedException {
		Verify_NotFly();
	}
	
	@Then("^Get the OTP from the third party app$")
	public void get_the_OTP_from_the_third_party_app() throws MalformedURLException{
		Third_PartyApp();
	}

	@Then("^Enter the OTP and confirm the screen navigates to you are all set! screen$")
	public void enter_the_OTP_and_confirm_the_screen_navigates_to_you_are_all_set_screen() {
		EnterOTP();
	}

	/*@Then("^Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen$")
	public void tap_on_Enable_Fingerprints_button_and_verify_the_screen_redirects_to_Dashboard_screen() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	*/
}
