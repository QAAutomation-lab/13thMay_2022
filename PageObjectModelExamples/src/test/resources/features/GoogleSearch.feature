Feature: Trying to Search something in Google

  Scenario: Trying to search Selenium Interview Questions in Google
    Given User has already on google search page
    When user types "Selenium Interview Questions" in search input field and press enter key
    Then User should able to get result page with title having "Selenium Interview Questions"

  Scenario Outline: Trying to search <textToBeSearched> in Google
    Given User has already on google search page
    When user types <textToBeSearched> in search input field and press enter key
    Then User should able to get result page with title having <textToBeSearched>

    Examples: 
      | textToBeSearched             |
      | Selenium Interview Questions |
      | Manual Testing Questions     |
      | API testing question         |