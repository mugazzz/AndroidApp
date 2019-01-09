package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Add_Pay_Conf_Page;
import cucumber.api.java.en.Then;

public class Add_Pay_Conf_Steps extends Add_Pay_Conf_Page{
	
	@Then("^Tap on cancel button and verify the popup appears$")
	public void tap_on_cancel_button_and_verify_the_popup_appears() {
	   Tap_Cancel();
	}

	@Then("^Tap on ok button and redirect to previous payment screen$")
	public void tap_on_ok_button_and_redirect_to_previous_payment_screen() {
	  Tap_OK_Redirect();
	}
	
	@Then("^Tap next and enter invalid OTP screen$")
	public void tap_next_and_enter_invalid_OTP_screen() throws Throwable {
	  Enter_Inv_OTP();
	}

	@Then("^Verify the user stays in OTP screen$")
	public void verify_the_user_stays_in_OTP_screen() throws Throwable {
	 Verify_Inv_OTP();
	}


}
