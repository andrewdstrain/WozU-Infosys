Feature: login
  Scenario: user logs in
    Given browser is open
      And user is on login page
    When user enters username and password
    Then user goes to home screen
