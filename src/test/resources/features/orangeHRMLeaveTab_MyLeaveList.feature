@TEX-181
Feature: Orange HRM Leave Tab / My Leave List
  Scenario: As Orange HRM user I should be able to click on the Leave Tab
    and then be able to click on My Leave Tab and be taken to My Leave List
    Given User is on Orange HRM login page
    When Admin user enters username and password
    And User clicks on login Button
    Then User should be taken to the Orange HRM Dashboard Page
    And User opens Tab "Leave"
    Then User should be taken to the Leave Page
    And User should click on My Leave Tab
    Then User Should be on My Leave List

