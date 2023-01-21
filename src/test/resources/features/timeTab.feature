@timeTab
Feature: Admin should be able to view Time Tab

  Scenario: Admin user can view Time Tab
    Given User is on OrangeHRM home page
    When User click on Time
    And User should be able to enter employee name Odis  Adalwin
    Then User should be able to click on View
