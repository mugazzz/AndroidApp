package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Set_Recur_Trans_Page;
import cucumber.api.java.en.Then;

public class Set_Recur_Trans_Steps extends Set_Recur_Trans_Page{
	
	@Then("^select other Al hilal Bank cardholder option$")
	public void select_other_Alhilal_Bank(){
		Select_Alhilal();
	}
	
	@Then("^Enter the AHB Card number$")
	public void Enter_AHB_Card_number(){
		Enter_AHB();
	}
	
	@Then("^Enter the OWN Card number$")
	public void Enter_OWN_Card_number(){
		Enter_OWN();
	}

	@Then("^Tap confirm button and verify the screen redirected to OTP screen$")
	public void Confirm_Verify_OTP(){
		Confirm_OTP();
	}
	
	@Then("^Verify the successfull confirmation screen$")
	public void Confirm_Sucess_Screen(){
		Verify_Success();
	}
}
