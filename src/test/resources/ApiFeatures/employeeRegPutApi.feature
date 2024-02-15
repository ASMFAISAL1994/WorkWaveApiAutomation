Feature: User Request
#  @smoke
  Scenario Outline: check user Request successful or not
    Given  user got the api '<path>'
    When user hits '<name>'and '<job>'
    And calls the api with changed body
    Then it will return updated data
    Examples:
      | path    | name     | job           |
      | users/2 | morpheus | zion resident |