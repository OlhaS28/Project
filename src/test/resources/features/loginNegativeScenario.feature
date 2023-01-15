@negLoginOutline
Feature: OrangeHRM Login and Logout function

  Scenario Outline:
Given User is on Orange HRM login page
And User enters correct username "<username>"
And User enters correct password "<password>"
And User clicks on login Button
Then User should see an error message and be able to verify error message is displayed on page
Examples:
| username | password |
| Admin    | admin321 |