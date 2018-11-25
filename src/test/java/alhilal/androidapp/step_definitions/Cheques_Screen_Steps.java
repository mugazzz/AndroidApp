package alhilal.androidapp.step_definitions;

import static alhilal.androidapp.utils.AppStrings.Inactive_CIF_Validation_Message;
import static alhilal.androidapp.utils.AppStrings.OTP_Validation;
import static org.junit.Assert.assertThat;

import org.hamcrest.CoreMatchers;

import alhilal.androidapp.pages.Cheques_Screen_Pages;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Cheques_Screen_Steps extends Cheques_Screen_Pages{
	
	@Then("^Tap on Chart Size toggle button to mimize the chart$")
	public void tap_on_Chart_Size_toggle_button_to_mimize_the_chart() {
	   Minimize_Chart();
	}

	@Then("^Check the My accounts section is available for user$")
	public void check_the_My_accounts_section_is_available_for_user() {
	   Check_For_Accounts();
	}

	@Then("^Tap on any operative account card and navigate to specific account details page$")
	public void tap_on_any_operative_account_card_and_navigate_to_specific_account_details_page() throws InterruptedException {
	   Tap_Current_Account();
	}
	
	@Then("^Tap on Cheques view button and navigate to Cheque list screen$")
	public void tap_on_Cheques_view_button_and_navigate_to_Cheque_list_screen() {
		Tap_Cheque_View();
	}

	@Then("^Tap on filter button and navigate to advance search screen$")
	public void tap_on_filter_button_and_navigate_to_advance_search_screen() {
		Tap_Filter_Icon();
	}

	@Then("^Tap on Time Range filter and select custom period option$")
	public void tap_on_Time_Range_filter_and_select_custom_period_option() {
		Tap_Time_Range();
		Select_CustomPeriod();
	}

	@Then("^Select Start Date and End Date$")
	public void select_Start_Date_and_End_Date() {
	   Select_Start_Date();
	   Select_End_Date();
	}

	@Then("^Apply the filter by tapping search button$")
	public void apply_the_filter_by_tapping_search_button() {
		Apply_Filter();
	}

	@Then("^Verify the search result for the applied start and end date$")
	public void verify_the_search_result_for_the_applied_start_and_end_date() {
		Verify_Search_Result();
	}
	
	@Then("^Tap on Add Range button$")
	public void tap_on_Add_Range_button() {
	   Tap_Add_Range();
	}
	
	@Then("^Tap on Add Range button for Amount value$")
	public void tap_on_Add_Range_button_Amount_Values() {
	   Tap_Add_Range_Amount();
	}

	@Then("^Enter the From and To Cheque numbers$")
	public void enter_the_From_and_To_Cheque_numbers() {
		Add_Cheque_numbers();
	}
	
	@Then("^Enter only the To Cheque numbers$")
	public void enter_the_To_Cheque_numbers() {
		Add_To_Cheque_numbers();
	}
	
	@Then("^Enter only the from Cheque numbers$")
	public void enter_the_From_Cheque_numbers() {
		Add_From_Cheque_numbers();
	}
	
	@Then("^Enter Maximum From number and minimum To number$")
	public void enter_max_From_and_mini_To_Cheque_numbers() {
		Add_max_min_inv_Cheque_numbers();
	}
	
	@Then("^Enter the incorrect Cheque number and tap search$")
	public void enter_the_incorrect_cheque_number() {
		Ente_incorrect_Cheque_number();
	}
	
	@Then("^Enter Maximum From number and minimum To number for account$")
	public void enter_max_From_and_mini_To_Cheque_numbers_for_account() {
		Add_max_min_inv_Cheque_numbers();
	}

	@Then("^Verify the search result for the applied From and To Cheque numbers$")
	public void verify_the_search_result_for_the_applied_From_and_To_Cheque_numbers() {
		Verify_Search_Result_Check_Number();
	}
	
	@Then("^Verify the search result for the applied To Cheque numbers$")
	public void verify_the_search_result_for_the_applied_To_Cheque_numbers() {
		Verify_Search_for_to_Check_Number();
	}
	
	@Then("^Verify the search result for the applied From Cheque numbers$")
	public void verify_the_search_result_for_the_applied_From_Cheque_numbers() {
		Verify_Search_for_From_Check_Number();
	}
	
	@Given("^Verify the Add Range and Remove Range button functionality$")
	public void verify_the_Add_Range_and_Remove_Range_button_functionality(){
	   Verify_Range_buttons();
	}
	
	@Given("^Verify the Add Range and Remove Range button functionality for cheque number option$")
	public void verify_the_Add_Range_and_Remove_Range_button_functionality_for_Cheque(){
	   Verify_Range_buttons_Cheque();
	}

	@Then("^Enter the From and To Amount values$")
	public void enter_the_From_and_To_Amount_values() {
	   Add_Amount_Values();
	}
	
	@Then("^Enter Only To Amount values$")
	public void enter_Only_To_Amount_values() {
		Add_Only_To_Amount_Values();
	}
	
	@Then("^Enter Only From Amount value$")
	public void enter_Only_From_Amount_values() {
		Add_Only_From_Amount_Values();
	}

	@Then("^Verify the search result for the applied from and to amount values$")
	public void verify_the_search_result_for_the_applied_from_and_to_amount_values() {
		Verify_Search_Result_Amount_Values();
	}
	
	@Then("^Verify the search result for the applied To amount values$")
	public void verify_the_search_result_for_the_applied_to_amount_values() {
		Verify_Search_Result_for_to_Amount_Values();
	}
	
	@Then("^Verify the search result for the applied From amount values$")
	public void verify_the_search_result_for_the_applied_from_amount_values() {
		Verify_Search_Result_for_from_Amount_Values();
	}
	
	
	@Then("^Verify the search result for the applied all filter values$")
	public void verify_the_search_result_for_the_applied_all_filter_values() {
		Verify_Search_Result_all_Values();
	}
	
	@Then("^Verify the search result for the applied date and cheque number filter values$")
	public void verify_the_search_result_for_the_applied_date_and_cheque_filter_values() {
		Verify_Search_Result_date_and_cheque_Values();
	}
	
	@Then("^Verify the search result for the applied dates and amounts filter values$")
	public void verify_the_search_result_for_the_applied_dates_amounts_filter_values() {
		Verify_Search_Result_dates_amounts_Values();
	}
	
	@Then("^Verify the search result for the applied cheque number and amount filter values$")
	public void verify_the_search_result_for_the_applied_cheque_amounts_filter_values() {
		Verify_Search_Result_cheque_amounts_Values();
	}
	
	@Then("^Verify the user able to select From date as future date$")
	public void verify_the_user_able_to_select_From_date_as_future_date() {
		Verify_Select_From_Date_Future();
	}
	
	@Then("^Select the start date$")
	public void select_the_start_date() {
		Select_End_Date();
	}

	@Then("^Tap the To Date and verify the dates below start are disabled$")
	public void tap_the_To_Date_and_verify_the_dates_below_start_are_disabled() {
	   Verify_To_Date_Disabled();
	}
	
	@Then("^Verify the validation message appears for invalid cheque range$")
	public void verify_the_validation_message_appears_for_invalid_cheque_ranges() throws InterruptedException {
		Thread.sleep(3000);
		String xmlFormat = driver.getPageSource();
		assertThat(xmlFormat, CoreMatchers.containsString(Inactive_CIF_Validation_Message));
	}
	
	@Then("^Enter Maximum From number and minimum To number for ammount$")
	public void enter_max_From_and_mini_To_amount_numbers() {
		Add_Amount_Values_Max_min();
	}
	
	@Then("^Select only the End Date$")
	public void select_only_the_End_Date() {
		Select_Only_End_Date();
	}
	
	@Then("^Select only the Start Date$")
	public void select_only_the_start_Date() {
		Select_Only_Start_Date();
	}

	@Then("^Verify the search result for the applied end date$")
	public void verify_the_search_result_for_the_applied_end_date() {
	    Verify_Search_Result_For_End();
	}
	
	@Then("^Verify the search result for the applied start date$")
	public void verify_the_search_result_for_the_applied_start_date() {
	    Verify_Search_Result_For_start();
	}
	
	@Then("^Tap on a specific cheque and navigate to cheque details page$")
	public void tap_on_a_specific_cheque_and_navigate_to_cheque_details_page() {
	   Tap_On_Specific_Cheque();
	}

	@Then("^Tap on Cheque image and verify the cheque image$")
	public void tap_on_Cheque_image_and_verify_the_cheque_image() {
		Verify_cheque_image();
	}

}
