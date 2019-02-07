@tran_mon_3rd_acc @sprint4 @sprint4_5 @sprint4-6 @transfers
Feature: Transfer money to another local or international third party bank account
 I should be able to transfer money to another local or international third party bank account

@tran_mon_3rd_acc0 @reset @Transfer_35 @reset
  Scenario: Able to transfer money to another local or international third party bank account- From Currents Account To local third party Account
	  #Given Verify the login check
	  Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any local third party account and navigate to transfers screen
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the transfer details for cards2
		And Tap confirm button and verify the screen redirected to successfully transfered screen
	
 
@tran_mon_3rd_acc1 @reset @Transfer_36
  Scenario: Able to transfer money to another local or international third party bank account - From Currents Account To international third party
	  Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the transfer details for cards2
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@tran_mon_3rd_acc2 @reset @Transfer_37
  Scenario: Able to transfer money to another local or international third party bank account - From Savings Account To local third party
	 Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any local third party account and navigate to transfers screen
		And Tap on from account and select the savings account1
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the transfer details for cards_s
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@tran_mon_3rd_acc4 @reset @Transfer_37_1
  Scenario: Able to transfer money to another local or international third party bank account - From Savings Account To international third party
	 Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the savings account1
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the transfer details for cards_s
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@tran_mon_3rd_acc5 @reset @Transfer_38
  Scenario: Able to transfer money to another local or international third party bank account -Active savings account with Account balance is zero
  	 Given Verify the login check 100000
  	 And Verify the user redirected to Dashboard screen successfully
  	 Then Tap on the transfers icon on tab bar
  	 And Select the option tranfer to others
  	 Then Select any third party account and navigate to transfers screen1
  	 And Tap on from account and verify the savings account with zero balance is not shown
  	 
 @tran_mon_3rd_acc6 @reset @Transfer_39
  Scenario: Able to transfer money to another local or international third party bank account -inactive savings account 
  	 Given Verify the login check 100000
  	 And Verify the user redirected to Dashboard screen successfully
  	 Then Tap on the transfers icon on tab bar
  	 And Select the option tranfer to others
  	 Then Select any third party account and navigate to transfers screen1
  	 And Tap on from account and verify the inactive savings account is not shown
 
 @tran_mon_3rd_acc7 @reset @Transfer_40
  Scenario: Able to transfer money to another local or international third party bank account -Active current account with Account balance is zero
  	Given Verify the login check 100000
  	 And Verify the user redirected to Dashboard screen successfully
  	 Then Tap on the transfers icon on tab bar
  	 And Select the option tranfer to others
  	 Then Select any third party account and navigate to transfers screen1
  	 And Tap on from account and verify the Current account with zero balance is not shown
  	 
