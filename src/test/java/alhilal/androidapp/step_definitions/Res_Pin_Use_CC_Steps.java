package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Res_Pin_Use_CC_Page;
import cucumber.api.java.en.Then;

public class Res_Pin_Use_CC_Steps extends Res_Pin_Use_CC_Page{
	
	@Then("^Launch the app and veify the Forgot login PIN in landing screen$")
	public void launch_the_app_and_veify_the_Forgot_login_PIN_in_landing_screen() {
		Verify_ForgotPIN_Link(); 
	}

	@Then("^Tap on the Forgot login PIN link and navigate to related registration screen$")
	public void tap_on_the_Forgot_login_PIN_link_and_navigate_to_related_registration_screen() {
		Tap_ForgotPIN_Link();
	}


}
