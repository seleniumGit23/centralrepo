Feature: Google test
  @t4
  Scenario: launch the google home page and search the desired string
    Given I launch the chrome Browser and navigate to Google home page
    When I entered the desired "amazon" string
    Then I see the "Amazon.in" search results are displayed
