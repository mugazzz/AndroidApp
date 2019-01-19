@edit_delete_pay @sprint6 @sprint4-6 @payment
Feature: Edit and delete payee
I should able to edit and delete payee

  @edit_delete_pay0
  Scenario: Edit Payees nickname and verify the details
   Given Verify the login check tran
	 And Verify the user redirected to Dashboard screen successfully
	 Then Tap on the pay bills icon on tab bar
	 And Tap on Make a payment tab
	 Then Tap on Edit payees link
	 And Select a listed payee to edit
	 Then Tap on Edit link and navigate to edit name screen
	 And Edit the nick name
	 Then Tap confirm button and verify the validation
	 And Verify the save details
	 
	@edit_delete_pay1
 	 Scenario: Delete a payee from listed payee list
   Given Verify the login check tran
	 And Verify the user redirected to Dashboard screen successfully
	 Then Tap on the pay bills icon on tab bar
	 And Tap on Make a payment tab
	 Then Tap on Edit payees link
	 And Select a listed payee to edit
	 Then Tap on delete button and confirm the process
	 Then Get the OTP from the third party app and enter the OTP2
	 And Verify the payee delete confirmation message
	 
	 