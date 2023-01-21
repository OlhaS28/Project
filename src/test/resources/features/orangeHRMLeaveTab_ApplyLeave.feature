@TEX-180
Feature: As Orange HRM Leave Tab

  Scenario: As Orange HRM user I should be able to Press on Entitlements Tab and click on Add Entitlements
  to take me to Add Entitlements Page
  Given User is on Orange HRM login page
  When Admin user enters username and password
  And User clicks on login Button
  Then User should be taken to the Orange HRM Dashboard Page
  And User opens Tab "Leave"
  Given User is on Leave Page
  And Clicks on Entitlements Tab
  And Clicks on Add Entitlements in the Drop Down List
  Then User should be taken to the Add Entitlements Section in Leave Tab Page

