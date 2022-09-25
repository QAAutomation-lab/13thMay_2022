Feature: It contains TCs related to Actitime Task creation page

  Scenario Outline: create new task
    Given user in on actitime login page
    And user enters username as <username> in the username field
    And user enters password as <password> in password field
    And clicks on Login button
    When click on Tasks tab
    And click on Add new button
    And select New Tasks
    And select projectr from project dropdown
    And enter task name as <taskName>
    And click on Create Tasks button
    Then user should be able to see the created task on page
    And close the browser

    Examples: 
      | Flow  | username | password | taskName |
      | valid | admin    | manager  | Testing  |
