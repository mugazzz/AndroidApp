@set_recur @sprint5 @sprint4_5 @sprint4-6 @transfers @reset
Feature: Set recurring transfers
  I should be able to set recurring transfers

#Account used are 9600000 and 9667733

  @set_recur0 @Transfers_181
  Scenario: Able to set recurring transfers - From Current/Savings account to  AHB card  - Yearly
   	Given Verify the login check tran_960000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the current account3
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards96
		And Tap confirm button and verify the screen redirected to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the successfull confirmation screen
		
	@set_recur1 @Transfers_180
  Scenario: Able to set recurring transfers - From Current/Savings account to  AHB card  - Quarterly
   	Given Verify the login check tran_960000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the current account3
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule quaterly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards96
		And Tap confirm button and verify the screen redirected to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the successfull confirmation screen
		
	@set_recur2 @Transfers_179
  Scenario: Able to set recurring transfers - From Current/Savings account to  AHB card  - Monthly
   Given Verify the login check tran_960000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the current account3
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule monthly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards96
		And Tap confirm button and verify the screen redirected to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the successfull confirmation screen
		
	@set_recur3 @Transfers_178
  Scenario:  Able to set recurring transfers - From Current/Savings account to  AHB card  - Weekly
   	Given Verify the login check tran_960000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the current account3
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule weekly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards96
		And Tap confirm button and verify the screen redirected to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the successfull confirmation screen
		
	@set_recur4 @Transfers_177
  Scenario:   Able to set recurring transfers - From Current/Savings account to  AHB card  - Daily
   	Given Verify the login check tran_960000
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then select other Al hilal Bank cardholder option
		And Tap on from account and select the current account3
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the AHB Card number
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards96
		And Tap confirm button and verify the screen redirected to OTP screen
		Then Get the OTP from the third party app and enter the OTP1
		And Verify the successfull confirmation screen
	
	@set_recur5 @Transfers_176
  Scenario:  Able to set recurring transfers - From Current/Savings account to  Own card  - Yearly
   Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the AHB Card and navigate to transfer screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur6 @Transfers_175
  Scenario: Able to set recurring transfers - From Current/Savings account to  Own card  - Quarterly
   Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the AHB Card and navigate to transfer screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule quaterly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
 @set_recur7 @Transfers_174
  Scenario: Able to set recurring transfers - From Current/Savings account to  Own card  - Monthly
   Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the AHB Card and navigate to transfer screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule monthly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur8 @Transfers_173
  Scenario: Able to set recurring transfers - From Current/Savings account to  Own card  - Weekly
   Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the AHB Card and navigate to transfer screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule weekly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur9 @Transfers_172
  Scenario:  Able to set recurring transfers - From Current/Savings account to Own card- Daily
   Given Verify the login check scheduled tran
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
		
	@set_recur10 @Transfers_171
  Scenario: Able to set recurring transfers - From Current/Savings account to local/international third party account  - Yearly
   Given Verify the login check scheduled tran
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
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur11 @Transfers_170
  Scenario: Able to set recurring transfers - From Current/Savings account to local/international third party account  - Quarterly
  Given Verify the login check scheduled tran
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
		And Select the mode of schedule quaterly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur12 @Transfers_169
  Scenario: Able to set recurring transfers - From Current/Savings account to local/international third party account  - Monthly
   Given Verify the login check scheduled tran
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
		And Select the mode of schedule monthly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur13 @Transfers_168
  Scenario: Able to set recurring transfers - From Current/Savings account to local/international third party account  - Weekly
   Given Verify the login check scheduled tran
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
		And Select the mode of schedule weekly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur14 @Transfers_167
  Scenario:  Able to set recurring transfers - From Current/Savings account to local/international third party account  - Daily
   Given Verify the login check scheduled tran
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
	
	@set_recur10 @Transfers_166
  Scenario:  Able to set recurring transfers - From Current/Savings account to Another AHB Account  - Yearly
  Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any AHB account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur10 @Transfers_165
  Scenario:  Able to set recurring transfers - From Current/Savings account to Another AHB Account  - Quarterly
  Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any AHB account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule quaterly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur10 @Transfers_164
  Scenario: Able to set recurring transfers - From Current/Savings account to Another AHB Account  - Monthly
   Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any AHB account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule monthly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur10 @Transfers_163
  Scenario: Able to set recurring transfers - From Current/Savings account to Another AHB Account  - Weekly
   Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any AHB account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule weekly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur10 @Transfers_162
  Scenario: Able to set recurring transfers - From Current/Savings account to Another AHB Account  - Daily
		Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		And Select the option tranfer to others
		Then Select any AHB account and navigate to transfers screen
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
			
	@set_recur15 @Transfers_161
  Scenario: Able to set recurring transfers - From Current/Savings account to Current/Savings credit account - Yearly
   		Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		Then Select AHB account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule yearly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur16 @Transfers_160
  Scenario: Able to set recurring transfers - From Current/Savings account to Current/Savings credit account - Quarterly
  		Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		Then Select AHB account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule quaterly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur17 @Transfers_159
  Scenario: Able to set recurring transfers - From Current/Savings account to Current/Savings credit account - Monthly
  		Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		Then Select AHB account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule monthly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur18 @Transfers_158
  Scenario: Able to set recurring transfers - From Current/Savings account to Current/Savings credit account - Weekly
   		Given Verify the login check scheduled tran
		And Verify the user redirected to Dashboard screen successfully
		Then Tap on the transfers icon on tab bar
		Then Select AHB account and navigate to transfers screen
		And Tap on from account and select the current account
		Then Verify the available balance amount appears
		When Enter the amount and change the currency
		And Enter the remarks
		Then Tap on submit scheduled transfer button
		And Select the mode of schedule weekly
		Then select the date for scheduled transfer
		And Set the schedule transfer and verify the confirmation screen
		Then Verify the transfer details for cards
		And Tap confirm button and verify the screen redirected to successfully transfered screen
		
	@set_recur19 @Transfers_157
  Scenario: Able to set recurring transfers - From Current/Savings account to Current/Savings credit account - Daily
  		Given Verify the login check scheduled tran
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
	