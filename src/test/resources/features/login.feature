Feature: Login
  As I user,I should be able to login

  @admin
  Scenario: login as admin
    Given I am on the login page
    When I enter username
    And I enter password
    And click the Login button
