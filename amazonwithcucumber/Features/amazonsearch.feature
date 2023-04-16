Feature: Search for products on Amazon
  As a user
  I want to search for products on Amazon
  So that I can find what I'm looking for

  Scenario: Search for an item
    Given I am on the Amazon home page
    When I search for "book"
    Then I should see search results for "book"