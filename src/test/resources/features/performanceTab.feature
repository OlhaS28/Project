Feature: Verify PerformanceTab functionality

  @performance
  Scenario:  User should be able to press a tab "Performance"
    Given User is on Orange HRM login page
    When Admin user enters username and password
    And User clicks on login Button
    Then User should be taken to the Orange HRM Dashboard Page
    And User opens Tab "Time"
#    And User selects configure
#    And User selects Manage Reviews
#    And User selects My trackers
#    And User selects Employee trackers
#    And User selects Employee Reviews
#    And User selects Employee Name
#    And User selects Job Title
#    And User selects Sub Unit
#    And User selects Include
#    And User selects Review Status
#    And User selects From Date
#    And User selects To Date
#    And User should be able to press Submit btn
#    And User should be able to press Search btn
#    Then User verifies if the records were found

