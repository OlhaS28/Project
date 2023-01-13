Feature: Verify OrangeHRM website

  @emergency
  Scenario: Create an account in Contact Details
    Given I am on the login page
    When I enter username
    And I enter password
    And click the Login button
    When clicked on the  My info text
    And I navigate back and click Emergency Contact
    And Navigate to Add button and click
    And I navigate back and click Name
    And I navigate back and click Relationship
    And I navigate back and click Home Telephone
    And I navigate back and enter Mobile
    And I navigate back and enter Work Telephone
    Then Press the save button
