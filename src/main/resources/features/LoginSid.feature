Feature: test login functionality

  Scenario: login with valid credential
    Given user is on login page
    When user enters username and password
    And hits enter button
    Then user navigate to home page

    