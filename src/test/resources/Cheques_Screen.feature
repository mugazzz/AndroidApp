@cheques_screen @ignore
Feature: Able to view all my cheques

@reset @cheques_screen0
Scenario: Register the user using CIF number and SMS to create existing user environment
	Given Verify the screen redirected to landing page
	Then Tap on register using your customer number link and navigate to customer registration screen
	Then Enter the valid customer number
	And Tap on T-PIN tab to enter T-PIN
	Then Enter the valid T-PIN
	And Tap on Next button
	Then Verify the card details are validated on fly and navigate to OTP screen
	Then Get the OTP from the third party app and enter the OTP
	And Confirm the screen navigates to you are all set! screen
	Then Tap on Skip without Enable the Fingerprints button and verify the screen redirects to Dashboard screen

@TC_Cheques_32_1 @cheques_screen1
Scenario: Able to view all my cheques - Using Dates filter
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Time Range filter and select custom period option
	Then Select Start Date and End Date 
	And Apply the filter by tapping search button
	Then Verify the search result for the applied start and end date
	
	
@TC_Cheques_32_2 @cheques_screen2
Scenario: Able to view all my cheques- Using Cheque Numbers filter
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	And Verify the Add Range and Remove Range button functionality for cheque number option
	Then Tap on Add Range button
	Then Enter the From and To Cheque numbers
	And Apply the filter by tapping search button
	Then Verify the search result for the applied From and To Cheque numbers

@TC_Cheques_32_3 @cheques_screen3
Scenario: Able to view all my cheques- Using Amounts filter
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	And Verify the Add Range and Remove Range button functionality
	Then Tap on Add Range button for Amount value
	Then Enter the From and To Amount values
	And Apply the filter by tapping search button
	Then Verify the search result for the applied from and to amount values
	
@TC_Cheques_32_4 @cheques_screen4
Scenario: Able to view all my cheques- Using all filters
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Time Range filter and select custom period option
	Then Select Start Date and End Date
	And Verify the Add Range and Remove Range button functionality
	Then Tap on Add Range button for Amount value
	Then Enter the From and To Amount values
	And Verify the Add Range and Remove Range button functionality for cheque number option
	Then Tap on Add Range button
	Then Enter the From and To Cheque numbers
	And Apply the filter by tapping search button
	Then Verify the search result for the applied all filter values

@TC_Cheques_32_5 @cheques_screen5
Scenario: Able to view all my cheques- Using Dates and Cheque Numbers filter
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Time Range filter and select custom period option
	Then Select Start Date and End Date
	And Verify the Add Range and Remove Range button functionality for cheque number option
	Then Tap on Add Range button
	Then Enter the From and To Cheque numbers
	And Apply the filter by tapping search button
	Then Verify the search result for the applied date and cheque number filter values
	
@TC_Cheques_32_6 @cheques_screen6
Scenario: Able to view all my cheques- Using Dates and Amounts filter
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Time Range filter and select custom period option
	Then Select Start Date and End Date
	And Verify the Add Range and Remove Range button functionality
	Then Tap on Add Range button for Amount value
	Then Enter the From and To Amount values
	And Apply the filter by tapping search button
	Then Verify the search result for the applied dates and amounts filter values

@TC_Cheques_32_7 @cheques_screen7
Scenario: Able to view all my cheques- Using Cheque Numbers and Amount filter
	Given Verify the screen redirected to landing page
	Then Enter the Login PIN
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	And Verify the Add Range and Remove Range button functionality
	Then Tap on Add Range button for Amount value
	Then Enter the From and To Amount values
	And Verify the Add Range and Remove Range button functionality for cheque number option
	Then Tap on Add Range button
	Then Enter the From and To Cheque numbers
	And Apply the filter by tapping search button
	Then Verify the search result for the applied cheque number and amount filter values

