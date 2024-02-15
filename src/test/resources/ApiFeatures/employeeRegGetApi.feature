Feature: User Get List Users
#  @smoke
  Scenario Outline: User Will Get Api Response
    Given users has the api '<path>'
    When user call '<params>'and '<paramsValue>'
    Then it will return valid data

    Examples:

      | path  | params | paramsValue |
      | users | ?page  | 2           |