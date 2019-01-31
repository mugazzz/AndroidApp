@account_section @sprint3 @sprint1-3
Feature: Account section verificatio

@account_section0 @TC_Accounts_24_1 @reset
Scenario: Able to view all my operative accounts and their details
	Given Verify the login check account
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	Then Verify the operative current account details in dashboard
	Then Navigate to current account details and additional account details
	And Return back to dashboard screen
	Then Verify the operative saving account details in dashboard
	Then Navigate to saving account details and additional account details

@account_section1 @TC_Accounts_25_1  @reset
Scenario: Able to view all my finance accounts and their details
	Given Register using credit card to create existing user scenario
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	Then Verify my finances is availble for the user
	And Tap on active finance and navigate to finance detail screen
	Then Verify the finance details for user
	Then Navigate to finance additional details screen and verify the details

#@account_section2 @TC_Accounts_24_2
#Scenario: Operative accounts section is not displayed in case of no accounts
#	Given Register the user whose card should not show specific account status
#	Then Close and relaunch the app
#	Given Verify the screen redirected to landing page
#	Then Enter the Login PIN
#	And Verify the user redirected to Dashboard screen successfully
#	Then Tap on Chart Size toggle button to mimize the chart
#	Then Verify the account section is displayed in case of no accounts

@account_section3 @TC_Accounts_25_2 @reset
Scenario: Finance account section is not displayed in case of no accounts
	Given Register the user who doesn't have' Finance account section
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	Then Verify the finance section is displayed in case of no accounts
	
@account_section4 @TC_Accounts_26_1 @reset
Scenario: Able to view all my Deposit accounts and their details
	Given Register the user who have Deposit account section
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	Then Verify my deposits is availble for the user
	And Tap on any deposit account and navigate to deposit detail screen
	Then Verify the deposit details for user
	
@account_section5 @TC_Accounts_26_2 @reset
Scenario: Deposit accounts section is not displayed in case of no accounts
	Given Register the user who doesn't have' Finance account section
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	Then Verify the deposit section is not displayed in case of no accounts