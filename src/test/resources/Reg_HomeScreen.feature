@reg_home_screen @sprint1_2 @sprint1-3 @res
Feature: Home Screen for Registered Users
I should be taken to a home screen  / landing page after opening the app

@reset @reg_home_screen0
Scenario: Enable FingerPrint for the user
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Enable Fingerprints button and verify the screen redirects to Dashboard screen
	
@reg_home_screen1
Scenario: Home screen/landing page for  - Registered User (Biometric is is available and enabled for login)
	Then Verify the pop up is displayed asking user to login by Facial recognition/fingerprints
	And Dismiss the popup and verify the landing screen options and links

@reset @reg_home_screen2
Scenario: Enable FingerPrint for the user
	Given Verify the screen redirected to landing page
	And Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credit Card PIN number
	Then Verify the card details are validated on flying and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen
	
@reg_home_screen3
Scenario: Home screen/landing page for  - Registered User (Biometric is available but not enabled for login)
	Then Verify the pop up is not displayed asking user to login by Facial recognition/fingerprints
	
@reg_home_screen4
Scenario: Change the language to Arabic - Registered User
	Given Verify the screen redirected to landing page
	Then Tap on English to Arabic language button
	And Verify the Home screen Arabic contents

@reg_home_screen5
Scenario: Change the language to English - Registered User
	Given Verify the screen redirected to landing page
	Then Tap on Arabic to English language button
	And Verify the Home screen English contents
	
