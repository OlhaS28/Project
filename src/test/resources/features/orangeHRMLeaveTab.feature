@TEX-133
Feature: Orange HRM Leave Tab
  Scenario: As Orange HRM user I should be able to press on the Leave Tab
    Given User is on Orange HRM login page
    When Admin user enters username and password
    And User clicks on login Button
    Then User should be taken to the Orange HRM Dashboard Page
    And User opens Tab "Leave"
    Then User should be taken to the Leave Page
