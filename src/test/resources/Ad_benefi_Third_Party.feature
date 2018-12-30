@Ad_Ben_Third_Party @sprint4 @reset
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
#	Then Tap on Cancel finger print popup and navigate to OTP screen
#	Then Get the OTP from the third party app and enter the OTP1
#	And Verify the screen redirected to successfully registered screen
	
@Ad_Ben_Third_Party1 @Transfer_83
Scenario: Able to add a beneficiary for Third Party Accounts using IBAN number international bank - biometric is not enabled	
	Given Verify the login check tran
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
	And Verify the screen redirected to successfully account added screen

@Ad_Ben_Third_Party2 @Transfer_87
Scenario: Able to add a beneficiary for Third Party Accounts - Account number using SWIFT code - Enter Country Code - biometrics are not enabled
	Given Verify the login check tran
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	Then Choose other bank options
	And Tap on account number and SWIFT link and navigate to enter account number screen
	Then Enter the account number and swift code
	And Tap on Next button and navigate to contry code
	Then Enter the contry code and tap next button
	And Enter the full name and nick name to add beneficiary3
	Then Tap next and navigate to cofirm details screen
	Then Verify the entered details3
	And Tap confrim details button and verify the screen navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP1
	And Verify the screen redirected to successfully account added screen
	
@Ad_Ben_Third_Party3 @Transfer_92
Scenario: Able to add a beneficiary  for Third Party Accounts - IBAN belongs to an AHB account
	Given Verify the login check tran
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
	And Verify the screen redirected to successfully account added screen
	
@Ad_Ben_Third_Party4 @Transfer_93
Scenario: Able to add a beneficiary  for Third Party Accounts - biometric is enabled but user clicks on cancel
Given Verify the login check with Bio
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	And Choose other bank option and enter the IBAN number2
	Then Tap next and navigate to enter details screen
	And Enter the full name and nick name to add beneficiary5
	Then Tap next and navigate to cofirm details screen
	Then Verify the entered details5
	And Tap confrim details button and verify the cofirm finger print popup appears
	Then Tap on Cancel finger print popup and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP1
	And Verify the screen redirected to successfully account added screen
	
@Ad_Ben_Third_Party5 @Transfer_94
Scenario: Able to add a beneficiary  for Third Party Accounts - enter incorrect Swift Code
	Given Verify the login check tran
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	Then Choose other bank options
	And Tap on account number and SWIFT link and navigate to enter account number screen
	Then Enter Account number and Enter incorrect swift code
	And Verify the user is restricted

@Ad_Ben_Third_Party6 @Transfer_95
Scenario: Able to add a beneficiary  for Third Party Accounts - enter incorrect IBAN number
	Given Verify the login check tran
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	And Choose other bank option and enter the incorrect IBAN number
	And Verify the user is restricted invalid iban

@Ad_Ben_Third_Party7 @Transfer_96
Scenario: Able to add a beneficiary  for Third Party Accounts - enter more/less number of digits in account number
	Given Verify the login check with Bio
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	Then Choose other bank options
	And Tap on account number and SWIFT link and navigate to enter account number screen
	Then Enter more/less than ten digit Account number
	And Verify the Third party account number is not restricted to ten digits
	
@Ad_Ben_Third_Party8 @Transfer_97
Scenario: Able to add a beneficiary  for local Third Party Accounts  - enter more/less number of digits in IBAN number
	Given Verify the login check tran
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	And Enter more/less number of IBAN number
	Then Verify IBAN number is not restricted to fixed number of digits
	
@Ad_Ben_Third_Party9 @Transfer_100
Scenario: Able to add a beneficiary  for Third Party Accounts- Duplicate Nick Name
	Given Verify the login check tran
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	Then Choose other bank options
	And Tap on account number and SWIFT link and navigate to enter account number screen
	Then Enter the account number and swift code
	And Tap on Next button and navigate to contry code
	Then Enter the contry code and tap next button
	And Enter the full name and nick name to add beneficiary
	And Tap confrim details button and verify the screen navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP1
	#Then Tap next and verify the validation1

@Ad_Ben_Third_Party10 @Transfer_102
Scenario: Able to add a beneficiary  for Third Party Accounts - enter duplicate IBAN number
	Given Verify the login check tran
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	And Choose other bank option and enter the IBAN number
	Then Tap next and navigate to enter details screen
	And Enter the full name and nick name to add beneficiary1
	Then Tap next and navigate to cofirm details screen
	And Tap confrim details button and verify the screen navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP1
	And Verify the validation for dup iban

@Ad_Ben_Third_Party10 @Transfer_103
Scenario: Able to add a beneficiary  for Third Party Accounts - Duplicate Account Number
	Given Verify the login check tran
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on the transfers icon on tab bar
	And Select the option tranfer to others
	Then Tap on add beneficiary option and navigate to add beneficiary screen
	Then Choose other bank options
	And Tap on account number and SWIFT link and navigate to enter account number screen
	Then Enter the account number and swift code
	And Tap on Next button and navigate to contry code
	Then Enter the contry code and tap next button
	And Enter the full name and nick name to add beneficiary2
	Then Tap next and navigate to cofirm details screen
	And Tap confrim details button and verify the screen navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP1
	And Verify the validation for dup iban