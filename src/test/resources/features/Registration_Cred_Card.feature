@reg_cred_card
Feature: Registration process using Credit Card
I should be able to register using my Credit card and Credit card pin

@reg_cred_card0
Scenario: Register usign Credit Card and Credit Card pin - Active Card
	Given Verify the homescreen button Register using card number
	When Tap on Register using card number button and navigate to registration screen
	Then Enter the Active Credit Card number
	And Enter the Active Credict Card PIN number
	Then Verify the card details are validated on fly