@add_pay_conf @sprint6 @sprint4-6
Feature: Add payee confirmaiton screen
I should able to verify the add payee confirmation screen

  @add_pay_conf0
  Scenario: Able to see a confirmation page with the details of the payee to be added-click Cancel 
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider Etisalat
		And Select the service type of etisalat as Landline
		Then enter the valid consumer number Landline1
		Then Enter the nick name of Landline1
		And Tap the next button and verify the navigated screen for payee Landline1
		Then Tap on cancel button and verify the popup appears
		And Tap on ok button and redirect to previous payment screen
		
		@add_pay_conf1
  Scenario: Not Able to create  a new payee - Using OTP 
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the pay bills icon on tab bar
		And Tap on Make a payment tab
		Then Tap on Add payee option and navigate to add payee screen
		Then Select the service provider Etisalat
		And Select the service type of etisalat as Landline
		Then enter the valid consumer number Landline1
		Then Enter the nick name of Landline1
		And Tap the next button and verify the navigated screen for payee Landline1
		Then Tap next and enter invalid OTP screen
		And Verify the user stays in OTP screen
	
