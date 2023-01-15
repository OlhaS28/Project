@forgotPasswordOutline
Feature: OrangeHRM password reset function

  Scenario Outline:
    Given User is on Orange HRM login page
    And User clicks on forgot your password link
    Then User should be taken to the password reset page and enters correct username "<username>"
    And User clicks on Reset password button
    Then User should see a Reset Password link sent successfully confirmation message

    Examples:
      | username |
      | Admin    |