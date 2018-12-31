package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Ad_Cod_Spec_Con_Page;
import cucumber.api.java.en.Then;

public class Ad_Cod_Spec_Con_Steps extends Ad_Cod_Spec_Con_Page {
	
	@Then("^Enter the account number and swift code for US$")
	public void enter_the_account_number_and_swift_code_for_US(){
		Enter_Acc_Swif_US();
	}
	
	@Then("^Verify fields Fed wire & ABA are displayed$")
	public void Verify_fields_Fed_wire_ABA_are_displayed(){
		Verify_Code_US();
	}
	
	@Then("^Enter the account number and swift code for UK$")
	public void enter_the_account_number_and_swift_code_for_UK(){
		Enter_Acc_Swif_UK();
	}
	
	@Then("^Verify fields UK are displayed$")
	public void Verify_fields_UK_are_displayed(){
		Verify_Code_UK();
	}
	
	@Then("^Enter the account number and swift code for IN$")
	public void enter_the_account_number_and_swift_code_for_IN(){
		Enter_Acc_Swif_IN();
	}
	
	@Then("^Verify fields IN are displayed$")
	public void Verify_fields_IN_are_displayed_IN(){
		Verify_Code_IN();
	}
	
	@Then("^Enter the account number and swift code for CA$")
	public void enter_the_account_number_and_swift_code_for_CA(){
		Enter_Acc_Swif_CA();
	}
	
	@Then("^Verify fields CA are displayed$")
	public void Verify_fields_IN_are_displayed_CA(){
		Verify_Code_CA();
	}
	
	@Then("^Enter the account number and swift code for AU$")
	public void enter_the_account_number_and_swift_code_for_AU(){
		Enter_Acc_Swif_AU();
	}
	
	@Then("^Verify fields AU are displayed$")
	public void Verify_fields_IN_are_displayed_AU(){
		Verify_Code_AU();
	}
}
