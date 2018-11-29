@res_pin_CIF_TPIN @sprint1_2
Feature: Existing registered user - Reset Pin validation using my CIF and TPIN
I should be able to reset my PIN by verifying myself using my CIF number and TPIN

@reset @res_pin_CIF_TPIN0
Scenario: Register the user using CIF number and TPIN to create existing user environment
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button 
	Then Verify the card details are validated on fly and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen
	
@res_pin_CIF_TPIN1
Scenario: Reset PIN using CIF number and TPIN
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button
	Then Verify the card details are validated on fly and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen
	
@res_pin_CIF_TPIN2
Scenario: Reset Pin using CIF number & TPIN - Inactive CIF
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the inactive CIF Card number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button
	Then Verify the validation message appears for inactive CIFT

@res_pin_CIF_TPIN3
Scenario: Reset Pin using CIF number & TPIN -incorrect number of CIF numbers
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the incorrect CIF number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button
	Then Verify the user is not allowed to proceed further

@res_pin_CIF_TPIN4
Scenario: Reset Pin using CIF number & TPIN -incorrect number of TPIN numbers
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Tap on T-PIN tab to enter T-PIN
	And Enter the incorrect TPIN number
	And Tap on Next button
	Then Verify the user is not allowed to proceed further

@res_pin_CIF_TPIN5
Scenario: Reset Pin using CIF number & TPIN - TPin is not set
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the customer number with no pin set
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button
	Then Verify the validation message appears for inactive CIFT

@res_pin_CIF_TPIN6
Scenario: Reset Pin using CIF number & TPIN - TPin is not active
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the customer number with inactive Tpin
	And Tap on T-PIN tab to enter T-PIN
	And Enter the inactive TPIN number
	And Tap on Next button
	Then Verify the validation message appears for inactive CIFT

@res_pin_CIF_TPIN7
Scenario: Reset Pin using CIF number & TPIN - Invalid CIF Number or TPIN
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen	
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Tap on T-PIN tab to enter T-PIN
	And Enter the invalid TPIN number
	And Tap on Next button
	Then Verify the validation for SMS pin fails

#@res_pin_CIF_TPIN8
#Scenario: Reset PIN using CIF number & TPIN - wrong TPIN for 5 times
#	Given Verify the screen redirected to landing page
#	Then Tap on the Forgot login PIN link and navigate to related registration screen
#	Then Tap on register using your customer number link and navigate to customer registration screen
#	Then Enter the valid customer number
#	And Tap on T-PIN tab to enter T-PIN
#	And Enter the invalid TPIN number for 5 times
#	Then Verify the card is blocked error message appears

@res_pin_CIF_TPIN9
Scenario: Reset PIN - Registration process should allow user to activate biometric login - biometrics features are enabled and set for the device
	Given Verify the screen redirected to landing page
	Then Tap on the Forgot login PIN link and navigate to related registration screen
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button 
	Then Verify the card details are validated on fly and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all sets! screen
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen