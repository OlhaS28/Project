@TEX-133
Feature: As Orange HRM Leave Tab
  Scenario: As Orange HRM user I should be able to press on the Leave Tab
    Given User is on Orange HRM login page
    When Admin user enters username and password
    And User clicks on login Button
    Then User should be taken to the Orange HRM Dashboard Page
    And User opens Tab "Leave"
    Then User should be taken to the Leave Page

#@TEX-180
#Scenario: As Orange HRM user I should be able to Press on Apply Tab and be
#taken to the Apply Section in the Leave Tab Page
#  Given User is on Leave Page
#  And Clicks on Apply Tab
#  Then User should be taken to the Apply Section in Leave Tab Page