Feature: verify menu titles in homepage

Background:
	Given I am on Amazon homepage
	
Scenario: Validate title for Menu - Mobile, Best Sellers, Todays Deals, Computer and Books
	When I click on Mobiles Menu
	Then I navigate to Mobile Page 
	And I validate the title of Mobile Page
	Then I navigate to Homepage
	
	When I click on Best Sellers Menu
	Then I navigate to Best Sellers Page 
	And I validate the title of Best Sellers Page
	Then I navigate to Homepage
	
	When I click on Todays Deals Menu
	Then I navigate to Todays Deals Page 
	And I validate the title of Todays Deals Page
	Then I navigate to Homepage
	
	When I click on Computer Menu
	Then I navigate to Computer Page 
	And I validate the title of Computer Page
	Then I navigate to Homepage
	
	When I click on Books Menu
	Then I navigate to Books Page 
	And I validate the title of Books Page
	Then I navigate to Homepage

