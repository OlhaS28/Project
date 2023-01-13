@smock
Feature: Login
  As I user,I should be able to login

  @admin
  Scenario: login as admin
    Given I am on the login page
    When I enter username
    And I enter password
    And click the Login button



  @myInfo
  Scenario: Create an account in Contact Details
    Given I am on the login page
    When I enter username
    And I enter password
    And click the Login button
    Given I am in the OrangeHRM page
    When clicked on the  My info text link
    And I navigate back and click  on Contact Details
    And I navigate back and click on Edit button
    And I navigate back and click Address Street 1
    And I navigate back and click City
    And I navigate back and click State Province
    And I navigate back and click Zip Postal Code
    And I navigate back and click Country then select United States fro drop down selection
    Then I navigate back and click Home Telephone
    And I navigate back and click Mobile
    And I navigate back and click Work Telephone
    And I navigate back and click Work Email
    And I navigate back and click Other Email
    Then Click the save button