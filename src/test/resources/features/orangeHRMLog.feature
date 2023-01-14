@oHRMLoginOutline
Feature: OrangeHRM Login and Logout function

  Scenario Outline:
    Given User is on Orange HRM login page
    And User enters correct username "<username>"
    And User enters correct password "<password>"
    And User clicks on login Button
    Then User should be taken to the Orange HRM Dashboard Page
    And User should be logged in and taken to the Dashboard Tab and should be able to click on picture icon
    And User will then be able to see the dropdown menu and click on the Logout option
    Then User should taken back to the Login page

    Examples:
      | username | password |
      | Admin    | admin123 |





