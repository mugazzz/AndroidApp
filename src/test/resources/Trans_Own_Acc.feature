@tran_own_acc @sprint7
Feature: Transfer to own account
  I should able to transfer to own account

  @tran_own_acc0
  Scenario: I should be able to perform currency selection during transfers - Transfer to Own Account - To Savings account
  	Given Verify the login check
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the saving account in usd
		Then Tap on from account and select the current account 
		Then Verify the available balance amount appears
		When Enter the amount 
		And Change the currency and verify the listed currencies
		Then Verify the indicative amount appears
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
		@tran_own_acc1
  Scenario: I should be able to perform currency selection during transfers - Transfer to Own Account - To Current account
  	Given Verify the login check
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the current account in usd
		Then Tap on from account and select the current account 
		Then Verify the available balance amount appears
		When Enter the amount 
		And Change the currency and verify the listed currencies
		Then Verify the indicative amount appears
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
   @tran_own_acc2
  Scenario: I should be able to perform currency selection during transfers - Transfer to Own Account - To Card
  	Given Verify the login check
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the card in usd
		Then Tap on from account and select the current account1
		Then Verify the available balance amount appears
		When Enter the amount 
		And Change the currency and verify the listed currencies1
		Then Verify the indicative amount appears
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		And Tap confirm button and verify the screen redirected to successfully transfered screen