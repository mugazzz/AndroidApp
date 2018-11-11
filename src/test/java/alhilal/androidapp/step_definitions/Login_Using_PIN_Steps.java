package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.AppStrings.*;
import static alhilal.androidapp.utils.Locators.*;
import alhilal.androidapp.pages.Login_Using_Pin_Page;
import cucumber.api.java.en.Then;

public class Login_Using_PIN_Steps extends Login_Using_Pin_Page{
	
	@Then("^Enter the Login PIN$")
	public void enter_the_Login_PIN() {
	  Enter_Login_Pin();
	}

	@Then("^Verify the user redirected to Dashboard screen successfully$")
	public void verify_the_user_redirected_to_Dashboard_screen_successfully() {
	   Verify_Dashboard();
	}

	@Then("^Enter the incorrect Login PIN$")
	public void enter_the_incorrect_Login_PIN() {
		Enter_Login_Incorrect_Pin();
	}

	@Then("^Validate the incorrect pin toast message$")
	public void validate_the_incorrect_pin_toast_message() {
	   Verify_Incor_Pin_Msg();
	}

	@Then("^Enter the incorrect Login PIN 3 times$")
	public void enter_the_incorrect_Login_PIN_times() {
		for (int i=0; i<=1; i++) {
			Enter_Login_Incorrect_Pin();
			}
	}

	@Then("^Verify the user automatically redirected to Reset password screen$")
	public void verify_the_user_automatically_redirected_to_Reset_password_screen() {
		appiumHelpers.waitForVisibilityOfElement(REG_CARD_HD);
	}

	@Then("^Check the validation error message appears regarding pin blocked$")
	public void check_the_validation_error_message_appears_regarding_pin_blocked() {
		Verify_Validation_Message(Pin_Blocked_Message);
	}
	
//	@Then("^apply finger print$")
//	public void apply_finger_print() throws IOException {
//		FingerPrint();
//	}

}
