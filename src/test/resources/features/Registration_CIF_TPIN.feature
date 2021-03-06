@reg_cif_tpin @reset
Feature: Registration using CIF and TPIN
I should be able to register using my CIF number & TPIN

@reg_cif_tpin0
Scenario: Register using CIF number & TPIN - Successful Registration
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button
	Then Verify the card details are validated on fly and navigate to OTP screen

@reg_cif_tpin1
Scenario: Register using CIF number & TPIN - Inactive CIF
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the inactive CIF Card number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button
	Then Verify the validation message appears for inactive CIF

@reg_cif_tpin2
Scenario: Register using CIF number & TPIN -incorrect number of CIF numbers
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the incorrect CIF number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button
	Then Verify the validation message appears for incorrect CIF

@reg_cif_tpin3
Scenario: Register using CIF number & TPIN -incorrect number of TPIN numbers
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Tap on T-PIN tab to enter T-PIN
	And Enter the incorrect TPIN number
	Then Verify the user is not allowed to proceed further

@reg_cif_tpin4
Scenario: Register using CIF number & TPIN - TPin is not set
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the customer number with no pin set
	Then Enter the valid T-PIN
	And Tap on T-PIN tab to enter T-PIN
	And Tap on Next button
	Then Verify the validation for SMS pin fails

@reg_cif_tpin5
Scenario: Register using CIF number & TPIN - TPin is not active
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the customer number with inactive Tpin
	And Tap on T-PIN tab to enter T-PIN
	And Enter the inactive SMS PIN number
	Then Verify the validation for SMS pin fails

@reg_cif_tpin6
Scenario: Register using CIF number & TPIN - Invalid CIF Number or TPIN
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Enter the invalid TPIN number
	Then Verify the validation for SMS pin fails

#@reg_cif_tpin7
#Scenario: Register using CIF number & TPIN - wrong TPIN for 5 times
#	Given Verify the screen redirected to landing page
#	Then Tap on register using your customer number link and navigate to customer registration screen
#	Then Enter the valid customer number
#	And Tap on T-PIN tab to enter T-PIN
#	And Enter the invalid TPIN number for 5 times
#	Then Verify the card is blocked error message appears
	
@reg_cif_tpin8
Scenario: Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button 
	Then Verify the card details are validated on fly and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen