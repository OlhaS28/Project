@searchFunctionality
Feature:Positive and negative scenarios for Search Functionality


  @search1
  Scenario: Positive scenario for Search Functionality
    Given User is on OrangeHRM home page
    When User enters PIM
    Then User should be able to see PIM on the search list

  @search2
  Scenario: Negative scenario for Search Functionality
    Given User is on OrangeHRM home page and click on Search Function
    When User enters Money
    Then User should be able to see empty search list