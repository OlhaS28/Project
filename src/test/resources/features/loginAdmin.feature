@LoginAdmin
Feature: Login as Admin

  Scenario: Login as Admin
    Given User is on Orange HRM login page
    When Admin user enters username and password
    And User clicks on login Button
    Then User should be taken to the Orange HRM Dashboard Page