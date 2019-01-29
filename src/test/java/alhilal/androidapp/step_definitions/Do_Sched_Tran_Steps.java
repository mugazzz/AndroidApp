package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.Locators.*;
import alhilal.androidapp.pages.Do_Sched_Tran_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Do_Sched_Tran_Steps extends Do_Sched_Tran_Page{
	
	@Then("^Tap on submit scheduled transfer button$")
	public void tap_on_submit_scheduled_transfer_button() throws Throwable {
	   Submit_Sch();
	}

	@Then("^Select the mode of schedule$")
	public void select_the_mode_of_schedule() throws Throwable {
	  Select_Mode(SEL_DAI);
	}
	
	@Then("^Select the mode of schedule yearly$")
	public void select_the_mode_of_schedule_yearly() throws Throwable {
	  Select_Mode(SEL_YEAR);
	}
	
	@Then("^Select the mode of schedule quaterly$")
	public void select_the_mode_of_schedule_quartly() throws Throwable {
	  Select_Mode(SEL_QUAT);
	}
	
	@Then("^Select the mode of schedule monthly$")
	public void select_the_mode_of_schedule_monthly() throws Throwable {
	  Select_Mode(SEL_MON);
	}
	
	@Then("^Select the mode of schedule weekly$")
	public void select_the_mode_of_schedule_weekly() throws Throwable {
	  Select_Mode(SEL_WEEK);
	}

	@Then("^select the date for scheduled transfer$")
	public void select_the_date_for_scheduled_transfer() throws Throwable {
	   Select_date();
	}

	@Then("^Set the schedule transfer and verify the confirmation screen$")
	public void set_the_schedule_transfer_and_verify_the_confirmation_screen() throws Throwable {
	  Submit_Verify();
	}
	
	@Given("^Tap on Edit scheduled transfers$")
	public void tap_on_Edit_scheduled_transfers() throws Throwable {
	  Tap_Edit_Tran();
	}

	@Then("^Verify the listed Daily Transfers$")
	public void verify_the_listed_Daily_Transfers() throws Throwable {
	 Verify_Listed_Scheduled_Transfer();
	}
	
	@Then("^Return to dashboard$")
	public void Return_to_dashboard() throws Throwable {
	 Return_Dash();
	}
	
	@Then("^Verify the listed yearly Transfers$")
	public void verify_the_listed_Yearly_Transfers() throws Throwable {
		Verify_Listed_Scheduled_Transfer(SEL_YEARLY);
	}
	
	@Then("^Verify the listed quaterly Transfers$")
	public void verify_the_listed_quaterly_Transfers() throws Throwable {
		Verify_Listed_Scheduled_Transfer(SEL_QUATLY);
	}
	
	@Then("^Verify the listed monthly Transfers$")
	public void verify_the_listed_monthly_Transfers() throws Throwable {
		Verify_Listed_Scheduled_Transfer(SEL_MONLY);
	}
	
	@Then("^Verify the listed Card Transfers$")
	public void verify_the_listed_card_Transfers() throws Throwable {
		Verify_Listed_Scheduled_Account_Transfer(CARD_CHECK_C);
	}
	
	@Then("^Verify the listed local Transfers$")
	public void verify_the_listed_local_Transfers() throws Throwable {
		Verify_Listed_Scheduled_Account_Transfer(LOCAL_CHECK);
	}
	
	@Then("^Verify the listed own Transfers$")
	public void verify_the_listed_own_Transfers() throws Throwable {
		Verify_Listed_Scheduled_Account_Transfer(OWN_CHECK);
	}
	
	@Then("^Verify the listed AHB Transfers$")
	public void verify_the_listed_AHB_Transfers() throws Throwable {
		Verify_Listed_Scheduled_Account_Transfer(OWN_CHECK);
	}
	

}
