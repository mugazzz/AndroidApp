@edit_del_ben @sprint5 @sprint4-6
Feature: Edit and Delete benificiary accounts
  I should able to edit and delete benificiary accounts

#Add one benificary for the the account 9500000

  @edit_del_ben0
  Scenario: I should able to edit benificary account nick name
   	Given Verify the login check tran_950000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
	 	Then Tap on Edit benificary link
	 	And Select a listed benificary to edit
	 	Then Tap on Edit link and navigate to edit name screen
	 	And Edit the nick name
	 	Then Tap confirm button and verify the validation1
	 	And Verify the save details1
	 
	  @edit_del_ben1
 	 Scenario: Delete a benficiary from listed payee list
   	Given Verify the login check tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
	 	Then Tap on Edit benificary link
	 	And Select a listed benificary to edit
	 	Then Tap on delete button and confirm the process
	 	Then Get the OTP from the third party app and enter the OTP3
	 	And Verify the payee delete confirmation message