Feature: Verify PerformanceTab functionality

  @performance
  Scenario:  User should be able to press a tab "Performance"
    Given User is logged in to OrangeHrm Tester account and Performance Page
    And User selects configure
    And User selects Manage Reviews
    And User selects My trackers
    And User selects Employee trackers
    And User selects Employee Reviews
    And User selects Employee Name
    And User selects Job Title
    And User selects Sub Unit
    And User selects Include
    And User selects Review Status
    And User selects From Date
    And User selects To Date
    And User should be able to press Submit btn
    And User should be able to press Search btn
    Then User verifies if the records were found

