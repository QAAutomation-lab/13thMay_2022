Feature: It contains TCs related to Actitime Login page

  Scenario Outline: check actitime login functinality with <Flow> user
    Given user in on actitime login page
    When user enters username as <username> in the username field
    And user enters password as <password> in password field
    And clicks on Login button
    Then user should get page title as <title>
		And close the browser
    Examples: 
      | Flow    | username | password | title                       |
      | valid   | admin    | manager  | actiTIME - Enter Time-Track |
      | invalid | admin    | ""       | actiTIME - Login            |
      | invalid | ""       | manager  | actiTIME - Login            |
