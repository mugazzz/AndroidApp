package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Tran_Anoth_AHB_Card_Page;
import cucumber.api.java.en.Then;

public class Tran_Anoth_AHB_Card_Steps extends Tran_Anoth_AHB_Card_Page{
	
	@Then("^Verify the validation error appears$")
	public void Verify_Valid(){
		Ver_Validl();
	}
	
	@Then("^Transfer the amount 30K for 3 times1$")
	public void Transfer_the_amount_30K_for_3_times1() {
		for (int i=0; i<=3; i++) {
			Transfer_30K();
			System.out.println("Round number: "+i);
		}
	
	}
	
	@Then("^Verify the validation error appears1$")
	public void Verify_Valid1(){
		Ver_Validl1();
	}
}
