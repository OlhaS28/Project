@forgotPasswordOHRM
Scenario Outline: As an Admin user I should be able to reset password using correct credentials
When User is on OrangeHRM login page
And User clicks on getForgotPassLink
And User is taken to the password reset page and enters correct usernameInput
And User clicks on reset password button
Then User should see a confirmation message and be able to verify it is displayed on page

Examples:
| forgot password link | username      | reset password button | confirmation message |
| getForgotPassLink    | usernameInput | getResetPassBtn       | getResetSuccessMsg   |