Feature: Create Daraz Account

  @smoke
  Scenario Outline: User will click Google to Creating Daraz Acoount
    Given user in the daraz account page to create account
    When user will cilck to Goolge button for signup
    And user will provide '<Email>' '<Password>'and '<Search>'
    Then user will order  products
    Examples:
      | Email                      | Password    |  | Search      |
      | a.s.m.faisal@g.bracu.ac.bd | 01623928456 |  | man fashion |