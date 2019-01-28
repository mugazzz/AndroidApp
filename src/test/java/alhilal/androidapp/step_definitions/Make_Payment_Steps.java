package alhilal.androidapp.step_definitions;

import alhilal.androidapp.pages.Make_Payment_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Make_Payment_Steps extends Make_Payment_Page
{
	
	@Then("^select any payees listed in your registered payees$")
	public void selectPayee() 
	{
		Tap_Any_Payee();
	}
	
	@Then("^select the From account for payment process$")
	public void selectFromAccount()
	{
		selectAccount();
	}
	
	@Then("^Enter the valid payment amount$")
	public void enterPaymentAmount()
	{
		enterValidAmount();
	}
	
	@Then ("^Enter the invalid payment amount$")
	public void enterInvalidPaymentAmount()
	{
		enterInvalidAmount();
	}
	
	@Then ("^Validate the Amount transfer and click Next$")
	public void clickNext()
	{ 
		clickNextPayment();
		
	}
	
	@Then ("^Check the validation for invalid amount transfer$")
	public void checkValidation_Invalid_Payment()
	{
		checkValidation();
	}
	
	@Then ("^validate the Amount to be paid and Confirm the pay$")
	public void validate_And_Confirm_Payment()
	{
		confirmPayment();
	}
	
	@Then ("^Check the status of Payment Transaction$")
	public void checkPaymentStatus()
	{
		checkStatus();
	}
	
	@Given("^Verify the login check tran_950000$")
	public void verify_login_check_tran_9500000() {
		Verify_Login_check_tran_950000();
	}
	
	@Given("^Verify the login check tran_960000$")
	public void verify_login_check_tran_9600000() {
		Verify_Login_check_tran_960000();
	}
	

}
