Feature: Flipkart Ecommerce operations

  @flipkart
  Scenario: Perform Product search in flipkart homepage
    Given User Launch the Flipkart website
    When User search the "Shirt" in search box
    Then User validates the "Shirt" content is displayed

  @flipkart_multi
  Scenario Outline: Perform Product search in flipkart homepage
    Given User Launch the Flipkart website
    When User search the "<searchitem>" in search box
    Then User validates the "<searchitem>" contents is displayed
    Examples:
      |searchitem |
    |Shirt      |
    |Mobile     |
    |Charger    |