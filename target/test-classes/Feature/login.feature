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
@SmokeScenario
Feature: feature to test login funclility.

@SmokeTest
  Scenario: check login is successful.
    Given user is in login page
    When user enter username and password
    And click on login button
    Then user is navigated to the home page

  Scenario Outline: check login is successful.
    Given user is in login page
    When user enter <username> and <password>
    And click on login button
    Then user is navigated to the home page

    Examples: 
      | username | password  |
      | user1    | password1 |
      | user2    | password2 |
