Feature: Happy Feet

  Scenario: Not enough Penguins were punted
    Given I am punting Penguins
    When less than 60 Penguins are punted
    Then the icecaps melt

  Scenario: Enough Penguins are punted
    Given I am punting Penguins
    When 60 or more Penguins are punted
    Then the icecaps stay nice and frosty
