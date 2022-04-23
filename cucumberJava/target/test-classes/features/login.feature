@Login
Feature: Feature to test Login functionality

  	 Scenario Outline: User to login to the web application
    Given user is on login page
    When user enters the "<userid>" and "<Password>"
    And clicks on Login button
    Then users is navigated to homepage
		Examples:
		 | userid | Password |
		 | user2 | test123 |
		 | user1 | test123 |
		
		 