package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.Locators.*;

import alhilal.androidapp.pages.Ad_benefi_Third_Party_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Ad_benefi_Third_Party_Steps extends Ad_benefi_Third_Party_Page{

	@Then("^Tap on the transfers icon on tab bar$")
	public void tap_on_the_transfers_icon_on_tab_bar(){
		Tap_Tab_Transfer_Icon();
	}

	@Then("^Select the option tranfer to others$")
	public void select_the_option_tranfer_to_others() {
		Select_other_option();
	}

	@Then("^Tap on add beneficiary option and navigate to add beneficiary screen$")
	public void tap_on_add_beneficiary_option_and_navigate_to_add_beneficiary_screen() {
	   Tap_Add_Benficiary();
	}

	@Then("^Choose other bank option and enter the IBAN number$")
	public void choose_other_bank_option_and_enter_the_IBAN_number() {
	    Tap_Other_Bank();
	    Enter_IBAN_Num();
	}

	@Then("^Tap next and navigate to enter details screen$")
	public void tap_next_and_navigate_to_enter_details_screen() {
		Tap_Next_Btn();
	}

	@Then("^Enter the full name and nick name to add beneficiary$")
	public void enter_the_full_name_and_nick_name_to_add_beneficiary() {
	   Enter_Full_Name();
	   Enter_Nick_Name();
	}

	@Then("^Tap next and navigate to cofirm details screen$")
	public void tap_next_and_navigate_to_cofirm_details_screen() throws Throwable {
		Tap_Next_Btn2();
	}

	@Then("^Verify the entered details$")
	public void verify_the_entered_details() throws Throwable {
		Benif_Verify_Detials();
	}

	@Then("^Tap confrim details button and verify the cofirm finger print popup appears$")
	public void tap_confrim_details_button_and_verify_the_cofirm_finger_print_popup_appears() throws Throwable {
	   Verify_Fing_Pop();
	}
	
	@Then("^Tap confrim details button and verify the screen navigate to OTP screen$")
	public void tap_confrim_details_button_and_verify_OTP_Screen() throws Throwable {
		clickOnElement(NXT_BTN);
		Verify_AutoFly();
	}
	
	@Then("^Tap on Cancel finger print popup and navigate to OTP screen$")
	public void tap_on_cancel_finger_popup_andNavigate() {
		clickOnElement(FINGERPRINTS_POPUP_CANCEL);
		Verify_AutoFly();
	}
	
	@Given("^Tap on account number and SWIFT link and navigate to enter account number screen$")
	public void tap_on_account_number_and_SWIFT_link_and_navigate_to_enter_account_number_screen() throws Throwable {
		Tap_And_Nav_Swif();
	}

	@Then("^Enter the account number and swift code$")
	public void enter_the_account_number_and_swift_code(){
		Enter_Acc_Swif();

	}

	@Then("^Tap on Next button and navigate to contry code$")
	public void tap_on_Next_button_and_navigate_to_contry_code(){
		Nav_Con_Code();
	}

	@Then("^Enter the contry code and tap next button$")
	public void enter_the_contry_code_and_tap_next_button() {
		Ent_Con_Cod();	
	}
	
	@Then("^Enter IBAN number which belongs to AHB account$")
	public void enter_IBAN_number_belong_to_AHB() {
		Ent_AHB_Acc();	
	}
	
	@Then("^Enter the ahb full name and nick name to add beneficiary$")
	public void enter_the_ahb_full_name_and_nick_name_to_add_beneficiary() {
	   //Enter_Full_Name_ahb();
	   Enter_Nick_Name();
	}
	
	@Then("^Verify the entered details AHB$")
	public void verify_the_entered_details_ahb() {
		Benif_Verify_Detials_ahb();
	}

}
