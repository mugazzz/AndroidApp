package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.Locators.*;
import static alhilal.androidapp.utils.AppStrings.*;

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
	
	@Then("^Choose other bank option and enter the IBAN number2$")
	public void choose_other_bank_option_and_enter_the_IBAN_number2() {
	    Tap_Other_Bank();
	    Enter_IBAN_Num2();
	}
	
	@Then("^Choose other bank options$")
	public void choose_other_bank_options() {
	    Tap_Other_Bank();
	}

	@Then("^Tap next and navigate to enter details screen$")
	public void tap_next_and_navigate_to_enter_details_screen() {
		Tap_Next_Btn();
	}

	@Then("^Enter the full name and nick name to add beneficiary$")
	public void enter_the_full_name_and_nick_name_to_add_beneficiary() {
		Enter_Names(Full_Name, Nick_Name);
	}
	
	@Then("^Enter the full name and nick name to add beneficiary1$")
	public void enter_the_full_name_and_nick_name_to_add_beneficiary1() {
		Enter_Names(Full_Name1, Nick_Name1);
	}
	
	@Then("^Enter the full name and nick name to add beneficiary2$")
	public void enter_the_full_name_and_nick_name_to_add_beneficiary2() {
		Enter_Names(Full_Name2, Nick_Name2);
	}
	
	@Then("^Enter the full name and nick name to add beneficiary3$")
	public void enter_the_full_name_and_nick_name_to_add_beneficiary3() {
		Enter_Names(Full_Name3, Nick_Name3);
	}
	
	@Then("^Enter the full name and nick name to add beneficiary5$")
	public void enter_the_full_name_and_nick_name_to_add_beneficiary5() {
		Enter_Names(Full_Name5, Nick_Name5);
	}

	@Then("^Tap next and navigate to cofirm details screen$")
	public void tap_next_and_navigate_to_cofirm_details_screen() throws Throwable {
		Tap_Next_Btn2();
	}
	
	@Then("^Tap next and navigate to cofirm details screen2$")
	public void tap_next_and_navigate_to_cofirm_details_screen2() throws Throwable {
		Tap_Next_Btn3();
	}

	@Then("^Verify the entered details$")
	public void verify_the_entered_details() throws Throwable {
		Benif_Verify_Detials();
	}
	
	@Then("^Verify the entered details5$")
	public void verify_the_entered_details5() throws Throwable {
		Benif_Verify_Detials5();
	}
	
	@Then("^Verify the entered details1$")
	public void verify_the_entered_details1(){
		Benif_Verify_Detials1();
	}
	
	@Then("^Verify the entered details3$")
	public void verify_the_entered_details3(){
		Benif_Verify_Detials3();
	}

	@Then("^Tap confrim details button and verify the cofirm finger print popup appears$")
	public void tap_confrim_details_button_and_verify_the_cofirm_finger_print_popup_appears() {
	   Verify_Fing_Pop();
	}
	
	@Then("^Tap confrim details button and verify the screen navigate to OTP screen$")
	public void tap_confrim_details_button_and_verify_OTP_Screenaa() {
		appiumHelpers.waitForVisibilityOfElement(NXT_BTN);
		clickOnElement(NXT_BTN);
		Verify_AutoFly();
	}
	
	@Then("^Tap confrim details button and verify the screen navigate to OTP screen1$")
	public void tap_confrim_details_button_and_verify_OTP_Screenaa1() {
		appiumHelpers.waitForVisibilityOfElement(CTN);
		clickOnElement(CTN);
		Verify_AutoFly();
	}
	
	@Then("^Tap on Cancel finger print popup and navigate to OTP screen$")
	public void tap_on_cancel_finger_popup_andNavigate() {
		clickOnElement(FINGERPRINTS_POPUP_CANCEL);
		Verify_AutoFly();
	}
	
	@Given("^Tap on account number and SWIFT link and navigate to enter account number screen$")
	public void tap_on_account_number_and_SWIFT_link_and_navigate_to_enter_account_number_screen() {
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
	   Enter_Nick_Name4();
	}
	
	@Then("^Verify the entered details AHB$")
	public void verify_the_entered_details_ahb() {
		Benif_Verify_Detials_ahb();
	}
	
	@Then("^Enter Account number and Enter incorrect swift code$")
	public void enter_Account_number_and_Enter_incorrect_swift_code() {
		Enter_Acc_Incor_Swif();
	}

	@Then("^Verify the user is restricted$")
	public void verify_the_user_is_restricted(){
		Veri_Vali();
	}
	
	@Then("^Verify the user is restricted invalid iban$")
	public void verify_the_user_is_restricted_iban(){
		Veri_Vali_iban();
	}
	
	@Then("^Verify the screen redirected to successfully account added screen$")
	public void verify_the_succesfully_added_screen(){
	    Verify_sucess();
	}
	
	@Then("^Choose other bank option and enter the incorrect IBAN number$")
	public void choose_other_bank_option_and_enter_the_incorrect_IBAN_number() {
	    Tap_Other_Bank();
	    Enter_Incoi_IBAN_Num();
	}
	
	@Then("^Enter more/less than ten digit Account number$")
	public void enter_more_less_than_digit_Account_number() {
		Enter_Acc_Swif();
	}

	@Then("^Verify the Third party account number is not restricted to ten digits$")
	public void verify_the_Third_party_account_number_is_not_restricted_to_digits() {
		Nav_Con_Code();
	}
	
	@Then("^Enter more/less number of IBAN number$")
	public void enter_more_less_number_of_IBAN_number(){
		Tap_Other_Bank();
	    Enter_IBAN_Num();
	}

	@Then("^Verify IBAN number is not restricted to fixed number of digits$")
	public void verify_IBAN_number_is_not_restricted_to_fixed_number_of_digits() {
		Tap_Next_Btn();
	}
	
	@Then("^Tap next and verify the validation$")
	public void tap_on_Next_button_and_Verify(){
		Dup_Validation();
	}
	
	@Then("^Verify the validation for dup iban$")
	public void valid_dup_iban(){
		Dup_iban_Validation();
	}

}
