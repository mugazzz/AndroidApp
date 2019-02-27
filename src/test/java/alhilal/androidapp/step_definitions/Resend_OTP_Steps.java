package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;

import alhilal.androidapp.pages.Resend_OTP_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Resend_OTP_Steps extends Resend_OTP_Page{
	
	@Then("^Get the first OTP number$")
	public void get_the_first_OTP_number() {
		GET_OTP();
	}

	@Then("^Tap on Resend OTP button$")
	public void tap_on_Resend_OTP_button(){
		hideKeyboard();
		clickOnElement(RESEND_OTP);
	}
	
	@Then("Trigger multiple OTPs by tapping Resend OTP button multiple times")
	public void trigger_multiple_otp() {
		Reset_OTP_multi_time();
	}

	@Given("^Trigger multiple OTPs and send the first OTP to enter$")
	public void trigger_multiple_OTPs_and_send_the_first_OTP_to_enter() {
		Validate_First_OTP();
	}

	@Then("^Verify the validation message appears$")
	public void verify_the_validation_message_appears() {
		Verify_Validation_Message(OTP_Validation);
	}
}
