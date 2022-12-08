Feature: Amazon ecommerce page operations
#  Background: I launch the Chrome browser

  @Amazon
  Scenario: To validate user is able to open Electronics items from Amazon
    Given I launch the Amazon web page
    When I clicked on Electronics link
    Then I should see the Electronic items on page

#  @Amazon
#    Scenario Outline: Multi activity
#      Given I did "<something>" on page
#      Examples:
#      |something|
#      |activity |
#      |activty2 |
