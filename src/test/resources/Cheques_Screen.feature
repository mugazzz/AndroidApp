@cheques_screen @sprint3 @sprint1-3
Feature: Able to view all my cheques

@TC_Cheques_32_1 @cheques_screen1 @reset
Scenario: Able to view all my cheques - Using Dates filter
	Given Verify the login check
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
	Given Verify the login check
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
	Given Verify the login check
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
	Given Verify the login check
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
	Given Verify the login check
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
	Given Verify the login check
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
	Given Verify the login check
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

@TC_Cheques_32_8 @cheques_screen8
Scenario: Able to view all my cheques - Incorrect Filter Validations - From Date as future date
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Time Range filter and select custom period option
	And Verify the user able to select From date as future date
	
@TC_Cheques_32_9 @cheques_screen9
Scenario: Able to view all my cheques - Incorrect Filter Validations - From date as Maximum and To date as Minimum
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Time Range filter and select custom period option
	Then Select the start date
	And Tap the To Date and verify the dates below start are disabled
	
@TC_Cheques_32_10 @cheques_screen10
Scenario: Able to view all my cheques - Incorrect Filter Validations - From Cheque as maximum and To Cheque as Minimum
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Add Range button
	Then Enter Maximum From number and minimum To number 
	Then Verify the validation message appears for invalid cheque range1

@TC_Cheques_32_11 @cheques_screen11
Scenario: Able to view all my cheques - Incorrect Filter Validations - From Amount as maximum and To Amount as minimum
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Add Range button for Amount value
	Then Enter Maximum From number and minimum To number for ammount
	Then Verify the validation message appears for invalid cheque range
	
@TC_Cheques_32_12 @cheques_screen12
Scenario: Able to view all my cheques - Incorrect Cheque Number Filter Validations - incorrect number of digits
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Enter the incorrect Cheque number and tap search
	Then Verify the validation message appears for invalid cheque range2
	
@TC_Cheques_32_13 @cheques_screen13
Scenario: Able to view all my cheques - Enter value in only To Date
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Time Range filter and select custom period option
	Then Select only the End Date
	And Apply the filter by tapping search button
	Then Verify the search result for the applied end date
	
@TC_Cheques_32_14 @cheques_screen14
Scenario: Able to view all my cheques - enter only To amount
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Add Range button for Amount value
	Then Enter Only To Amount values
	And Apply the filter by tapping search button
	Then Verify the search result for the applied To amount values

@TC_Cheques_32_15 @cheques_screen15
Scenario: Able to view all my cheques - Incorrect Cheque Numbers Filter Validations - Enter only To number
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Add Range button
	Then Enter only the To Cheque numbers
	And Apply the filter by tapping search button
	Then Verify the search result for the applied To Cheque numbers

@TC_Cheques_32_13A @cheques_screen13A
Scenario: Able to view all my cheques - Enter value in only From Date
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Time Range filter and select custom period option
	Then Select only the Start Date
	And Apply the filter by tapping search button
	Then Verify the search result for the applied start date
	
@TC_Cheques_32_14 @cheques_screen14A
Scenario: Able to view all my cheques - enter only From Amount
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Add Range button for Amount value
	Then Enter Only From Amount value
	And Apply the filter by tapping search button
	Then Verify the search result for the applied From amount values

@TC_Cheques_32_15 @cheques_screen15A
Scenario: Able to view all my cheques - Incorrect Cheque Numbers Filter Validations - Enter only From number
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on filter button and navigate to advance search screen
	Then Tap on Add Range button
	Then Enter only the from Cheque numbers
	And Apply the filter by tapping search button
	Then Verify the search result for the applied From Cheque numbers
	
@TC_Cheques_32_16 @cheques_screen16
Scenario: Able to view all my cheques - View cheque image
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My accounts section is available for user
	Then Tap on any operative account card and navigate to specific account details page
	And Tap on Cheques view button and navigate to Cheque list screen
	Then Tap on a specific cheque and navigate to cheque details page
	And Tap on Cheque image and verify the cheque image