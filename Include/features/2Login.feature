#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Login Function

	@invalid
  Scenario Outline: User Login Invalid
    Given User navigate to Website PHP Travels
    When User click button login page
    And User enter <username> and <password>
    And User click button login
    Then User login with <status> credentials

    Examples: 
      | username  | password | status |
      | user2@phptravels.com | 6weEYLVRi3+STmppai9GiQ== | invalid username |
      | user@phptravels.com | 6weEYLVRi3+WzIa8VJE2kA== | invalid password |
	
	@invalid      
  Scenario: User with null username
		When User enter null username
		Then User required username
		
	@invalid		
	Scenario: User with null password
		When User enter null password
		Then User required password
		
	@invalid	
	Scenario: User login with invalid format email
		When User enter invalid format email
		Then User must enter valid format email
	
	@valid	
	Scenario: User login with valid login
		When User enter valid login
		Then User login successfully