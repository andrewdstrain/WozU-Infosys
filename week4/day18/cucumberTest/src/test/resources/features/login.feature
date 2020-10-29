Feature: Login
  Scenario: Successful Login
    Given I input my credentials
    And those credentials are correct
    And I have less than 5 login attempts
    When I hit the signon button
    Then I sign in successfully


  Scenario: Unsuccessful Login Due to too Many Attempts
    Given I input my credentials
    But I attempted more than 4 times
    When I hit the signon button
    Then I cannot login

