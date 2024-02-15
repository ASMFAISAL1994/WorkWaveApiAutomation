Feature: Expense Report Added to eribank
  @smoke
  Scenario: User will click Add Button in the Expense Report
    Given User in the Expense Report page
    And User will click Add button
    And User will click Back button to go home page
    Then User will be successfully Logout