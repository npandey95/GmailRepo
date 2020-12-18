Feature: verify Gmail homepage

Background:
	Given User login into gmail
	
Scenario: Validate new message is composed and attachment is added  in gmail
	When User clicks on Compose
	Then Compose message window should be displayed
	And User adds attachment
