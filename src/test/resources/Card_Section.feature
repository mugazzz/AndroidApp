@card_section @sprint3 @sprint1-3
Feature: Card Section Verification

@card_section1 @TC_Cards_27_1 @reset
Scenario: Able to view all my cards and their details
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My Cards section is available for user
	Then Tap on specific card and navigate to card details screen
	Then Verify the available card limit and total outstanding balance
	And Tap on card and navigate to verify card additional detail screen
	
@card_section2 @TC_Cards_27_4 @reset
Scenario: Bill payment from cards should show for specific card statuses
	Given Verify the login check
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My Cards section is available for user
	Then Tap on specific card and navigate to card details screen
	Then Verify the Bill payment button is displayed for specific card statuses

@card_section3 @TC_Cards_27_2  @reset
Scenario: Cards section is not displayed  in case of no cards
	Given Register the user who doesnot have card account
	And Verify the user redirected to Dashboard screen successfully
	Then Tap on Chart Size toggle button to mimize the chart
	Then Verify the card section is displayed in case of no cards

@card_section4 @TC_Cards_27_3 @reset
Scenario: Bill payment from cards should not show for specific card statuses
	Given Verify the login check
	Then Tap on Chart Size toggle button to mimize the chart
	And Check the My Cards section is available for user
	Then Tap on specific card and navigate to card details screen
	And Verify the Bill payment option is not available for the user