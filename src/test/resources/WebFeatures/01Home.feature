Feature:Daraz Bangladesh Website

  @smoke
  Scenario Outline:User will Search for prefered products and add to curt
    Given base urls
    When User will  click SignupLogin
#    And User will click register to create Daraz acoount
    And User will provide '<PhoneNumber>', '<VerficationCodefromSMS>', '<Password>','<Month>', '<Day>','<Year>', '<Gender>', '<Fullname>'
    Then User will successfully SIGNUP

    Examples:
      | PhoneNumber | VerficationCodefromSMS | Password    | Month    | Day | Year | Gender | Fullname   |
      | 01555330330 | 123456                 | Faisal@#330 | December | 19  | 1994 | male   | ASM FAISAL |
