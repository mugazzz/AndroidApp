@tran_mon_3rd_acc @sprint4

Feature: Transfer money to another local or international third party bank account
 I should be able to transfer money to another local or international third party bank account

@tran_mon_3rd_acc0 @reset @Transfer_35
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
	
 
@tran_mon_3rd_acc1 @reset @Transfer_36
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
		
	@tran_mon_3rd_acc2 @reset @Transfer_37
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
		
	@tran_mon_3rd_acc4 @reset @Transfer_37_1
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
		
	@tran_mon_3rd_acc5 @reset @Transfer_38
  Scenario: Able to transfer money to another local or international third party bank account -Active savings account with Account balance is zero
  	 Given Verify the login check
  	 And Verify the user redirected to Dashboard screen successfully
  	 Then Tap on the transfers icon on tab bar
  	 And Select the option tranfer to others
  	 Then Select any third party account and navigate to transfers screen
  	 And Tap on from account and verify the savings account with zero balance is not shown
  	 
 @tran_mon_3rd_acc6 @reset @Transfer_39
  Scenario: Able to transfer money to another local or international third party bank account -inactive savings account 
  	 Given Verify the login check
  	 And Verify the user redirected to Dashboard screen successfully
  	 Then Tap on the transfers icon on tab bar
  	 And Select the option tranfer to others
  	 Then Select any third party account and navigate to transfers screen
  	 And Tap on from account and verify the inactive savings account is not shown
 
 @tran_mon_3rd_acc7 @reset @Transfer_40
  Scenario: Able to transfer money to another local or international third party bank account -Active savings account with Account balance is zero
  	 Given Verify the login check
  	 And Verify the user redirected to Dashboard screen successfully
  	 Then Tap on the transfers icon on tab bar
  	 And Select the option tranfer to others
  	 Then Select any third party account and navigate to transfers screen
  	 And Tap on from account and verify the current account with zero balance is not shown
  	 
@tran_mon_3rd_acc8 @reset @Transfer_41
  Scenario: Able to transfer money to another local or international third party bank account -inactive current account
  	 Given Verify the login check
  	 And Verify the user redirected to Dashboard screen successfully
  	 Then Tap on the transfers icon on tab bar
  	 And Select the option tranfer to others
  	 Then Select any third party account and navigate to transfers screen
  	 And Tap on from account and verify the inactive current account is not shown
 
 @tran_mon_3rd_acc9 @reset @Transfer_42
 Scenario: Able to transfer money to another local or international third party bank account - To international third party - Transferred amount is more than Account balance
 		Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account1
		Then Verify the available balance amount appears
		And Enter the Transfer amount and change the currency
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the validation errror appears
	
	@tran_mon_3rd_acc9 @reset @Transfer_43
 Scenario: Able to transfer money to another local or international third party bank account - Local third party- Transferred amount is more than Account balance

  
  	 