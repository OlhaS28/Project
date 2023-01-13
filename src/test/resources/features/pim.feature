@smock
Feature: Login
  As I user,I should be able to login

  @admin
  Scenario: login as admin
    Given I am on the login page
    When I enter username
    And I enter password
    And click the Login button




  @PIM
  Scenario: Create an account in Contact Details
    Given I am on the login page
    When I enter username
    And I enter password
    And click the Login button
    Given I am in the OrangeHRM page
    When clicked on the  PIM text link
    And I navigate back and click  on Employee List
