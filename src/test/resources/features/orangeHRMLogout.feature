@oHRMLogoutOutline
Feature: OrangeHRM Log out function

  Background:

  Scenario Outline:
    When User is on OrangeHRM login page
    And User enters correct username
    And User enters correct password
    And User clicks on login button

    Examples:
      | username | password | login button |
      | Admin    | admin123 | getLoginBtn  |

  @logoutOHRM
  Scenario Outline: As an Admin user I should be able to log out of Orange HRM

    And User should be logged in and taken to the Dashboard Tab and should be able to click on picture icon
    And User will then be able to see the dropdown menu and click on the Logout option
    Then User should taken back to the Login page



    Examples:
      | picture icon | dropdown menu   | logout option   |
      | getIdPicture | getDropdownMenu | getLogoutOption |
