@make_payment @sprint6 @payment
Feature: Make payment
I should be able to make a payment 

@makePayment0 @invalidPayment @reset
 	Scenario: Able to make a payment - validate with invalid amount
	Given Verify the login check tran_960000
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the pay bills icon on tab bar
	And Tap on Make a payment tab
	Then select any payees listed in your registered payees 
	Then select the From account for payment process
	Then Enter the invalid payment amount
	Then Check the validation for invalid amount transfer
	
@makePayment1 @validPayment
	Scenario: Able to make a payment - validate with valid amount
	Given Verify the login check tran_960000
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the pay bills icon on tab bar
	And Tap on Make a payment tab
	Then select any payees listed in your registered payees 
	Then select the From account for payment process
	Then Enter the valid payment amount
	Then Validate the Amount transfer and click Next
	
 @makePayment2 @fullPayment 
 	Scenario: Able to make a payment - complete payment process
	Given Verify the login check tran_960000
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the pay bills icon on tab bar
	And Tap on Make a payment tab
	Then select any payees listed in your registered payees 
	Then select the From account for payment process
	Then Enter the valid payment amount
	Then Validate the Amount transfer and click Next
	Then validate the Amount to be paid and Confirm the pay
	Then Check the status of Payment Transaction