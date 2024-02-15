Feature: Mortgage Request
  @smoke
  Scenario Outline: User will provide details in Mortgage Request
    Given user in the Mortgage page
    And user will provide '<First Name>' '<Last Name>' '<Age>'
    And user will provide '<Address1>' '<Address2>' AND '<Country>'
    Then user will click Next button
    Examples:
      | First Name | Last Name | Age | Address1 | Address2 | Country    |  |
      | ASM        | FAISAL    | 28  | ADABOR   | SHAMOLI  | BANGLADESH |  |