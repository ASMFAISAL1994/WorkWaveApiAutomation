Feature: User Login
  @smoke
  Scenario Outline: User will Login and will get Api Response
    Given user has hit the api '<path>'
    When user will  provide email and password
    Then user will login successfully
    Examples:
    |path    |
    |v1/auth/login|