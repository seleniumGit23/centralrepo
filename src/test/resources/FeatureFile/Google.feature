Feature: Google home page functionality -- high level description of the module
Background: Launch the Chrome browser

  @Google
  Scenario: Verify Google home page loads the search box
    Given Launch the google website
#    When home page loads
    Then Verfiy the search box is displayed

@Google_select
Scenario: Verify user is able to select desired country
  Given Launch the "https://www.globalsqa.com/demo-site/select-dropdown-menu/" url
  When User select the "Estonia" country
  Then Verify user is selcted "Estonia" country