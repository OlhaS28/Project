@addingUser
Feature: Admins user can add an user

  Scenario: Admins user can add an user
    Given User is on OrangeHRM home page
    When User click on Admin
    Then User should be able to see function Add
    Then User should be able to choose Role Admin
    And Select Status as Enabled
    And User should be able to enter Employee Name
    And User should be able to select Username
    And User should be able to choose Password
    Then User should be able to click on Save