@Ad_Ben_Third_Party @sprint
Feature: I should be able to add a beneficiary for Third Party Accounts 

@Ad_Ben_Third_Party0 @reset @Transfer_82
Scenario: Able to add a beneficiary for Third Party Accounts using IBAN number- biometric is enabled
	Given Verify the login check with Bio
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	And Choose other bank option and enter the IBAN number
	Then Tap next and navigate to enter details screen
	And Enter the full name and nick name to add beneficiary
	Then Tap next and navigate to cofirm details screen
	Then Verify the entered details
	And Tap confrim details button and verify the cofirm finger print popup appears
	Then Tap on Cancel finger print popup and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP1
	And Verify the screen redirected to successfully registered screen
	
@Ad_Ben_Third_Party1 @Transfer_83
Scenario: Able to add a beneficiary for Third Party Accounts using IBAN number international bank - biometric is not enabled	
	Given Verify the login check
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	And Choose other bank option and enter the IBAN number
	Then Tap next and navigate to enter details screen
	And Enter the full name and nick name to add beneficiary
	Then Tap next and navigate to cofirm details screen
	Then Verify the entered details
	And Tap confrim details button and verify the screen navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP1
	And Verify the screen redirected to successfully registered screen

@Ad_Ben_Third_Party2 @Transfer_87 @reset
Scenario: Able to add a beneficiary for Third Party Accounts - Account number using SWIFT code - Enter Country Code - biometrics are not enabled
	Given Verify the login check
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	And Tap on account number and SWIFT link and navigate to enter account number screen
	Then Enter the account number and swift code
	And Tap on Next button and navigate to contry code
	Then Enter the contry code and tap next button
	And Enter the full name and nick name to add beneficiary
	Then Tap next and navigate to cofirm details screen
	Then Verify the entered details
	And Tap confrim details button and verify the screen navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP1
	And Verify the screen redirected to successfully registered screen
	
@Ad_Ben_Third_Party3 @Transfer_92
Scenario: Able to add a beneficiary  for Third Party Accounts - IBAN belongs to an AHB account
	Given Verify the login check
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	And Enter IBAN number which belongs to AHB account
	Then Tap next and navigate to enter details screen
	And Enter the ahb full name and nick name to add beneficiary
	Then Tap next and navigate to cofirm details screen
	Then Verify the entered details AHB
	And Tap confrim details button and verify the screen navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP1
	And Verify the screen redirected to successfully registered screen
