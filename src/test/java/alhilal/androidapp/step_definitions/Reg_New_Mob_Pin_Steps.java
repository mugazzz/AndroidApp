package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Reg_New_Mob_Pin_Page;
import cucumber.api.java.en.Then;

public class Reg_New_Mob_Pin_Steps extends Reg_New_Mob_Pin_Page{

	@Then("^Enter and Renter the incorrect Login Pins$")
	public void enter_and_Renter_the_incorrect_Login_Pins() {
		Enter_Re_Incor_Pin();
		}

	@Then("^Verify the user is restricted to proceed further$")
	public void verify_the_user_is_restricted_to_proceed_further(){
		Verify_Page_Stay();
	}

	@Then("^Enter the incorrect confirmation PIN$")
	public void enter_the_incorrect_confirmation_PIN(){
		Verify_Incor_Conf_Pin();
	}
	
	@Then("^Verify pin validation message appears$")
	public void verify_pin_validation_message_appears(){
		Verify_Pin_Validation();
	}
	
}
