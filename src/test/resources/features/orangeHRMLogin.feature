@OHRMLoginFeatureOutline
Feature: OrangeHRM Login and Forgot Password Functionality

  Background:
    When User is on OrangeHRM login page
    And User enters correct username
    And User enters correct password
    And User clicks on login button

  @outlineLoginPosOHRM
  Scenario Outline: As an Admin user I should be able to login using authenticated test data

    Then User should be logged in and taken to the Dashboard Tab be able to verify "tabText" is displayed on page

    Examples:
      | username | password | tabText    |
      | Admin    | admin123 | getTabText |


  @outlineLoginNegOHRM
  Scenario Outline: As an Admin user I should be able to login using authenticated test data

    Then User should see an error message and be able to verify error message is displayed on page

    Examples:
      | username | password | error message |
      | Admin    | admin321 | getErrorMsg   |


