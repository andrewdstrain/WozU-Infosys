Feature: Is it Friday yet?
  Everybody wants to know when it's Friday.

  Scenario: Sunday isn't Friday
    Given today is Sunday
    When I ask if today is Friday
    Then I should be told "Nope"

  Scenario: Friday is Friday
    Given today is Friday
    When I ask if today is Friday
    Then I should be told "TGIF"