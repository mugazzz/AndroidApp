@tran_mon_3rd_acc @sprint4

Feature: Transfer money to another local or international third party bank account
 I should be able to transfer money to another local or international third party bank account

@tran_mon_3rd_acc0 @reset
  Scenario: Able to transfer money to another local or international third party bank account- From Currents Account To local third party Account
	  Given Verify the login check
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any local third party account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
	
 
@tran_mon_3rd_acc1 @reset
  Scenario: Able to transfer money to another local or international third party bank account - From Currents Account To international third party
	  Given Verify the login check
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@tran_mon_3rd_acc2 @reset
  Scenario: Able to transfer money to another local or international third party bank account - From Savings Account To local third party
	  Given Verify the login check
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any local third party account and navigate to transfers screen
		And Tap on from account and select the savings account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the savings transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@tran_mon_3rd_acc4 @reset
  Scenario: Able to transfer money to another local or international third party bank account - From Savings Account To international third party
	  Given Verify the login check
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the savings account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the savings transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen