@do_sche_tran @sprint5 @sprint4_5 @sprint4-6
Feature: Perform scheduled transfers
  I should be able to perform scheduled transfers

  @do_sche_tran0 @Transfers_140
  Scenario: Able to perform scheduled transfers -Scheduled Amount is greater than current amount
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen

	@do_sche_tran1 @Transfers_225
  Scenario: Able to perform scheduled transfers -Scheduled Amount is greater than current amount
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Tap on Edit scheduled transfers
		Then Verify the listed Daily Transfers
		
	@do_sche_tran2 @Transfers_224
  Scenario: I should be able to view a list of my scheduled transfers - yearly
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed yearly Transfers
		
	@do_sche_tran2 @Transfers_223
  Scenario: I should be able to view a list of my scheduled transfers - quarterly
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule quaterly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed quaterly Transfers
		
	@do_sche_tran2 @Transfers_222
  Scenario: I should be able to view a list of my scheduled transfers - monthly
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule monthly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed monthly Transfers
	
	@do_sche_tran2 @Transfers_221
  Scenario: I should be able to view a list of my scheduled transfers - Daily
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed Daily Transfers
	
	@do_sche_tran2 @Transfers_219
  Scenario: I should be able to view a list of my scheduled transfers - AHB card
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the AHB Card and navigate to transfer screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed Card Transfers
		
	@do_sche_tran2 @Transfers_218
  Scenario: I should be able to view a list of my scheduled transfers - Own card
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the AHB Card and navigate to transfer screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed Card Transfers
		
	@do_sche_tran2 @Transfers_218
  Scenario: I should be able to view a list of my scheduled transfers - Own card
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the AHB Card and navigate to transfer screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed Card Transfers
		
	@do_sche_tran2 @Transfers_217
  Scenario:  I should be able to view a list of my scheduled transfers - third party account
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any local third party account and navigate to transfers screen1
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed local Transfers
	
	@do_sche_tran2 @Transfers_216
  Scenario: I should be able to view a list of my scheduled transfers - AHB account
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		Then Select AHB account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed AHB Transfers
		
	@do_sche_tran2 @Transfers_215
  Scenario: I should be able to view a list of my scheduled transfers - own account
    Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		Then Select own account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		Then Return to dashboard
		And Tap on Edit scheduled transfers
		Then Verify the listed own Transfers
	