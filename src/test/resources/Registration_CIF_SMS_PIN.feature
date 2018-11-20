@reg_cif_spin
Feature: Registration using CIF number and SPIN number
I should be able to register using my CIF Number & SMS Pin

@reg_cif_spin0 @reset
Scenario: Register using CIF number & SMS PIN - Successful Registration
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	Then Enter the valid SMS PIN 
	Then Verify the card details are validated on fly and navigate to OTP screen

@reg_cif_spin1
Scenario: Register using CIF number & SMS PIN - Inactive CIF
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the inactive CIF Card number
	Then Enter the valid SMS PIN
	Then Verify the validation message appears for inactive CIF

@reg_cif_spin2
Scenario: Register using CIF number & SMS PIN -incorrect number of CIF numbers
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the incorrect CIF number
	And Enter the valid SMS PIN
	Then Verify the user is not allowed to proceed further

@reg_cif_spin3
Scenario: Register using CIF number & SMS PIN -incorrect number of SMS PIN numbers
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Enter the incorrect SMS PIN number
	Then Verify the user is not allowed to proceed further

@reg_cif_spin4
Scenario: Register using CIF number & SMS PIN - SMS Pin is not set
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the customer number with no spin set
	And Enter the valid SMS PIN
	Then Verify the validation for SMS pin fails

@reg_cif_spin5
Scenario: Register using CIF number & SMS PIN is not active
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the customer number with inactive pin
	And Enter the inactive SMS PIN number
	Then Verify the validation for SMS pin fails

@reg_cif_spin6
Scenario: Register using CIF number & SMS PIN - Invalid CIF Number or SMS PIN
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Enter the invalid SMS PIN number
	Then Verify the validation for SMS pin fails

#@reg_cif_spin7
#Scenario: Register using CIF number & SMS PIN - wrong TPIN for 5 times
#	Register using CIF number & SMS PIN - Invalid CIF Number or SMS PIN
#	Given Verify the screen redirected to landing page
#	Then Tap on register using your customer number link and navigate to customer registration screen
#	Then Enter the valid customer number
#	And Enter the invalid SMS PIN number for 5 times
#	Then Verify the card is blocked error message appears

@reset @reg_cif_spin8
Scenario: Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	Then Enter the valid SMS PIN 
	Then Verify the card details are validated on fly and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen
	
	