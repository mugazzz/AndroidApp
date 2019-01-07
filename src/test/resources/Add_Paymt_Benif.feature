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
		
		@Payment_85 @add_pay_beni2
  Scenario: Able to add a payment beneficiary- For AADC
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider AADC
		Then Enter the AADC consumer number
		Then Enter the AADC nick name
		And Tap on Next button and verify the navigated screen for payee AADC
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the screen redirected to successfully account payment beneficiary added screen
		
		@Payment_87 @add_pay_beni3
  Scenario: Able to add a payment beneficiary- For DEWA
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider DEWA
		Then Enter the DEWA consumer number
		Then Enter the DEWA nick name
		And Tap on Next button and verify the navigated screen for payee DEWA
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the screen redirected to successfully account payment beneficiary added screen
		
		@Payment_89 @add_pay_beni4 @reset
  Scenario: Able to add a payment beneficiary- Biometric  option is enabled
   Given Verify the login check with Bio
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider DEWA
		Then Enter the DEWA consumer number1
		Then Enter the DEWA nick name1
		And Tap on Next button and verify the navigated screen for payee DEWA1
		And Tap confrim details button and verify the cofirm finger print popup appears1
		
	 @Payment_90 @add_pay_beni5 @reset
  Scenario: Able to add a payment beneficiary- Biometric  option is enabled and click cancel button
   Given Verify the login check with Bio
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider DEWA
		Then Enter the DEWA consumer number1
		Then Enter the DEWA nick name1
		And Tap on Next button and verify the navigated screen for payee DEWA1
		Then Tap on Cancel finger print popup and navigate to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the screen redirected to successfully account payment beneficiary added screen
		
	@Payment_92 @add_pay_beni6 @reset
  Scenario: Able to add a payment beneficiary- incorrect consumer number
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider AADC
		Then Enter the AADC incorrect consumer number
		Then Enter the AADC nick name1
		And Tap on Next button and verify validation message appears
	
	@Payment_93 @add_pay_beni6 @reset
  Scenario: Able to add a payment beneficiary- Duplicate consumer number
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider DEWA
		Then Enter the DEWA consumer number1
		Then Enter the DEWA nick name2
		And Tap on Next button and verify validation message appears for dup consumer
		
		@Payment_94 @add_pay_beni7 @reset
  Scenario: Able to add a payment beneficiary- Duplicate nick name
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider ADDC
		Then Enter the ADDC consumer number1
		Then Enter the DEWA nick name1
		And Tap on Next button and verify validation message appears for dup nick
		
	 @Payment_95 @add_pay_beni8 @reset
	 Scenario: Able to add a payment beneficiary-Consumer number digits less or more number of digits- for Etisalat - GSM Utility
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider Etisalat
		And Select the service type of etisalat
		Then Enter the consumer number less than 9 digits
		Then Enter the nick name of etisalat
		Then Tap on next button and verify the validation message
		Then Enter the consumer number more than 10 digits
		And Tap on next button and verify the validation message
		Then enter the valid consumer number
		And Tap the next button and verify the navigated screen for payee GSM
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the screen redirected to successfully account payment beneficiary added screen
		