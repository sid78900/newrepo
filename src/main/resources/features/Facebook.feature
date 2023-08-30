Feature: Facebook signup functonality

  Scenario Outline: validate facebook unctionality
    Given when user open webpage
    And navigate to homepage
    When user enter <username> and <password>
    Then user is on facebook loginpage
    And close window

    Examples: 
      | username | password |
      | sid      |     hggg |
      |dddd|ddd|
     