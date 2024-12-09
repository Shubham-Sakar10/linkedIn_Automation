@google
Feature: feature to test google search functionality

  Scenario : check the google search is working fine
    Given user is opening the browser
    And user is on the google search page
    When user enter some text to search in the google page
    And user need to click on the search button
    Then user validate the search result