@tran_mon_3rd_acc8 @reset @Transfer_41
  Scenario: Able to transfer money to another local or international third party bank account -inactive current account
  	Given Verify the login check 100000
  	 And Verify the user redirected to Dashboard screen successfully
  	 Then Tap on the transfers icon on tab bar
  	 And Select the option tranfer to others
  	 Then Select any third party account and navigate to transfers screen1
  	 And Tap on from account and verify the inactive current account is not shown
 
 @tran_mon_3rd_acc9 @reset @Transfer_42
 Scenario: Able to transfer money to another local or international third party bank account - To international third party - Transferred amount is more than Account balance
 		Given Verify the login check 100000
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
		Then Click on next and verify the validation errror appears1
	
	@tran_mon_3rd_acc10 @reset @Transfer_43
 	Scenario: Able to transfer money to another local or international third party bank account - Local third party- Transferred amount is more than Account balance
		Given Verify the login check tran1
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any local third party account and navigate to transfers screen
		And Tap on from account and select the current account4
		Then Verify the available balance amount appears
		And Enter the Transfer amount and change the currency
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the validation errror appears1
		
	@tran_mon_3rd_acc11 @reset @Transfer_44
 	Scenario: Able to transfer money to another local or international third party bank account- to Local third party with more than 100k AED(limit) in multiple transaction
 		Given Verify the login check tran1
		And Verify the user redirected to Dashboard screen successfully
		Then Transfer the amount 30K for 3 times
		And Verify the validation message
		
	@tran_mon_3rd_acc12 @reset @Transfer_45
 	Scenario: Able to transfer money to another local or international third party bank account- to  international third party with more than 100k AED in multiple transaction
 		Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Transfer the amount 30K for 3 times using international
		And Verify the validation message

  
  @tran_mon_3rd_acc13 @reset @Transfer_47
 	Scenario: Able to transfer money to another local or international third party bank account - to international third party with more 100k AED in one transaction
 		Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the savings account3
		Then Verify the available balance amount appears
		And Enter the Transfer amount and change the currency1
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Click on next and verify the validation errror appears2	
		
	@tran_mon_3rd_acc14 @reset @Transfer_46
 	Scenario: Able to transfer money to another local or international third party bank account - to local third party with more than 100k AED (limit) in one transaction
 		Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any local third party account and navigate to transfers screen1
		And Tap on from account and select the current account4
		Then Verify the available balance amount appears
		And Enter the Transfer amount and change the currency1
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Click on next and verify the validation errror appears2
		
	@tran_mon_3rd_acc15 @reset @Transfer_47
 	Scenario: Able to transfer money to another local or international third party bank account - to local third party 100k AED(equal to limit) in one transaction
 	Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any local third party account and navigate to transfers screen
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		When Enter the amount and change the currency3
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the transfer details100000
		And Tap confirm button and verify the screen redirected to successfully transfered screen100000
		
		@tran_mon_3rd_acc15 @reset @Transfer_48
 	Scenario: Able to transfer money to another local or international third party bank account - to local third party 100k AED(equal to limit) in one transaction
 		Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		When Enter the amount and change the currency3
		#Then Verify the indicative amount appears
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Verify the transfer details100000
		And Tap confirm button and verify the screen redirected to successfully transfered screen100000
		
	@tran_mon_3rd_acc16 @reset @Transfer_49
 	Scenario: Able to transfer money to another local or international third party bank account - to international third party with more than 100k AED in one transaction - transfer using USD currency
 	Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		And Enter the Transfer amount and change the currency USD
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Click on next and verify the validation errror appears2
 	
 	@tran_mon_3rd_acc17 @reset @Transfer_50
 	Scenario: Able to transfer money to another local or international third party bank account - to international third party with more than 100k AED in one transaction - transfer using USD currency
		Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		And Enter the Transfer amount and change the currency USD
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Click on next and verify the validation errror appears2
 	
 	@tran_mon_3rd_acc18 @reset @Transfer_51
 	Scenario: Able to transfer money to another local or international third party bank account - to international third party with more than 100k AED in one transaction - transfer using USD currency
		Given Verify the login check 100000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any third party account and navigate to transfers screen
		And Tap on from account and select the current account_1000000
		Then Verify the available balance amount appears
		And Enter the Transfer amount and change the currency USD
		And Select the from charges pay by and choose Me
		Then Choose the reason as charitable contributions
		And Enter the remarks
		Then Click on next and verify the screen redirect to transfers details screen
		Then Click on next and verify the validation errror appears2
		
	@tran_mon_3rd_acc19 @reset @Transfer_52
 	Scenario: Able to transfer money to another local or international third party bank account - Inactive local third party To account
 		Given Verify the login check inact
  	And Verify the user redirected to Dashboard screen successfully
  	Then Tap on the transfers icon on tab bar
  	And Select the option tranfer to others
  	Then Select any third party account and navigate to transfers screen1
  	And Tap on from account and verify the inactive current account is not shown1
  	
  @tran_mon_3rd_acc20 @reset @Transfer_53
 	Scenario: Able to transfer money to another local or international third party bank account - Inactive international third party To account
 		Given Verify the login check inact inter
  	And Verify the user redirected to Dashboard screen successfully
  	Then Tap on the transfers icon on tab bar
  	And Select the option tranfer to others
  	Then Select any third party account and navigate to transfers screen1
  	And Tap on from account and verify the inactive current account is not shown2
 		