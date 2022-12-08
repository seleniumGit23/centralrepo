Feature: CricBuzz app functionalities

  @CricBuzz
  Scenario Outline: To validate user able to navigate Quiz page
    Given I launch the "<CricBuzz>" webpage
    When I clicked on More link
    And I clicked on Quiz link
    Then I should see the Quiz page loaded successfully
Examples:
  |CricBuzz                 |
  |https://www.cricbuzz.com/|
#    |https://www.espncricinfo.com|