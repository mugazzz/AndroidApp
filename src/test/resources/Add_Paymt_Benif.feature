@add_pay_beni @sprint6
Feature: Add a payment beneficiary-Consumer number
  I should able to add a payment beneficiary

  @Payment_83 @add_pay_beni0
  Scenario: Able to add a payment beneficiary- For  Salik
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider Salik
		Then Enter the salik consumer number
		Then Enter the salik nick name
		Then Enter the salik PIN number
		And Tap on Next button and verify the navigated screen for payee SALIK
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the screen redirected to successfully account payment beneficiary added screen
		
		@Payment_84 @add_pay_beni1
  Scenario: Able to add a payment beneficiary- For ADDC
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider ADDC
		Then Enter the ADDC consumer number
		Then Enter the ADDC nick name
		And Tap on Next button and verify the navigated screen for payee ADDC
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the screen redirected to successfully account payment beneficiary added screen