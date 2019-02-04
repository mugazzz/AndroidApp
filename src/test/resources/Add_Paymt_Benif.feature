@add_pay_beni @sprint6 @sprint4-6 @payment
Feature: Add a payment beneficiary-Consumer number
  I should able to add a payment beneficiary

  	@Payment_83 @add_pay_beni0 @reset
  Scenario: Able to add a payment beneficiary- For  Salik
    Given Verify the login check tran_9500000
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
		
		@Payment_84 @add_pay_beni1 @reset
  Scenario: Able to add a payment beneficiary- For ADDC
    Given Verify the login check tran_9500000
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
		
		@Payment_85 @add_pay_beni2 @reset
  Scenario: Able to add a payment beneficiary- For AADC
    Given Verify the login check tran_9500000
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
		
		@Payment_87 @add_pay_beni3 @reset
  Scenario: Able to add a payment beneficiary- For DEWA
    Given Verify the login check tran_9500000
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
		
		@Payment_89 @add_pay_beni4
  Scenario: Able to add a payment beneficiary- Biometric  option is enabled
   Given Verify the login check with Bio clean
	And Close and relaunch the app
	Then Login by cancel the login popup
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider DEWA
		Then Enter the DEWA consumer number1
		Then Enter the DEWA nick name1
		And Tap on Next button and verify the navigated screen for payee DEWA1
		And Tap confrim details button and verify the cofirm finger print popup appears1
		
	 @Payment_90 @add_pay_beni5
  Scenario: Able to add a payment beneficiary- Biometric  option is enabled and click cancel button
   Given Verify the login check with Bio clean
	And Close and relaunch the app
	Then Login by cancel the login popup
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
		
	@Payment_92 @add_pay_beni7 @reset
  Scenario: Able to add a payment beneficiary- incorrect consumer number
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider AADC
		Then Enter the AADC incorrect consumer number
		Then Enter the AADC nick name1
		And Tap on Next button and verify validation message appears
	
	@Payment_93 @add_pay_beni8 @reset
  Scenario: Able to add a payment beneficiary- Duplicate consumer number
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider DEWA
		Then Enter the DEWA consumer number1
		Then Enter the DEWA nick name2
		And Tap on Next button and verify validation message appears for dup consumer
		
		@Payment_94 @add_pay_beni9 @reset
  Scenario: Able to add a payment beneficiary- Duplicate nick name
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider ADDC
		Then Enter the ADDC consumer number1
		Then Enter the DEWA nick name1
		And Tap on Next button and verify validation message appears for dup nick
		
	 @Payment_95 @add_pay_beni10 @reset
	Scenario: Able to add a payment beneficiary-Consumer number digits less or more number of digits- for Etisalat - GSM Utility
    Given Verify the login check tran_9500000
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
		
		@Payment_96 @add_pay_beni11 @reset
	 Scenario: Able to add a payment beneficiary-Consumer number digits less or more number of digits- for Etisalat - WASEL Recharge Utility
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider Etisalat
		And Select the service type of etisalat as WASEL
		Then Enter the consumer number less than 9 digits
		Then Enter the nick name of WASEL
		Then Tap on next button and verify the validation message
		Then Enter the consumer number more than 10 digits
		And Tap on next button and verify the validation message
		Then enter the valid consumer number WASEL
		And Tap the next button and verify the navigated screen for payee WASEL
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the screen redirected to successfully account payment beneficiary added screen
		
		@Payment_97 @add_pay_beni12 @reset
	 Scenario: Able to add a payment beneficiary-Consumer number digits less or more number of digits- for Etisalat - Landline Utility
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider Etisalat
		And Select the service type of etisalat as Landline
		Then Enter the consumer number less than 9 digits
		Then Enter the nick name of Landline
		Then Tap on next button and verify the validation message1
		Then Enter the consumer number more than 10 digits
		And Tap on next button and verify the validation message1
		Then enter the valid consumer number Landline
		And Tap the next button and verify the navigated screen for payee Landline
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the screen redirected to successfully account payment beneficiary added screen
		
		@Payment_99 @add_pay_beni13 @reset
	 Scenario: Able to add a payment beneficiary-Consumer number digits less or more number of digits- for Etisalat - Al SHAMIL Utility
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider Etisalat
		And Select the service type of etisalat as Al SHAMIL
		Then Enter the consumer number less than 9 digits
		Then Enter the nick name of Al SHAMIL
		Then Tap on next button and verify the validation message2
		Then Enter the consumer number more than 10 digits
		And Tap on next button and verify the validation message2
		Then enter the valid consumer number Al SHAMIL
		And Tap the next button and verify the navigated screen for payee Al SHAMIL
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the screen redirected to successfully account payment beneficiary added screen
		
		@Payment_109 @add_pay_beni14 @reset
	 Scenario: Able to add a payment beneficiary-Consumer number digits less or more number of digits- for SALIK  Utility
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider Salik
		Then Enter the consumer number less than 9 digits
		Then Enter the salik nick name
		Then Enter the salik PIN number
		Then Tap on next button and verify the validation message3
		Then Enter the consumer number more than 10 digits
		And Tap on next button and verify the validation message3

		@Payment_110 @add_pay_beni15 @reset
	 Scenario: Able to add a payment beneficiary-Consumer number digits less or more number of digits- for DEWA  Utility
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider DEWA
		Then Enter the consumer number less than 9 digits
		Then Enter the DEWA nick name
		Then Tap on next button and verify the validation message1
		Then Enter the consumer number more than 10 digits
		And Tap on next button and verify the validation message3
		
		@Payment_111 @add_pay_beni16 @reset
	 Scenario: Payment_111:Able to add a payment beneficiary-Consumer number digits less or more number of digits- for ADDC  Utility.
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider ADDC
		Then Enter the consumer number less than 9 digits
		Then Enter the ADDC nick name
		Then Tap on next button and verify the validation message
		Then Enter the consumer number more than 10 digits
		And Tap on next button and verify the validation message
		
		@Payment_112 @add_pay_beni17 @reset
	 Scenario: Payment_111:Able to add a payment beneficiary-Consumer number digits less or more number of digits- for AADC  Utility
     Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider AADC
		Then Enter the consumer number less than 9 digits
		Then Enter the AADC nick name
		Then Tap on next button and verify the validation message
		Then Enter the consumer number more than 10 digits
		And Tap on next button and verify the validation message
		
			@Payment_113 @add_pay_beni18 @reset
	 Scenario: Payment_111:Able to add a payment beneficiary-Consumer number digits less or more number of digits- for SEWA  Utility
    Given Verify the login check tran_9500000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider SEWA
		Then Enter the consumer number less than 9 digits
		Then Enter the AADC nick name
		Then Tap on next button and verify the validation message4
		Then Enter the consumer number more than 10 digits
		And Tap on next button and verify the validation message4
		
	