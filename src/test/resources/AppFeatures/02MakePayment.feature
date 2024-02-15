Feature: eriBank make payment
  @smoke
  Scenario Outline:  Make Payment with valid credentials
    Given User in the Payment page
    And User will fill '<PhoneNumber>' and '<Name>'
    And provide '<Amount>'
    And choose '<Country>'
    Then user will be click Send Payment button
    Examples:
      | PhoneNumber | Name       | Amount | Country    |  |
      | 01623928456 | Asm Faisal | 600    | Bangladesh |  |