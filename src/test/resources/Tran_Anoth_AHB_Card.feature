@tran_Anoth_AHB_Card @sprint5 @sprint4_5 @sprint4-6 @transfers
Feature: Transfer money to another AHB card
 I should be able to transfer money to another AHB card 
 
#Used account 7799712

  @tran_Anoth_AHB_Card0 @Transfers_118 @reset
  Scenario: Able to transfer money to another AHB card - Transfer 100K AED(limit)
    Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		When Enter the amount and change the currency3
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details1000001
		And Tap confirm button and verify the screen redirected to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Tap confirm button and verify the screen redirected to successfully transfered screen1000001
		
	@tran_Anoth_AHB_Card1 @Transfers_117 @reset
  Scenario: Able to transfer money to another AHB card-more than limit in one transaction
  	Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		And Enter the Transfer amount and change the currency1
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards1
		And Tap confirm button and verify the screen redirected to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the validation error appears
		
	@tran_Anoth_AHB_Card2 @Transfers_116 @reset
  Scenario: Able to transfer money to another AHB card- more than 100k AED in multiple transaction
  	Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Transfer the amount 30K for 3 times1
		And Transfer the amount 30K for 1 more times
		And Verify the validation message
		
	@tran_Anoth_AHB_Card3 @Transfers_115 @reset
  Scenario: Able to transfer money to another AHB card-Transferred amount is more than Account balance
  	Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		And Enter the Transfer amount and change the currency
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Verify the validation error appears1
#		And Select the mode of schedule yearly
#		Then select the date for scheduled transfer
#		And Set the schedule transfer and verify the confirmation screen
#		And Tap confirm button and verify the screen redirected to OTP screen
#		Then Get the OTP from the third party app and enter the OTP1
#		And Verify the validation error appears1
		
	@tran_Anoth_AHB_Card4 @Transfers_113 @reset
  Scenario: Able to transfer money to another AHB card- from Active Current account with Account balance zero
  		Given Verify the login check tran3
  		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and verify the Current account with zero balance is not shown
		
	@tran_Anoth_AHB_Card5 @Transfers_111 @reset
  Scenario: Able to transfer money to another AHB card- from Active savings account with Account balance zero
  	Given Verify the login check tran3
  	And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and verify the savings account with zero balance is not shown
		
	@tran_Anoth_AHB_Card6 @Transfers_110 @reset
  Scenario: Able to transfer money to another AHB card- From Savings account
  		Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the savings account1
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards_s
		And Tap confirm button and verify the screen redirected to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the successfull confirmation screen
		
	@tran_Anoth_AHB_Card7 @Transfers_109 @reset
  Scenario: Able to transfer money to another AHB card- From Current account
  		Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		#Then Verify the transfer details for cards2
		And Tap confirm button and verify the screen redirected to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the successfull confirmation screen
		